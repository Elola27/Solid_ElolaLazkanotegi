package LSK;

public class File implements Readable{
	
	public String filePath;

	public File(String filePath) {
		this.filePath = filePath;
	}
	
	public void read() {
		System.out.println("file loaded from " + filePath);
	}

	public void store() {
		System.out.println("file saved to " + filePath);
	}

}
