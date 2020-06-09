import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("一言入力してください：");
    String inputText = scanner.next();

    System.out.println("入力結果" + inputText);
  }
}


