package com.bridgelabz.FundooNotes.Service;

import com.bridgelabz.FundooNotes.Model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

}
