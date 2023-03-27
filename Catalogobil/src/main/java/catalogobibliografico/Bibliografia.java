package catalogobibliografico;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class Bibliografia {
	private int isbn;
	private String titolo;
	private int annopubblicazione;
	private int numeropagine;
	
	    // ...

	    public static Bibliografia parse(String input) {
	        String[] tokens = input.split(",");
	        if (tokens.length == 4) {
	            String tipo = tokens[0];
	            long isbn = Long.parseLong(tokens[1]);
	            String autore = tokens[2];
	            int annopubblicazione = Integer.parseInt(tokens[3]);
	            if (tipo.equals("libro")) {
	                return new libri(isbn, autore, annopubblicazione);
	            } else if (tipo.equals("rivista")) {
	                return new riviste(isbn, autore, annopubblicazione);
	            }
	        }
	        return null;
	    }



	public List<Bibliografia> getAutore() {
		// TODO Auto-generated method stub
		return null;
	}



	public Bibliografia(long isbn2, int annopubblicazione2) {
		// TODO Auto-generated constructor stub
	}


}
