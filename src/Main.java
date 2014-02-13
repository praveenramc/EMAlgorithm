
public class Main {
	
	
	public static void main(String args[]) {
		
		String fileName = args[0];
		Main m = new Main();
		EM em = new EM(fileName);
		
		
		em.loadDataFromTheFile(fileName);
		em.setNumOfClusters(3);
		em.initParameters(false);
		
	}
}
