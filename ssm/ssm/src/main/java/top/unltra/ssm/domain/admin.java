package top.unltra.ssm.domain;

import java.util.Date;

public class admin {
    private Integer aid;

    private String aname;

    private String apw;

    private Integer apower;

    private String atel;

    private String aphone;

    private String aqq;

    private String amail;

    private Date acreatetime;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApw() {
        return apw;
    }

    public void setApw(String apw) {
        this.apw = apw == null ? null : apw.trim();
    }

    public Integer getApower() {
        return apower;
    }

    public void setApower(Integer apower) {
        this.apower = apower;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel == null ? null : atel.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAqq() {
        return aqq;
    }

    public void setAqq(String aqq) {
        this.aqq = aqq == null ? null : aqq.trim();
    }

    public String getAmail() {
        return amail;
    }

    public void setAmail(String amail) {
        this.amail = amail == null ? null : amail.trim();
    }

    public Date getAcreatetime() {
        return acreatetime;
    }

    public void setAcreatetime(Date acreatetime) {
        this.acreatetime = acreatetime;
    }
}