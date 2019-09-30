import java.util.Scanner;

public class Year_Check_Leap {
    public static void main(String[] args) {
        System.out.println("nhập  năm cần kiểm tra");
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        if(year %4 ==0){
                if(year %100 ==0){
                    if(year % 400 == 0){
                        System.out.printf("%d is a leap Year",year);
                    }else {
                        System.out.printf("%d is not a leap Year",year);
                    }
                }else {
                    System.out.printf("%d is a leap Year",year);
                }


        }else{
            System.out.printf("%d is not a leap Year  ",year);
        }

    }
}
