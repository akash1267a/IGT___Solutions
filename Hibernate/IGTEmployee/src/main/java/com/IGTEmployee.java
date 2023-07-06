package com;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class IGTEmployee {
	@Id
	private int uid;
	private String name;
	private String desig;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}

}
