package com.tweteroo.api.services;

import java.util.Optional;

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

  public String findUserAvatarByUsername(String username) {

    Optional<User> user = repository.findUserByName(username);
    if(user.get().getAvatar() != null) {
      return user.get().getAvatar();
    }
    return "Not found";
  }
}
