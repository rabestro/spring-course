package com.rabestro.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rabestro.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
