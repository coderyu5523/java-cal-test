import java.util.Scanner;

public class Cal1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int n1 = sc.nextInt();

        System.out.println("기호를 입력하세요 ex)+,-,*,/ ");
        String s1 = sc.next();

        System.out.println("숫자를 입력하세요");
        int n2 = sc.nextInt();

        if(s1.equals("+")){
            System.out.println("결과 : "+(n1+n2));
        }else if(s1.equals("-")){
            System.out.println("결과 : "+(n1-n2));
        } else if (s1.equals("*")) {
            System.out.println("결과 : "+(n1*n2));
        } else if (s1.equals("/")) {
            System.out.println("결과 : "+(n1/n2));
        }


    }
}