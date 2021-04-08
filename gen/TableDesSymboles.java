
import java.util.ArrayList;

public class TableDesSymboles {
	
	/*cette classe utilise le pattern singleton
	 * qui fait en sorte que la classe ne s'instancie qu'une seule et unique fois
	 * pour s'assurer d'avoir qu'une seule table des symboles durant la compilation
	 */

	
	private static TableDesSymboles instance = null;
	private ArrayList<ElementTable> table;
	
	private TableDesSymboles() //constructeur privé
	{
		table = new ArrayList<ElementTable>();
	}
	
	//methode qui s'assure de l'existance d'une seule instance de la table avant de la retourner
	public static TableDesSymboles getInstance()
	{
		if(instance==null) //si premiere instanciation 
		{
			instance = new TableDesSymboles();
		}
		
		return instance;
	}
	
	//ajouter un element dans la table des symboles
	public void ajouterElement(ElementTable e)
	{
		table.add(e);
		
	}
	
	//extraire l'element dont le nom est nomElem de la table
	public ElementTable getElement(String nomElem)
	{
		for(int i=0;i<this.tailleTable();i++)
		{
			if(table.get(i).nomElem.equals(nomElem))
				return table.get(i);
		}
		
		return null;
	}
	
	//verifier l'existance d'un element dans la table
	public boolean existElement(String nomElem)
	{
		return (getElement(nomElem) != null);
	}
	
	//supprimer un element de la table
	public void supprimerElement(String nomElem)
	{
		ElementTable e = getElement(nomElem);
		if(e != null)
			table.remove(e);
	}
	
	public int tailleTable()
	{
		return table.size();
	}
	
	//surcharges
	
	public ElementTable getElement(int i)
	{
		return table.get(i);
	}
	
	public void supprimerElement(int i)
	{
		table.remove(i);
	}
	
	public void supprimerElement(ElementTable e)
	{
		table.remove(e);
	}

	
}


