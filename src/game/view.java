/*
* This is the GUI that formats a list of things I like
 */
package game;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;






 import java.awt.*;
 import java.util.*;
 import java.applet.Applet;

 public class View extends Applet {

     protected void makebutton(String name, GridBagLayout gridbag, GridBagConstraints c) {
         Button button = new Button(name);
         gridbag.setConstraints(button, c);
         add(button);
     }

     public void init() {
         GridBagLayout gridbag = new GridBagLayout();
         GridBagConstraints c = new GridBagConstraints();
         GridBagConstraints e = new GridBagConstraints();
         GridBagConstraints i = new GridBagConstraints();

         setFont(new Font("TimesNewRoman", Font.PLAIN, 14));
         setLayout(gridbag);

         c.fill = GridBagConstraints.BOTH;
         c.weightx = 4.0;
         
         i.fill = GridBagConstraints.BOTH;
         i.weightx = 0.5;
         i.gridheight = 2;
         
         e.fill = GridBagConstraints.BOTH;
         e.weightx = 4.0;
         e.gridwidth = GridBagConstraints.REMAINDER;
         
         makebutton("name", gridbag, c);
         makebutton("serial no.", gridbag, e);
         
         makebutton("keywords", gridbag, e);

         makebutton("team ability", gridbag, c);
         makebutton("team ability", gridbag, c);
         makebutton("", gridbag, e);
         
         makebutton("+", gridbag, e);//come back later and uncenter...
         
         makebutton("*", gridbag, c);
         makebutton("flavor", gridbag, e);
         
         makebutton("I", gridbag, i);
         makebutton("#", gridbag, c);
         makebutton("flavor", gridbag, e);
         makebutton("power", gridbag, e);
         
         makebutton("I", gridbag, i);
         makebutton("#", gridbag, c);
         makebutton("flavor", gridbag, e);
         makebutton("power", gridbag, e);

         makebutton("I", gridbag, i);
         makebutton("#", gridbag, c);
         makebutton("flavor", gridbag, e);
         makebutton("power", gridbag, e);
         
         makebutton("I", gridbag, i);
         makebutton("#", gridbag, c);
         makebutton("flavor", gridbag, e);
         makebutton("power", gridbag, e);
         
         makebutton("Point Value: ", gridbag, c);
         makebutton("#", gridbag, e);
         
         makebutton("Rarity: ", gridbag, c);
         makebutton("value", gridbag, e);
         
         makebutton("Real Name: ", gridbag, c);
         makebutton("value", gridbag, e);

         setSize(300, 100);
     }

     public static void main(String args[]) {
         Frame f = new Frame("GridBag Layout Example");
         View ex1 = new View();

         ex1.init();

         f.add("Center", ex1);
         f.pack();
         f.setSize(f.getPreferredSize());
         f.show();
     }
 }