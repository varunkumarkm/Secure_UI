package com.secure.ui.secureui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/actuator/info")
public class ReportController {
	
	@Autowired
	private WebClient.Builder weclientbuilder;

	@RequestMapping("/home")
	public String loadHome() {
		
		return"home";
	}
	@RequestMapping("/report")
	public String loadReport(Model model) {
		
		weclientbuilder.build().get()
		.uri("http://dataApi//actuator/info/userdetails/")
		.retrieve()
		.bodyToMono(ReportController.class)
		.block();
		return"report";
	}
	
}
