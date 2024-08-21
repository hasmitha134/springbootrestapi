package com.example.springbootrestapi;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	
	private RestTemplate restTemplate;
	
	public String getUser() {
		String url="https://reqres.in/api/users/2";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String senduser() {
		String url = "https://reqres.in/api/users";
		
		Map<String ,String> body = new HashMap<>(); 
		body.put("name", "sampleuser"); 
		body.put("job", "trainer");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Map<String,String>> request= new HttpEntity<>(body,headers);
		return restTemplate.exchange(url, HttpMethod.POST,request,String.class).getBody();
		
		
	}

	

}
