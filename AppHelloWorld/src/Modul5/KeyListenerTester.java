
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Acer
 */
public class KeyListenerTester extends Frame implements KeyListener 
{

    TextField t1;
    Label l1;
public KeyListenerTester(String s ){
super(s);
    Panel p = new Panel();
    l1 = new Label ("Key Listener!");
    p.add(l1);
    add(p);
    addKeyListener ( this ) ;
    setSize ( 200,100 );
    setVisible(true);
    addWindowListener(new WindowAdapter()
{
    public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}

    @Override
    public void keyTyped(KeyEvent ke) {
       l1.setText("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l1.setText ("Key Pressed") ;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       l1.setText("Key Released");
    }
    public static void main (String[]args ) {
        new KeyListenerTester ("Key Listener Tester") ;
    }
}
