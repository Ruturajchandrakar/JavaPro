package com.springboot.courceController;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourceRepository extends CrudRepository<Cource, String> {
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic c)
	// deleteTopic(String id)
	public List<Cource> findByTopicId(String topicId);
}
