import java.util.Arrays;

public class Main{
    public static void main(String[] args){
      Sort s1 = new Sort();

      System.out.println("(1) Сортировки целочисленных массивов:");
      System.out.println();
      int a1[]={5,4,3,2,1};
      int a1_copy[] = Arrays.copyOfRange(a1, 1, 3);
      System.out.println("Before: " + Arrays.toString(a1));
      s1.bubbleSort(a1);
      System.out.println("bubbleSort: " + Arrays.toString(a1));
      int a2[]={7,4,3,0,1};
      int a2_copy[] = Arrays.copyOfRange(a2, 0, 2);
      System.out.println("Before: " + Arrays.toString(a2));
      s1.insertionSort(a2);
      System.out.println("inserionSort: " + Arrays.toString(a2));
      int a3[]={5,1,9,222,77};
      int a3_copy[] = Arrays.copyOfRange(a3, 0, 3);
      System.out.println("Before: " + Arrays.toString(a3));
      s1.selectionSort(a3);
      System.out.println("selectionSort: " + Arrays.toString(a3));
      System.out.println();

      System.out.println("(2) Сортировки любых(строковых) массивов:");
      System.out.println();
      String b1[]={"c","ad","ab","op"};      
      String b1_copy[] = Arrays.copyOfRange(b1, 1, 3);
      System.out.println("Before: " + Arrays.toString(b1));
      s1.bubbleSort(b1);
      System.out.println("bubbleSort: " + Arrays.toString(b1));
      String b2[]={"kate","kot","ot","ty"};
      String b2_copy[] = Arrays.copyOfRange(b2, 0, 2);
      System.out.println("Before: " + Arrays.toString(b2));
      s1.insertionSort(b2);
      System.out.println("inserionSort: " + Arrays.toString(b2));
      String b3[]={"qqq","dq","twice","once"};
      String b3_copy[] = Arrays.copyOfRange(b3, 1, 3);
      System.out.println("Before: " + Arrays.toString(b3));
      s1.selectionSort(b3);
      System.out.println("selectionSort: " + Arrays.toString(b3));
      System.out.println();

      System.out.println("(3) Сортировки соответствующих подпоследовательностей:");
      System.out.println();
      System.out.println("Before: " + Arrays.toString(a1_copy));
      s1.bubbleSort(a1_copy);
      System.out.println("bubbleSort: " + Arrays.toString(a1_copy));
      System.out.println("Before: " + Arrays.toString(a2_copy));
      s1.insertionSort(a2_copy);
      System.out.println("inserionSort: " + Arrays.toString(a2_copy));
      System.out.println("Before: " + Arrays.toString(a3_copy));
      s1.selectionSort(a3_copy);
      System.out.println("selectionSort: " + Arrays.toString(a3_copy));
      System.out.println();
      System.out.println("Before: " + Arrays.toString(b1_copy));
      s1.bubbleSort(b1_copy);
      System.out.println("bubbleSort: " + Arrays.toString(b1_copy));
      System.out.println("Before: " + Arrays.toString(b2_copy));
      s1.insertionSort(b2_copy);
      System.out.println("inserionSort: " + Arrays.toString(b2_copy));
      System.out.println("Before: " + Arrays.toString(b3_copy));
      s1.selectionSort(b3_copy);
      System.out.println("selectionSort: " + Arrays.toString(b3_copy));
  }
}
