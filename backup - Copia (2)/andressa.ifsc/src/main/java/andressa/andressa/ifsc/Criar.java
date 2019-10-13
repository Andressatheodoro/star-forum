package andressa.andressa.ifsc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Criar {
	@Id
private String title;
private Boolean politicas;
private String descricao;
public Criar(String title, Boolean politicas, String descricao) {
	super();
	this.title = title;
	this.politicas = politicas;
	this.descricao = descricao;
}

public Criar() {
	
	}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Boolean getPoliticas() {
	return politicas;
}

public void setPoliticas(Boolean politicas) {
	this.politicas = politicas;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
	result = prime * result + ((politicas == null) ? 0 : politicas.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
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
	Criar other = (Criar) obj;
	if (descricao == null) {
		if (other.descricao != null)
			return false;
	} else if (!descricao.equals(other.descricao))
		return false;
	if (politicas == null) {
		if (other.politicas != null)
			return false;
	} else if (!politicas.equals(other.politicas))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Titulo: " +"   " + this.title + "   ";
}


}
