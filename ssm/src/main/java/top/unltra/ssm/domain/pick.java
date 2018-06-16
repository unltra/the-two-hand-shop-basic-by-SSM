package top.unltra.ssm.domain;

import java.util.Date;

public class pick {
    private Integer pid;

    private Integer aid;

    private Integer kid;

    private String pname;

    private String ppic;

    private String pdescri;

    private String pplace;

    private Date ptime;

    private String ppersoninf;

    private String pnowplace;

    private Integer poutstatus;

    private Integer pownstatus;

    private Date pcreatetime;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic == null ? null : ppic.trim();
    }

    public String getPdescri() {
        return pdescri;
    }

    public void setPdescri(String pdescri) {
        this.pdescri = pdescri == null ? null : pdescri.trim();
    }

    public String getPplace() {
        return pplace;
    }

    public void setPplace(String pplace) {
        this.pplace = pplace == null ? null : pplace.trim();
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPpersoninf() {
        return ppersoninf;
    }

    public void setPpersoninf(String ppersoninf) {
        this.ppersoninf = ppersoninf == null ? null : ppersoninf.trim();
    }

    public String getPnowplace() {
        return pnowplace;
    }

    public void setPnowplace(String pnowplace) {
        this.pnowplace = pnowplace == null ? null : pnowplace.trim();
    }

    public Integer getPoutstatus() {
        return poutstatus;
    }

    public void setPoutstatus(Integer poutstatus) {
        this.poutstatus = poutstatus;
    }

    public Integer getPownstatus() {
        return pownstatus;
    }

    public void setPownstatus(Integer pownstatus) {
        this.pownstatus = pownstatus;
    }

    public Date getPcreatetime() {
        return pcreatetime;
    }

    public void setPcreatetime(Date pcreatetime) {
        this.pcreatetime = pcreatetime;
    }
}