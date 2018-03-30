package TemplateMethod;

public class Test {
    public static void main(String[] args) {
        String exp = "6+8";
        AbstractCalculator  cal = new Plus();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}
