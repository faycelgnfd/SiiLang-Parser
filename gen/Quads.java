import java.util.LinkedList;

public class Quads {
	
	private LinkedList<Quad> quads;
	
	public Quads()
	{
		quads = new LinkedList<Quad>();
	}
	
	public int ajouterQuad(String ch1, String ch2, String ch3, String ch4)
	{
		quads.add(new Quad(ch1,ch2,ch3,ch4));
		return this.tailleQuads()-1;
	}
	
	public Quad getQuad(int i)
	{
		return quads.get(i);
	}
	
	public int tailleQuads()
	{
		return quads.size();
	}
	
	//surcharge
	public int ajouterQuad(Quad quad)
	{
		quads.add(quad);
		return this.tailleQuads()-1;
	}

}
