package pack.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Topic;
import pack.Model.difficulty;

public interface itemRepo  extends CrudRepository<Item, Long>  {
	ArrayList<Item> findByDifficultyInAndStatusIn(ArrayList<Difficulty>difficulty, ArrayList<Status> status);
	  ArrayList<Item> findByDifficultyInAndStatusInAndTopicsId(ArrayList<Difficulty>difficulty, ArrayList<Status> status, long id);
}
