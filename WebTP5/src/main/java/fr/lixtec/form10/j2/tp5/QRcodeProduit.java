package fr.lixtec.form10.j2.tp5;

import org.krysalis.barcode4j.impl.code39.Code39Bean;

public class QRcodeProduit {
	
	private String code;
	private String name;
	private Code39Bean bean;
	
	public String getCode() {
		return this.code;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}
