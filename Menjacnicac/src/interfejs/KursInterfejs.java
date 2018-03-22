package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface KursInterfejs {
 public boolean dodajKurs(Kurs k);
 public boolean obrisiKurs(Kurs k);
 public Kurs pronadjiKurs(String naziv,GregorianCalendar datum);

}
