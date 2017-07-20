package com.bridgelabz.FundooNotes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.FundooNotes.Model.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findUserByEmail(String email);

}
