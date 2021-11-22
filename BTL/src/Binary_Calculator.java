import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Binary_Calculator implements ActionListener {

    JFrame myFrame ;
    Font myFont = new Font("sansserif", Font.BOLD, 25);
    TextField myTextField1, myTextField2, ans ;
    JButton delBut, equBut;
    JComboBox myComboBox1, myComboBox2;
    JComboBox myOperations, ansType;

    Binary_Calculator(){
        JFrame myFrame = new JFrame("Binary Calculator");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,600);
        myFrame.getContentPane().setBackground(Color.pink);
        myFrame.setLayout(null);

        myTextField1 = new TextField();
        myTextField1.setBounds(70,50,240,40);
        myTextField1.setFont(myFont);
        myTextField1.setEditable(true);
        myFrame.add(myTextField1);

        String[] myTypeOfNum = {"Binary", "Octal", "Decimal", "Hexadecimal"};
        myComboBox1= new JComboBox(myTypeOfNum);
        myComboBox1.setBounds(70,100,240,40);
        myFrame.add(myComboBox1);


        String[] operations = {"Add (+)", "Subtract (-)", "Multiple (*)", "Divide (/)"};
        myOperations= new JComboBox(operations);
        myOperations.setBounds(70,170,200,40);
        myFrame.add(myOperations);

        myTextField2 = new TextField();
        myTextField2.setBounds(70,240,240,40);
        myTextField2.setFont(myFont);
        myTextField2.setEditable(true);
        myFrame.add(myTextField2);

        myComboBox2= new JComboBox(myTypeOfNum);
        myComboBox2.setBounds(70,290,240,40);
        myFrame.add(myComboBox2);

        delBut= new JButton("<html><font color=white> Del </font></html>");
        delBut.addActionListener(this);
        delBut.setBounds(50,50,50,50);
        delBut.setBackground(Color.black);
        delBut.setFocusable(false);

        equBut= new JButton("<html><font color=white> = </font></html>");
        equBut.addActionListener(this);
        equBut.setBounds(50,50,50,50);
        equBut.setBackground(Color.black);
        equBut.setFocusable(false);

        JPanel myPanel = new JPanel();
        myPanel.setBackground(null);
        myPanel.setBounds(70,350,200,40);
        myPanel.setLayout(new GridLayout(1,2, 10,10));
        myPanel.add(equBut);
        myPanel.add(delBut);
        myFrame.add(myPanel);

        ans = new TextField();
        ans.setBounds(70,400,240,40);
        ans.setFont(myFont);
        ans.setEditable(false);
        myFrame.add(ans);

        ansType= new JComboBox(myTypeOfNum);
        ansType.setBounds(70,450,240,40);
        myFrame.add(ansType);

        myFrame.setVisible(true);



    }

    public static void main(String[] args) {
        Binary_Calculator myCalc= new Binary_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delBut){
            myTextField1.setText("");
            myTextField2.setText("");
            ans.setText("");
        }
        if(e.getSource()==equBut){
            Integer num1=0, num2=0;
            if( myComboBox1.getSelectedItem()=="Binary"){
                num1=Integer.parseInt(myTextField1.getText(),2);
            }else if( myComboBox1.getSelectedItem()=="Octal"){
                num1=Integer.parseInt(myTextField1.getText(),8);
            }else if( myComboBox1.getSelectedItem()=="Hexadecimal"){
                num1=Integer.parseInt(myTextField1.getText(),16);
            }else if( myComboBox1.getSelectedItem()=="Decimal"){
                num1=Integer.parseInt(myTextField1.getText());
            }

            if( myComboBox2.getSelectedItem()=="Binary"){
                num2=Integer.parseInt(myTextField2.getText(),2);
            }else if( myComboBox1.getSelectedItem()=="Octal"){
                num2=Integer.parseInt(myTextField2.getText(),8);
            }else if( myComboBox1.getSelectedItem()=="Hexadecimal"){
                num2=Integer.parseInt(myTextField2.getText(),16);
            }else if( myComboBox1.getSelectedItem()=="Decimal"){
                num2=Integer.parseInt(myTextField2.getText());
            }

            Integer ansNum=0;
            if( myOperations.getSelectedItem()=="Add (+)"){
                ansNum=num1+num2;
                ans.setText(ansNum.toString());
            }else if(myOperations.getSelectedItem()=="Subtract (-)"){
                 ansNum=num1-num2;
                ans.setText(ansNum.toString());
            }else if(myOperations.getSelectedItem()=="Multiple (*)"){
                 ansNum=num1*num2;
                ans.setText(ansNum.toString());
            }else if(myOperations.getSelectedItem()=="Divide (/)"){
                 ansNum=num1/num2;
                ans.setText(ansNum.toString());
            }

            if( ansType.getSelectedItem()=="Binary"){
                ans.setText(Integer.toBinaryString(ansNum));
            }else if( myComboBox1.getSelectedItem()=="Octal"){
                ans.setText(Integer.toOctalString(ansNum));
            }else if( myComboBox1.getSelectedItem()=="Hexadecimal"){
                ans.setText(Integer.toHexString(ansNum));
            }else if( myComboBox1.getSelectedItem()=="Decimal"){
                ans.setText(Integer.toString(ansNum));
            }
        }
    }
}
