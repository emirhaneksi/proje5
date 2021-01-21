package lift_project;

import java.util.ArrayList;
import java.util.Random;


public class Lift_project {

  
    public static void main(String[] args) {
         ArrayList<Integer> lift_0 = new ArrayList<>();
        ArrayList<Integer> lift_1 = new ArrayList<>();
        ArrayList<Integer> lift_2 = new ArrayList<>();
        ArrayList<Integer> lift_3 = new ArrayList<>();
        ArrayList<Integer> lift_4 = new ArrayList<>();
       
        ArrayList<Integer> floors_0 = new ArrayList<>();// zemin katta kaç kişi var ? 
        ArrayList<Integer> floors_1 = new ArrayList<>();// birinci katta kaç kişi var ?
        ArrayList<Integer> floors_2 = new ArrayList<>();// ikinci katta kaç kişi var ?
        ArrayList<Integer> floors_3 = new ArrayList<>();// üçüncü katta kaç kişi var ?
        ArrayList<Integer> floors_4 = new ArrayList<>();// dördüncü katta kaç kişi var ?
        
       Bekleme bekle_login = new Bekleme(500); // Binaya girerken bekleme süresi : 500ms
       Bekleme bekle_exit = new Bekleme(1000); // Binadan çıkarken bekleme süresi : 1000ms
       Bekleme bekle_lift = new Bekleme(200); //Asansörlerin katlar arası geçişi : 200ms
       
       
       System.out.println("**********************AVM Asansör Sistemi*********************************");
       System.out.println();
       
       Login log = new Login(lift_0,lift_1,lift_2,lift_3,lift_4,floors_0,floors_1,floors_2,floors_3,floors_4);
       log.start();
       
       Exit ex = new Exit(lift_0,lift_1,lift_2,lift_3,lift_4,floors_0,floors_1,floors_2,floors_3,floors_4);
       ex.start();
       
       Lift lift= new Lift(lift_0,lift_1,lift_2,lift_3,lift_4,floors_0,floors_1,floors_2,floors_3,floors_4);
       lift.start();
      
    }
}