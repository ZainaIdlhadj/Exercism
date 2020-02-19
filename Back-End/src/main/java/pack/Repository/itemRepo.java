package pack.Repository;

import java.util.ArrayList;


import org.springframework.data.repository.CrudRepository;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Difficulty;

public interface ItemRepo  extends CrudRepository<Item, Long>  {
	  public ArrayList<Item>  findByDifficultyInAndStatutIn(ArrayList<Difficulty>difficulty, ArrayList<Status> status);
	  public ArrayList<Item> findByDifficultyInAndStatutInAndTopicsId(ArrayList<Difficulty>difficulty, ArrayList<Status> status, int id);
}
