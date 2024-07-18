package com.example.demo;

import Homework2.Scoreboard;
import Homework2.Ticket;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		Scoreboard scoreBoard = context.getBean(Scoreboard.class);

		Ticket ticket = scoreBoard.newTicket();

		System.out.println(ticket);


	}
}
