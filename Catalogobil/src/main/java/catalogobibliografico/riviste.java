package catalogobibliografico;

public class riviste extends Bibliografia {

	private Periodico periodicità;
	public riviste( int isbn,
			String titolo,
			int annopubblicazione,
			int numeropagine) {
				super(isbn,titolo, annopubblicazione, numeropagine);
				this.periodicità=periodicità;
			}

			

}
