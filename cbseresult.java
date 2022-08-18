import java.util.Scanner;
public class cbseresult {
    public static void main(String[] args) {
        System.out.println("welcome to percentage boss!!");
        System.out.println("please enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the subject 1 marks");
        int A = sc.nextInt();
        System.out.println("Enter the subject 2 marks");
        int B = sc.nextInt();
        System.out.println("Enter the subject 3 marks");
        int C = sc.nextInt();
        System.out.println("Enter the subject 4 marks");
        int D = sc.nextInt();
        System.out.println("Enter the subject 5 marks");
        int E = sc.nextInt();
        System.out.println("The sum of marks of all 5 subjects is:");
        int sum = A+B+C+D+E;
        System.out.println(sum);
        float percentage = sum*100/500;
        System.out.println("The percentage of the "+name+" is "+percentage);

    }
    
    
}
