package the_app;

import frontend_viewcontroller.DebugWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class GRS {

    public static void main(String[] args) {
        
        try {
            DebugWindow dw = new DebugWindow();
            dw.reInit();
            System.out.print("Program Executed");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GRS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
