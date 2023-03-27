package catalogobibliografico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
	private static List<Bibliografia> archivio=new ArrayList<Bibliografia>();
	public static void main(String[] args) {

		
		
		
	}
	private void addBibliografia(Bibliografia b) {
		archivio.add(b);
	};
	public void add (libri l) {addBibliografia(l);}
	public void add (riviste r) {addBibliografia(r);}
	
	
	public static void rimuovi(long isbn) {
		archivio=archivio.stream().filter(e->e.getIsbn() != isbn).collect(Collectors.toList());
	}
	
	public static Bibliografia cercaPerISBD(long isbd) {
	    return archivio.stream()
	            .filter(b -> b.getIsbn() == isbd)
	            .findFirst()
	            .orElse(null);
	}
	public static List<Bibliografia> cercaPerAnno(int anno) {
	    return archivio.stream()
	            .filter(b -> b.getAnnopubblicazione() == anno)
	            .collect(Collectors.toList());
	}
	public static List<Bibliografia> cercaPerAutore(String autore) {
	    return archivio.stream()
	            .filter(b -> b.getAutore().contains(autore))
	            .collect(Collectors.toList());
	}
	public static void writeToTextFile(String Lista) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Lista));
            for (Bibliografia b : archivio) {
                writer.write(b.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

	    public static void readFromTextFile(String Lista) {
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(Lista));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                
	                Bibliografia b = Bibliografia.parse(line);
	                archivio.add(b);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("Error reading from file: " + e.getMessage());
	        }
	    }
	




}
