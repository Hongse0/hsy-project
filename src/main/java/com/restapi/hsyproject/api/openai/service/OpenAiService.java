package com.restapi.hsyproject.api.openai.service;

import static com.theokanning.openai.service.OpenAiService.defaultObjectMapper;
import static java.time.Duration.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenAiService {

    private static final String BASE_URL = "https://api.openai.com/";
    private static final Duration DEFAULT_TIMEOUT = ofSeconds(10);
    private static final ObjectMapper mapper = defaultObjectMapper();
}
