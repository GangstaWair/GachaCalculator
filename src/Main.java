import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {

        JFrame window = new JFrame("Gacha Calculator 1.0");
        window.setBounds(5,5,560,480);
        window.setLayout(null);

        ////////////////////////////////
        JLabel moon = new JLabel("У вас есть луна? (1/0)");
        moon.setBounds(10,20,240,25);
        window.add(moon);

        JTextField a_field = new JTextField();
        a_field.setBounds(10,45,240,25);
        window.add(a_field);


        JLabel daily = new JLabel("Вы будете выполнять дейлики? (1/0)");
        daily.setBounds(295,20,240,25);
        window.add(daily);

        JTextField b_field = new JTextField();
        b_field.setBounds(295,45,240,25);
        window.add(b_field);
        ////////////////////////////////

        ////////////////////////////////
        JLabel days = new JLabel("Дней до нужного баннера? (Число)");
        days.setBounds(10,90,240,25);
        window.add(days);

        JTextField c_field = new JTextField();
        c_field.setBounds(10,115,240,25);
        window.add(c_field);


        JLabel gems = new JLabel("Сколько у вас УЖЕ есть гемов? (Число)");
        gems.setBounds(295,90,240,25);
        window.add(gems);

        JTextField d_field = new JTextField();
        d_field.setBounds(295,115,240,25);
        window.add(d_field);
        ////////////////////////////////

        ////////////////////////////////
        JLabel pulls = new JLabel("Сколько у вас УЖЕ есть гемов? (Число)");
        pulls.setBounds(10,160,240,25);
        window.add(pulls);

        JTextField e_field = new JTextField();
        e_field.setBounds(10,185,240,25);
        window.add(e_field);
        ////////////////////////////////

        // Button
        JButton button = new JButton("Принять");
        button.setBounds(10,250,150,50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        window.add (button);

        //Label
        JLabel label = new JLabel("");
        label.setBounds(200,250,400,50);
        window.add(label);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=0, b=0, c=0, d=0, f=0;

                try {
                    a = Integer.parseInt(a_field.getText());
                    b = Integer.parseInt(b_field.getText());

                    c = Integer.parseInt(c_field.getText());
                    d = Integer.parseInt(d_field.getText());
                    f = Integer.parseInt(e_field.getText());

                } catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Введите корректное значение!" +
                            "\n( ТОЛЬКО цифры )");
                    label.setText("Введены неверные данные! Попробуйте ещё раз");
                };

                if (a == 1 && b == 1) {
                    float result = ( ( 90 + 60 ) * c + ( d + ( f * 160 ) ) ) / 160f;
                    label.setText("Всего круток до баннера: " + Math.round(result));

                } else if (a == 1 && b==0) {

                    float result = ( 90 * c + ( d + ( f * 160 ) ) ) / 160f;
                    label.setText("Всего круток до баннера: " + Math.round(result));

                }else if (a == 0 && b == 1) {

                    float result = ( 60 * c + (d + (f * 160))) / 160f;
                    label.setText("Всего круток до баннера: " + Math.round(result));

                }else if (a == 0 && b == 0) {

                    float result = ( c + (d + (f * 160))) / 160f;
                    label.setText("Всего круток до баннера: " + Math.round(result));

                }else {
                    label.setText("Ошибочка в подсчётах");
                }
            }
        };
        button.addActionListener(actionListener);

        window.setVisible(true);
    }
}
