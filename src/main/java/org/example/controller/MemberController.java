package org.example.controller;

import org.example.example2.Member;
import org.example.example3.Util;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberController {

  private List<Member> members;

  public MemberController(List<Member> members) {
    this.members = members;
  }
  int mem=1;

  public void dojoin() {
    Scanner sc=new Scanner(System.in);
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

}
