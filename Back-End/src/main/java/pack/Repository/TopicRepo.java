package pack.Repository;

import org.springframework.data.repository.CrudRepository;

import pack.Model.Topic;

public interface TopicRepo extends CrudRepository<Topic, Long>  {
	 public Topic findTopicByValue(String Value);
 
} 


