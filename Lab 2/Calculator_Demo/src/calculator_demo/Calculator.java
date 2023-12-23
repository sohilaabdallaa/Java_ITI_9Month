package calculator_demo;

public class Calculator {

    private String cmdline;

    public Calculator() {
        cmdline = " ";
    }

    public Calculator(String init_Line) {
        set_Line(init_Line);
    }

    public String get_Line() {
        return cmdline;
    }

    public void set_Line(String line) {
        cmdline = line;
    }

    public String do_Operation() {
        if (cmdline.equals(" ")) // False if it is empty
        {
            return "Empty Line";
        } else {
            String[] line_Parts = cmdline.split(" ");
            String output = " ";


            int oprand1 = Integer.parseInt(line_Parts[0]);
            int oprand2 = Integer.parseInt(line_Parts[2]);
            switch (line_Parts[1]) {
                case "+": {
                    output += oprand1 + oprand2;
                    break;
                }
                case "-": {
                    output += oprand1 - oprand2;
                    break;
                }
                case "/": {
                    if(oprand2 == 0)
                    {
                        return "Cannot Divide By Zero";
                    }
                    output += oprand1 / oprand2;
                    break;
                }
                case "*": {
                    output += oprand1 * oprand2;
                    break;
                }
                default:
                    return "Unknown Operation";
            }
            return output;
        }

    }
}
