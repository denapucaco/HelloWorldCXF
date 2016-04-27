package com.sparsh.learning.CXF;

import javax.jws.WebService;

/**
 * 
 * @author Prashant Swamy
 *
 */

@WebService(endpointInterface = "com.sparsh.learning.CXF.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		return "Hello " + text;
	}
}