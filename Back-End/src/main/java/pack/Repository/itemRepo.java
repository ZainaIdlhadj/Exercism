package pack.Repository;

import java.util.ArrayList;


import org.springframework.data.repository.CrudRepository;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Topic;
import pack.Model.Difficulty;

public interface itemRepo  extends CrudRepository<Item, Long>  {
	  public ArrayList<Item> findItemByDifficulty(Difficulty d);
	  public ArrayList<Item> findItemByStatut(Status s);
	  public ArrayList<Item> findItemByTopicsIdAndStatut(int id,Status s);
	  public ArrayList<Item> findItemByTopicsIdAndDifficulty(int id,Difficulty d);
	  public ArrayList<Item> findItemByTopicsId(int id);
	  public ArrayList<Item> findByDifficultyAndStatutAndTopicsId(Difficulty difficulty, Status status,int id);
	  public ArrayList<Item> findItemByDifficultyAndStatut(Difficulty difficulty, Status status);
}
