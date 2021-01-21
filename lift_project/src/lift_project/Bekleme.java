
package lift_project;

import java.util.logging.Level;
import java.util.logging.Logger;
/*

!!! BU KOD PARÇACAĞI YAZILIRKEN İNTERNETTEN YARDIM ALINMIŞTIR 

KAYNAK : https://ufukuzun.wordpress.com/2015/02/14/javada-multithreading-bolum-1-merhaba-thread/

*/

public class Bekleme implements Runnable{
    int ms;
    //ms beklenecek süreyi belirler
    public Bekleme(int ms) {
        this.ms = ms;
    }   
    @Override
    public void run() {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Bekleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
