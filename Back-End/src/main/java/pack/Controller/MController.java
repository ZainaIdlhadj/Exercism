package pack.Controller;

import java.util.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.Difficulty;
import pack.Service.TopicService;
import pack.Service.itemService;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:4200")
public class MController {
	    @Autowired
	    private itemService itemservice;
	    private TopicService topicservice;
	    @GetMapping("/find")
	 	 public ArrayList<Item> findByDifficulty(@RequestParam("d") Difficulty d,@RequestParam("s") Status s,@RequestParam("id") int id) {
	 		ArrayList<Item>  items = (ArrayList<Item>) itemservice.find(d,s,id);
	 		return items;
	 		}
	 	
	 	@GetMapping("/items")
	 		 public ArrayList<Item> findAll(){
	 		ArrayList<Item> items = (ArrayList<Item>) itemservice.findAll();
			
	 		return items;
	 		}

	 	@GetMapping("/add")
	 	public void add() {
	 		Item item=new Item("ResistorColor",Difficulty.Difficult, Status.Completed,"https://assets.exercism.io/exercises/resistor-color-dark.png");
	 		item.getTopics().add(topicservice.findbyValue("Arrays"));
	 		item.getTopics().add(topicservice.findbyValue("Strings"));
	 		itemservice.save(item);
	 		
	 	}
	 	
}