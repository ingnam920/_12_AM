package org.example.example2;


public class Article extends Dto{

  private String name;
  private String naeyong;
  private String update;
  private int loginedId;
  private int good;

  public Article(int num, int ld,  String date, String update, String name, String naeyong) {
    this.id = num;
    this.name = name;
    this.naeyong = naeyong;
    this.regdate = date;
    this.update = update;
    this.good = 0;
    this.loginedId=ld;
  }



  public String getNaeyong() {
    return naeyong;
  }

  public String getDate() {
    return regdate;
  }

  public String getUpdate() {
    return update;
  }

  public int getGood() {
    return good;
  }

  public void setNum(int num) {
    this.id = num;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNaeyong(String naeyong) {
    this.naeyong = naeyong;
  }

  public void setDate(String date) {
    this.regdate = date;
  }

  public void setUpdate(String update) {
    this.update = update;
  }

  public void setGood(int good) {
    this.good = good;
  }

  @Override
  public String toString() {
    return "Article{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", naeyong='" + naeyong + '\'' +
        ", regdate='" + regdate + '\'' +
        ", update='" + update + '\'' +
        ", good=" + good +
        '}';
  }

  public int getNum() {
    return id;
  }
}
