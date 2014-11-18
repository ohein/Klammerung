
public class Buch {
	
	private String autor;
	private String titel;
	private int isbn;
	
	public Buch (String autor, String titel, int isbn){
		this.autor=autor;
		this.titel=titel;
		this.isbn=isbn;
	}
	
	public void setAutor (String autor){
		this.autor= autor;
	}
	
	public String getAutor (){
		return this.autor;
	}
	
	public void setTitel (String titel){
		this.titel = titel;
	}
	
	public String getTitel (){
		return this.titel;
	}
	
	public void setIsbn (int isbn){
		this.isbn= isbn;
	}
	
	public int getISBN (){
		return this.isbn;
	}
}
