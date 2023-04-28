//Copy pasted from DemoApplication.java
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;

//RestController and GetMapping are built-in
@RestController 
public class DemoController //Annotating entire class to be a part of RestController
{
	@PostMapping("/palindrome")
	public String print(@RequestBody Map<String,String> data)
	{
		String str = data.get("pal_input");
		Palindrome ob = new Palindrome();
		String subStr = ob.answer(str);
		return subStr;
	}
}

/*
1. Go to where mvnw file is there and type ./mvnw spring-boot:run

2. Any controller is for mapping and displaying output only. 
   Not for writing codes. So we shouldn't be writing our codes here.
   
3. Controller is a servlet that runs continuously waiting for Request.
*/
