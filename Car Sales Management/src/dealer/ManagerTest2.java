package dealer;

import dealer.personnelmanagement.CarSalesmanManager;
import java.util.Scanner;

public class ManagerTest2 {
   public static void main(String[] args) {
      CarSalesmanManager manager = new CarSalesmanManager(6);
      Scanner stdin = new Scanner(System.in);
      
      while(stdin.hasNext()) {
         String action = stdin.next();
         
         switch(action) {
            case "add":
               manager.addSalesman(stdin.nextInt(), stdin.next());
               break;
            case "qs":
               System.out.println(manager.getSalesman(stdin.nextInt()).querySale());
               break;
            case "qc":
               System.out.println(manager.getSalesman(stdin.nextInt()).queryCommission());
               break;
            case "sell": 
               manager.getSalesman(stdin.nextInt()).makeSale(stdin.nextDouble());
               break;
         }
      }
      
      stdin.close();
   }
}