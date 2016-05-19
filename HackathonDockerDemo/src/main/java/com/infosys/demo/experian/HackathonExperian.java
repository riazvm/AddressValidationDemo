package com.infosys.demo.experian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;




@SpringBootApplication
@RestController
public class HackathonExperian {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(HackathonExperian.class, args);
	 }
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
		 
		 try
		 {
		String BaseurlFree = "https://autocomplete-api.smartystreets.com/suggest";
		//return "The address Enteres is " +  strAddress;
		RestTemplate restTemp = new RestTemplate();
		//restTemp.p
		String Baseurl = "https://api.smartystreets.com/street-address";
		
		 MultiValueMap<String,String>params = new LinkedMultiValueMap<String,String>();
		// params.add("auth-id", "071b9cf9-af21-92e6-503a-70a66bbbe6f2");
		// params.add("auth-token", "B6FI5xfK4AV9axT7s45U");
		 params.add("auth-id", "6c8aa067-7d61-9759-860b-5028a52ddad1");
		 params.add("auth-token", "ZgiLq7fu99ZVaXvxJQYa");
		 params.add("street", street);
		 params.add("street2", street2);
		 params.add("city", city);
		 params.add("state", state);
		 params.add("zipcode", zipcode);
		 params.add("candidates", "10");
		 
		  UriComponents uricomps= UriComponentsBuilder.fromHttpUrl(Baseurl).queryParams(params).build();
		
			  SmartyResults[] sr=restTemp.getForObject(uricomps.toUri(), SmartyResults[].class);
		  
		  if(sr.length==0)
		  {
			  	return "Address Not Found";
		  }
		  else
		  {
		for (int i=0;i<sr.length;i++)
		{
			if(sr[i].getMetadata().getRecord_type().equals("P") || sr[i].getAnalysis().getDpv_cmra().equals("Y") )
			{
				return "PO BOX Address Found";
			}
			else if(sr[i].getMetadata().getRdi().equals("commercial"))
			{
				return "Valid Commercial Address Found";
			}
			else if(sr[i].getMetadata().getRdi().equals("residential"))
			{
				return "Valid Residential Address Found";
			}
			else
			{
				return "Valid Non PO BOX Address Found";
				
			}
	
		}
		  }
		 }
		 catch(Exception e)
		 {
			 
		 }
		 return "";
		
		 
	 }
	 
	 @RequestMapping(value="/zipcode-verify/{zipcode}")
	 @ResponseBody
	 public String ZipCodeVerify(@PathVariable("zipcode") String zipcode)
	 
	 {
		//here we will write the consumer
		
		RestTemplate restTemp = new RestTemplate();
		//restTemp.p
		String Baseurl = "https://us-zipcode.api.smartystreets.com/lookup";
		
		 MultiValueMap<String,String>params = new LinkedMultiValueMap<String,String>();
		 params.add("auth-id", "071b9cf9-af21-92e6-503a-70a66bbbe6f2");
		 params.add("auth-token", "B6FI5xfK4AV9axT7s45U");
		 params.add("zipcode", "75034");
		 params.add("city", "Frisco");
		 params.add("state", "TX");
		 
		 UriComponents uricomps= UriComponentsBuilder.fromHttpUrl(Baseurl).queryParams(params).build();
		 ZipCodeResults[] zp= restTemp.getForObject(uricomps.toUri(),ZipCodeResults[].class);
		  
// SmartyResults[] op = restTemp.getForObject(uricomps.toUri(), SmartyResults[].class);
		for (int i=0;i<zp.length;i++)
		{
			System.out.println("The output JSON is "+zp[i].toString());
	
		}
		if (zp[0]!=null)
		return "The address Enteres is " + zp[0].toString();
		else 
			return "No values returned";
	//	restTemp.
		//Output op1 = restTemp.getForObject("http://jsonplaceholder.typicode.com/posts/"+zipcode, Output.class); 
	    //return "The op is " + op1.toString();
	 }
	 
	 
	

}
