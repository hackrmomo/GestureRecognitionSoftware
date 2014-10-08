package midend;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import frontend.DebugFrame;

public class Keyboard implements KeyListener {

    private static boolean keys[] = new boolean[65535];

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        if (e.getKeyCode() == 'D' || e.getKeyCode() == 'd') {
            DebugFrame df = new DebugFrame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static boolean isKeyDown(int keyCode) {
        return keys[keyCode];
    }
    
}
