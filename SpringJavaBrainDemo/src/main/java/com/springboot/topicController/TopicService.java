package com.springboot.topicController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;

	public Iterable<Topic> getAllTopics() {
		return topicRepository.findAll();
	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic top) {
		topicRepository.save(top);
	}

	public void updateTopic(String id, Topic top) {
		topicRepository.save(top);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
