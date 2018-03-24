package top.unltra.domain;

import java.io.Serializable;
import java.util.Date;

/*CREATE TABLE `lp_pick` (
		  `pid` int(11) NOT NULL,
		  `aid` int(11) DEFAULT NULL,
		  `cdid` int(11) DEFAULT NULL,
		  `pname` varchar(30) DEFAULT NULL,
		  `ppic` longblob,
		  `pdescri` varchar(50) DEFAULT NULL,
		  `pplace` varchar(20) DEFAULT NULL,
		  `ptime` date DEFAULT NULL,
		  `ppersoninf` varchar(50) DEFAULT NULL,
		  `pnowplace` varchar(20) DEFAULT NULL,
		  `poutstatus` tinyint(1) DEFAULT NULL,
		  `pownstatus` tinyint(1) DEFAULT NULL,
		  `pcreatetime` datetime DEFAULT NULL,
		  PRIMARY KEY (`pid`),
		  KEY `FK_pick_ad` (`aid`),
		  KEY `FK_pick_classd` (`cdid`),
		  CONSTRAINT `FK_pick_ad` FOREIGN KEY (`aid`) REFERENCES `lp_admin` (`aid`),
		  CONSTRAINT `FK_pick_classd` FOREIGN KEY (`cdid`) REFERENCES `lp_classdetail` (`cdid`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/

public class Pick implements Serializable {

	private Integer pid; // id
	private String pname; // 拾物名称
	private String ppic; // 拾物图片
	private String pdescri; // 拾物描述
	private String pplace; // 拾物地点
	private Date ptime; // 拾物时间
	private String ppersoninf; // 拾物人信息
	private String pnowplace; // 拾物现位地址
	private Integer poutstatus; // 拾物发布状态
	private Integer pownstatus; // 拾物认领状态
	private Date pcreatetime; // 拾物创建时间

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPpic() {
		return ppic;
	}

	public void setPpic(String ppic) {
		this.ppic = ppic;
	}

	public String getPdescri() {
		return pdescri;
	}

	public void setPdescri(String pdescri) {
		this.pdescri = pdescri;
	}

	public String getPplace() {
		return pplace;
	}

	public void setPplace(String pplace) {
		this.pplace = pplace;
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
		this.ppersoninf = ppersoninf;
	}

	public String getPnowplace() {
		return pnowplace;
	}

	public void setPnowplace(String pnowplace) {
		this.pnowplace = pnowplace;
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

	public Pick() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pick [pid=" + pid + ", pname=" + pname + ", ppic=" + ppic + ", pdescri=" + pdescri + ", pplace="
				+ pplace + ", ptime=" + ptime + ", ppersoninf=" + ppersoninf + ", pnowplace=" + pnowplace
				+ ", poutstatus=" + poutstatus + ", pownstatus=" + pownstatus + ", pcreatetime=" + pcreatetime + "]";
	}

}
