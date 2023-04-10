package com.tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.tweteroo.api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.User;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public void createUser(UserDTO user) {
    repository.addNew(new User(user));
  }
}
