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

  public List<Tweet> getAllTweets(int pag) {
    int finalI = tweets.size() - (pag * 5);
    int initialI = finalI + 4;

    if(finalI < 0) {
      finalI = 0;
    }
    if(initialI >= tweets.size()) {
      initialI = tweets.size() - 1;
    }

    List<Tweet> filteredTweets = new ArrayList<>();

    for (int i = initialI; i >= finalI; i--) {
      filteredTweets.add(tweets.get(i));
    }
    return filteredTweets;
  } 

  public List<Tweet> getAllTweetsOfUser(String username) {
    List<Tweet> tweetsOfUser = new ArrayList<>();

    for (int i = tweets.size() - 1; i >= 0; i--) {
      if(tweets.get(i).getUsername().equals(username)) {
        tweetsOfUser.add(tweets.get(i));
      }
    }

    return tweetsOfUser;
  }

}
