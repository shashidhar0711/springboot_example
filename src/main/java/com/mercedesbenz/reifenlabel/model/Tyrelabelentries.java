package com.mercedesbenz.reifenlabel.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tyrelabelentries")
public class Tyrelabelentries {
	
	


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
   private int id;
	
   @Column(name = "datakey")
   private String datakey;
   
   @Column(name = "jsonfileid")
   private int jsonfileid;
   
   @Column(name = "plant")
   private String plant;
   
   @Column(name = "modelseries")
   private String modelseries;
   
   @Column(name = "module")
   private String module;
   
   @Column(name = "position")
   private String position;
   
   @Column(name = "startofslice")
   private String startofslice;
   
   @Column(name = "endofslice")
   private String endofslice;
   
   @Column(name = "eprelid")
   private String eprelid;
   
   @Column(name = "asnr")
   private String asnr;
   
   @Column(name = "sda")
   private String sda;
   
   @Column(name = "sdb")
   private String sdb;

	
	  @Column(name = "entryjson") 
	  private String entryjson;
	  
	  @Column(name = "created_on")
	  private Date created_on;
	
	    public int getId() {
		return id;
	}

	public String getDatakey() {
		return datakey;
	}

	public int getJsonfileid() {
		return jsonfileid;
	}

	public String getPlant() {
		return plant;
	}

	public String getModelseries() {
		return modelseries;
	}

	public String getModule() {
		return module;
	}

	public String getPosition() {
		return position;
	}

	public String getStartofslice() {
		return startofslice;
	}

	public String getEndofslice() {
		return endofslice;
	}

	public String getEprelid() {
		return eprelid;
	}

	public String getAsnr() {
		return asnr;
	}

	public String getSda() {
		return sda;
	}

	public String getSdb() {
		return sdb;
	}

	public String getEntryjson() {
		return entryjson;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDatakey(String datakey) {
		this.datakey = datakey;
	}

	public void setJsonfileid(int jsonfileid) {
		this.jsonfileid = jsonfileid;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public void setModelseries(String modelseries) {
		this.modelseries = modelseries;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setStartofslice(String startofslice) {
		this.startofslice = startofslice;
	}

	public void setEndofslice(String endofslice) {
		this.endofslice = endofslice;
	}

	public void setEprelid(String eprelid) {
		this.eprelid = eprelid;
	}

	public void setAsnr(String asnr) {
		this.asnr = asnr;
	}

	public void setSda(String sda) {
		this.sda = sda;
	}

	public void setSdb(String sdb) {
		this.sdb = sdb;
	}

	public void setEntryjson(String entryjson) {
		this.entryjson = entryjson;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	
	public Tyrelabelentries() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Tyrelabelentries [id=" + id + ", datakey=" + datakey + ", jsonfileid=" + jsonfileid + ", plant=" + plant
				+ ", modelseries=" + modelseries + ", module=" + module + ", position=" + position + ", startofslice="
				+ startofslice + ", endofslice=" + endofslice + ", eprelid=" + eprelid + ", asnr=" + asnr + ", sda="
				+ sda + ", sdb=" + sdb + ", entryjson=" + entryjson + ", created_on=" + created_on + "]";
	}


	
}