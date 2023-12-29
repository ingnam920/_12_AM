package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("==프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);

    List<Article> articlearr = new ArrayList<Article>();
    int num = 0;
    int id = 1;
    while (true) {
      num++;
      System.out.println("명령어");
      String cmd = sc.nextLine();
      if (cmd.equals("exit")) {
        break;
      }
      if (cmd.equals("write")) {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        articlearr.add(new Article(id, s1, s2));
        id++;

      }
      if (cmd.equals("list")) {
        Iterator<Article> e = articlearr.listIterator();
        while (e.hasNext()) {
          System.out.println(e.next().toString());
        }
      }
      if (cmd.startsWith("article detail")) {
        String[] str = cmd.split("\\ ");
        int a = Integer.parseInt(str[2]);
        System.out.println(a);
        System.out.println(articlearr.get(a + 1));
      }
    }
    System.out.println("==프로그램 끝==");

  }
}

class Article {
  private int num;
  private String name;
  private String naeyong;

  public Article(int num, String name, String naeyong) {
    this.num = num;
    this.name = name;
    this.naeyong = naeyong;
  }

  @Override
  public String toString() {
    return "Article{" +
        "num=" + num +
        ", name='" + name + '\'' +
        ", naeyong='" + naeyong + '\'' +
        '}';
  }

}

