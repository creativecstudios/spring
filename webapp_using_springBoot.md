## To open a webapp in browser we want a @Controller

To make a class as a Controller use @Controller at the top of the class
![Screenshot 2021-06-18 175310](https://user-images.githubusercontent.com/63385985/122560343-215a4780-d05e-11eb-9c98-c845a05b75fb.png)

### To create a view we want .jsp file
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	I love java
</body>
</html>
```

In spring there is no inbuilt jsp dependency so we add Tomcat-jasper dependency to the pom.xml file

![Screenshot 2021-06-18 175647](https://user-images.githubusercontent.com/63385985/122560747-9ded2600-d05e-11eb-9fc0-2bfdbd820ea9.png)

## To open our webappview (home.jsp) in webbrowser we use @RequestMapping

![Screenshot 2021-06-18 180217](https://user-images.githubusercontent.com/63385985/122561316-5a46ec00-d05f-11eb-8611-739840d3c452.png)

```java
package com.ccs.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	@RequestMapping("home")
	public String show() {
		return "Home";
	}

// when client asks request to about or home or... page the spring dosen't no where to call the about or home or... page 
// To indicate that we use @Requestmappint befor the method

	@RequestMapping("about")
	public String about() {
  
  // usually spring allows us to loose coupling by reducing the call like about.jsp 
  // we just return about (i.e) the name of the file dont need to reperesent the extension such as .jsp,.html,etc.
  // Fot that we use application.properties mentioned below
  
		return "About";
	}
}
```
## application.properties
```java
spring.mvc.view.prefix=/pages/
spring.mvc.view.suffix=.jsp
```
