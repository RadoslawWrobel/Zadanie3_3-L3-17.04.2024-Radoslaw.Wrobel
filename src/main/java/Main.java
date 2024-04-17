import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Print trójkąt
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj rozmiar trojkata: ");
    int rozmiarTrojkata = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < rozmiarTrojkata; i++) 
    {
      for (int j = rozmiarTrojkata - 1; j >= 0; j--) 
      {
        if (j <= i) 
        {
          System.out.print("*");
        } else 
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}