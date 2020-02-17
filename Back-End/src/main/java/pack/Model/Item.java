package pack.Model;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="item")

public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Column(name = "name")
    private String name;
	@Column(name = "img")
    private String img;
	@Column(name = "difficulty")
    private Difficulty difficulty;
	@Column(name = "statut")
	private Status statut;

	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
	
    @JoinTable(name = "topic_items",
            joinColumns = { @JoinColumn(name = "topic_id") },
            inverseJoinColumns = { @JoinColumn(name = "item_id") })
    private Set<Topic> topics = new HashSet<>();
	public Item() {}
	
	
	
    public int getId() {
		return id;
	}


	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}



	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public Item(String name, pack.Model.Difficulty difficulty, Status statut, String img) {
		super();
		this.name = name;
		this.difficulty = difficulty;
		this.statut = statut;
		this.img=img;
	}



	public Difficulty getDifficulty() {
		return difficulty;
	}



	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}



	public Status getStatut() {
		return statut;
	}



	public void setStatut(Status statut) {
		this.statut = statut;
	}



	public Set<Topic> getTopics() {
		return topics;
	}



	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}





    

  
}
