package com.carshop.app.modules.users.services;

import java.util.List;

import com.carshop.app.modules.users.entities.User;

public interface UserService {

    List<User> listAll(final int customerId) throws Exception;

    User findById(final int customerId, final int userId) throws Exception;

    User save(final User user) throws Exception;

}
