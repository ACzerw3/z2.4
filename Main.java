import java.awt.PrintJob;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int opcja;
    double a,b,P;
    System.out.println("1 - pole prostokąta");
    System.out.println("2 - pole trójkąta prostokątengo");
    System.out.println("Podaj opcję: ");
    Scanner liczba = new Scanner(System.in);
    opcja = liczba.nextInt();
    switch(opcja)
      {
        case 1:
          System.out.println("Podaj liczbę a:");
          a = liczba.nextInt();
          System.out.println("Podaj liczbę b:");
          b = liczba.nextInt();
          P=a*b;
          System.out.print("Pole wynosi:"+P);
          break;
          
        case 2:
          System.out.println("Podaj liczbę a:");
          a = liczba.nextInt();
          System.out.println("Podaj liczbę b:");
          b = liczba.nextInt();
          P=0.5*a*b;
          System.out.println("Pole wynosi:"+P);
          break;
      }
  }
}