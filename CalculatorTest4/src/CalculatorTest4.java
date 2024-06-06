public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        //Name your friends
        /*
        calc.findTotal(10, "steve");
        calc.findTotal(12, "gordon");
        calc.findTotal(9,  "nicolas");
        calc.findTotal(8,  "carlos");
        calc.findTotal(7,  "cleber");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "francisco");
        calc.findTotal(30, "Forgetful");
        */
        System.out.println("Total da mesa: "+(calc.findTotal(10,"steve")+calc.findTotal(12,"gordon")+calc.findTotal(9,"nicolas")+calc.findTotal(8,"carlos")+calc.findTotal(7,"cleber")+calc.findTotal(11,"francisco")/6));
        //Find and print the entire table's total, including tax and tip
    } 
}
