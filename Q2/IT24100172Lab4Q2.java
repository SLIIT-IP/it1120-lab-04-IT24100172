import java.util.Scanner;

public class IT24100172Lab4Q2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double exammarks,labsubmissionmarks,exampercentage,labpercentage,finalexammarks;

        System.out.print("Please enter exam marks:");
        exammarks = sc.nextDouble();
        if(exammarks<=100 & exammarks>=0){
            System.out.print("Please enter lab submission marks:"); 
            labsubmissionmarks = sc.nextDouble();
            if(labsubmissionmarks <=100 & labsubmissionmarks>=0){
                System.out.print("Please enter the percentage given for the exam:");
                exampercentage = sc.nextDouble();
                System.out.print("Please enter the percentage given for the lab submisssion:");
                labpercentage = sc.nextDouble();
                if(exampercentage + labpercentage == 100){
                    finalexammarks = (exammarks*(exampercentage/100)) + (labsubmissionmarks*(labpercentage/100));
                    System.out.println("Final exam marks:" + finalexammarks);
                }
                else{
                    System.out.println("The percentages must add up to 100");
                }
            }
            else{
                System.out.println("Invalid input for lab submission marks");
            }
        }
        else{
            System.out.println("Invalid input for exam marks");
        }

        sc.close();
    }
}


