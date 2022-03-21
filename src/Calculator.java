
public class Calculator {

    private String displayValue;
    private double num;
    private String operation;
    private int operationState;
    private boolean hasDecimal;
    
    public Calculator() {
        displayValue = "0";
        num = 0d;
        operation = "none";
        operationState = 0;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public int getOperationState() {
        return operationState;
    }

    public String getOperation() {
        return operation;
    }

    public void addToDisplayValue(String s) {
        if (operationState == 2) {
            if (s.equals(".")) {
                hasDecimal = true;
                displayValue = "0" + s;
            }
            else displayValue = s;
            operationState = 3;
        }
        else if (displayValue.equals("0")) {
            if (!hasDecimal && s.equals(".")) {
                hasDecimal = true;
                displayValue = "0" + s;
            }
            else displayValue = s;
            if (operationState == 0) operationState = 1;
        }
        else if (hasDecimal && s.equals(".")) {}
        else {
            if (!hasDecimal && s.equals(".")) hasDecimal = true;
            displayValue += s;
        }
    }

    public void setDisplayValue(String s) {
        displayValue = s;
    }

    public void queueOperation(String s) {
        operationState = 2;
        operation = s;
        num = Double.parseDouble(displayValue);
        hasDecimal = false;
    }

    public void clear() {
        operationState = 0;
        operation = "none";
        num = 0d;
        displayValue = "0";
        hasDecimal = false;
    }

    public void calculate() {
        // System.out.println("calculated");
        double answer = 0d;
        
        if (operation.equals("+")) {
            answer = num + Double.parseDouble(displayValue);
        }
        if (operation.equals("-")) {
            answer = num - Double.parseDouble(displayValue);
        }
        if (operation.equals("*")) {
            answer = num * Double.parseDouble(displayValue);
        }
        if (operation.equals("÷")) {
            answer = num / Double.parseDouble(displayValue);
        }
        if (operation.equals("^")) {
            answer = Math.pow(num, Double.parseDouble(displayValue));
        }

        if (operation.equals("pm")) {
            answer = -1 * num;
        }
        if (operation.equals("ln")) {
            answer = Math.log(num);
        }

        clear();
        displayValue = Double.toString(answer);
        try {
            if (displayValue.indexOf("E") != -1) {
                if (displayValue.indexOf("E") >= 12) {
                    displayValue = displayValue.substring(0, 12) + displayValue.substring(displayValue.indexOf("E"));
                }
            }
            else displayValue = displayValue.substring(0, 16);
        } catch (Exception e) {}
        operationState = 4;
    }
}
