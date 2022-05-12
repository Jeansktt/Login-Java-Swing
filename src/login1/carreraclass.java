/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 34680
 */
public class carreraclass extends Thread{
    private JLabel eti;
    private carrera p;
    
    public carreraclass(JLabel eti, carrera p){
    this.eti= eti;
    this.p= p;
    }
    
    public void run(){
    int c1=0, c2=0;    
        while (true) {            
            try {
                sleep((int)(Math.random()*1000));
                c1=p.coche1().getLocation().x;
                c2=p.coche2().getLocation().x;
                if(c1<p.txt_meta().getLocation().x-10&&c2<p.txt_meta().getLocation().x-10){
                    eti.setLocation(eti.getLocation().x+10, eti.getLocation().y);
                    p.repaint();
                }else{
                    break;
                }
            } catch (InterruptedException e) {
            }
            if(eti.getLocation().x>=p.txt_meta().getLocation().x-10){
                if(c1>c2){
                    JOptionPane.showMessageDialog(null, "Gano coche 1");
                }else if(c2>c1){
                    JOptionPane.showMessageDialog(null, "Gano coche 2");
                }else{
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }
}
