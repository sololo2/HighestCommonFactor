package com.proxy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class HighestCommonFactor {

    static JList<Integer> numbersList;

    public static void main(String[] args)
    {
        HighestCommonFactor highestCommonFactor = new HighestCommonFactor();
        JPanel panel =new JPanel();
        JLabel label= new JLabel();
        Integer[] numbers = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        numbersList = new JList<>(numbers);

        JFrame frame=new JFrame("Highest Common Factor");
        JButton button=new JButton("Highest Common Factor");
        button.setBounds(50,100,95,30);
        label.setBounds(50,100,95,30);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(numbersList.getSelectedValuesList().size()>0) {
                    int hcf = highestCommonFactor.getHighestCommonFactorService(numbersList.getSelectedValuesList());
                    label.setText("highest common factor: " + hcf);
                }else {
                    label.setText("Please select a number");
                }
            }
        });

        panel.setSize(200,200);
        panel.setLayout(new BorderLayout());

        panel.add(new JScrollPane(numbersList), BorderLayout.BEFORE_FIRST_LINE);
        panel.add(new JScrollPane(button), BorderLayout.PAGE_END );
        panel.add(new JScrollPane(label), BorderLayout.CENTER );

        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
}

    public int getHighestCommonFactorService(List<Integer> array) {
        int highestCommonFactor = array.get(0);
        for(int number:array)  {
            highestCommonFactor = getHighestCommonFactor(highestCommonFactor, number);
        }
        return highestCommonFactor;
    }

    public int getHighestCommonFactor(int a, int b) {
        // hcf of 2 numbers
        int highestCommonFactor = 0;
        for(int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                highestCommonFactor=i;
        }
        return highestCommonFactor;
    }

}
