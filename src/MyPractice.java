import java.util.ArrayList;
import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /*Given an integer N, write a program to print the hollow diamond pattern in (2*N - 1) rows
         and 2*N - 1 columns, similar to the pattern shown below
        int a = input.nextInt();
        System.out.println(" ".repeat(a-1) + " * ");
        for(int i=1; i<a; i++){
            System.out.println(" ".repeat(a-i)+"*"+"  ".repeat(i)+"*");
        }
        for(int j=2; j<a; j++){
            System.out.println(" ".repeat(j)+"*"+"  ".repeat(a-j)+"*" );
        }
        System.out.println(" ".repeat(a-1) + " * ");

        Given the number of rows N, write a program to print the pattern similar to the pattern shown below.
        int a = input.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println(" ".repeat(a-i)+"$".repeat(a));
        }

        Write a program to compute the cumulative sum of the given N numbers after each input.
        Cumulative sum is the sum of all the previous inputs and the current input.
        int a = input.nextInt();
        int b = 0;
        for(int i=0; i<a; i++){
            b = b+ input.nextInt();
            System.out.println(b);
        }

        Write a program to compute the cumulative average of the given N numbers after each input.
        Cumulative average is the average of all the inputs read so far.
        int a = input.nextInt();
        float b = 0;
        for(int i=1; i<=a; i++){
            b = b+input.nextInt();
            System.out.println(b/i);
        }

        Given a string, write a program to double all the characters in the given string.
        String a = input.nextLine();
        int len = a.length();
        String b = "";
        for(int i=0; i<len; i++){
            String c = String.valueOf(a.charAt(i));
            b = b+ c.repeat(2);
        }
        System.out.println(b);

        Given two strings, write a program to check if the second string is a subsequence of the first string.
        A string can be considered subsequence of other if it can be derived from the original string by ignoring or
        removing some characters without changing the order of the remaining characters.
        String a = input.nextLine();
        String b = String.valueOf(a.charAt(0));
        for(int i=1; i<a.length(); i++){
            if (i%2==0){
                b = b + String.valueOf(a.charAt(i));
            }
        }
        System.out.println(b);

        For this problem, the prefilled code will contain a list. You need to write a program to read N integers,
         and print the elements at the index locations represented by those integers.
        ArrayList newList = new ArrayList<>();
        newList.add(0,"Python");
        newList.add(1,"Java");
        newList.add(2,"Ruby");
        newList.add(3,"C");
        newList.add(4,"C++");
        newList.add(5,"Go");
        newList.add(6,"Dart");
        newList.add(7,"R");
        newList.add(8,"Swift");
        newList.add(9,"Kotlin");
        int a = input.nextInt();
        for(int i=0; i<a; i++){
            int b = input.nextInt();
            System.out.println(newList.get(b));
        }


      For this problem, the prefilled code will contain a list. You need to concatenate the given number to the list.
      The first list should have the number concatenated at the beginning. The second list should have the number
      concatenated at the end.
        ArrayList listA = new ArrayList<>();
        ArrayList listB = new ArrayList<>();
        listA.add(10);
        listA.add(20);
        listA.add(30);
        listA.add(40);
        listA.add(50);
        listB.add(10);
        listB.add(20);
        listB.add(30);
        listB.add(40);
        listB.add(50);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = listB.size();
        listA.remove(0);
        listB.remove(c-1);
        listA.add(0,a);
        listB.add(c-1,b);

        System.out.println(listA);
        System.out.println(listB);

        Given a string, write a program to convert the string into a list.
        ArrayList listA = new ArrayList<>();
        String a = input.nextLine();
        for(int i=0; i<a.length(); i++){
            listA.add(a.charAt(i));
        }
        System.out.println(listA);

        Given two integers M and N, write a program to create a list with element M repeated by N times.
        int a = input.nextInt();
        int b = input.nextInt();
        ArrayList listA = new ArrayList<>();
        for(int i=0; i<a; i++){
            listA.add(b);
        }
        System.out.println(listA);

        For this problem, the prefilled code will contain a list. Your program should create a new list with all
        the elements in existing list that are greater than given number.
        Note: The order of elements in the new list should be same as the order of those elements in the list given
        in the prefilled code.
        int a = input.nextInt();
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(0,1);
        listA.add(1,6);
        listA.add(2,32);
        listA.add(3,93);
        listA.add(4,71);
        listA.add(5,-20);
        listA.add(6,30);
        listA.add(7,-90);
        listA.add(8,50);
        int len = listA.size();
        ArrayList<Integer> listB = new ArrayList<>();
        for(int i=0; i<len; i++){
            int b = Integer.parseInt((listA.get(i)).toString());
            if(a<b) {
                listB.add(b);
            }
        }
        System.out.println(listB);

        Given an integer N, write a program to print the given N inputs in the reverse order.
        int a = input.nextInt();
        ArrayList<String> ListA = new ArrayList<>();
        ArrayList<String> ListB = new ArrayList<>();
        for(int i=0; i<=a; i++){
            String b = input.nextLine();
            ListA.add(b);
        }
        int c = a;
        for(int j=0; j<a; j++){
            ListB.add(ListA.get(c));
            c = c-1;
        }
        System.out.println(ListB);

        Write a program to read N inputs and print a list containing the first and last three inputs.
        int a = input.nextInt();
        ArrayList<String> ListA = new ArrayList<>();
        for(int i=0; i<=a; i++){
            ListA.add(input.nextLine());
        }
        ArrayList<String> ListB = new ArrayList<>();
        for(int j=0; j<=3; j++){
            ListB.add(ListA.get(j));
        }
        for(int k=0; k<3; k++){
            ListB.add(ListA.get((a-2)+k));
        }
        System.out.println(ListB);

         Given a list of N words, write a program to print each word in a line.
        String a = input.nextLine();
        ArrayList<String> ListOne = new ArrayList<>();
        String[] b = a.split(" ");
        for(int i=0; i<b.length; i++){
            ListOne.add(b[i]);
        }
        System.out.println(ListOne);

         */
    }
}
