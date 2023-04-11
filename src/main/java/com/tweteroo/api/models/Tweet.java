package com.tweteroo.api.models;

import lombok.Getter;

public class Tweet extends User {
  @Getter private String text;

  public Tweet(String username, String avatar, String text) {
    this.text = text;
    super.userTweet(username, avatar);
  }
}
