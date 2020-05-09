package ui;
import java.util.Scanner;
public class test {
    public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("請輸入你要的年份:");
    int year = sc.nextInt();
    Year yr = new Year();
    for (int i =2020;i>=-1000000;i--){
        yr.culc(i);
        System.out.println(i + "年為:" + yr.FTian + yr.FDi);
    }
    
    
//    yr.culc(year);
//    System.out.println("此年為:" + yr.FTian + yr.FDi);
    }
}
