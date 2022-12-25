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
            date[count-1]=input;
            count--;
        }
        String [] lastArray=checkArray(date);
    }
    public static String [] checkArray(String [] array){
        int count=0;
        for(int i=0;i< array.length;i++){
            if (array[i].length()<=3){count++;}
        }
        String [] dateNew=new String[count];
        int j=0;
        for(int i=0;i< array.length;i++){
            if (array[i].length()<=3){dateNew[j]=array[i];j++;}
        }
        return dateNew;
    }
}