package lift_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Login extends Thread {
    
        ArrayList<Integer> lift_0 ;
        ArrayList<Integer> lift_1 ;
        ArrayList<Integer> lift_2 ;
        ArrayList<Integer> lift_3 ;
        ArrayList<Integer> lift_4 ;
        ArrayList<Integer> floors_0 ;
        ArrayList<Integer> floors_1 ;
        ArrayList<Integer> floors_2 ;
        ArrayList<Integer> floors_3 ;
        ArrayList<Integer> floors_4 ;
        
        int floor[] = {0,1,2,3,4};
        int customer=0;
        
        Bekleme bekle_login = new Bekleme(500);
        
    public Login(ArrayList<Integer> lift_0,ArrayList<Integer> lift_1, ArrayList<Integer> lift_2,ArrayList<Integer> lift_3,ArrayList<Integer> lift_4,ArrayList<Integer> floors_0,ArrayList<Integer> floors_1,ArrayList<Integer> floors_2,ArrayList<Integer> floors_3,ArrayList<Integer> floors_4 ){
       this.floors_0=floors_0;
       this.floors_1=floors_1;
       this.floors_2=floors_2;
       this.floors_3=floors_3;
       this.floors_4=floors_4;
       this.lift_0=lift_0;
       this.lift_1=lift_1;
       this.lift_2=lift_2;
       this.lift_3=lift_3;
       this.lift_4=lift_4;
    }
    
    
    
    @Override
    public void run() {
        
       while(true){
           
        bekle_login.run();
        
        Random r = new Random();
        int login = (r.nextInt(10)+1);
System.out.println();
        System.out.println("Giriş Kat Kuyruğa eklenen kişi sayısı : "+login);
        
        int adaa=0;
        
        System.out.println("Giriş Kat Kuyruğa eklenen kişiler ");
        for (int i = 0; i < login; i++) {
            synchronized(floors_0){
                floors_0.add(r.nextInt(4)+1); //Binaya girenler hangi katlara çıkacak
                System.out.println(floors_0.get(i)+" inci kata gidecek");
            }
            
        }System.out.println();
        System.out.println("Giriş Kat Sıra Durumu");
        for (int i = 0; i <floors_0.size() ; i++) {
            synchronized(floors_0){
                 //Binaya girenler hangi katlara çıkacak
                System.out.println(floors_0.get(i)+" inci kata gidecek");
            }
            
        }
        
           
        }
    }
    
    
}
