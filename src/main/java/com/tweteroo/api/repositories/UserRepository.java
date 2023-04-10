package com.tweteroo.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.User;

@Repository
public class UserRepository {
  private List<User> users = new ArrayList<>();

  public void addNew(User user) {
    users.add(user);
  }

}
