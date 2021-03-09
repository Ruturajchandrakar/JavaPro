package com.springboot.courceController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourceService {
	@Autowired
	private CourceRepository courceRepository;

	public Iterable<Cource> getAllCources(String topicId) {
		return courceRepository.findByTopicId(topicId);
	}

	public Optional<Cource> getCource(String id) {
		return courceRepository.findById(id);
	}

	public void addCource(Cource cource) {
		courceRepository.save(cource);
	}

	public void updateCource(Cource cource) {
		courceRepository.save(cource);
	}

	public void deleteCource(String id) {
		courceRepository.deleteById(id);
	}

}
