
package top.linz86.twohand.domain;
/**
    *Demo class
	*@author lnz86
	*@date 2018年3月23日 下午8:11:04
	*
	*/
/*CREATE TABLE `lp_user` (
		  `uid` int(11) NOT NULL AUTO_INCREMENT,
		  `uname` varchar(10) NOT NULL,
		  `stuid` varchar(10) DEFAULT NULL,
		  `upw` varchar(20) NOT NULL,
		  `uphone` varchar(11) DEFAULT NULL,
		  `uqq` varchar(12) DEFAULT NULL,
		  `umail` varchar(25) DEFAULT NULL,
		  `uaddress` varchar(50) DEFAULT NULL,
		  `ucreatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
		  PRIMARY KEY (`uid`)
		) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;*/

import java.util.Date;

public class User {
	private Integer uid;
	private String uname;
	private String stuid;
	private String upw;
	private String uphone;
	private String uqq;
	private String umail;
	private String uaddress;
	private Date ucreatetime;
	public User() {
		super();
	}
	public User( String uname, String stuid, String upw) {
		this.uname = uname;
		this.stuid = stuid;
		this.upw = upw;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", stuid=" + stuid + ", upw=" + upw + ", uphone=" + uphone
				+ ", uqq=" + uqq + ", umail=" + umail + ", uaddress=" + uaddress + ", ucreatetime=" + ucreatetime + "]";
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUqq() {
		return uqq;
	}
	public void setUqq(String uqq) {
		this.uqq = uqq;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public Date getUcreatetime() {
		return ucreatetime;
	}
	public void setUcreatetime(Date ucreatetime) {
		this.ucreatetime = ucreatetime;
	}
	
}
