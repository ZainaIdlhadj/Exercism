package pack.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Difficulty;
import pack.Repository.ItemRepo;

@Service
public class ItemService {
	@Autowired
    private ItemRepo repository;
	
	
    public void save(Item item) {
    	repository.save(item);
    }
    public ArrayList<Item> findAll() {

        return (ArrayList<Item>) repository.findAll();
    }
  
    public ArrayList<Item> findByDiffultyAndStatusAndTopic(ArrayList<Difficulty> d,ArrayList<Status> s,int id) {
    	
    	return repository.findByDifficultyInAndStatutInAndTopicsId(d, s, id);
    }
    
    public ArrayList<Item> findByDiffultyAndStatus(ArrayList<Difficulty> difficulty,ArrayList<Status> status){
		
		return repository.findByDifficultyInAndStatutIn(difficulty, status);
	}
	
    
    
   
}
