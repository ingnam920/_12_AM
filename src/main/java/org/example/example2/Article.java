package org.example.example2;


public class Article {
  private int num;
  private String name;
  private String naeyong;
  private String date;
  private String update;
  private int good;

  public Article(int num, String date, String update, String name, String naeyong) {
    this.num = num;
    this.name = name;
    this.naeyong = naeyong;
    this.date = date;
    this.update = update;
    this.good = 0;
  }

  public String getName() {
    return name;
  }

  public String getNaeyong() {
    return naeyong;
  }

  public String getDate() {
    return date;
  }

  public String getUpdate() {
    return update;
  }

  public int getGood() {
    return good;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNaeyong(String naeyong) {
    this.naeyong = naeyong;
  }

  public void setDate(String date) {
    this.date = date;
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
        "num=" + num +
        ", name='" + name + '\'' +
        ", naeyong='" + naeyong + '\'' +
        ", date='" + date + '\'' +
        ", update='" + update + '\'' +
        ", good=" + good +
        '}';
  }

  public int getNum() {
    return num;
  }
}
