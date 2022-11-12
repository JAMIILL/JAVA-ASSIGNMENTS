package WEEK6;

public class Encap1 {
	
	private int id =10;
	private int idd = 20;
	private int iddd;
	public void set(int id1,int idd1)
	{
		this.id = id1;
		this.idd = idd1;
		this.iddd = this.id + this.idd;
	}
public int  get ()//we have to create seperate mehod for each get
{
	return id;
	
	}
public int  get1 ()
{
	return idd;
	
	}
public int  get2 ()
{
	return iddd;
	
	}
}
