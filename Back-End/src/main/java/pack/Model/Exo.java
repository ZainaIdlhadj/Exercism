package pack.Model;

import java.util.ArrayList;

public class Exo {
	    private String name;
	    private String img;
	    private Difficulty difficulty;
		private Status statut;
		private ArrayList<String> topics;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
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
		public ArrayList<String> getTopics() {
			return topics;
		}
		public void setTopics(ArrayList<String> topics) {
			this.topics = topics;
		}
		
}
