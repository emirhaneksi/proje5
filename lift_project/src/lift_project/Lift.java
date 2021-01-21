/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lift_project;

import java.util.ArrayList;

/**
 *
 * @author erdem
 */
public class Lift extends Thread{
    
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
       int waiting;
       int buff;
       int waitbuf;
        int lift0floor=0;
         Bekleme bekle_lift = new Bekleme(200);
         int a1;
        
    public Lift(ArrayList<Integer> lift_0,ArrayList<Integer> lift_1, ArrayList<Integer> lift_2,ArrayList<Integer> lift_3,ArrayList<Integer> lift_4,ArrayList<Integer> floors_0,ArrayList<Integer> floors_1,ArrayList<Integer> floors_2,ArrayList<Integer> floors_3,ArrayList<Integer> floors_4 ){
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
            
       System.out.print(" ");
       synchronized(floors_0){
             buff=floors_0.size()+floors_1.size()+floors_2.size()+floors_3.size()+floors_4.size();
       }
      
        waiting=buff;
        
        if(waiting>10 && waiting<21){
            System.out.println("-----------------------1. ve 2. Asansör devreye girmeli----------Katlarda Toplam Bekleyen"+waiting);
        }else if(waiting>20 && waiting<31){
            System.out.println("-----------------------1. 2. ve 3. Asansör devreye girmeli----------Katlarda Toplam Bekleyen"+waiting);
        }else if(waiting>30 && waiting<41){
            System.out.println("-----------------------1. 2. 3. ve 4. Asansör devreye girmeli----------Katlarda Toplam Bekleyen"+waiting);
        }else if(waiting>40 && waiting<51){
            System.out.println("-----------------------1. 2. 3. 4. ve 5. Asansör devreye girmeli----------Katlarda Toplam Bekleyen"+waiting);
        }
        
        
        if(1<=waiting){
            System.out.println();
            System.out.println("1.Asansor Çalıştı");
            if(floors_0.size()<10){
                waitbuf=floors_0.size();
            }else if(floors_0.size()>=10){
                waitbuf=10;
            }
           System.out.println("Asansordeki kişi sayısı"+waitbuf);
             for(int i=0; i<waitbuf ;i++){
               lift_0.add(floors_0.get(i));
               
               System.out.println("Asansörden "+lift_0.get(i)+" inci katta inecek");
                }
             
             for(int i=0; i<waitbuf-1 ;i++){
              
               floors_0.remove(0);
              
                }
             
             
             
             for(int j = 0; j < lift_0.size(); j++){
                 if(lift_0.get(j)==1){          
                 
                 bekle_lift.run();
                 lift0floor=1;
                 
                 
                 }
                 
             }
             
             if(lift0floor==1){
             for (int i = 0; i < lift_0.size(); i++) {
                   if(lift_0.get(i)==1){           //Eğer asansördeki i. kişi 1. kata girecekse indir
                       waitbuf--;
                       System.out.println("Birinci kata bir kişi indi");
                    }
                  }
             }
             
             
             
             
             
             
             for(int j = 0; j < lift_0.size(); j++){
                 if(lift_0.get(j)==2){          
                 
                 if(lift0floor==0){
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==1){
                     bekle_lift.run();
                 }
                 lift0floor=2;
                 
                 
                 }
                 
             }
             if(lift0floor==2){
             for (int i = 0; i < lift_0.size(); i++) {
                   if(lift_0.get(i)==2){           //Eğer asansördeki i. kişi 1. kata girecekse indir
                       waitbuf--;
                       System.out.println("İkinci kata bir kişi indi");
                    }
                  }
             }
             
             
             
             
             
             for(int j = 0; j < lift_0.size(); j++){
                 if(lift_0.get(j)==3){          
                 
                 if(lift0floor==0){
                     bekle_lift.run();
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==1){
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==2){
                     bekle_lift.run();
                 }
                 lift0floor=3;
                 
                 
                 }
                 
             }
             if(lift0floor==3){
             for (int i = 0; i < lift_0.size(); i++) {
                   if(lift_0.get(i)==3){           //Eğer asansördeki i. kişi 1. kata girecekse indir
                       waitbuf--;
                       System.out.println("Üçünci kata bir kişi indi");
                    }
                  }
             }
             
             
             
             
             
             for(int j = 0; j < lift_0.size(); j++){
                 if(lift_0.get(j)==4){          
                 
                 if(lift0floor==0){
                     bekle_lift.run();
                     bekle_lift.run();
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==1){
                     bekle_lift.run();
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==2){
                     bekle_lift.run();
                     bekle_lift.run();
                 }else if(lift0floor==3){
                     bekle_lift.run();
                    
                 }
                 lift0floor=4;
                 
                
                 }
                 
             }
             if(lift0floor==4){
              for (int i = 0; i < lift_0.size(); i++) {
                   if(lift_0.get(i)==4){           //Eğer asansördeki i. kişi 1. kata girecekse indir
                       waitbuf--;
                       System.out.println("Dörtüncü kata bir kişi indi");
                    }
                  }
             }
             
             
             
             if(waitbuf<1 ){
                 lift_0.clear();
                 System.out.println("Asansör Boşaldı");
             }
        
        if(lift0floor==1){
            a1=floors_1.size();
              floors_1.clear();
            bekle_lift.run();
        }else if (lift0floor==2){
            a1=floors_2.size();
            floors_2.clear();
            bekle_lift.run();
            if(a1<10){
                floors_1.clear();
            }
           
            bekle_lift.run();
        }else if(lift0floor==3){
            a1=floors_3.size();
            floors_3.clear();
            bekle_lift.run();
            if(a1<10){
                a1=a1+floors_2.size();
                floors_2.clear();
            }
             bekle_lift.run();
            if(a1<10){
                
                floors_1.clear();
            }
           
            bekle_lift.run();
            
        }else if(lift0floor==4){
            a1=floors_4.size();
            floors_4.clear();
            bekle_lift.run();
            if(a1<10){
                a1=a1+floors_3.size();
                floors_3.clear();
            }
            bekle_lift.run();
            if(a1<10){
                a1=a1+floors_2.size();
                floors_2.clear();
            }
            bekle_lift.run();
            if(a1<10){
                
                floors_1.clear();
            }
            bekle_lift.run();
            
        }
            
                      System.out.println();
                      System.out.println("Asansör Turunu Tamamladı, Katlar Bu Durunmda ;");
                      System.out.println("1.Katta "+floors_1.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("2.Katta "+floors_2.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("3.Katta "+floors_3.size()+" Kişi Çıkış Bekliyor");
                      System.out.println("4.Katta "+floors_4.size()+" Kişi Çıkış Bekliyor");
                      System.out.println();   
        }
        
        
        
    }
    }
}
