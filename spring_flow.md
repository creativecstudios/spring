## List of Packages 
* Controller package
* Entity  package
* Service  package
* Repository  package

 In Controller package we create a Controller class
 
 In Entity package, we add the variables that are to be inserted to database or got from user.
 
 In Service package, a service class(service implementation) created that implements the service interface we created. For the service class we use @Service.
  
 In Repository package, we create a interface of repository which extends JPA repository class.
 
 ## Entity
 
 1) In entity class, we make the class @Entity and add primary key and make it as auto increment by using @Generate(Strategy = 


As I am creating the REST Api using @Postmapping()  that is post request i'll be do from any of the rest client, I'll be passing the request body as well.
So that will be the entire JSON object that I'll be passing here. what i want is the total JSON object coming over here and converting entire JSON object 
into my particular entity.
``` Java
@Postmapping("/departments")
public Department savedepartment(@RequestBody Department department) 
{
  
}
 ```

### Here the Request body is the request from the rest client as a JSON object which will convert it into our Department object that is our entity object.

#### To save the department, we have to call Service layer to pass this data and from that service layer we will do business logic and after doing logic we will call repository layer to save the particular data here.
