package com.tts.subscriberlisttts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.subscriberlisttts.model.Subscriber;
import com.tts.subscriberlisttts.repository.SubscriberRepository;

@Controller
public class SubscriberController {
	
	@Autowired
	private SubscriberRepository subscriberRepository;
	
	@GetMapping(value = "/")
	public String index(Subscriber subscriber) {
		return "subscriber/index";
	}
	
	@PostMapping(value = "/")
	public String addNewSubscriber(Subscriber subscriber, Model model) {
		Subscriber subscriberToAdd = new Subscriber(subscriber.getFirstName(), subscriber.getLastName(), subscriber.getUsername());
		subscriberRepository.save(subscriberToAdd);
		model.addAttribute("firstName", subscriberToAdd.getFirstName());
		model.addAttribute("lastName", subscriberToAdd.getLastName());
		model.addAttribute("username", subscriberToAdd.getUsername());
		return "subscriber/result";
	}

}
