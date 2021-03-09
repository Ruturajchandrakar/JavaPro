package com.springboot.topicController;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic c)
	// deleteTopic(String id)
}
