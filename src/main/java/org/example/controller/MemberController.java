package org.example.controller;

import org.example.example2.Article;
import org.example.example2.Member;
import org.example.example3.Util;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberController {

  private List<Member> members;
  private Member loginmember = null;

  public MemberController(List<Member> members) {
    this.members = members;

  }

  int mem = 1;
  Scanner sc = new Scanner(System.in);

  public void dojoin() {

    boolean idpass = false;
    String rdate = Util.getNowDate_TimeStr();
    System.out.println("회원가입기능구현");
    String s1 = null;

    while (true) {
      Iterator<Member> e = members.listIterator();
      System.out.println("id입력하세요");
      s1 = sc.nextLine();
      while (e.hasNext()) {
        Member member = e.next();
        if (member.getLogid().equals(s1)) {
          System.out.println("이미존재하는 id입니다");
          idpass = true;
          break;
        }
      }

      if (idpass == true) {
        continue;
      }

      break;
    }
    System.out.println("pwd입력하세요");
    String s2 = sc.nextLine();
    System.out.println("이름 입력하세요");
    String s3 = sc.nextLine();


    members.add(new Member(mem, s1, s2, s3, rdate));
    System.out.println(members.get(mem - 1).toString());
    mem++;

  }

  public void dologin() {
    if (loginmember == null) {
      System.out.println("로그인기능구현아이디비번입력");
      String str1 = null;
      String str2 = null;

      while (true) {
        boolean log = false;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        Iterator<Member> e = members.listIterator();
        while (e.hasNext()) {
          Member member = e.next();
          if (member.getLogid().equals(str1) && member.getPwd().equals(str2)) {

            loginmember = member;
            log = true;
            break;
          }
        }
        if (!log) {
          System.out.println("아디비번 다시입력해줘");
          continue;
        }
        else{
          System.out.println("로그인이되었습니다.");
          break;
        }
      }
    }
    System.out.println(loginmember.getName() + "로그인되어있음");
  }

  public void dologout() {
    if (loginmember != null) {
      loginmember = null;
      System.out.println("로그아웃되었어");
      return;
    }
    System.out.println("로그인안되어있음");

  }

  public void makeTestData() {
    System.out.println("테스트를 위한 데이터를 생성합니다.");

    members.add(new Member(1, "2021", "0205", "영희", "내용1"));
    members.add(new Member(2, "2022", "0206", "철수", "내용2"));
    members.add(new Member(3, "2023", "0207", "철희", "내용3"));
  }

  public Member getLoginmember() {
    return loginmember;
  }
}
