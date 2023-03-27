package catalogobibliografico;

import lombok.Getter;

@Getter
public class libri extends Bibliografia {
	String autore;
	Generebibliografico generebibliografico;
	public libri( int isbn,
	String titolo,
	int annopubblicazione,
	int numeropagine) {
		super(isbn,titolo, annopubblicazione, numeropagine);
		this.autore=autore;
		this.generebibliografico=generebibliografico;
	}

	
}
