package com.plantplaces2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}

}
