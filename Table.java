import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner hf = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = hf.nextInt();

        System.out.println("Multiplication Table for "+ num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}