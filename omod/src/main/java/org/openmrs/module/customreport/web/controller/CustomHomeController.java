package org.openmrs.module.customreport.web.controller;

import org.openmrs.module.customreport.api.service.CustomReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomHomeController {
	
	@Autowired
	CustomReportService customReportService;
	
	@ResponseBody
	@RequestMapping(value = "module/customreport/greeting.form", method = RequestMethod.GET)
	public String greeting() {
		return customReportService.welCome();
	}
}
