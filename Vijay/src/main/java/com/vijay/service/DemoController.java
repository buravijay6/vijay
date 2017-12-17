package com.vijay.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/file")
public class DemoController {


	@RequestMapping(value = "/name", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getfileNames1() throws Exception {
		
		return new ResponseEntity<String>("Vijay", HttpStatus.OK);

	}
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> getfileNames() throws Exception {
		
		return new ResponseEntity<String>("Vijay", HttpStatus.OK);

	}

}
