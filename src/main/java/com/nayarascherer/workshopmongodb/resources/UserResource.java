package com.nayarascherer.workshopmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayarascherer.workshopmongodb.domain.User;
import com.nayarascherer.workshopmongodb.services.UserService;

@RequestMapping(value = "/users")
@RestController
public class UserResource {

	@Autowired
	private UserService service;

	// @RequestMapping(method =RequestMethod.GET )
	@GetMapping
	public ResponseEntity<List<User>> findAll() {

		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

}
