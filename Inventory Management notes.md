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
 
When submit button clicked it Does basic form validation along with it will restricts duplicate stockname if user enter existing stock name it will display an alert message that stock name already exists. Also after clicking submit button the input fields get reseted for next new input.

To post the entered data I used ajax Post method with submit button.

Reset Button will perform reset operation.

## View Stocks

To view stock table I used $.getJSON method. The table has two buttons in its last column Edit and Delete.


