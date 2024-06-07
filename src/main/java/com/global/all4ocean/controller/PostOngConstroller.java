package com.global.all4ocean.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
@CacheConfig(cacheNames = "post")
@Slf4j
@Tag(name = "Post")
public class PostOngConstroller {
}
