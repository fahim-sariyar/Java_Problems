# A university is developing a simple Digital Wallet System to help students track their personal balance. 

## Create a class named Wallet that contains two instance variables: 

ownerName of type String and balance of type double. 
The class must also maintain a static variable totalWallets to keep track of how many Wallet objects have been created.
All instance variables must be initialized using a constructor, and each time a new wallet object is created, the constructor must increment the total Wallets variable. 
The Wallet class should include methods add_money and spend_mone. 
The addMoney method should increase the balance by the given amount and return the current object, while the spend Money method should decrease the balance and also return the current object. 
Another method, showStatus(), should display the wallet owner's name along with the current balance.
A static method named getTotalWallets() should return the total number of wallet objects created. 
All methods and variables handling balance or money should be able to handle fractional numbers.

### In the main method, create a Wallet object using your own name as the wallet owner and initialize the wallet balance using your full ID number. Then call the spendMoney() method using the last four digits of your ID as the spending amount. Finally, display the wallet status and print the total number of wallet objects created using the static method.
