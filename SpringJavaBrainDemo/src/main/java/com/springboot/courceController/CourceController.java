package com.springboot.courceController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.topicController.Topic;

@RestController
public class CourceController {
	@Autowired
	private CourceService courceService;

	@RequestMapping("/topics/{id}/cources")
	public Iterable<Cource> getAllCource(@PathVariable String id) {
		return courceService.getAllCources(id);
	}

	@RequestMapping("/topics/{topicId}/cources/{id}")
	public Optional<Cource> getCource(@PathVariable String id) {
		return courceService.getCource(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/cources")
	public void addCource(@RequestBody Cource cource, @PathVariable String topicId) {
		cource.setTopic(new Topic(topicId, "", ""));
		courceService.addCource(cource);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/cources/{id}")
	public void updateCource(@RequestBody Cource cource, @PathVariable String topicId) {
		cource.setTopic(new Topic(topicId, "", ""));
		courceService.updateCource(cource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/cources/{id}")
	public void deleteCource(@PathVariable String id) {
		courceService.deleteCource(id);
	}
}
