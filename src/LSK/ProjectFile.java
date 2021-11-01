package LSK;

public class ProjectFile extends File implements Readable,Storable{

	public ProjectFile(String filePath){
		super(filePath);
	}
	public void read() {
		System.out.println("file loaded from " + filePath);
	}

	public void store() {
		System.out.println("file saved to " + filePath);
	}
}
