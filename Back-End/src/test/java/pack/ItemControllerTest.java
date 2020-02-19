package pack;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;

import pack.Controller.ItemController;
import pack.Model.Difficulty;
import pack.Model.Item;
import pack.Model.Status;
import pack.Service.TopicService;
import pack.Service.ItemService;

@RunWith(SpringRunner.class)
@WebMvcTest
@ContextConfiguration(classes = {ItemController.class, ItemControllerTest.class})
public class ItemControllerTest {

	 @Autowired
	    private MockMvc mvc;

	    @MockBean
	    private TopicService service;
	    private ItemService itemService;

		@Test
		void FindAllTest() throws Exception {
			Item item1 = new Item("Hello World", Difficulty.Easy, Status.Locked,"https://assets.exercism.io/exercises/hello-world-dark.png");
	 		item1.getTopics().add(service.findByValue("Arrays"));
	 		item1.getTopics().add(service.findByValue("Classes"));
	        
	 		Item item2=new Item("Two Fer ",Difficulty.Easy, Status.Unlocked,"https://assets.exercism.io/exercises/two-fer-dark.png");
	 		item2.getTopics().add(service.findByValue("Arrays"));
	 		
	 		Item item3=new Item("Reverse Strings",Difficulty.Easy, Status.Unlocked,"https://assets.exercism.io/exercises/reverse-string-dark.png");
	 		item3.getTopics().add(service.findByValue("File"));
	 		
	 		Item item4=new Item("Leap",Difficulty.Medium, Status.Locked,"https://assets.exercism.io/exercises/leap-dark.png");
	 		item4.getTopics().add(service.findByValue("Booleans"));
	 		item4.getTopics().add(service.findByValue("Logic"));
	 		
	 		Item item5=new Item("ResistorColor",Difficulty.Difficult, Status.Completed,"https://assets.exercism.io/exercises/resistor-color-dark.png");
	 		item5.getTopics().add(service.findByValue("Arrays"));
	 		item5.getTopics().add(service.findByValue("Strings"));
			ArrayList<Item> items = new ArrayList<Item>();
			items.add(item1);
			items.add(item2);
			items.add(item3);
			items.add(item4);
			items.add(item5);

			given(itemService.findAll()).willReturn(items);

		    mvc.perform(get("/item/items")
		            .contentType(MediaType.APPLICATION_JSON))
		            .andExpect(status().isOk())
		           .andExpect(jsonPath("$.length()", is (5)))
		            .andExpect(jsonPath("$[0].name", is("Hello World")));
		
		}
		
		

	}