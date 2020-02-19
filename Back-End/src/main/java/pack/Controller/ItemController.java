package pack.Controller;

import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Difficulty;
import pack.Service.TopicService;
import pack.Service.ItemService;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {
	    @Autowired
	    private ItemService itemservice;
	    private TopicService topicservice;
	    
	    @GetMapping("/find")
	 	 public ArrayList<Item> findByDifficulty(@RequestParam("d") Difficulty d,@RequestParam("s") Status s,@RequestParam("id") int id) {
	 		ArrayList<Difficulty>  difficulty = new ArrayList<Difficulty>();
	 		ArrayList<Status>  status = new ArrayList<Status>();
	        if (d==Difficulty.All) difficulty.addAll(Arrays.asList(Difficulty.values()));
	        else difficulty.add(d);
	        if (s==Status.All) status.addAll(Arrays.asList(Status.values()));
	        else status.add(s);
	        if(id==0) return itemservice.findByDiffultyAndStatus(difficulty, status);
	        else return itemservice.findByDiffultyAndStatusAndTopic(difficulty, status,id);
	 		}
	 	
	 	@GetMapping("/items")
	 		 public ArrayList<Item> findAll(){
	 		ArrayList<Item> items = (ArrayList<Item>) itemservice.findAll();
	 		return items;
	 		}

	 	@GetMapping("/add")
	 	public void add() {
	 		Item item=new Item("ResistorColor",Difficulty.Difficult, Status.Completed,"https://assets.exercism.io/exercises/resistor-color-dark.png");
	 		item.getTopics().add(topicservice.findByValue("Arrays"));
	 		item.getTopics().add(topicservice.findByValue("Strings"));
	 		itemservice.save(item);
	 		
	 	}
	 	
}