package andressa.andressa.ifsc;

public class Login {

	private String Name;
	private String Senha;

	public Login(String name, String senha) {
		super();
		Name = name;
		Senha = senha;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
