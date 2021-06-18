## Create A class naming Prem under 
![Screenshot from 2021-06-18 08-26-01](https://user-images.githubusercontent.com/63385985/122499673-ef6dc480-d00e-11eb-9056-3fee356186cc.png)

### Add some Porperties into it.

```java
    package com.ccs.mywebapp;
@Component
public class Prem {

	private String name;
	private int id;
	private int age;
	private String city;
	
	@Autowired
	private Laptop laptop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//add one more method
	
	public void printsomething() {
		System.out.println("Hi I am from Prem Class");
		laptop.laptopmethod();
	}
}
```

![Screenshot from 2021-06-18 08-27-47](https://user-images.githubusercontent.com/63385985/122499769-1b894580-d00f-11eb-9f2a-9e1e6f2c98c2.png)

Here in above image THe annotation @SpringBootApplication denotes that this is the starting point of my project 

```java
public static void main(String[] args) {
		SpringApplication.run(MywebappApplication.class, args);
		
	}
```
The springApplication.run(parameter1 ,parameter2) has two parameters.One is where to start the flow of the projet (i.e my main class name) and Second is args.

```java
package com.ccs.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MywebappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MywebappApplication.class, args);
		
		Prem obj = context.getBean(Prem.class);
		
		obj.printsomething();
		
	}

}
```
![Screenshot from 2021-06-18 08-38-46](https://user-images.githubusercontent.com/63385985/122500565-aa4a9200-d010-11eb-90d7-cbc311c702a7.png)

## Now I am going to create another class called laptop because prem need laptop
Prem depends upon laptop to do practicing codes

```java
package com.ccs.mywebapp;

import org.springframework.stereotype.Controller;

@Component
public class Laptop {

	private String comapnyname;
	private String modelname;
	private int price;
	
	public String getComapnyname() {
		return comapnyname;
	}
	public void setComapnyname(String comapnyname) {
		this.comapnyname = comapnyname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [comapnyname =" + comapnyname + ", modelname=" + modelname + ", price=" + price + "]";
	}
	
	public void laptopmethod() {
		System.out.println("Hey Hi I am form Laptop class");
	}
	
	
}

```
![Screenshot from 2021-06-18 08-45-49](https://user-images.githubusercontent.com/63385985/122501090-a66b3f80-d011-11eb-9cb4-90486eca6e74.png)


# There are two different class in spring 
# singleton class and prototype class
## @Controller refers to singleton class and @Scope(value="prototype") refers to prototype

### Singleton class in Java
* create static instance of the class
* make the constructor as private
* create a static method which return the instance of the class.

```java

class abc{

	public static void main(String args[]){
		Singleton obj = Singleton.getinstance();
	}
class Singleton{
	static Singleton obj = new Singleton();
	
	private Singleton(){
	
	}
	
	public static Singleton getinstance(){
		return obj;
	}
	
}
}
```

@AutoWired which is used to connect between prem and laptop class
 now laptop class inject its dependency to prem class
 
 * Also calling by name of the class
 * Using Qualifier
 ![Screenshot from 2021-06-18 11-32-53](https://user-images.githubusercontent.com/63385985/122514201-2e107880-d029-11eb-8589-8bd43a0b4ff0.png)
![Screenshot from 2021-06-18 11-33-15](https://user-images.githubusercontent.com/63385985/122514209-2fda3c00-d029-11eb-99ff-58b05f26dd68.png)


