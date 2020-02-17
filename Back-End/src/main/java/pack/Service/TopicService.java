package pack.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.Model.Topic;
import pack.Repository.TopicRepo;

@Service
public class TopicService {
	@Autowired
    private TopicRepo repository;

    public void save(Topic topic) {
    	repository.save(topic);
    }
    public ArrayList<Topic> findAll() {

        return (ArrayList<Topic>) repository.findAll();

         }
    public Topic findbyValue(String value) {
    		return repository.findTopicByValue(value);
    }
}
