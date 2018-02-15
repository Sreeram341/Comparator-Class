
public class Loadit implements Comparable<Loadit> {
	
	String Values;
	int Numbers;
	
	public Loadit( String VL,int NS) {
		
		this.Values = VL;
		this.Numbers = NS;
		
	}

	@Override
	public int compareTo(Loadit Loaddit) {
		// TODO Auto-generated method stub
		
		return (this.Numbers-Loaddit.Numbers);
	}
	
}
