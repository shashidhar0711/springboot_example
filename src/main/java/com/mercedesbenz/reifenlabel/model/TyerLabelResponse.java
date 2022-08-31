package com.mercedesbenz.reifenlabel.model;

import javax.persistence.Column;

public class TyerLabelResponse {
	   private String eprelid;
	   
	   private String asnr;

	public String getEprelid() {
		return eprelid;
	}

	public String getAsnr() {
		return asnr;
	}

	public void setEprelid(String eprelid) {
		this.eprelid = eprelid;
	}

	public void setAsnr(String asnr) {
		this.asnr = asnr;
	}
}
