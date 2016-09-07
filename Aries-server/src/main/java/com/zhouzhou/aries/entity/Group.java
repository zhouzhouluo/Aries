package com.zhouzhou.aries.entity;

// Generated 2016-9-7 23:21:18 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name = "group", catalog = "aries")
public class Group implements java.io.Serializable {

	private Integer id;
	private String groupid;
	private String groupname;
	private String groupcol;
	private String twodbarcode;
	private Date createtime;
	private Date updatetime;
	private String createby;
	private String createbyname;

	public Group() {
	}

	public Group(String groupid, String groupname, String groupcol,
			String twodbarcode, Date createtime, Date updatetime,
			String createby, String createbyname) {
		this.groupid = groupid;
		this.groupname = groupname;
		this.groupcol = groupcol;
		this.twodbarcode = twodbarcode;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.createby = createby;
		this.createbyname = createbyname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "groupid", length = 45)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "groupname", length = 45)
	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Column(name = "groupcol", length = 45)
	public String getGroupcol() {
		return this.groupcol;
	}

	public void setGroupcol(String groupcol) {
		this.groupcol = groupcol;
	}

	@Column(name = "twodbarcode", length = 45)
	public String getTwodbarcode() {
		return this.twodbarcode;
	}

	public void setTwodbarcode(String twodbarcode) {
		this.twodbarcode = twodbarcode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatetime", length = 19)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "createby", length = 45)
	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	@Column(name = "createbyname", length = 45)
	public String getCreatebyname() {
		return this.createbyname;
	}

	public void setCreatebyname(String createbyname) {
		this.createbyname = createbyname;
	}

}