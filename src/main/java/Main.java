/* 16.- Escriba un diagrama que genere N números aleatorios. */

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
    int n = scanner.nextInt();
    Random random = new Random();
    for (int i = 0; i < n; i++){
      int numeroAleatorio = random.nextInt(100);
      System.out.println(numeroAleatorio);
      
    }
    scanner.close();
    /* int N = Integer.parseInt(System.console().readLine("N: "));
    int[] numeros = new int[N];
    for (int i = 0; i < N; i++) {
      numeros[i] = (int) (Math.random() * 100);
      System.out.println(numeros[i]); */
    }
  }
