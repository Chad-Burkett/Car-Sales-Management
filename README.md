# Car-Sales-Management
The entirety of this program is:

Have a class for the Car Salesperson(s) that has their info related to them.
    Info Related: ID, Name, Total Sales, Total Commission.

Have a class for the Car Salesperson(s) Managers that has the amount of Salesperson allowed per Manager, a method to add a Salesman if the id and name searched for is not in the array,      a method for getting the Salesman whose id is specified, if there is no such Salesperson, it will return null.

Have a ManagerTest to test the implementation.

Commission is based off the following formula:

If the sales amount (per sale, not the total sales amount) is smaller than $1000, no commission.
If the sales is from $1000 to $2000, the salesperson will earn 5% of the amount that is larger than $1000.
If the sales is larger than $2000, the salesperson will earn 50 plus 10% of the amount that is larger than $2000.

To calculate the Commission per Salesman, the program follows these guidelines:

  1. If they sell an item for $700, they earn $0 Commission.
  2. If they sell an item for $1400, they will earn (1400 - 1000) * 5% so $20 Commission.
  3. If they sell an item for $4000, they will earn $50 + (4000 - 2000) * 10% so $250 Commission.
