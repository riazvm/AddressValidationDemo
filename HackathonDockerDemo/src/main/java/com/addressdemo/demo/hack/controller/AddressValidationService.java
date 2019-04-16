package com.addressdemo.demo.hack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.addressdemo.demo.hack.imp.AddressValidationServiceImpl;


@RestController
@EnableAsync
@EnableCaching
@EnableScheduling
@SpringBootApplication
@ComponentScan({"addressdemo.demo.hack"})
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
public class AddressValidationService {
	
	@Autowired
	AddressValidationServiceImpl addressValidationServiceImpl;
	
	 @RequestMapping(value="/")
	 public String returnHello()
	 {
		 
		 return "Hello";
	 }
	 
	 @RequestMapping(value="/address-verify", params={"street","street2","city","state","zipcode"} ,method = RequestMethod.GET)
	 @ResponseBody
	 // public String AddressVerify(@PathVariable("address") String strAddress)
	 public String AddressVerify(@RequestParam String street,@RequestParam String street2,@RequestParam String city,@RequestParam String state, @RequestParam String zipcode)
	 
	 {
		 
	
			
				
				 MultiValueMap<String,String>params = new LinkedMultiValueMap<String,String>();
				 params.add("auth-id", "<add authid>");
				 params.add("auth-token", "<add auth token>");
				 params.add("street", street);
				 params.add("street2", street2);
				 params.add("city", city);
				 params.add("state", state);
				 params.add("zipcode", zipcode);
				 params.add("candidates", "10");
				 
				 return addressValidationServiceImpl.verifyAddress(params);
	 }
	 
	 @RequestMapping(value="/zipcode-verify/{zipcode}")
	 @ResponseBody
	 public String ZipCodeVerify(@PathVariable("zipcode") String zipcode)
	 
	 {
		
		 MultiValueMap<String,String>params = new LinkedMultiValueMap<String,String>();
		 params.add("auth-id", "<add authid>");
		 params.add("auth-token", "<add auth token>");
		 params.add("zipcode", "75034");
		 params.add("city", "Frisco");
		 params.add("state", "TX");
		 return addressValidationServiceImpl.verifyZipcode(params);
	
	 }
	 
	 
	

}
