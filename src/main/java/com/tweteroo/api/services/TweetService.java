package com.tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.repositories.TweetRepository;

@Service
public class TweetService {
  
  @Autowired
  private UserService userService;

  @Autowired
  private TweetRepository tweetRepository;

  public void newTweet(TweetDTO tweet) {
    String avatar = userService.findUserAvatar(tweet.avatar());

    if (avatar.equals("Not found")) throw new Error("User doesn't exist");

    tweetRepository.postNew(new Tweet(tweet.username(), avatar, tweet.text()));
  }
}
