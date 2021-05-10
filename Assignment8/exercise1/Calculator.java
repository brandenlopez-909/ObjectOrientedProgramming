/*
package exercise1;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
*/
public class Calculator extends JFrame {
    private JLabel myLabel;
    private JTextField outputField;
    private ArrayList<JButton> digits;
    private JButton plusSign;
    private JButton minusSign;
    private JButton multSign;
    private JButton divSign;
    private JButton eqSign;
    private JMenuItem menuSubtraction,menuAddition, menuDivision, menuMultiplication, menuClear;
    private String currentOperation;
    private Double firstOperand;
    
    /**
     * Constructor utilizing Java Swing API to create a calulator. 
     */
    Calculator(){
        this.currentOperation = "";
        this.firstOperand = 0.0;
        
        //I used a folder within this package for images, that required us to use a different method
        //https://stackoverflow.com/questions/299495/how-to-add-an-image-to-a-jpanel
        //Everything else is the same other than this.getClass().getResource().
        ImageIcon app_icon = new ImageIcon(this.getClass().getResource("./images/app_icon.jpg") ) ;
        //We must scale it for it to fit 
        Image appImg = app_icon.getImage();
        Image scaledApp = appImg.getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
        app_icon = new ImageIcon(scaledApp);
        setIconImage(app_icon.getImage());
        
        
        
        //Flowlayout is the main container. Used to hold other panels 
        JPanel displayPanel = new JPanel(new FlowLayout());
        outputField = new JTextField("0", 20);
        displayPanel.add(outputField);
        
        //Create the subpanel for button panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        
        //A subpanel for the button panel
        JPanel digitButtonPanel = new JPanel(new GridLayout(4, 3));
        digits = new ArrayList<JButton>();
        digits.add(new JButton("0"));
        digits.add(new JButton("1"));
        digits.add(new JButton("2"));
        digits.add(new JButton("3"));
        digits.add(new JButton("4"));
        digits.add(new JButton("5"));
        digits.add(new JButton("6"));
        digits.add(new JButton("7"));
        digits.add(new JButton("8"));
        digits.add(new JButton("9"));
        digits.add(new JButton("."));
        digits.add(new JButton("AC"));
        digits.get(10).setForeground(Color.MAGENTA);
        digits.get(11).setForeground(Color.MAGENTA);
        
        //Populate the panel with digits 
        digitButtonPanel.add(digits.get(0));
        digitButtonPanel.add(digits.get(1));
        digitButtonPanel.add(digits.get(2));
        digitButtonPanel.add(digits.get(3));
        digitButtonPanel.add(digits.get(4));
        digitButtonPanel.add(digits.get(5));
        digitButtonPanel.add(digits.get(6));
        digitButtonPanel.add(digits.get(7));
        digitButtonPanel.add(digits.get(8));
        digitButtonPanel.add(digits.get(9));
        digitButtonPanel.add(digits.get(10));
        digitButtonPanel.add(digits.get(11));
        buttonPanel.add(digitButtonPanel);
        
        
        //Set the image
        
        //Plus
        ImageIcon plus_icon = new ImageIcon((this.getClass().getResource("./images/addition.jpg")));
        Image plusImg = plus_icon.getImage();
        Image scaledPlus = plusImg.getScaledInstance(10,10, java.awt.Image.SCALE_SMOOTH);
        plus_icon = new ImageIcon(scaledPlus);
        
        //Subtraction
        ImageIcon sub_icon = new ImageIcon((this.getClass().getResource("./images/Subtraction.jpg")));
        Image subImg = sub_icon.getImage();
        Image scaledSub = subImg.getScaledInstance(10,10, java.awt.Image.SCALE_SMOOTH);
        sub_icon = new ImageIcon(scaledSub);
        
        //Multiplicaiton 
        ImageIcon mult_icon = new ImageIcon((this.getClass().getResource("./images/multiplication.jpg")));
        Image multImg = mult_icon.getImage();
        Image scaledMult = multImg.getScaledInstance(15,15, java.awt.Image.SCALE_SMOOTH);
        mult_icon = new ImageIcon(scaledMult);
        
        //Division
        ImageIcon div_icon = new ImageIcon((this.getClass().getResource("./images/division.png")));
        Image divImg = div_icon.getImage();
        Image scaledDiv = divImg.getScaledInstance(15,15, java.awt.Image.SCALE_SMOOTH);
        div_icon = new ImageIcon(scaledDiv);
        
        //Equals 
        ImageIcon eq_icon = new ImageIcon((this.getClass().getResource("./images/equals.png")));
        Image eqImg = eq_icon.getImage();
        Image scaledEq = eqImg.getScaledInstance(15,15, java.awt.Image.SCALE_SMOOTH);
        eq_icon = new ImageIcon(scaledEq);
        
        //Now the operators 
        JPanel operatorButtonPanel = new JPanel(new GridLayout(5, 1));
        plusSign = new JButton(plus_icon);
        minusSign = new JButton(sub_icon);
        multSign = new JButton(mult_icon);
        divSign = new JButton(div_icon);
        eqSign = new JButton(eq_icon);
        
        //We now set the foreground
        plusSign.setForeground(Color.BLUE);
        minusSign.setForeground(Color.BLUE);
        multSign.setForeground(Color.BLUE);
        divSign.setForeground(Color.BLUE);
        eqSign.setForeground(Color.GREEN);
        
        //Add the Jbuttons to the panel
        operatorButtonPanel.add(plusSign);
        operatorButtonPanel.add(minusSign);
        operatorButtonPanel.add(multSign);
        operatorButtonPanel.add(divSign);
        operatorButtonPanel.add(eqSign);
        //Add the the operator panel to the button panel 
        buttonPanel.add(operatorButtonPanel);
        
        //Add button panel to the display Panel 
        displayPanel.add(buttonPanel);
        
        //We need AC or number 11 in the list to clear values
        digits.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetValues();
            }
        });
        

        //Digit 10 needs to be a "."
        digits.get(10).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String currentText = outputField.getText();
                if(currentText.indexOf(".") < 0){
                    outputField.setText(currentText+".");
                }
            }
        });
        
        //OperatorListener extends an action listener
        OperatorListener opListener = new OperatorListener();
        plusSign.addActionListener(opListener);
        minusSign.addActionListener(opListener);
        multSign.addActionListener(opListener);
        divSign.addActionListener(opListener);

        //Listens to the digits 
        for(int i = 0; i <= 9; i ++){
            digits.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    String currentText = outputField.getText();
                    JButton source = (JButton)event.getSource();
                    String newDigit = "";
                    if (source == digits.get(0)) {
                        newDigit = "0";
                    } else if (source == digits.get(1)) {
                        newDigit = "1";
                    } else if (source == digits.get(2)) {
                        newDigit = "2";
                    } else if (source == digits.get(3)) {
                        newDigit = "3";
                    } else if (source == digits.get(4)) {
                        newDigit = "4";
                    } else if (source == digits.get(5)) {
                        newDigit = "5";
                    } else if (source == digits.get(6)) {
                        newDigit = "6";
                    } else if (source == digits.get(7)) {
                        newDigit = "7";
                    } else if (source == digits.get(8)) {
                        newDigit = "8";
                    } else if (source == digits.get(9)) {
                        newDigit = "9";
                    }

                    currentText = currentText + newDigit;
                    currentText = currentText.replaceFirst("^0+(?!$)", "");
                    outputField.setText(currentText);
                }
            });
        }

        //Equal sign must operate on the prior operation symbol
        eqSign.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = outputField.getText();
                try{
                    Double secondOperand = new Double(currentText);

                    if(currentOperation == "+"){
                        result = firstOperand + secondOperand;
                    } else if(currentOperation == "-"){
                        result = firstOperand - secondOperand;
                    } else if(currentOperation == "*"){
                        result = firstOperand * secondOperand;
                    } else if(currentOperation == "/"){
                        if(secondOperand != 0.0){
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            outputField.setBackground(Color.PINK);
                        }
                    }

                    outputField.setText(result.toString());
                    firstOperand = result;
                } catch(NumberFormatException e){
                    resetValues();
                }
            }
        });
        //When we close the window, terminate the script. 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        
        
       //Now we add menus  
      //Menu bar
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu1 = new JMenu("Operations Menu");
        menuBar.add(menu1);
        
        //Contents of the menu bar
        menuAddition = new JMenuItem("Addition");
        menu1.add(menuAddition);
        
        menu1.addSeparator(); //Change the location of this to change where this goes
        
        //TextBased menu Items
        menuSubtraction = new JMenuItem("Subtraction");
        menu1.add(menuSubtraction);
        
        menu1.addSeparator(); //Change the location of this to change where this goes
        
        menuMultiplication = new JMenuItem("Mutliplication");
        menu1.add(menuMultiplication);
        
        menu1.addSeparator(); //Change the location of this to change where this goes
        
        menuDivision = new JMenuItem("Division");
        menu1.add(menuDivision);
        
        menu1.addSeparator(); //Change the location of this to change where this goes
        
        menuClear = new JMenuItem("Clear");
        menu1.add(menuClear);
       
        //MenuAL extends action listener is its own class. 
        MenuAL menuAL = new MenuAL();
        menuAddition.addActionListener(menuAL);
        menuSubtraction.addActionListener(menuAL);
        menuMultiplication.addActionListener(menuAL);
        menuDivision.addActionListener(menuAL);
        menuClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                resetValues();
            }
        });
        
        
        //What we can do is have the menus activate the plusSign/divSign and the action listeners 
        
        //content.add(menuBar);
        this.setJMenuBar(menuBar); //This way for a natural menu. 
        add(displayPanel);
        
        
        
        
        
        //Set the title and size.
        setTitle("Calculator");
        setSize(500, 250);
        setVisible(true);
    }
    
    //The reset values function as used in the above code 
    /**
     * Used by the "AC" method to reset the calculator values 
     */
    private void resetValues() {
        currentOperation = "";
        firstOperand = 0.0;
        outputField.setText("0");
        outputField.setBackground(Color.WHITE);
    }
    
    
    /**
     * An event listener which transcribes operation clicks to operations the java 
     * application can use. 
     * Originally provided by Yulia Newton 
     *
     */
    private class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            
        	JButton source = (JButton)event.getSource();
            if (source == plusSign) {
                currentOperation = "+";
            }else if (source == minusSign) {
                currentOperation = "-";
            }else if (source == multSign) {
                currentOperation = "*";
            }else if (source == divSign) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();              
            }
        }
    }
    /**
     * Nested class that determines what the menu items do 
     *
     */
    private class MenuAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            
        	JMenuItem source = (JMenuItem)event.getSource();
            if (source == menuAddition) {
                currentOperation = "+";
            }else if (source == menuSubtraction) {
                currentOperation = "-";
            }else if (source == menuMultiplication) {
                currentOperation = "*";
            }else if (source == menuDivision) {
                currentOperation = "/";
            }

            String currentText = outputField.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                outputField.setText("0");
            } catch(NumberFormatException e){
                resetValues();              
            }
        }
    }
    
    
    /**
     * Runs the application
     */
    public static void main(String[] args) {
    	Calculator test = new Calculator();
    }
}
