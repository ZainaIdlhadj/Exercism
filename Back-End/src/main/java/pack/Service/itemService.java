package pack.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Topic;
import pack.Model.difficulty;
import pack.Repository.TopicRepo;
import pack.Repository.itemRepo;

@Service
public class itemService {
	@Autowired
    private itemRepo repository;
	
	@Autowired
    private TopicRepo repo;
	
    public void save(Item item) {
    	repository.save(item);
    }
    public ArrayList<Item> findAll() {

        return (ArrayList<Item>) repository.findAll();
    }
    public ArrayList<Item> find(difficulty d,Status s,int id) {
    	 if(id==0)
    	 {
    		 if(d==difficulty.All && s==Status.All)
                   return (ArrayList<Item>) repository.findAll();
             else if (s==Status.All)
            	   return (ArrayList<Item>) repository.findItemByDifficulty(d);
             else if (d==difficulty.All)
        	       return (ArrayList<Item>) repository.findItemByStatut(s);
             else return (ArrayList<Item>) repository.findItemByDifficultyAndStatut(d,s);
    	 }
         else if (s==Status.All&&d==difficulty.All)
        	  return (ArrayList<Item>) repository.findItemByTopicsId(id);
         else if (s==Status.All)
       	      return (ArrayList<Item>) repository.findItemByTopicsIdAndDifficulty(id,d);
         else if (d==difficulty.All)
    	       return (ArrayList<Item>) repository.findItemByTopicsIdAndStatut(id,s);
         else return (ArrayList<Item>) repository.findByDifficultyAndStatutAndTopicsId(d,s,id);
    	 
    }
    
    public Topic finbyValue(String value) {
		return repo.findTopicByValue(value);
    }
   
}
