package com.mercedesbenz.reifenlabel.model;

import java.util.Date;

public class TyerLabelRequest {

	private String lcr;
	private String plantid;
	private String model;
	private String bm7;
	private Date ttz;
	public String getLcr() {
		return lcr;
	}
	public String getPlantid() {
		return plantid;
	}
	public String getModel() {
		return model;
	}
	public String getBm7() {
		return bm7;
	}
	public Date getTtz() {
		return ttz;
	}
	public void setLcr(String lcr) {
		this.lcr = lcr;
	}
	public void setPlantid(String plantid) {
		this.plantid = plantid;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBm7(String bm7) {
		this.bm7 = bm7;
	}
	public void setTtz(Date ttz) {
		this.ttz = ttz;
	}
}
