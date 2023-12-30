package com.carshop.app.modules.users.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.profiles.entities.Profile;
import com.carshop.app.modules.users.entities.User;
import com.carshop.app.modules.users.repositories.IUserRepository;
import com.carshop.app.modules.users.services.impl.UserServiceImpl;

@DisplayName("User unity tests")
@SpringBootTest
public class UserServiceTestImpl {

    private UserService userService;

    @Mock
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @BeforeEach
    public void setup() {
        userService = new UserServiceImpl(userRepository, encoder);
    }

    @Test
    @DisplayName("It Should register a new user")
    public void shouldRegisterUser() throws Exception {
        User user = new User();
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        Mockito.when(userRepository.save(Mockito.any())).thenReturn(mountUserInserted(user));

        user = this.userService.save(user);

        assertEquals(1, user.getId());
    }

    @Test
    @DisplayName("It Should not register a new user when passwords dont match")
    public void shouldNotRegisterUserWhenPasswordsDontMatch() throws Exception {
        User user = new User();
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc1235@$");

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            userService.save(user);
        });

        assertEquals(CarShopRuleException.PASSWORDS_DONT_MATCH, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when passwords is invalid")
    public void shouldNotRegisterUserWhenPasswordIsInvalid() throws Exception {
        User user = new User();
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("abc123@$");
        user.setPasswordConfirm("abc123@$");

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            userService.save(user);
        });

        assertEquals(CarShopRuleException.PASSWORD_OUT_OF_RULES, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when username already exists")
    public void shouldNotRegisterUserWhenUsernameAlreadyExists() throws Exception {
        User user = new User();
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        Mockito.when(userRepository.existsByUsername(user.getUsername())).thenReturn(true);

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            userService.save(user);
        });

        assertEquals(CarShopRuleException.USERNAME_ALREADY_USED, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when email already exists")
    public void shouldNotRegisterUserWhenEmailAlreadyExists() throws Exception {
        User user = new User();
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        Mockito.when(userRepository.existsByEmail(user.getEmail())).thenReturn(true);

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            userService.save(user);
        });

        assertEquals(CarShopRuleException.EMAIL_ALREADY_USED, exception.getMessage());
    }

    @Test
    @DisplayName("It Should get an user")
    public void shouldGetAnUser() throws Exception {
        final int customerId = 1;

        final User user = new User();
        user.setId(1);
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        Mockito.when(userRepository.findByCustomerIdAndId(customerId, user.getId())).thenReturn(Optional.of(user));

        final User userCatched = this.userService.findById(customerId, user.getId());

        assertEquals(userCatched.getId(), user.getId());
    }

    @Test
    @DisplayName("It Should not get an user")
    public void shouldNotGetAnUser() throws Exception {
        final int customerId = 1;
        final int userId = 1;

        Mockito.when(userRepository.findByCustomerIdAndId(customerId, userId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            userService.findById(customerId, userId);
        });

        assertEquals(CarShopRuleException.USER_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It Should get users")
    public void shouldGetUsers() throws Exception {
        final int customerId = 1;

        final User user = new User();
        user.setId(1);
        user.setProfile(new Profile(1));
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        final List<User> users = new ArrayList<>();
        users.add(user);

        Mockito.when(userRepository.findAllByCustomerId(customerId)).thenReturn(users);

        final List<User> usersFetched = this.userService.listAll(customerId);

        assertTrue(usersFetched.size() == 1);
    }

    @Test
    @DisplayName("It Should not get users")
    public void shouldNotGetUsers() throws Exception {
        final int customerId = 1;

        Mockito.when(userRepository.findAllByCustomerId(customerId)).thenReturn(Collections.emptyList());

        final List<User> users = this.userService.listAll(customerId);

        assertTrue(users.isEmpty());
    }

    private User mountUserInserted(final User user) {
        user.setId(1);
        return user;
    }

}
