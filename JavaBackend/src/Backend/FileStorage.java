package Backend;
import java.io.File;
import java.util.ArrayList;

public class FileStorage extends ArrayList<String> {
	private static final long serialVersionUID = 1L;
	
	public File src;
	public File bin;

	public FileStorage() {super();}
	
	public FileStorage(File directory) {
		src = new File(directory.getAbsolutePath() + File.separator + "src");
		if(!src.exists()) {src.mkdir();}
		bin = new File(directory.getAbsolutePath() + File.separator + "bin");
		if(!bin.exists()) {bin.mkdir();}
	}
	
	public FileStorage(File src, File bin) {
		this.src = src; 
		if(!src.exists()) {src.mkdir();}
		this.bin = bin;
		if(!bin.exists()) {bin.mkdir();}
	}
	
	public void addToFront(String string) {this.add(0, string);}
}