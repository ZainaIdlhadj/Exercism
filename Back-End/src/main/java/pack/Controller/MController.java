package pack.Controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pack.Model.Item;
import pack.Model.Status;
import pack.Model.difficulty;
import pack.Service.itemService;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:4200")
public class MController {
	    @Autowired
	    private itemService itemservice;
	    
	    @GetMapping("/find")
	 	 public ArrayList<Item> findByDifficulty(@RequestParam("d") difficulty d,@RequestParam("s") Status s,@RequestParam("id") int id) {
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
	 		Item item1 = new Item(1,"Hello World", difficulty.Easy, Status.Locked,"https://assets.exercism.io/exercises/hello-world-dark.png");
	 		item1.getTopics().add(itemservice.finbyValue("Arrays"));
	 		item1.getTopics().add(itemservice.finbyValue("Classes"));
	        
	 		Item item2=new Item(2,"Two Fer ",difficulty.Easy, Status.Unlocked,"https://assets.exercism.io/exercises/two-fer-dark.png");
	 		item2.getTopics().add(itemservice.finbyValue("Arrays"));
	 		
	 		Item item3=new Item(3,"Reverse Strings",difficulty.Easy, Status.Unlocked,"https://assets.exercism.io/exercises/reverse-string-dark.png");
	 		item3.getTopics().add(itemservice.finbyValue("File"));
	 		
	 		Item item4=new Item(4,"Leap",difficulty.Medium, Status.Locked,"https://assets.exercism.io/exercises/leap-dark.png");
	 		item4.getTopics().add(itemservice.finbyValue("Booleans"));
	 		item4.getTopics().add(itemservice.finbyValue("Logic"));
	 		
	 		Item item5=new Item(5,"ResistorColor",difficulty.Difficult, Status.Completed,"https://assets.exercism.io/exercises/resistor-color-dark.png");
	 		item5.getTopics().add(itemservice.finbyValue("Arrays"));
	 		item5.getTopics().add(itemservice.finbyValue("Strings"));
	 		
	 		itemservice.save(item1);
	 		itemservice.save(item2);
	 		itemservice.save(item3);
	 		itemservice.save(item4);
	 		itemservice.save(item5);
	 		
	 	}
	 	
}