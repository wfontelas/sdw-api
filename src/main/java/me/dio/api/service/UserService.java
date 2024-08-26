package me.dio.api.service;


import me.dio.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
