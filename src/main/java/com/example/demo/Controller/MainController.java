package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Gameclass.gameclass;

@Controller
public class MainController {
	@Autowired
	gameclass gc;
	@RequestMapping("/")
    public String start() {
		
		return "index.html";
	}
	
	@PostMapping("/submit")
	public String startwork(Model model)
	{
		ArrayList<gameclass> gamevalue=new ArrayList<>();
		for(int i=0;i<50;i++)
		{
			gc=new gameclass();
			gamevalue.add(gc);
		}
		model.addAttribute("gamevalue", gamevalue);
		
		System.out.println("Started");
		return "result.html";
	}

}
