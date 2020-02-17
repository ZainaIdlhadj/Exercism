package pack.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Topic;
import pack.Model.difficulty;

public interface itemRepo  extends CrudRepository<Item, Long>  {
	  public ArrayList<Item> findItemByDifficulty(difficulty d);
	  public ArrayList<Item> findItemByStatut(Status s);
	  public ArrayList<Item> findItemByTopicsIdAndStatut(int id,Status s);
	  public ArrayList<Item> findItemByTopicsIdAndDifficulty(int id,difficulty d);
	  public ArrayList<Item> findItemByTopicsId(int id);
	  public ArrayList<Item> findByDifficultyAndStatutAndTopicsId(difficulty difficulty, Status status,int id);
	  public ArrayList<Item> findItemByDifficultyAndStatut(difficulty difficulty, Status status);
}
