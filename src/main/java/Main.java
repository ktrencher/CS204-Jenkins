//package src.main.java;

import java.util.Objects;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the calculator");
    Calculator calculator = new Calculator();

    while (true) {
      System.out.println("Enter a command:");
      String input = scanner.nextLine();
      if (Objects.equals(input, "")) {
        break;
      }
      String[] split = input.split(" ");
      if (input.charAt(0) == 'a') {
        System.out.println(calculator.add(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
      } else if (input.charAt(0) == 's') {
        System.out.println(calculator.subtract(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
      } else if (input.charAt(0) == 'm') {
        System.out.println(calculator.multiply(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
      } else if (input.charAt(0) == 'd') {
        System.out.println(calculator.divide(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
      } else if (input.charAt(0) == 'f') {
        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(split[1])));
      } else if (input.charAt(0) == 'b') {
        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(split[1])));
      }
    }

  }
}