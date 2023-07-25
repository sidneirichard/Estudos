import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame(); // Cria a instancia de um JFrame.
        frame.setTitle("Sad Cat Programmer");  // aqui vai o nome da janela JFrame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha a janela quando apertar o 'X'.
        frame.setResizable(false);  // previne o frame de ser redimencionado.
        frame.setSize(420,420);  // muda a dimensão x e dimensão y.
        frame.setVisible(true);  // faz com que a janela JFrame seja visível.

        ImageIcon imagem = new ImageIcon("cat.jpg");  // cria uma ImageIcon.
        frame.setIconImage(imagem.getImage());  // muda a ImageIcon para um ícone da janela.
        frame.getContentPane().setBackground(new Color(0x222334));*/

        ImageIcon imagem = new ImageIcon("cat.jpg");
        Border borda = BorderFactory.createLineBorder(Color.PINK,3);

        JLabel label = new JLabel();
        label.setText(" #xaTiadU, n çei uzaa o Marquidão no descordu!");
        label.setIcon(imagem);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(9987765));
        label.setFont(new Font("MV Boli", Font.PLAIN, 18));
        label.setIconTextGap(6);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setBorder(borda);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,0, 250, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
