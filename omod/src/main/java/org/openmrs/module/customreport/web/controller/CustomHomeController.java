package org.openmrs.module.customreport.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomHomeController {
	
	@ResponseBody
	@RequestMapping(value = "module/customreport/greeting.form", method = RequestMethod.GET)
	public String greeting() {
		return "Custom Report";
	}
}
