package com.carshop.app.modules.profiles.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.carshop.app.exceptions.CarShopRuleException;
import com.carshop.app.modules.profiles.entities.Profile;
import com.carshop.app.modules.profiles.repositories.IProfileRepository;
import com.carshop.app.modules.profiles.services.impl.ProfileServiceImpl;

@SpringBootTest
@DisplayName("Profile unity tests")
public class ProfileServiceTestImpl {

    private ProfileService profileService;

    @Mock
    private IProfileRepository profileRepository;

    @BeforeEach
    public void setup() {
        profileService = new ProfileServiceImpl(profileRepository);
    }

    @Test
    @DisplayName("It should save a profile")
    public void shouldSave() throws Exception {
        Profile profile = new Profile();
        profile.setCustomerId(1);
        profile.setName("ADM");
        profile.setCreatedAt(LocalDateTime.now());
        profile.setUpdatedAt(LocalDateTime.now());

        Mockito.when(profileRepository.save(Mockito.any())).thenReturn(mountInsertedProfile(profile));

        profile = this.profileService.save(profile);

        assertEquals(1, profile.getId());
    }

    @Test
    @DisplayName("It should update a profile")
    public void shouldUpdate() throws Exception {
        Profile profile = new Profile();
        profile.setCustomerId(1);
        profile.setName("ADM 2");
        profile.setUpdatedAt(LocalDateTime.now());

        Mockito.when(profileRepository.save(Mockito.any())).thenReturn(mountInsertedProfile(profile));

        profile = this.profileService.save(profile);

        assertEquals(1, profile.getId());
    }

    @Test
    @DisplayName("It should list profiles")
    public void shouldListProfiles() throws Exception {
        final int customerId = 1;

        final Profile profile = new Profile();
        profile.setCustomerId(1);
        profile.setName("ADM");
        profile.setUpdatedAt(LocalDateTime.now());

        final List<Profile> profiles = new ArrayList<>();
        profiles.add(profile);

        Mockito.when(profileRepository.findAllByCustomerId(customerId)).thenReturn(profiles);

        final List<Profile> profilesFetched = this.profileService.findAllByCustomerId(customerId);

        assertEquals(1, profilesFetched.size());
    }

    @Test
    @DisplayName("It should get a profile")
    public void shouldGetProfile() throws Exception {
        final int customerId = 1;

        final Profile profile = new Profile();
        profile.setId(1);
        profile.setCustomerId(1);
        profile.setName("ADM");
        profile.setUpdatedAt(LocalDateTime.now());

        Mockito.when(profileRepository.findByCustomerIdAndId(customerId, profile.getId())).thenReturn(Optional.of(profile));

        final Profile profileFetched = this.profileService.findByCustomerIdAndProfileId(customerId, profile.getId());

        assertEquals(1, profileFetched.getId());
    }

    @Test
    @DisplayName("It should not get a profile")
    public void shouldNotGetProfile() throws Exception {
        final int customerId = 1;
        final int profileId = 1;

        Mockito.when(profileRepository.findByCustomerIdAndId(customerId, profileId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            this.profileService.findByCustomerIdAndProfileId(customerId, profileId);
        });

        assertEquals(CarShopRuleException.PROFILE_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It should delete a profile")
    public void shouldDeleteProfile() throws Exception {
        final int customerId = 1;

        Profile profile = new Profile();
        profile.setId(1);
        profile.setCustomerId(customerId);
        profile.setCustomerId(1);
        profile.setName("ADM");
        profile.setUpdatedAt(LocalDateTime.now());

        profile = this.profileService.delete(profile);

        assertEquals(1, profile.getId());
    }

    private Profile mountInsertedProfile(final Profile profile) {
        profile.setId(1);
        return profile;
    }

}
