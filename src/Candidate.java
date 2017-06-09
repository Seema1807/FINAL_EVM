
public class Candidate {
	//int id;
	public String name;
	public int votes;
	
	public Candidate(String name)
	{
		//this.id=id;
		this.name=name;
		votes=0;
	}
	
	//public int getId()
	//{
	//	return id;
	//}
	
	public String getName()
	{
		return name;
	}
	
	public void incrementCount()
	{
		votes++;
	}
	public int getNumberOfVotes()
	{
		return votes;
	}
}

