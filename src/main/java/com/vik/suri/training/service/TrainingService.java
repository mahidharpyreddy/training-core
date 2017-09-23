package com.vik.suri.training.service;

import static spark.Spark.get;
import static spark.Spark.port;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class TrainingService {
	@PostConstruct
	public void init(){
		port(9090);
		get("/hello", (req, res) -> "Hello World");
		get("/health", (req, res) -> "Service is up and running");
	}

}
