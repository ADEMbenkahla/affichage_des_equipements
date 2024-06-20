package com.sfm.stage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sfm.stage.entity.User;
import com.sfm.stage.service.UserService;
@Controller
public class UserController {
	private UserService userService;
	public UserController (UserService userService) {
		this.userService = userService;
		
	}
	
	@PostMapping("/userDelete")
	public String userDelete(@ModelAttribute(value = "user") User user, BindingResult result,
			Model model) {
		System.out.println("user to delete "+ user);
		userService.deleteById(user.getId());
		System.out.println("user deleted " + user);
		return "redirect:users";
	}

}
