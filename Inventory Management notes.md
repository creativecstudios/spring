# Stock Management

## Add Stocks page
  1 There are 6 input fields
  * Category
  * Stock Name
  * Quantity
  * Base-price
  * Profit
  * Pxpiry-date
    and two buttons 
  * Submit and Reset.
 
2 When submit button clicked it Does basic form validation.

3 Along with it will restricts duplicate stockname if the user enter existing stock name. It will display an alert message that "stock name already exists". 

4 I used Response Entity for exception handling in the backend. This response will be hited in the UI when the user inputs excisting stockname.

5 Also after clicking submit button the input fields get reseted for next new input.

6 To post the entered data I used ajax Post method with submit button.

7 Reset Button will perform reset operation.

## View Stocks

8 To view stock table I used $.getJSON method. The table has two buttons in its last column namely Edit and Delete.

9 I used JPA repository in Springboot for all these operation and also done all these using JDBC template but not with UI.

10 I used @Qualifier("service1 or service2") anotation to map the service class when more than one service class exists.





