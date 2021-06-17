# Requirements for Spting
## Sring integrates with other farameworks like HIBERNATE, STRUTS...
   ### wHAT IS HIBERNATE
   Hibernate is an open source object relational mapping tool for Java. 
    It provides a framework for mapping an object-oriented domain model to a traditional relational database. ... 
    Mapping Java classes to database tables is accomplished through the configuration of an XML file or by using Java annotations.
   ### WHAT IS STRUTS
       
   Struts is an open source framework that extends the Java Servlet API and employs a Model, View, Controller (MVC) architecture. 
      It enables you to create maintainable, extensible, and flexible web applications based on standard technologies, 
      such as JSP pages, JavaBeans, resource bundles, and XML.

# Maven Repository
    * Maven is a repository which has all the required dependensy. 
    * It is like platform or like junction. 
    * where we able to get required dependensy  
    * At first starting of our project we need to dwonload required dependency form the Remote Server of Maven.'
    * once, It has been completed at the first time we dont need to do the same thing like downloading the dependency for our project
    * it will automatically create a local repositor in our system where we use the needful.
    
   ### The main Theme concept of Maven is to provide dependency 
   ### Not only Maven will provide all of these stuffs there are some other stuffs like Gradle..
#  xml
   xml is a ** Extensible MarkUp Language ** 
   Like in html there are inbuilt tags 
   ```html
      <b> Bold </b>
      <p> This is bold tag "<b> </b>" </p>
   ```
   We may also able to create our own tags we Extensible our own markup language
   ** xml ** does this
   
   There is a case where I want to get data form server the way to achieve thing is using html
   
   But I don't want the design tags I want only the data
   
   XML achieve this
   
   ```xml
      <?xml version="1.0" encoding="UTF-8"?>
 - <note>
       <to>Tove</to>
       <from>Jani</from>
       <heading>Reminder</heading>
       <body>Don't forget me this weekend!</body>
   </note>
   ```
  # JSON
 Java Script Object Notation
   Json is similar to xml it has some intresting freatures 
   However Json is considering as a standard format for transfering data in now a days
   
   But, why Json overrides the xml
   
      * In xml theres ia tag 
      * Each element has starting and closing tag which is complex one right
      
      * But in Json there is no such formats. It makes much easier for us.
   
   Json example
 
   ```json
           {"employees":[
           { "firstName":"John", "lastName":"Doe" },
           { "firstName":"Anna", "lastName":"Smith" },
           { "firstName":"Peter", "lastName":"Jones" }
         ]}
   ```
    
   ```xml
        <employees>
           <employee>
             <firstName>John</firstName> <lastName>Doe</lastName>
           </employee>
           <employee>
             <firstName>Anna</firstName> <lastName>Smith</lastName>
           </employee>
           <employee>
             <firstName>Peter</firstName> <lastName>Jones</lastName>
           </employee>
       </employees>
   ```
   ### Spring Initializer...
   
   When you ues eclipse or intelij ..Go to spring Initializer https://start.spring.io/ Generate the dependencies take the review If Ok then start generating the zip file and open the same in IDE
   
   Orelse simply Download Spring Tool Suite STS. https://spring.io/tools


# SERVELETS

## Servlets are Java classes which service HTTP requests and implement the javax
Web application developers typically write servlets that extend javax. ... HttpServlet, an abstract class that implements the Servlet interface and is specially designed to handle HTTP requests.
   when a client sends a request to server. server will respond the client as html page
   
   Suppose If the server does not have such file to respond for client what to do ? If it is DYNAMIC REQUEST
   
   Java provides different features called servelets.Ok, what does servelets do ?
   
   If a file not present in server the request goes to Web Container (TOMCAT,GLASSFISH, etc...) these are called Web Container.
   
   The webcontainer has a WEB.XML file This file decides which serverlet to call further the servlet will provide something back in the form of either html or jsor whatever it may be.
   
   
# MVC MODEL VIEW CONTROLLER

