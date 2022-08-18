import java.util.Scanner;
public class cbseresult {
    public static void main(String[] args) {
        System.out.println("welcome to percentage boss!!");
        System.out.println("please enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the subject 1 marks");
        Scanner sub1 = new Scanner(System.in);
        int A = sub1.nextInt();
        System.out.println("Enter the subject 2 marks");
        Scanner sub2 = new Scanner(System.in);
        int B = sub2.nextInt();
        System.out.println("Enter the subject 3 marks");
        Scanner sub3 = new Scanner(System.in);
        int C = sub3.nextInt();
        System.out.println("Enter the subject 4 marks");
        Scanner sub4 = new Scanner(System.in);
        int D = sub4.nextInt();
        System.out.println("Enter the subject 5 marks");
        Scanner sub5 = new Scanner(System.in);
        int E = sub5.nextInt();
        System.out.println("The sum of marks of all 5 subjects is:");
        int sum = A+B+C+D+E;
        System.out.println(sum);
        float percentage = sum*100/500;
        System.out.println("The percentage of the "+name+" is "+percentage);

    }
    
    
}
