import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 5; i++){
            int num = input.nextInt();
            list.add(num);
        }
        for (int i = 0; i < 5; i++){
            double num = input.nextDouble();
            list.add(num);
        }

        sort(list);

        for (int i = 0; i < 10; i++){
            System.out.print(list.get(i));
            System.out.print(" ");
    }

    public static void sort(ArrayList<Number> list) {

         Collections.sort(list);

    }
}

