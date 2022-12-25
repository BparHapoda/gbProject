import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк : ");
        String input;
        String [] date=new String[5];
        int count=date.length;
        while (count>0){
            input=scanner.nextLine();
            date[count]=input;

        }
    }
}