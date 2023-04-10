package com.tweteroo.api.models;

public class Tweet extends User {
  private String text;

  public Tweet(String username, String avatar, String text) {
    this.text = text;
    super.userTweet(username, avatar);
  }

  public String showText() {
    return this.text;
  }
}
