package com.example.demo9.service;

import org.springframework.stereotype.Service;

import com.example.demo9.entity.Review;
import com.example.demo9.repository.RegistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {

	private final RegistRepository repository;
	
	@Override
	public void regist(Review review) {
		
		repository.add(review);

	}

}
