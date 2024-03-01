package com.carshop.app.adapter.persistence.user.adapter;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.carshop.app.adapter.persistence.user.entity.UserEntity;
import com.carshop.app.adapter.persistence.user.mapper.UserJpaMapper;
import com.carshop.app.adapter.persistence.user.repository.UserRepository;
import com.carshop.app.application.port.persistence.user.UserRepositoryPort;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Adapter;

@Adapter
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final UserJpaMapper userJpaMapper;

    public UserRepositoryAdapter(final UserRepository userRepository, final UserJpaMapper userJpaMapper) {
        this.userRepository = userRepository;
        this.userJpaMapper = userJpaMapper;
    }

    @Override
    public User save(User user) {
        UserEntity entity = this.userJpaMapper.toJpaEntity(user);
        entity = this.userRepository.save(entity);
        return this.userJpaMapper.toDomain(entity);
    }

    @Override
    public User delete(User user) {
        final UserEntity entity = this.userJpaMapper.toJpaEntity(user);
        this.userRepository.delete(entity);
        return user;
    }

    @Override
    public Collection<User> findAllByCustomerId(long customerId) {
        return this.userRepository
                .findAllByCustomerId(customerId)
                .stream()
                .map((entity) -> {
                    return this.userJpaMapper.toDomain(entity);
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<User> findByCustomerIdAndId(long customerId, long id) {
        final Optional<UserEntity> entity = this.userRepository.findByCustomerIdAndId(customerId, id);
        return entity.isPresent() ? Optional.of(this.userJpaMapper.toDomain(entity.get())) : Optional.empty();
    }

    @Override
    public Optional<User> findByUserName(String username) {
        final Optional<UserEntity> entity = this.userRepository.findByUserName(username);
        return entity.isPresent() ? Optional.of(this.userJpaMapper.toDomain(entity.get())) : Optional.empty();
    }

    @Override
    public Boolean existsByUsername(String username) {
        return this.userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }

}
