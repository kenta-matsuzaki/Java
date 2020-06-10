// overloadについて
public class Overload {

  // public static int add(int x, int y){
  //   return x + y;
  // }

  // public static double add(double x, double y){
  //   return x + y;
  // }

  // public static String add(String x, String y){
  //   return x + y;
  // }

  // public static void main(String[] args){
  //   System.out.println(add(10, 20));

  //   System.out.println(add(3.5, 2.7));

  //   System.out.println(add("Hello", "Kenta"));
  // }

  // public static void printArray(int[] array){
  //   for(int element : array){
  //     System.out.println(element);
  //   }
  // }

  // public static void main(String[] args){
  //   int[] array = {1,2,3};
  //   printArray(array);
  // }

  // public static void incArray(int[] array){
  //   for(int i = 0; i < array.length; i++){
  //     array[i]++;
  //   }
  // }

  // public static void main(String[] args){
  //   int[] array = {1, 2, 3};
  //   incArray(array);
  //   for(int i : array){
  //     System.out.println(i);
  //   }
  // }

  // public static int[] makeArray(int size){
  //   int[] newArray = new int[size];
  //   for(int i = 0; i < newArray.length; i++){
  //     newArray[i] = i;
  //   }
  //   return newArray;
  // }

  // public static void main(String args[]){
  //   int[] array = makeArray(3);
  //   for(int i : array){
  //     System.out.println(i);
  //   }
  // }

  // public static void introduceOneself(String name, int age, double height, String sex){
  //   System.out.println("初めまして" + name + "と申します。年齢は" + age + "歳で、身長は" + height + "性別は" + sex + "です");
  // }

  // public static void main(String[] args){
  //   introduceOneself("kenta", 34, 170.1, "男");
  // }

  // public static void email(String title, String address, String text){
  //   System.out.println("「" + address + "」に、以下のメールを送信しました。");
  //   System.out.println("件名：「" + title + "」");
  //   System.out.println("本文：「" + text + "」");
  // }

  // public static void email(String address, String text){
  //   System.out.println("「" + address + "」に、以下のメールを送信しました。");
  //   System.out.println("無題");
  //   System.out.println("本文：「" + text + "」");
  // }

  // public static void main(String[] args){
  //   email("test@tmail.com", "今日も一日がんばろう！");
  // }

  public static double calcTriangleArea(double bottom, double height){
    return bottom * height / 2;
  }

  public static double calcCircleArea(double radius){
    return radius * radius * 3.14;
  }

  public static void main(String[] args){
    double bottom = 10.0;
    double height = 5.0;
    double radius = 5.0;
    System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + calcTriangleArea(10.0, 5.0) + "㎠");
    System.out.println("円の半径が" + radius + "cmの場合、面積は" + calcCircleArea(5.0) + "㎠");
  }

}