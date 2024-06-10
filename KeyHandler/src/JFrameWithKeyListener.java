import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class JFrameWithKeyListener extends JFrame {
    public JFrameWithKeyListener() {
        setTitle("Key Listener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a JTextArea to receive key events
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        // Add a KeyListener to the JTextArea
        textArea.addKeyListener(new MyKeyListener());
        // Add the JTextArea to the JFrame
        add(textArea);
        // Set the JFrame to be focusable so that it can receive key events
        setFocusable(true);
    }
    // Custom KeyListener implementation
    private class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            // Invoked when a key is typed (pressed and released)
            // Not used in this example
        }
        @Override
        public void keyPressed(KeyEvent e) {
            // Invoked when a key is pressed down
            char keyChar = e.getKeyChar();
            int keyCode = e.getKeyCode();
            // Display key information in the JTextArea
            JTextArea textArea = (JTextArea) getContentPane().getComponent(0);
            textArea.append("Key Pressed: " + keyChar + " (Code: " + keyCode + ")\n");
        }
        @Override
        public void keyReleased(KeyEvent e) {
            // Invoked when a key is released
            // Not used in this example
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrameWithKeyListener frame = new JFrameWithKeyListener();
            frame.setVisible(true);
        });
    }
}