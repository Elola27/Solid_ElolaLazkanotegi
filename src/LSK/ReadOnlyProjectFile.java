package LSK;

public class ReadOnlyProjectFile extends File implements Readable  {
	/*public ReadOnlyProjectFile(String filePath) {
		super(filePath);
// TODO Auto-generated constructor stub
	}

	public void storeFile() {
		System.out.println("ERROR, can not be Saved");
	}*/

	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
	}
	
	public void read() {
		System.out.println("file loaded from " + filePath);
	}
}
