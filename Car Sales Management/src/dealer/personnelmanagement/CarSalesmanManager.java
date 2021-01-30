package dealer.personnelmanagement;

/*
This class describes a salesman manager with the following parameters

   numOfSalesman
   array to hold numOfSalesman
   
methods

   constructors:
   default-initalize array to hold 10 salesman
   specified parameter-number of salesman the manager can hold
   getSalesMan(id), returns salesman object whos id is given if no return then return "null"
   
*/
import dealer.personnel.CarSalesman;

public class CarSalesmanManager {
   private int numOfSalesman; // set the number of salesman that will be used later
   private CarSalesman[] salesmen;

   public CarSalesmanManager() { // default constructor named CarSalesmanManager
      this.numOfSalesman = 0; // set number of salesman to 0
      this.salesmen = new CarSalesman[10]; // set the number each manager holds which is up to 10 salesman       
   }

   public CarSalesmanManager(int capacity) { // default constructor named CarSalesmanManager to set capacity for the manager
      this.numOfSalesman = 0; // set number of salesman to 0
      this.salesmen = new CarSalesman[capacity]; // set the capacity each manager can hold       
   }

   public void addSalesman(int id, String name) {
      // find the salesman 
      for (int i = 0; i < numOfSalesman; i++) { // for loop to check if there is a salesman there
         if (salesmen[i].getId() == id) { // if the loop finds a Id that matches
            return; // it returns
         }
      }

      salesmen[numOfSalesman] = new CarSalesman(id, name); // if it does not find the salesman then it adds a new salesman by id and name
      numOfSalesman++; // increments the number of salesman by one
   }

   public CarSalesman getSalesman(int id) {
      // find the salesman 
      for (int i = 0; i < numOfSalesman; i++) { // for loop to check for a salesman
         if (salesmen[i].getId() == id) { // if the loop finds an id that matches
            return salesmen[i]; // it returns the salesman
         }
      }

      return null; // if finds it then it will return null
   }
}