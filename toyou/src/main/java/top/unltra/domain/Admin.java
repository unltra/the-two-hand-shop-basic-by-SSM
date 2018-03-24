package top.unltra.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *CREATE TABLE `lp_admin` (
  `aid`  int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(10) DEFAULT NULL,
  `apw` varchar(20) DEFAULT NULL,
  `apower` int(11) DEFAULT NULL,
  `atel` varchar(12) DEFAULT NULL,
  `aphone` varchar(11) DEFAULT NULL,
  `aqq` varchar(12) DEFAULT NULL,
  `amail` varchar(25) DEFAULT NULL,
  `acreatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
 * */

public class Admin implements Serializable{

	private Integer aid;	    // aid
	private String aname;	    // admin用户名
	private String apw;	        // 密码
	private Integer apower;	    // 权限值
	private String atel;		// 电话号码
	private String aphone;		// 手机号码
	private String aqq;		    // qq
	private String amail;		// mail
	private Date acreatetime;  //  用户创建时间
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
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
		this.aname = aname;
	}

	public String getApw() {
		return apw;
	}

	public void setApw(String apw) {
		this.apw = apw;
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
		this.atel = atel;
	}

	public String getAphone() {
		return aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public String getAqq() {
		return aqq;
	}

	public void setAqq(String aqq) {
		this.aqq = aqq;
	}

	public String getAmail() {
		return amail;
	}

	public void setAmail(String amail) {
		this.amail = amail;
	}

	public Date getAcreatetime() {
		return acreatetime;
	}

	public void setAcreatetime(Date acreatetime) {
		this.acreatetime = acreatetime;
	}

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", apw=" + apw + ", apower=" + apower + ", atel=" + atel
				+ ", aphone=" + aphone + ", aqq=" + aqq + ", amail=" + amail + ", acreatetime=" + acreatetime + "]";
	}
	
	
}
