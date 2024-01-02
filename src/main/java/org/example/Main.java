package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Calendar c = Calendar.getInstance();

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
      if (cmd.startsWith("article write")) {
        String date = Util.getNowDate_TimeStr();
        String update = Util.getNowDate_TimeStr();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        articlearr.add(new Article(id, date, update, s1, s2));
        id++;


      }
      if (cmd.startsWith("article list")) {
        Iterator<Article> e = articlearr.listIterator();
        while (e.hasNext()) {
          System.out.println(e.next().toString());
        }
        if (articlearr == null || articlearr.isEmpty()) {
          System.out.println("게시글이없습니다.");
        }
      }
      if (cmd.startsWith("article detail")) {
        String[] str = cmd.split(" ");
        boolean has = false;
        int a = Integer.parseInt(str[2]);
        Iterator<Article> e = articlearr.listIterator();
        int found = 0;
        while (e.hasNext()) {
          if (e.next().getNum() == a) {

            has = true;
            break;
          }
          found++;
        }
        if (!has) {
          System.out.println("님이 찾는게 세부목록에없습니다.");
          continue;
        }
        System.out.println(articlearr.get(found));
      }
      if (cmd.startsWith("article delete")) {
        String[] str = cmd.split(" ");
        int a = Integer.parseInt(str[2]);
        Iterator<Article> e = articlearr.listIterator();
        int found = 0;
        boolean has = false;
        while (e.hasNext()) {
          if (e.next().getNum() == a) {
            has = true;
            Article art = e.next();
            articlearr.remove(found);
            System.out.println(a + "번째 게시글이 삭제되었습니다.");
            break;
          }
          found++;
        }
        if (!has) {
          System.out.println(a + "번째 게시글이 없습니다");
        }


      }
    }
    System.out.println("==프로그램 끝==");

  }
}

class Article {
  private int num;
  private String name;
  private String naeyong;
  private String date;
  private String update;

  public Article(int num, String date, String update, String name, String naeyong) {
    this.num = num;
    this.name = name;
    this.naeyong = naeyong;
    this.date = date;
    this.update = update;
  }

  @Override
  public String toString() {
    return "Article{" +
        "num=" + num +
        ", name='" + name + '\'' +
        ", naeyong='" + naeyong + '\'' +
        ", date='" + date + '\'' +
        ", update='" + update + '\'' +
        '}';
  }

  public int getNum() {
    return num;
  }
}

