package com.global.all4ocean.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("comentarios")
@CacheConfig(cacheNames = "comentarios")
@Slf4j
@Tag(name = "Comentarios")
public class ComentarioPostController {
}
