package com.tweteroo.api.models;

import com.tweteroo.api.dto.UserDTO;

public class User {
  private String username;
  private String avatar;

  public User(UserDTO user) {
    this.username = user.username();
    this.avatar = user.avatar();
  }

  public String showUsername() {
    return this.username;
  }

  public String showAvatar() {
    return this.avatar;
  }
}
