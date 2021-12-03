import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUtils;
import com.models.Etudiant;
import com.models.Filiere;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		
		List<Filiere> fils = s.createQuery("From Filiere").list();
		
		for(Filiere f : fils)
			System.out.println(f.getNom() + " - " + f.getEtudiants().size());
		
		/*Etudiant e = new Etudiant();
		e.setNom("testkkkk");
		e.setPrenom("testdfsds");
		Filiere f = new Filiere();
		f.setId(2);
		e.setFiliere(f);
		
		s.save(e);
		*/
		t.commit();
		s.close();

	}

}
