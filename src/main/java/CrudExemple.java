import java.util.List;

import Controller.PersonneController;
import model.Perssone;

public class CrudExemple {
	public static void main(String[] args) {
		PersonneController prsCtl = new PersonneController();
		Perssone p  = new Perssone("yassine","Slaoui",24);
		Perssone s  = new Perssone("wadie","sl",22);
		Perssone l  = new Perssone("Dahman","dd",28);
//		prsCtl.savePerssone(s);
//		prsCtl.savePerssone(p);
//		prsCtl.savePerssone(l);
		List<Perssone> listP = prsCtl.getPerssone();
		for(Perssone pr : listP) {
			System.out.println(pr.toString());
		}
	}
}
