package dealer;

import dealer.personnel.CarSalesman;

public class SalesmanTest {
   public static void main(String[] args) {
      CarSalesman csm1 = new CarSalesman();
      csm1.makeSale(1000);
      csm1.makeSale(700);
      csm1.makeSale(2000);
      csm1.makeSale(2500);
      
      System.out.println(csm1.querySale());
      System.out.println(csm1.queryCommission());

      CarSalesman csm2 = new CarSalesman(3, "John");
      csm2.makeSale(2000);
      csm2.makeSale(700);
      csm2.makeSale(800);
      csm2.makeSale(4500);
      
      System.out.println(csm2.querySale());
      System.out.println(csm2.queryCommission());   
      
   }
}