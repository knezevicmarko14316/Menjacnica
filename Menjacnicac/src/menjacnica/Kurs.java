package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private String nazivValute;
	private String skracenNazivValute;
	private GregorianCalendar datum;
	private double prodajniKurs,srednjiKurs,kupovniKurs;
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkracenNazivValute() {
		return skracenNazivValute;
	}
	public void setSkracenNazivValute(String skracenNazivValute) {
		this.skracenNazivValute = skracenNazivValute;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	
}
