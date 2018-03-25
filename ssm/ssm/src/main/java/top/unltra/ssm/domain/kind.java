package top.unltra.ssm.domain;

public class kind {
    private Integer kid;

    private Integer aKid;

    private String kname;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Integer getaKid() {
        return aKid;
    }

    public void setaKid(Integer aKid) {
        this.aKid = aKid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }
}