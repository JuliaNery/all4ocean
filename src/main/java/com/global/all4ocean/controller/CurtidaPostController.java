package com.global.all4ocean.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("curtidas")
@CacheConfig(cacheNames = "curtidas")
@Slf4j
@Tag(name = "Curtidas")
public class CurtidaPostController {
}
