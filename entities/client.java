package entities;
import java.util.Date;
import java.text.SimpleDateFormat;

public class client {
	
	private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date BirthDate;
	
	public client() {
		
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.BirthDate = birthDate;
	}

	public client(String name, String email, Date birthDate) {
		
		this.nome = name;
		this.email = email;
		this.BirthDate = birthDate;
	}
		
	public String toString() {
	return nome + " (" + sdf.format(BirthDate) + ") - " + email;
	}
	
	
	
	
	
}
