package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.KursInterfejs;

public class Menjacnica implements KursInterfejs {
	private LinkedList<Kurs> kursnaLista=new LinkedList();
	@Override
	public boolean dodajKurs(Kurs k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean obrisiKurs(Kurs k) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Kurs pronadjiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
