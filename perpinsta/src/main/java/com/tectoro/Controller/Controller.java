package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.model.Model;
import com.tectoro.service.ServiceInterface;
@RestController
public class Controller 
{
	@Autowired
 ServiceInterface interface1;
	
	@PostMapping("/pn")
	public String posOrNeg(Model model) {
	int num=model.getNumber();
	return 	interface1.positiveOrNegative(num);
	}
	@PostMapping("/EO")
	public String evenOrOdd(Model model ) {
		int num=model.getNumber();
		return interface1.evenOrOdd(num);
	}
	@PostMapping("/natural")
	public String natural(Model model) {
		int num=model.getNumber();
		return interface1.nNatural(num);
	}
	@PostMapping("/range")
	public String rangeNatural(Model model) {
		int num=model.getNumber();
		int num1=model.getNumber1();
		return interface1.rangeNatural(num, num1);
	}
}
