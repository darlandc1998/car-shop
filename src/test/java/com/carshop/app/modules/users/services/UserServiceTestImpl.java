package com.carshop.app.modules.users.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.carshop.app.adapter.api.user.dto.UserRegisterDTO;
import com.carshop.app.adapter.persistence.user.entity.UserEntity;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

@DisplayName("User unity tests")
@SpringBootTest
public class UserServiceTestImpl {

    // private UserService userService;

    @Mock
    // private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @BeforeEach
    public void setup() {
        // userService = new UserServiceImpl(userRepository, encoder);
    }

    @Test
    @DisplayName("It Should register a new user")
    public void shouldRegisterUser() throws Exception {
        final int customerId = 1;
        UserRegisterDTO user = new UserRegisterDTO();
        user.setProfileId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        // Mockito.when(userRepository.save(Mockito.any())).thenReturn(mountUserInserted(customerId, user));

        // final UserDTO userDTO = this.userService.insert(customerId, user);

        // assertEquals(1, userDTO.getId());
    }

    @Test
    @DisplayName("It Should not register a new user when passwords dont match")
    public void shouldNotRegisterUserWhenPasswordsDontMatch() throws Exception {
        final int customerId = 1;
        UserRegisterDTO user = new UserRegisterDTO();
        user.setProfileId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc1235@$");

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // userService.insert(customerId, user);
        });

        assertEquals(CarShopRuleException.PASSWORDS_DONT_MATCH, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when passwords is invalid")
    public void shouldNotRegisterUserWhenPasswordIsInvalid() throws Exception {
        final int customerId = 1;
        UserRegisterDTO user = new UserRegisterDTO();
        user.setProfileId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("abc123@$");
        user.setPasswordConfirm("abc123@$");

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // userService.insert(customerId, user);
        });

        assertEquals(CarShopRuleException.PASSWORD_OUT_OF_RULES, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when username already exists")
    public void shouldNotRegisterUserWhenUsernameAlreadyExists() throws Exception {
        final int customerId = 1;
        UserRegisterDTO user = new UserRegisterDTO();
        user.setProfileId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        // Mockito.when(userRepository.existsByUsername(user.getUsername())).thenReturn(true);

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // userService.insert(customerId, user);
        });

        assertEquals(CarShopRuleException.USERNAME_ALREADY_USED, exception.getMessage());
    }

    @Test
    @DisplayName("It Should not register a new user when email already exists")
    public void shouldNotRegisterUserWhenEmailAlreadyExists() throws Exception {
        final int customerId = 1;
        UserRegisterDTO user = new UserRegisterDTO();
        user.setProfileId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        user.setPasswordConfirm("Abc123@$");

        // Mockito.when(userRepository.existsByEmail(user.getEmail())).thenReturn(true);

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // userService.insert(customerId, user);
        });

        assertEquals(CarShopRuleException.EMAIL_ALREADY_USED, exception.getMessage());
    }

    @Test
    @DisplayName("It Should get an user")
    public void shouldGetAnUser() throws Exception {
        final int customerId = 1;

        final UserEntity user = new UserEntity();
        // user.setId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        // user.setPasswordConfirm("Abc123@$");

        // Mockito.when(userRepository.findByCustomerIdAndId(customerId, user.getId())).thenReturn(Optional.of(user));

        // final UserDTO userCatched = this.userService.findById(customerId, user.getId());

        // assertEquals(userCatched.getId(), user.getId());
    }

    @Test
    @DisplayName("It Should not get an user")
    public void shouldNotGetAnUser() throws Exception {
        final int customerId = 1;
        final int userId = 1;

        // Mockito.when(userRepository.findByCustomerIdAndId(customerId, userId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // userService.findById(customerId, userId);
        });

        assertEquals(CarShopRuleException.USER_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It Should get users")
    public void shouldGetUsers() throws Exception {
        final int customerId = 1;

        final UserEntity user = new UserEntity();
        // user.setId(1);
        user.setName("John");
        user.setUsername("john2023");
        user.setEmail("john@teste.com.br");
        user.setPassword("Abc123@$");
        // user.setPasswordConfirm("Abc123@$");

        final List<UserEntity> users = new ArrayList<>();
        users.add(user);

        // Mockito.when(userRepository.findAllByCustomerId(customerId)).thenReturn(users);

        // final List<UserDTO> usersFetched = this.userService.listAll(customerId);

        // assertTrue(usersFetched.size() == 1);
    }

    @Test
    @DisplayName("It Should not get users")
    public void shouldNotGetUsers() throws Exception {
        final int customerId = 1;

        // Mockito.when(userRepository.findAllByCustomerId(customerId)).thenReturn(Collections.emptyList());

        // final List<UserDTO> users = this.userService.listAll(customerId);

        // assertTrue(users.isEmpty());
    }

    private UserEntity mountUserInserted(final int customerId, final UserRegisterDTO userRegisterDTO) {
        // final UserEntity user = UserConverter.mountOf(customerId, userRegisterDTO);
        // user.setId(1);
        // return user;
        return null;
    }

}
