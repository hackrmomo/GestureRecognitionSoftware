package frontend_view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class GRS {

    public static void main(String[] args) {
        try {
            DebugWindow dw = new DebugWindow();
            dw.reInit();
            System.out.print("SWAG");
            //BackgroundPlatform.initialize();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GRS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GRS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GRS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GRS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
