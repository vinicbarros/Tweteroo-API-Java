package com.tweteroo.api.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.User;

@Repository
public class UserRepository {
  private List<User> users = new ArrayList<>();

  public void addNew(User user) {
    users.add(user);
  }

  public Optional<User> findUserByName(String name) {
    User user = new User();
    
    for (int i = 0; i < users.size(); i++) {
       String username = users.get(i).showUsername();
       
      if(username.equals(name)) {
        user = users.get(i);
      }
    }

    return Optional.ofNullable(user);
  }

}
