package com.api.marketingapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.marketingapp.Entities.Lead;
import com.api.marketingapp.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;

	// localhost:3030/Lead
	@RequestMapping("/Lead")
	public String Lead_1() {
		return "Firstpage";
	}

	
	  @RequestMapping("/saveReg") 
	  public String saveOne(Lead lead) {
	 leadService.saveReg(lead); 
	 return"Firstpage"; }
	 

	/*
	 * @RequestMapping("/saveReg") public String saveOne_1(@ModelAttribute Lead
	 * lead) { leadService.saveReg(lead); return"Firstpage"; }
	 */

}

/*
 * @RequestMapping("/saveReg") public String saveOne(Lead lead) {
 * leadService.saveReg(lead); return"Firstpage"; }
 */

//System.out.println(lead.getFirst_Name());
//System.out.println(lead.getLast_Name());
////System.out.println(lead.getId());
//System.out.println(lead.getPhone());
//System.out.println(lead.getEmail());
