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
		if(nazivValute == null || nazivValute=="")
			throw new RuntimeException("Naziv valute nije unet!");
		this.nazivValute = nazivValute;
	}
	public String getSkracenNazivValute() {
		return skracenNazivValute;
	}
	public void setSkracenNazivValute(String skracenNazivValute) {
		if(skracenNazivValute == null || skracenNazivValute=="")
			throw new RuntimeException("Skraceni naziv valute nije unet!");
		this.skracenNazivValute = skracenNazivValute;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null )
			throw new RuntimeException("Datum nije unet!");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs <=0)
			throw new RuntimeException("Prodajni kurs nije ispravno unet!");
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs <=0)
			throw new RuntimeException("Prodajni kurs nije ispravno unet!");
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs <=0)
			throw new RuntimeException("Prodajni kurs nije ispravno unet!");
		this.kupovniKurs = kupovniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenNazivValute == null) ? 0 : skracenNazivValute.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skracenNazivValute == null) {
			if (other.skracenNazivValute != null)
				return false;
		} else if (!skracenNazivValute.equals(other.skracenNazivValute))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [nazivValute=" + nazivValute + ", skracenNazivValute=" + skracenNazivValute + 
				", datum=" + datum.get(GregorianCalendar.DAY_OF_MONTH)
		+"." +datum.get(GregorianCalendar.MONTH)+"."+datum.get(GregorianCalendar.YEAR)
		+ ", prodajniKurs=" + prodajniKurs + ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs
				+ "]";
	}

	
}
