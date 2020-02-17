package pack.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="topics")
public class Topic {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Column(name = "value")
    private String value;
	Topic() {}
	
	public Topic(int id, String value) {
			this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
