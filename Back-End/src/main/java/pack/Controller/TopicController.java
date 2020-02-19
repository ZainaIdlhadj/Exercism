package pack.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pack.Model.Topic;
import pack.Service.TopicService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/topic")
public class TopicController {
	 @Autowired
	    private TopicService topicservice;

	 	@GetMapping("/add")
	 	public void add() {
	 		topicservice.save(new Topic(1,"Arrays"));
	 		topicservice.save(new Topic(2,"Strings"));
	 		topicservice.save(new Topic(3,"Conditionals"));
	 		topicservice.save(new Topic(4,"Classes"));
	 		topicservice.save(new Topic(5,"Booleans"));
	 		topicservice.save(new Topic(6,"Dates"));
	 		topicservice.save(new Topic(7,"Equality"));
	 		topicservice.save(new Topic(8,"File"));
	 		topicservice.save(new Topic(9,"Games"));
	 		topicservice.save(new Topic(10,"Logic"));	
	 	}
	 	
	 	
	 	@GetMapping("/items")
	 		 public ArrayList<Topic> findAll(){
	 		ArrayList<Topic> items = (ArrayList<Topic>) topicservice.findAll();
			
	 		return items;
	 		}
}
