package com.tectoro.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements ServiceInterface {

	@Override
	public String positiveOrNegative(int number) {
		if (number > 0) {
			return "Positive Number::" + number;
		} else if (number == 0) {
			return "Zero::" + number;
		} else {
			return "Negative Number::" + number;
		}

	}

	@Override
	public String evenOrOdd(int number) {
		if(number%2==0) {
			return "Even Number::"+number;
		}
		else {
			return "Odd Number::"+number;
		}
		
	}

	@Override
	public String nNatural(int number) {
	//	int n=10;
		int sum=0;
		for(int i=0;i<=number;i++) {
			sum+=i;
		}
		return "natural number::"+ sum;
	}

	@Override
	public String rangeNatural(int number, int number1) {
		int sum=0;
		for(int i=number;i<=number1;i++) {
			sum+=i;
		}
		return " Sum of Range Between "+number+" to "+number1+" is "+ sum;
	}
	 

}
