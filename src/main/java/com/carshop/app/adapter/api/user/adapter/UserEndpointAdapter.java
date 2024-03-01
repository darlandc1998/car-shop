package com.carshop.app.adapter.api.user.adapter;

import java.util.Collection;

import com.carshop.app.adapter.api.user.dto.UserRegisterDTO;
import com.carshop.app.adapter.api.user.mapper.UserDtoMapper;
import com.carshop.app.application.port.api.user.UserEndpointPort;
import com.carshop.app.application.usecase.user.UserUseCase;
import com.carshop.app.domain.User;
import com.carshop.app.infrastructure.annotation.Adapter;
import com.carshop.app.infrastructure.http.HttpResponse;
import com.carshop.app.infrastructure.http.handles.HttpHandle;

@Adapter
public class UserEndpointAdapter implements UserEndpointPort {

    private final UserUseCase userUseCase;
    private final UserDtoMapper userDtoMapper;

    public UserEndpointAdapter(final UserUseCase userUseCase, final UserDtoMapper userDtoMapper) {
        this.userUseCase = userUseCase;
        this.userDtoMapper = userDtoMapper;
    }

    @Override
    public HttpResponse listAll(long customerId) {
        try {
            final Collection<User> users = this.userUseCase.listAllByCustomerId(customerId);
            return HttpHandle.success(this.userDtoMapper.toDto(users));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse findById(long customerId, long userId) {
        try {
            final User user = this.userUseCase.findById(customerId, userId);
            return HttpHandle.success(this.userDtoMapper.toDto(user));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

    @Override
    public HttpResponse save(long customerId, UserRegisterDTO registerDTO) {
        try {
            User user = this.userDtoMapper.toDomainFromSaveBody(customerId, registerDTO);
            user = this.userUseCase.insert(user);
            return HttpHandle.created(this.userDtoMapper.toDto(user));
        } catch (Exception e) {
            return HttpHandle.badRequest(e.getMessage());
        }
    }

}
