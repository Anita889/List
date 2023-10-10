import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        List<Integer> listNew=new LinkedList<>();
        System.out.print("Header=");
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(count<20) {
            list.add(scanner.nextInt());
            count++;
        }        int a=list.get(0);
        for (Integer integer : list) {
            if (a != integer) {
                listNew.add(a);
                a = integer;
            }
        }
        if(a!=listNew.get(listNew.size()-1))
            listNew.add(a);
        System.out.println(listNew);
    }
}
