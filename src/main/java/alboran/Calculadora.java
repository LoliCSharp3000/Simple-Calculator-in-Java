package alboran;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
    private JTextField campo1;
    private JTextField campo2;
    private JButton plus, minus, milti, dividir;
    private JLabel resultado;

    public Calculadora(){
        setTitle("Mini Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel numero1 = new JLabel("Numero 1: ");
        add(numero1);

        campo1 = new JTextField("Pon el numero 1");
        add(campo1);

        JLabel numero2 = new JLabel("Numero 2:");
        add(numero2);

        campo2 = new JTextField("Pon el numero 2");
        add(campo2);

        plus = new JButton("+");
        plus.addActionListener(new Operation('+'));
        add(plus);

        minus = new JButton("-");
        minus.addActionListener(new Operation('-'));
        add(minus);

        milti = new JButton("*");
        milti.addActionListener(new Operation('*'));
        add(milti);

        dividir = new JButton("/");
        dividir.addActionListener(new Operation('/'));
        add(dividir);

        resultado = new JLabel("resultado: ");
        add(resultado);

        setVisible(true);
    }
    private class Operation implements ActionListener {
        private char operacion;

        public Operation(char operacion){
            this.operacion = operacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = 0;

                switch (operacion) {
                    case '+': res = num1 + num2; break;
                    case '-': res = num1 - num2; break;
                    case '*': res = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Dividir por cero");
                        }
                        res = num1 / num2;
                    default:
                        break;
                }
                resultado.setText("Resultado: " + res);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Porfavor pon un numero");
            } catch(ArithmeticException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

}


