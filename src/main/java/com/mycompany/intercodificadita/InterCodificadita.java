package com.mycompany.intercodificadita;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterCodificadita extends JFrame implements ActionListener{ //clase
    JLabel L0;
    JLabel L1;
    JLabel L2;
    JLabel L3;
    JLabel L4;
    JTextField T1;
    JTextField T2;
    JTextField T3;
    JButton B1;
    public static void main(String[] args) {  //metodo
        InterCodificadita gato=new InterCodificadita();  
    }

    public InterCodificadita() { //metodo
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 200, 500, 600);
        this.getContentPane().setBackground(Color.WHITE);
        setLayout(new FlowLayout());
        
        
        //titulo
        L0=new JLabel("PASEADORES DE PERROS");
        add(L0);
        L0.setBounds(90, 50, 400, 30);
        L0.setForeground(Color.BLUE);
        L0.setFont(new java.awt.Font("cooper black", 0, 25));
        
        L1=new JLabel("Perros:");
        add(L1);
        setLayout(null);
        L1.setBounds(130, 100, 400, 20);
        L1.setFont(new java.awt.Font("comic sans MS", 0, 14));
        T1=new JTextField(8);
        add(T1);
        T1.setBounds(230, 100, 100, 20);
        
       
        L2=new JLabel("Horas:");
        add(L2);
        L2.setBounds(130, 130, 400, 20);
        L2.setFont(new java.awt.Font("comic sans MS", 0, 14));
        T2=new JTextField(8);
        add(T2);
        T2.setBounds(230, 130, 100, 20);
        
        L4=new JLabel("1.Grande, 2.Mediano, 3.Pequeño");
        add(L4);
        L4.setBounds(140, 160, 400, 20);
        L4.setFont(new java.awt.Font("comic sans MS", 0, 14));
        
        L3=new JLabel("Tamaño:");
        add(L3);
        L3.setBounds(130, 190, 400, 20);
        L3.setFont(new java.awt.Font("comic sans MS", 0, 14));
        T3=new JTextField(8);
        add(T3);
        T3.setBounds(230, 190, 100, 20);
        
        B1=new JButton("Calcular");
        add(B1);
        B1.setBounds(190, 240, 100, 20);
        B1.setHorizontalAlignment(SwingConstants.CENTER);
        B1.setForeground(Color.BLUE);
        B1.setFont(new java.awt.Font("comic sans MS", 0, 14));
        B1.addActionListener(this);
        setVisible(true);
        
        //imagen
        JLabel PHO = new JLabel();
        add(PHO);
        PHO.setIcon(new javax.swing.ImageIcon("perrito.jpg"));
        PHO.setBounds(150, 290, 200, 200);
        PHO.setHorizontalAlignment(SwingConstants.CENTER);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  //metodo
        String accion = e.getActionCommand();
        if (accion.equals("Calcular")) {
            int horas, perros, tamañoP;
            float costo=0, costoT=0;
      
        horas=Integer.parseInt(T2.getText());
        perros=Integer.parseInt(T1.getText());
   
        for (int i = 1; i <= perros; i++) {
            tamañoP=Integer.parseInt(T3.getText());
           if (tamañoP==1) {
             costo=horas*10000;
           } if (tamañoP==2) {
                costo=horas*5000;
            } if (tamañoP==3) {
                costo=horas*3000;
            }
            costoT+=costo;
        }
        
        if (perros>1) {
            costoT=(float)(costoT-(costoT*0.1));
        }
        
        JOptionPane.showMessageDialog(null, costoT);
                                            
        } 
        
    }
}
