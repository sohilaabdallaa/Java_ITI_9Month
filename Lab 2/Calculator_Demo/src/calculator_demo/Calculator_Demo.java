package calculator_demo;

/**
 *
 * @author Lap Smart
 */
public class Calculator_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line1 = "70 + 30";
        String line2 = "70 / 0";
        Calculator cal = new Calculator(line1);
        Calculator cal2 = new Calculator(line2);
        String result = cal.do_Operation();
        System.out.println("70 + 30 = "+result);
        System.out.println(cal2.do_Operation());
       
    }
    
}
