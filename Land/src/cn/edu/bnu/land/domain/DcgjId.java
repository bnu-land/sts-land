package cn.edu.bnu.land.domain;

// Generated 2015-1-27 8:44:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DcgjId generated by hbm2java
 */
public class DcgjId implements java.io.Serializable {

	private int id;
	private String gjid;
	private String rwid;
	private Integer gjds;
	private String gjzb;
	private Boolean sfjs;
	private Date sj;
	private Boolean fxwc;
	private Boolean sfsc;
	private Boolean gjscbz;
	private Double gjcd;
	private String zrqy;
	private String xcry;
	private String xcjg;
	private String xczzcs;
	private String bgqk;
	private String xgry;
	private String bz;

	public DcgjId() {
	}

	public DcgjId(int id, String gjid) {
		this.id = id;
		this.gjid = gjid;
	}

	public DcgjId(int id, String gjid, String rwid, Integer gjds, String gjzb,
			Boolean sfjs, Date sj, Boolean fxwc, Boolean sfsc, Boolean gjscbz,
			Double gjcd, String zrqy, String xcry, String xcjg, String xczzcs,
			String bgqk, String xgry, String bz) {
		this.id = id;
		this.gjid = gjid;
		this.rwid = rwid;
		this.gjds = gjds;
		this.gjzb = gjzb;
		this.sfjs = sfjs;
		this.sj = sj;
		this.fxwc = fxwc;
		this.sfsc = sfsc;
		this.gjscbz = gjscbz;
		this.gjcd = gjcd;
		this.zrqy = zrqy;
		this.xcry = xcry;
		this.xcjg = xcjg;
		this.xczzcs = xczzcs;
		this.bgqk = bgqk;
		this.xgry = xgry;
		this.bz = bz;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGjid() {
		return this.gjid;
	}

	public void setGjid(String gjid) {
		this.gjid = gjid;
	}

	public String getRwid() {
		return this.rwid;
	}

	public void setRwid(String rwid) {
		this.rwid = rwid;
	}

	public Integer getGjds() {
		return this.gjds;
	}

	public void setGjds(Integer gjds) {
		this.gjds = gjds;
	}

	public String getGjzb() {
		return this.gjzb;
	}

	public void setGjzb(String gjzb) {
		this.gjzb = gjzb;
	}

	public Boolean getSfjs() {
		return this.sfjs;
	}

	public void setSfjs(Boolean sfjs) {
		this.sfjs = sfjs;
	}

	public Date getSj() {
		return this.sj;
	}

	public void setSj(Date sj) {
		this.sj = sj;
	}

	public Boolean getFxwc() {
		return this.fxwc;
	}

	public void setFxwc(Boolean fxwc) {
		this.fxwc = fxwc;
	}

	public Boolean getSfsc() {
		return this.sfsc;
	}

	public void setSfsc(Boolean sfsc) {
		this.sfsc = sfsc;
	}

	public Boolean getGjscbz() {
		return this.gjscbz;
	}

	public void setGjscbz(Boolean gjscbz) {
		this.gjscbz = gjscbz;
	}

	public Double getGjcd() {
		return this.gjcd;
	}

	public void setGjcd(Double gjcd) {
		this.gjcd = gjcd;
	}

	public String getZrqy() {
		return this.zrqy;
	}

	public void setZrqy(String zrqy) {
		this.zrqy = zrqy;
	}

	public String getXcry() {
		return this.xcry;
	}

	public void setXcry(String xcry) {
		this.xcry = xcry;
	}

	public String getXcjg() {
		return this.xcjg;
	}

	public void setXcjg(String xcjg) {
		this.xcjg = xcjg;
	}

	public String getXczzcs() {
		return this.xczzcs;
	}

	public void setXczzcs(String xczzcs) {
		this.xczzcs = xczzcs;
	}

	public String getBgqk() {
		return this.bgqk;
	}

	public void setBgqk(String bgqk) {
		this.bgqk = bgqk;
	}

	public String getXgry() {
		return this.xgry;
	}

	public void setXgry(String xgry) {
		this.xgry = xgry;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DcgjId))
			return false;
		DcgjId castOther = (DcgjId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getGjid() == castOther.getGjid()) || (this.getGjid() != null
						&& castOther.getGjid() != null && this.getGjid()
						.equals(castOther.getGjid())))
				&& ((this.getRwid() == castOther.getRwid()) || (this.getRwid() != null
						&& castOther.getRwid() != null && this.getRwid()
						.equals(castOther.getRwid())))
				&& ((this.getGjds() == castOther.getGjds()) || (this.getGjds() != null
						&& castOther.getGjds() != null && this.getGjds()
						.equals(castOther.getGjds())))
				&& ((this.getGjzb() == castOther.getGjzb()) || (this.getGjzb() != null
						&& castOther.getGjzb() != null && this.getGjzb()
						.equals(castOther.getGjzb())))
				&& ((this.getSfjs() == castOther.getSfjs()) || (this.getSfjs() != null
						&& castOther.getSfjs() != null && this.getSfjs()
						.equals(castOther.getSfjs())))
				&& ((this.getSj() == castOther.getSj()) || (this.getSj() != null
						&& castOther.getSj() != null && this.getSj().equals(
						castOther.getSj())))
				&& ((this.getFxwc() == castOther.getFxwc()) || (this.getFxwc() != null
						&& castOther.getFxwc() != null && this.getFxwc()
						.equals(castOther.getFxwc())))
				&& ((this.getSfsc() == castOther.getSfsc()) || (this.getSfsc() != null
						&& castOther.getSfsc() != null && this.getSfsc()
						.equals(castOther.getSfsc())))
				&& ((this.getGjscbz() == castOther.getGjscbz()) || (this
						.getGjscbz() != null && castOther.getGjscbz() != null && this
						.getGjscbz().equals(castOther.getGjscbz())))
				&& ((this.getGjcd() == castOther.getGjcd()) || (this.getGjcd() != null
						&& castOther.getGjcd() != null && this.getGjcd()
						.equals(castOther.getGjcd())))
				&& ((this.getZrqy() == castOther.getZrqy()) || (this.getZrqy() != null
						&& castOther.getZrqy() != null && this.getZrqy()
						.equals(castOther.getZrqy())))
				&& ((this.getXcry() == castOther.getXcry()) || (this.getXcry() != null
						&& castOther.getXcry() != null && this.getXcry()
						.equals(castOther.getXcry())))
				&& ((this.getXcjg() == castOther.getXcjg()) || (this.getXcjg() != null
						&& castOther.getXcjg() != null && this.getXcjg()
						.equals(castOther.getXcjg())))
				&& ((this.getXczzcs() == castOther.getXczzcs()) || (this
						.getXczzcs() != null && castOther.getXczzcs() != null && this
						.getXczzcs().equals(castOther.getXczzcs())))
				&& ((this.getBgqk() == castOther.getBgqk()) || (this.getBgqk() != null
						&& castOther.getBgqk() != null && this.getBgqk()
						.equals(castOther.getBgqk())))
				&& ((this.getXgry() == castOther.getXgry()) || (this.getXgry() != null
						&& castOther.getXgry() != null && this.getXgry()
						.equals(castOther.getXgry())))
				&& ((this.getBz() == castOther.getBz()) || (this.getBz() != null
						&& castOther.getBz() != null && this.getBz().equals(
						castOther.getBz())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result
				+ (getGjid() == null ? 0 : this.getGjid().hashCode());
		result = 37 * result
				+ (getRwid() == null ? 0 : this.getRwid().hashCode());
		result = 37 * result
				+ (getGjds() == null ? 0 : this.getGjds().hashCode());
		result = 37 * result
				+ (getGjzb() == null ? 0 : this.getGjzb().hashCode());
		result = 37 * result
				+ (getSfjs() == null ? 0 : this.getSfjs().hashCode());
		result = 37 * result + (getSj() == null ? 0 : this.getSj().hashCode());
		result = 37 * result
				+ (getFxwc() == null ? 0 : this.getFxwc().hashCode());
		result = 37 * result
				+ (getSfsc() == null ? 0 : this.getSfsc().hashCode());
		result = 37 * result
				+ (getGjscbz() == null ? 0 : this.getGjscbz().hashCode());
		result = 37 * result
				+ (getGjcd() == null ? 0 : this.getGjcd().hashCode());
		result = 37 * result
				+ (getZrqy() == null ? 0 : this.getZrqy().hashCode());
		result = 37 * result
				+ (getXcry() == null ? 0 : this.getXcry().hashCode());
		result = 37 * result
				+ (getXcjg() == null ? 0 : this.getXcjg().hashCode());
		result = 37 * result
				+ (getXczzcs() == null ? 0 : this.getXczzcs().hashCode());
		result = 37 * result
				+ (getBgqk() == null ? 0 : this.getBgqk().hashCode());
		result = 37 * result
				+ (getXgry() == null ? 0 : this.getXgry().hashCode());
		result = 37 * result + (getBz() == null ? 0 : this.getBz().hashCode());
		return result;
	}

}
