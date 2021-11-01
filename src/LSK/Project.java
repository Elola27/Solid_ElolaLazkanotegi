package LSK;

import java.util.Vector;

public class Project {
	public Vector<File> files = new Vector<File>();

	public void addProject(File p) {
		files.add(p);
	}

	public void loadAllFiles() {
		for (File f : files)
			f.read();
	}

	public void storeAllFiles() {
		for (File f : files) {
			if (f instanceof ProjectFile) {
				((ProjectFile)f).store();
			}
		}
			
	}
}
