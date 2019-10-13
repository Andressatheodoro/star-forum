package andressa.andressa.ifsc;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Register {
	
	@Id
	private String txtName;
	private String senha;
	private String txtEmail;
	private Boolean confirmation;

public Register(){
	
}

public Register(String txtName, String senha, String txtEmail, Boolean confirmation) {
	super();
	this.txtName = txtName;
	this.senha = senha;
	this.txtEmail = txtEmail;
	this.confirmation = confirmation;
}

public String getTxtName() {
	return txtName;
}

public void setTxtName(String txtName) {
	this.txtName = txtName;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getTxtEmail() {
	return txtEmail;
}

public void setTxtEmail(String txtEmail) {
	this.txtEmail = txtEmail;
}

public Boolean getConfirmation() {
	return confirmation;
}

public void setConfirmation(Boolean confirmation) {
	this.confirmation = confirmation;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((confirmation == null) ? 0 : confirmation.hashCode());
	result = prime * result + ((senha == null) ? 0 : senha.hashCode());
	result = prime * result + ((txtEmail == null) ? 0 : txtEmail.hashCode());
	result = prime * result + ((txtName == null) ? 0 : txtName.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Register other = (Register) obj;
	if (confirmation == null) {
		if (other.confirmation != null)
			return false;
	} else if (!confirmation.equals(other.confirmation))
		return false;
	if (senha == null) {
		if (other.senha != null)
			return false;
	} else if (!senha.equals(other.senha))
		return false;
	if (txtEmail == null) {
		if (other.txtEmail != null)
			return false;
	} else if (!txtEmail.equals(other.txtEmail))
		return false;
	if (txtName == null) {
		if (other.txtName != null)
			return false;
	} else if (!txtName.equals(other.txtName))
		return false;
	return true;
}

}