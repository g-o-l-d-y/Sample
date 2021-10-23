package backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.model.UserModel;
import backend.repo.UserRepo;

@RestController
public class HomeController {

	@Autowired
	UserRepo userRepo;
		
	@GetMapping("/")
	public String home()
	{
		return "HI";
	}
	
	@GetMapping("/users")
	public List<UserModel> getUsers()
	{
		return userRepo.findAll();
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody UserModel user)
	{
		userRepo.save(user);
	}
}
