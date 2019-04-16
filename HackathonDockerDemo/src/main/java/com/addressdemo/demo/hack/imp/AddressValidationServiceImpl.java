package com.addressdemo.demo.hack.imp;


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
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.addressdemo.demo.hack.model.SmartyResults;
import com.addressdemo.demo.hack.model.ZipCodeResults;


@RestController
@EnableAsync
@EnableCaching
@EnableScheduling
@SpringBootApplication
@ComponentScan({"addressdemo.demo.hack"})
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
public class AddressValidationServiceImpl {
	
	
	 public String verifyAddress(MultiValueMap<String,String> queryParams)
	 
	 {
		 
		 try
		 {
				String BaseurlFree = "https://autocomplete-api.smartystreets.com/suggest";
				//return "The address Enteres is " +  strAddress;
				RestTemplate restTemp = new RestTemplate();
				//restTemp.p
				String Baseurl = "https://api.smartystreets.com/street-address";
				
			 
				UriComponents uricomps= UriComponentsBuilder.fromHttpUrl(Baseurl).queryParams(queryParams).build();
		
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
	 

	 public String verifyZipcode(MultiValueMap<String,String> queryParams)
	 
	 {
		//here we will write the consumer
		
		RestTemplate restTemp = new RestTemplate();
		//restTemp.p
		String Baseurl = "https://us-zipcode.api.smartystreets.com/lookup";
		
		
		 UriComponents uricomps= UriComponentsBuilder.fromHttpUrl(Baseurl).queryParams(queryParams).build();
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
