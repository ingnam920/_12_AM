package org.example;

import org.example.controller.ArticleController;
import org.example.controller.MemberController;
import org.example.example2.Article;

import org.example.example2.Member;
import org.example.example3.Util;

import java.util.*;


public class App {
  List<Article> articlearr = new ArrayList<Article>();
  List<Member> members = new ArrayList<Member>();


  public void run() {

    Calendar c = Calendar.getInstance();

    System.out.println("==프로그램 시작 ==");


    Scanner sc = new Scanner(System.in);
    MemberController memberController = new MemberController(members);
    ArticleController articleController = new ArticleController(articlearr);
    articleController.makeTestData();

    int num=1;
    while (true) {
      num++;
      System.out.println("명령어");
      String cmd = sc.nextLine();
      if (cmd.equals("exit")) {
        break;
      }

      if (cmd.startsWith("article write")) {
        articleController.dowrite(cmd);
      }
      if (cmd.startsWith("article list")) {
        articleController.dolist(cmd);
      }

      if (cmd.startsWith("article detail")) {
        articleController.dodetail(cmd);
      }
      if (cmd.startsWith("article delete")) {
        articleController.dodelete(cmd);


      }
      if(cmd.startsWith("member join")){
        memberController.dojoin();
      }


    }
    System.out.println("==프로그램 끝==");
  }


}
