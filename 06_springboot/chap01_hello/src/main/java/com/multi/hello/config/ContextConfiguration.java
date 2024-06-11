package com.multi.hello.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan(basePackages = "com.multi.hello")
public class ContextConfiguration {
}
