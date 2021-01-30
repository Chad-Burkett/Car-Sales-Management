package dealer.personnel;

/*
This class describes a salesman with the following parameters:

Parameters:
   id
   name
   totalSales
   totalCommission
*/

public class CarSalesman {
   private int id; // initialize the id number of the salesman
   private String name; // initialize the name of the salesman
   private int totalSales; // initialize the total sale of the salesman
   private int totalCommission; // initialize the total commission of the salesman

   public CarSalesman() { // create a default constructor that sets the name
      this.name = ""; // creates a field to hold a name
   }

   public CarSalesman(int id, String name) { // create a CarSalesman parameterized constructor to hold id and name
      this.id = id; // sets id to id specified
      this.name = name; // sets name to name specified
   }

   public int getId() { // set method to get the salesman id

      return id; // return that id
   }

   public void makeSale(double amount) { // create a makeSale mathod to store the amount per sale and calculate the commission
      this.totalSales += amount; // add totalSales to amount

      double commission = 0; // set commission to default 0
      if (amount > 2000) { // if the sale amount is greater than $2,000
         commission = 50 + (amount - 2000) * 0.1; // then commission goes through a calculation to determine the commission for the sale
      } else if (amount > 1000) { // if the sale amount is greater than $1,000
         commission = (amount - 1000) * 0.05; // then commission goes through a calculation to determine the commission for the sale
      }

      this.totalCommission += commission; // set the default totalCommission to the new commission number	   
   }

   public double querySale() { // create a querySale method

      return totalSales; // return the total sale
   }

   public double queryCommission() { // create a queryCommission method

      return totalCommission; // return the total commission that was given on line "39"
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
