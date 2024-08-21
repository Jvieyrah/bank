package com.betrybe.acc.java.bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class de jaoa.
 */
public class Application {
  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o número da conta:");
    try (scanner) {
      int numberAcc = scanner.nextInt();
      var formatedNumber = new AccountNumberFormatter().formatAccountNumber(numberAcc);
      System.out.println("Numero da conta: " + formatedNumber);
      scanner.close();
    } catch (InputMismatchException e) {
      System.out.println("Número da conta inválido!");
      return;
    }
  }
}
