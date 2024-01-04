package org.example.example2;

public class Member extends Dto{


  private String logid;
  private String pwd;
  private String name;


  public Member(int id, String logid, String pwd, String name, String regdate) {

    this.id = id;
    this.logid = logid;
    this.pwd = pwd;
    this.name = name;
    this.regdate = regdate;
  }

  @Override
  public String toString() {
    return "Member{" +
        "id=" + id +
        ", logid='" + logid + '\'' +
        ", pwd='" + pwd + '\'' +
        ", name='" + name + '\'' +
        ", regdate='" + regdate + '\'' +
        '}';
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setLogid(String logid) {
    this.logid = logid;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRegdate(String regdate) {
    this.regdate = regdate;
  }


  public int getId() {
    return id;
  }

  public String getLogid() {
    return logid;
  }

  public String getPwd() {
    return pwd;
  }

  public String getName() {
    return name;
  }

  public String getRegdate() {
    return regdate;
  }

}
