package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.services.TweetService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/tweets")
public class TweetController {
  
  @Autowired
  private TweetService tweetService;

  @PostMapping
  public String postTweet(@RequestBody @Valid TweetDTO tweet) {
    tweetService.newTweet(tweet);
    return("Ok");
  }

  @GetMapping
  public List<Tweet> getTweets(@RequestParam("page") String page) {
    return tweetService.tweets(Integer.parseInt(page));
  }
}
