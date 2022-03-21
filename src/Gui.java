import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Gui extends JPanel implements ActionListener {
    final int screenWidth = 450;
    final int screenHeight = 500;

    private Calculator calculator;

    private JLabel calcOutput;

    private JButton equalsButton;
    private JButton decButton;
    private JButton zeroButton;
    private JButton clearButton;

    private JButton plusButton;
    private JButton threeButton;
    private JButton twoButton;
    private JButton oneButton;

    private JButton minButton;
    private JButton sixButton;
    private JButton fiveButton;
    private JButton fourButton;

    private JButton multButton;
    private JButton nineButton;
    private JButton eightButton;
    private JButton sevButton;

    private JButton divButton;
    private JButton pmButton;
    private JButton pwrButton;
    private JButton lnButton;

    private BufferedImage background;
    private BufferedImage buttonImage;

    
    public Gui() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.decode("#f7f7f7"));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.setLayout(null);

        calculator = new Calculator();

        try {
            background = ImageIO.read(getClass().getResourceAsStream("images/grid.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            buttonImage = ImageIO.read(getClass().getResourceAsStream("images/button.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        calcOutput = new JLabel("0");
        calcOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        calcOutput.setFont(new Font("Ink Free", Font.BOLD, 36));
        calcOutput.setBounds(-35, 27, 450, 36);

        equalsButton = new JButton("=");
        equalsButton.setFont(new Font("Ink Free", Font.BOLD, 48));
        equalsButton.setBounds(336, 426, 96, 64);
        equalsButton.setBorderPainted(false);
        equalsButton.setFocusPainted(false);
        equalsButton.setContentAreaFilled(false);
        equalsButton.addActionListener(this);

        decButton = new JButton(".");
        decButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        decButton.setBounds(230, 426, 96, 64);
        decButton.setBorderPainted(false);
        decButton.setFocusPainted(false);
        decButton.setContentAreaFilled(false);
        decButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        zeroButton.setBounds(124, 426, 96, 64);
        zeroButton.setBorderPainted(false);
        zeroButton.setFocusPainted(false);
        zeroButton.setContentAreaFilled(false);
        zeroButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        clearButton.setBounds(18, 426, 96, 64);
        clearButton.setBorderPainted(false);
        clearButton.setFocusPainted(false);
        clearButton.setContentAreaFilled(false);
        clearButton.addActionListener(this);


        plusButton = new JButton("+");
        plusButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        plusButton.setBounds(336, 352, 96, 64);
        plusButton.setBorderPainted(false);
        plusButton.setFocusPainted(false);
        plusButton.setContentAreaFilled(false);
        plusButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        threeButton.setBounds(230, 352, 96, 64);
        threeButton.setBorderPainted(false);
        threeButton.setFocusPainted(false);
        threeButton.setContentAreaFilled(false);
        threeButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        twoButton.setBounds(124, 352, 96, 64);
        twoButton.setBorderPainted(false);
        twoButton.setFocusPainted(false);
        twoButton.setContentAreaFilled(false);
        twoButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        oneButton.setBounds(18, 352, 96, 64);
        oneButton.setBorderPainted(false);
        oneButton.setFocusPainted(false);
        oneButton.setContentAreaFilled(false);
        oneButton.addActionListener(this);


        minButton = new JButton("-");
        minButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        minButton.setBounds(336, 278, 96, 64);
        minButton.setBorderPainted(false);
        minButton.setFocusPainted(false);
        minButton.setContentAreaFilled(false);
        minButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        sixButton.setBounds(230, 278, 96, 64);
        sixButton.setBorderPainted(false);
        sixButton.setFocusPainted(false);
        sixButton.setContentAreaFilled(false);
        sixButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        fiveButton.setBounds(124, 278, 96, 64);
        fiveButton.setBorderPainted(false);
        fiveButton.setFocusPainted(false);
        fiveButton.setContentAreaFilled(false);
        fiveButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        fourButton.setBounds(18, 278, 96, 64);
        fourButton.setBorderPainted(false);
        fourButton.setFocusPainted(false);
        fourButton.setContentAreaFilled(false);
        fourButton.addActionListener(this);


        multButton = new JButton("x");
        multButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        multButton.setBounds(336, 204, 96, 64);
        multButton.setBorderPainted(false);
        multButton.setFocusPainted(false);
        multButton.setContentAreaFilled(false);
        multButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        nineButton.setBounds(230, 204, 96, 64);
        nineButton.setBorderPainted(false);
        nineButton.setFocusPainted(false);
        nineButton.setContentAreaFilled(false);
        nineButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        eightButton.setBounds(124, 204, 96, 64);
        eightButton.setBorderPainted(false);
        eightButton.setFocusPainted(false);
        eightButton.setContentAreaFilled(false);
        eightButton.addActionListener(this);

        sevButton = new JButton("7");
        sevButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        sevButton.setBounds(18, 204, 96, 64);
        sevButton.setBorderPainted(false);
        sevButton.setFocusPainted(false);
        sevButton.setContentAreaFilled(false);
        sevButton.addActionListener(this);


        divButton = new JButton("÷");
        divButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        divButton.setBounds(336, 130, 96, 64);
        divButton.setBorderPainted(false);
        divButton.setFocusPainted(false);
        divButton.setContentAreaFilled(false);
        divButton.addActionListener(this);

        pmButton = new JButton("±");
        pmButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        pmButton.setBounds(230, 130, 96, 64);
        pmButton.setBorderPainted(false);
        pmButton.setFocusPainted(false);
        pmButton.setContentAreaFilled(false);
        pmButton.addActionListener(this);

        pwrButton = new JButton("^");
        pwrButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        pwrButton.setBounds(124, 130, 96, 64);
        pwrButton.setBorderPainted(false);
        pwrButton.setFocusPainted(false);
        pwrButton.setContentAreaFilled(false);
        pwrButton.addActionListener(this);

        lnButton = new JButton("LN");
        lnButton.setFont(new Font("Ink Free", Font.BOLD, 24));
        lnButton.setBounds(18, 130, 96, 64);
        lnButton.setBorderPainted(false);
        lnButton.setFocusPainted(false);
        lnButton.setContentAreaFilled(false);
        lnButton.addActionListener(this);


        this.add(calcOutput);

        this.add(equalsButton);
        this.add(decButton);
        this.add(zeroButton);
        this.add(clearButton);

        this.add(plusButton);
        this.add(threeButton);
        this.add(twoButton);
        this.add(oneButton);

        this.add(minButton);
        this.add(sixButton);
        this.add(fiveButton);
        this.add(fourButton);

        this.add(multButton);
        this.add(nineButton);
        this.add(eightButton);
        this.add(sevButton);

        this.add(divButton);
        this.add(pmButton);
        this.add(pwrButton);
        this.add(lnButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (calculator.getOperationState() != 4) {
            if (e.getSource() == oneButton) {
                calculator.addToDisplayValue("1");
            }
            if (e.getSource() == twoButton) {
                calculator.addToDisplayValue("2");
            }
            if (e.getSource() == threeButton) {
                calculator.addToDisplayValue("3");
            }
            if (e.getSource() == fourButton) {
                calculator.addToDisplayValue("4");
            }
            if (e.getSource() == fiveButton) {
                calculator.addToDisplayValue("5");
            }
            if (e.getSource() == sixButton) {
                calculator.addToDisplayValue("6");
            }
            if (e.getSource() == sevButton) {
                calculator.addToDisplayValue("7");
            }
            if (e.getSource() == eightButton) {
                calculator.addToDisplayValue("8");
            }
            if (e.getSource() == nineButton) {
                calculator.addToDisplayValue("9");
            }
            if (e.getSource() == zeroButton) {
                calculator.addToDisplayValue("0");
            }
            if (e.getSource() == decButton) {
                calculator.addToDisplayValue(".");
            }
        }
        
        if (e.getSource() == plusButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("+");
            calculator.setDisplayValue("+");
        }
        if (e.getSource() == minButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("-");
            calculator.setDisplayValue("-");
        }
        if (e.getSource() == multButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("*");
            calculator.setDisplayValue("*");
        }
        if (e.getSource() == divButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("÷");
            calculator.setDisplayValue("÷");
        }
        if (e.getSource() == pwrButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("^");
            calculator.setDisplayValue("^");
        }

        if (e.getSource() == pmButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("pm");
            calculator.calculate();
        }
        if (e.getSource() == lnButton && (calculator.getOperationState() == 1 || calculator.getOperationState() == 4)) {
            calculator.queueOperation("ln");
            calculator.calculate();
        }

        if (e.getSource() == equalsButton && calculator.getOperationState() == 3) {
            calculator.calculate();
        }

        if (e.getSource() == clearButton) {
            calculator.clear();
        }

        calcOutput.setText(calculator.getDisplayValue());

        if (calculator.getOperationState() != 0) {
            clearButton.setForeground(Color.red);
        }
        else {
            clearButton.setForeground(Color.black);
        }
        
        if (calculator.getOperationState() == 3) {
            equalsButton.setForeground(Color.decode("#0cc24e"));
        }
        else {
            equalsButton.setForeground(Color.black);
        }

        // System.out.println(calculator.getOperationState());
        // System.out.println(calculator.getOperation());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.drawImage(background, 0, 0, null);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                g2.drawImage(buttonImage, 336 - 106 * i, 426 - 74 * j, 96, 64, null);
            }
        }

        g2.fillRect(25, 20, 400, 50);

        g2.setColor(Color.black);
        g2.drawRect(25, 20, 400, 50);
    }
}
