package com.example.app.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.app.Repo.UserRepo;
import com.example.app.models.UserSignup;


@org.springframework.stereotype.Service
public class Service {
	
	@Autowired 
	private UserRepo newrepo; 
	

	
public String data(UserSignup user) {
		
		if (user.getPassword().length() < 6) {
			return "Password should be min 6 character";
		}
		
		if (user.getEmail() == "") {
			return "Please Enter Email";
		}
		
		if (user.getUserName() == "") {
			return "Please Enter UserName";
		}
		
		user.setRole("User");
		newrepo.save(user);
		return "Success";
		
	}
	
	public String login(UserSignup login) {
		UserSignup data = newrepo.findByEmail(login.getEmail());
		
		if (data != null) {
			if(data.getPassword().equals (login.getPassword())) {
				return "Authenticated";
			}
			
			return "Password is wrong";
		}
		 return "User Not Found";
	}
	
	public String hotelreg(UserSignup hotelowner) {
		if (hotelowner.getPassword().length() < 6) {
			return "Password should be min 6 character";
		}
		
		if (hotelowner.getEmail() == "") {
			return "Please Enter Email";
		}
		
		if (hotelowner.getUserName() == "") {
			return "Please Enter HotelName";
		}
		
		hotelowner.setRole("HotelOwner");
		newrepo.save(hotelowner);
		return "Successfully Registered";
	}




}
