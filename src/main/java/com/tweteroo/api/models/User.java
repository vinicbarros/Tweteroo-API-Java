package com.tweteroo.api.models;

import com.tweteroo.api.dto.UserDTO;

import lombok.Getter;

public class User {
  @Getter private String username;
  @Getter private String avatar;

  public User() {}

  public User(UserDTO user) {
    this.username = user.username();
    this.avatar = user.avatar();
  }

  public void userTweet(String username, String avatar) {
    this.username = username;
    this.avatar = avatar;
  }
}
