package dealer;

import dealer.personnelmanagement.CarSalesmanManager;

public class ManagerTest {
   public static void main(String[] args) {
      CarSalesmanManager manager = new CarSalesmanManager();
      
      manager.addSalesman(1, "John");
      manager.addSalesman(3, "Kelly");
      
      
      manager.getSalesman(1).makeSale(1000);
      manager.getSalesman(1).makeSale(700);
      manager.getSalesman(1).makeSale(2000);
      manager.getSalesman(1).makeSale(2500);
      
      System.out.println(manager.getSalesman(1).querySale());
      System.out.println(manager.getSalesman(1).queryCommission());


      manager.getSalesman(3).makeSale(2000);
      manager.getSalesman(3).makeSale(700);
      manager.getSalesman(3).makeSale(800);
      manager.getSalesman(3).makeSale(4500);
      
      System.out.println(manager.getSalesman(3).querySale());
      System.out.println(manager.getSalesman(3).queryCommission());   
   }
}