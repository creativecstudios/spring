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

// when client asks request to 'about' or 'home' or... page we should call the particular page by executing a method. But spring doesn't know how to accept the request // and where the method is. So we use @RequestMapping("home") above that method.

	@RequestMapping("about")
	public String about() {
  
  // usually spring allows us to loose coupling by reducing the call like about.jsp 
  // we just return 'about' (i.e the name of the file)  dont need to reperesent the extension such as .jsp,.html,etc.
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

![Screenshot 2021-06-18 182043](https://user-images.githubusercontent.com/63385985/122563609-04277800-d062-11eb-8c21-184dfbe0393c.png)

# Accepting Client data

```java
@RequestMapping("home")
public String hello(HttpServeletRequest req){
	HttpSession session = req.getSession();
	String name = req.getParameter("name");
	session.setAttribute("name",name);
	//exactly don't know but, session acts as temperory storage. it holds the data during particular interval of time.
	System.out.println("name");
	return "Hello";
}

```
### JSP file which prints the data
```html
<body>
	<p> Hi my name is ${name}</p>
</body>
${} --> represents jstl or el (expression language)
```
# ModelAndView
Spring boot reduces all those difficulties such as HttpServeletRequest,HttpServeletResponse.... by replacing ModelAndView

```java
	@RequestMapping("home")
	public ModelAndView hello(@RequestParam("name") String myName){
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
		
		return mv;
	}
```
## Model view object

```java
@RequestMapping("home")
	public ModelAndView show(Employee emp) {
		
	ModelAndView mv = new ModelAndView();	
	mv.addObject("obj",emp);
	mv.setViewName("Home");
		return mv;
	}
	
```
![Screenshot 2021-06-18 213955](https://user-images.githubusercontent.com/63385985/122589713-3e067780-d07e-11eb-945f-b557422aa8dd.png)
