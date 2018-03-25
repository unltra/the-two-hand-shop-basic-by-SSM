package top.unltra.ssm.domain;

import java.util.Date;

public class lostnotice {
    private Integer lid;

    private Integer uid;

    private Integer kid;

    private Integer aid;

    private String lname;

    private String lpic;

    private String ldescri;

    private String lplace;

    private Date ltime;

    private Integer loutstatus;

    private Date lcreatetime;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLpic() {
        return lpic;
    }

    public void setLpic(String lpic) {
        this.lpic = lpic == null ? null : lpic.trim();
    }

    public String getLdescri() {
        return ldescri;
    }

    public void setLdescri(String ldescri) {
        this.ldescri = ldescri == null ? null : ldescri.trim();
    }

    public String getLplace() {
        return lplace;
    }

    public void setLplace(String lplace) {
        this.lplace = lplace == null ? null : lplace.trim();
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public Integer getLoutstatus() {
        return loutstatus;
    }

    public void setLoutstatus(Integer loutstatus) {
        this.loutstatus = loutstatus;
    }

    public Date getLcreatetime() {
        return lcreatetime;
    }

    public void setLcreatetime(Date lcreatetime) {
        this.lcreatetime = lcreatetime;
    }
}