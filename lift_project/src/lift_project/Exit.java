package lift_project;

import java.util.ArrayList;
import java.util.Random;


public class Exit extends Thread {
    
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
        int flo;
        
        Bekleme bekle_exit = new Bekleme(1000);
        
    public Exit(ArrayList<Integer> lift_0,ArrayList<Integer> lift_1, ArrayList<Integer> lift_2,ArrayList<Integer> lift_3,ArrayList<Integer> lift_4,ArrayList<Integer> floors_0,ArrayList<Integer> floors_1,ArrayList<Integer> floors_2,ArrayList<Integer> floors_3,ArrayList<Integer> floors_4 ){
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
    public void run(){
        
         while(true){
           
        bekle_exit.run();
        
        Random r = new Random();
        int exitt = (r.nextInt(5)+1);
        exitt = exitt+customer;
       System.out.println();
        System.out.println("Çıkmak İçin Kuyruğa Alınan Müşteri Sayısı : "+exitt);
        
        
        
        
        for (int i = 0; i < exitt; i++) {
            flo=r.nextInt(4)+1;
            
            if(flo==1){
                synchronized(floors_1){
                    floors_1.add(0);
                    System.out.println("1. katta çıkış istiyor");
                }
                
            }if(flo==2){
                synchronized(floors_2){
                    floors_2.add(0);
                    System.out.println("2. katta çıkış istiyor");
                }
            }if(flo==3){
                synchronized(floors_3){
                    floors_3.add(0);
                    System.out.println("3. katta çıkış istiyor");
                }
            }if(flo==4){
                synchronized(floors_4){
                    floors_4.add(0);
                    System.out.println("4. katta çıkış istiyor");
                }
            }
            
            
            
        }             System.out.println();
                      System.out.println("1.Katta "+floors_1.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("2.Katta "+floors_2.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("3.Katta "+floors_3.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("4.Katta "+floors_4.size()+" Kişi Çıkış Bekliyor");
                      System.out.println();
                      
        
        
        
        
             }
        
        
        
    }
     
    
}
