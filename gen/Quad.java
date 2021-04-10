
public class Quad {
	
	public String champs[];
	
	public Quad(String ch1, String ch2, String ch3, String ch4)
	{
		this.champs = new String[4];
		this.champs[0] = ch1;
		this.champs[1] = ch2;
		this.champs[2] = ch3;
		this.champs[3] = ch4;
	}
	
	public Quad(String[] champs)
	{
		this.champs = champs;
	}
	
	public String getChamp(int i)
	{
		if(i<0 || i>3)
			return null;
		else
			return champs[i];
	}
	
	public void setChamp(int i, String ch)
	{
		if(i>=0 && i<=3)
			this.champs[i] = ch;
	}
	
	@Override
	public String toString()
	{
		return "("+champs[0]+","+champs[1]+","+champs[2]+","+champs[3]+")";
	}
}
