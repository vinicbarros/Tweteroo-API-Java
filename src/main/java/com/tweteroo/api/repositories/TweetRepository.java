package com.tweteroo.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.Tweet;

@Repository
public class TweetRepository {
  private List<Tweet> tweets = new ArrayList<>();

  public void postNew(Tweet tweet) {
    tweets.add(tweet);
  }

}
