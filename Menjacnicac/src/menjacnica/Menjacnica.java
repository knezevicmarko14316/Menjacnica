package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.KursInterfejs;

public class Menjacnica implements KursInterfejs {
	private LinkedList<Kurs> kursnaLista=new LinkedList();
	@Override
	public boolean dodajKurs(Kurs k) {
		// TODO Auto-generated method stub
		if (k == null || kursnaLista.contains(k))
			throw new RuntimeException("Kurs je null ili vec postoji");
		
		kursnaLista.add(k);
		return true;
	}

	@Override
	public boolean obrisiKurs(Kurs k) {
		// TODO Auto-generated method stub
		if (k == null || !kursnaLista.contains(k))
			throw new RuntimeException("Knjiga je null ili ne postoji");

		kursnaLista.remove(k);
		return true;
	}

	@Override
	public Kurs pronadjiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		if (naziv == null||naziv=="" || datum==null)
			throw new RuntimeException("Unesite naziv i datum kursa");
		for (int i=0;i<kursnaLista.size();i++){
			if (kursnaLista.get(i).getNazivValute().contains(naziv) &&  kursnaLista.get(i).getDatum()==datum)
				
		return kursnaLista.get(i);}
		return null;
		
	}

}
