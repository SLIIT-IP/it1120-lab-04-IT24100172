import java.util.Scanner;
public class IT24100172Lab4Q3{
    public static void main(String[] args){
        float number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        number = sc.nextFloat();
        String result = (number > 0) ?
                "The number is: positive" :
                (number < 0) ?
                        "The number is:Negative" :
                        "The number is zero";
        System.out.println(result);
    }
}
