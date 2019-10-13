package andressa.andressa.ifsc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id

	private String name;
	private String job;
	private String homeState;
	private String contact;
	private String about;

	public User() {
		
	

	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHomeState() {
		return homeState;
	}

	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public User(String name, String job, String homeState, String contact, String about) {
		super();

		this.job = job;
		this.homeState = homeState;
		this.contact = contact;
		this.about = about;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((about == null) ? 0 : about.hashCode());

		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((homeState == null) ? 0 : homeState.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
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
		User other = (User) obj;
		if (about == null) {
			if (other.about != null)
				return false;
		} else if (!about.equals(other.about))
			return false;

		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (homeState == null) {
			if (other.homeState != null)
				return false;
		} else if (!homeState.equals(other.homeState))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		return true;
	}

}