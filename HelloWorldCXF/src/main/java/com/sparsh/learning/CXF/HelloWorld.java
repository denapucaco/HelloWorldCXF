package com.sparsh.learning.CXF;

import javax.jws.WebService;

/**
 * 
 * @author Prashant Swamy
 *
 */

@WebService
public interface HelloWorld {
	String sayHi(String text);
}