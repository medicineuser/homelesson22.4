import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Введите 5 cтрок для списка А");

        for (int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.next();
            listA.add(letter);
        }
        System.out.println("Cписок А: "+listA);


        System.out.println("Введите 5 cтрок для списка Б");

        for (int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.next();
            listB.add(letter);
        }

        System.out.println("Cписок Б: "+listB);
        Collections.reverse(listB);

        listC.addAll(listA);

        System.out.println(listA);
        int index = 1;
        for (int i = 0; i < listA.size(); i++){
            listC.add(index,listB.get(i));
            index += 2;
        }


        System.out.println(listC);
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println(listC);
    }
}