/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 34680
 */
public class cambiocolor extends javax.swing.JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    
    
    public cambiocolor() {
        initComponents();
        //Parametros asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
 
        //Componentes
 
        JButton btnEligeUnColor = new JButton("Elige color");
        btnEligeUnColor.setBounds(10, 60, 137, 23);
        contentPane.add(btnEligeUnColor);
        
        JButton bttaplicar= new JButton("Aplicar");
        bttaplicar.setBounds(10, 170, 137, 23);
        contentPane.add(bttaplicar);
 
        lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(185, 64, 154, 91);
        contentPane.add(lblNewLabel);
 
        JLabel lblMuestraDeColor = new JLabel("Muestra de color");
        lblMuestraDeColor.setBounds(200,200,200,200); 
        contentPane.add(lblMuestraDeColor);
 
        //Eventos
 
        btnEligeUnColor.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
 
                //Mostramos el dialogo, indicamos el panel, el titulo del dialogo y un color por defecto
                //Devuelve un color
                Color color=JColorChooser.showDialog(contentPane, "Elige un color", Color.BLACK);
 
                //Cambiamos el color de fondo de la etiqueta
                lblNewLabel.setBackground(color);
                lblNewLabel.setOpaque(true);
            }
        });
        
    bttaplicar.addActionListener (new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
           login_ l= new login_();
           l.setVisible(true);
         
           
           
    }

    });
        
        
        
    }

    cambiocolor(login_ aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            try {
                    cambiocolor frame = new cambiocolor();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
