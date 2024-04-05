import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
<applet code="Calculator" height=500 width=500></applet>
*/

public class Calculator extends Applet implements ActionListener {

    TextField t1;
    int ans=0;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bm, bd, bs,be;
    String s="";
    int f=1;
    public void init() {
        t1 = new TextField(20);
	t1.setEnabled(false);
        add(t1);
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bm = new Button("*");
        ba = new Button("+");
        bd = new Button("/");
        bs = new Button("-");
	be = new Button("=");
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
	add(b9);
        add(bm);
        add(bd);
        add(bs);
        add(ba);
	add(be);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bd.addActionListener(this);
        bm.addActionListener(this);
	be.addActionListener(this);
    }

  //  @Override
    public void actionPerformed(ActionEvent ae) {
	

	if(ae.getSource()==b0){
		s=s+'0';
		f=0;
	}
	if(ae.getSource()==b1){
		s=s+'1';
		f=0;
	}
	if(ae.getSource()==b2){
		s=s+'2';
		f=0;
	}
	if(ae.getSource()==b3){
		s=s+'3';
		f=0;
	}
	if(ae.getSource()==b4){
		s=s+'4';
		f=0;
	}
	if(ae.getSource()==b5){
		s=s+'5';
		f=0;
	}
	if(ae.getSource()==b6){
		s=s+'6';
		f=0;
	}
	if(ae.getSource()==b7){
		s=s+'7';
		f=0;
	}
	if(ae.getSource()==b8){
		s=s+'8';
		f=0;
	}
	
	if(ae.getSource()==b9){
		s=s+'9';
		f=0;
	}
	
	if(ae.getSource()==ba && f==0){
		s=s+'+';
		f=1;
	}
	
	if(ae.getSource()==bd && f==0){
		s=s+'/';
		f=1;
	}
	
	if(ae.getSource()==bm && f==0){
		s=s+'*';
		f=1;
	}

	if(ae.getSource()==bs && f==0){
		s=s+'-';
		f=1;
	}

	if(ae.getSource()==be){
		
	//	int x=Integer.parseInt(t1.getText());
	//	t1.setText(x);
		ans=evaluateExpression(s);
		s=Integer.toString(ans);
		
		
	}
	t1.setText(s);
    }

	 private static final int MAX_SIZE = 100;
    private int[] numbers = new int[MAX_SIZE];
    private char[] operators = new char[MAX_SIZE];
    private int numTop = -1;
    private int opTop = -1;

    public int evaluateExpression(String expression) {
        // Remove whitespaces from the expression
        expression = expression.replaceAll("\\s", "");

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is a digit, parse the number
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;

                pushNumber(num);
            }
            // If the character is an operator, evaluate previous operations if needed, and push the operator
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (opTop != -1 && hasPrecedence(c, operators[opTop])) {
                    int b = popNumber();
                    int a = popNumber();
                    pushNumber(applyOperation(operators[opTop], b, a));
                    opTop--;
                }
                operators[++opTop] = c;
            }
        }

        // Evaluate remaining operators
        while (opTop != -1) {
            int b = popNumber();
            int a = popNumber();
            pushNumber(applyOperation(operators[opTop], b, a));
            opTop--;
        }

        // The result is the top element of the numbers stack
        return popNumber();
    }

    // Helper method to check operator precedence
    private boolean hasPrecedence(char op1, char op2) {
        if ((op2 != '(' && op2 != ')') &&
            ((op1 == '*' || op1 == '/') || (op2 == '+' || op2 == '-'))) {
            return true;
        } else {
            return false;
        }
    }

    // Helper method to apply an operation
    private int applyOperation(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                return 0;
        }
    }

    // Helper methods for stack operations
    private void pushNumber(int num) {
        if (numTop == MAX_SIZE - 1) {
            throw new StackOverflowError("Stack overflow");
        }
        numbers[++numTop] = num;
    }

    private int popNumber() {
        if (numTop == -1) {
            throw new IllegalStateException("Stack underflow");
        }
        return numbers[numTop--];
    }

}
