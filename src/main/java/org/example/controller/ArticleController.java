package org.example.controller;

import org.example.example2.Article;
import org.example.example3.Util;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArticleController extends Controller {
  private List<Article> articles;
  Scanner sc = new Scanner(System.in);
  int id = 1;

  public ArticleController(List<Article> articles) {
    this.articles = articles;
  }


  public void dowrite(String cmd) {
    String date = Util.getNowDate_TimeStr();
    String update = Util.getNowDate_TimeStr();
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    articles.add(new Article(id, loginMember.getId(), date, update, s1, s2));
    id++;
  }

  public void dolist(String cmd) {
    String[] str = cmd.split(" ");
    if (str.length == 2) {
      Iterator<Article> e = articles.listIterator();
      while (e.hasNext()) {
        System.out.println(e.next().toString());
      }
      if (articles == null || articles.isEmpty()) {
        System.out.println("게시글이없습니다.");
      }
    } else {
      Iterator<Article> e = articles.listIterator();
      while (e.hasNext()) {
        Article as = e.next();
        if (as.getId()==Integer.parseInt(str[2])) {
          System.out.println(as.toString());
        }
      }
      System.out.println("검색결과없음");
    }
  }

  public void dodetail(String cmd) {
    String[] str = cmd.split(" ");
    boolean has = false;
    int a = Integer.parseInt(str[2]);
    Iterator<Article> e = articles.listIterator();
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
      return;
    }
    articles.get(found).setGood(articles.get(found).getGood() + 1);

    System.out.println(articles.get(found).toString());
  }

  public void dodelete(String cmd) {
    String[] str = cmd.split(" ");
    int a = Integer.parseInt(str[2]);

    Iterator<Article> e = articles.listIterator();
    int found = 0;
    boolean has = false;
    while (e.hasNext()) {
      Article art = e.next();
      if (art.getNum() == a) {
        has = true;
        articles.remove(found);
        System.out.println(a + "번째 게시글이 삭제되었습니다.");
        break;
      }
      found++;
    }
    if (!has) {
      System.out.println(a + "번째 게시글이 없습니다");
    }
  }

  public void makeTestData() {
    System.out.println("테스트를 위한 데이터를 생성합니다.");

    articles.add(new Article(1, 2, "02285","0205", "영희", "내용1"));
    articles.add(new Article(2, 3,"05508", "0205", "철수", "내용2"));
    articles.add(new Article(3, 2, "54548","0205", "철희", "내용3"));
  }
}
