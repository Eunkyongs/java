import java.io.FileReader;
import java.io.IOException;

//IOException + Exception
public class file3 {
	public static void main(String[] args)throws Exception{
		filein f = new filein();
	}
}

class filein{
	FileReader fr=null;
	public filein() throws IOException, Exception{
		
		try {
		this.fr = new FileReader("C:\\Java5\\File_Stream\\src\\data.dat");
		this.word();
		}
		catch(IOException k){
			if(k.getMessage()!=null) {
				System.out.println(k);
			}
		}
		catch(Exception k1){
			if(k1.getMessage()!=null) {
				System.out.println(k1);
			}
		}
	}
	public void word() throws Exception {
		try {
			int w;
			while(true) {
				w = this.fr.read();
				if(w==-1) {
					break;
				}
				System.out.print((char)w);
			}
			
			this.fr.close(); //FileReader Á¾·á
			
		}catch(Exception j){ 
			if(j.getMessage()!=null) {
				System.exit(0);
			}
		}
	}
}