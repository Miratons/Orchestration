package com.family.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.family.model.Application;

@RestController
public class ApplicationController {
	
	@RequestMapping("/application")
	public Application getApplication() {
		try {
			Application app = new Application();
			app.setIp(InetAddress.getLocalHost().getHostAddress());
			app.setName(InetAddress.getLocalHost().getHostName());
			return app;
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/applications")
	public String getApplications() {
		StringBuilder builder = new StringBuilder();
		try {
			builder.append(InetAddress.getLocalHost().getHostAddress());
			builder.append("      -       ");
			for (int i = 0; i < 1000000; i ++) {
				builder.append(i);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return builder.toString();
	}
	
}
