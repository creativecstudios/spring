# Stock Management

## Add Stocks page
  There are 6 input fields
  * Category
  * Stock Name
  * Quantity
  * Base-price
  * Profit
  * Pxpiry-date
    and two buttons 
  * Submit and Reset.
 
When submit button clicked it Does basic form validation.

Along with it will restricts duplicate stockname if user enter existing stock name it will display an alert message that stock name already exists. 

Also after clicking submit button the input fields get reseted for next new input.

To post the entered data I used ajax Post method with submit button.

I used Response Entity for exception handling in the backend. This response will be hited when user enter excisting stockname.

Reset Button will perform reset operation.

## View Stocks

To view stock table I used $.getJSON method. The table has two buttons in its last column namely Edit and Delete.

I used JPA repository in Springboot for all these operation and also done all these using JDBC template but not with UI.

I used @Qualifier("service1 or service2") anotation to map the service class when more than one service class exists.





