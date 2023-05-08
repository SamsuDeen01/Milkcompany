package com.example.study.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.Model.LoanApplicationModel;
import com.example.study.Model.UserModel;
import com.example.study.Service.LoanApplicationService;

@RestController
public class Controller {
@Autowired
LoanApplicationService ls;
@GetMapping("/user/getProfile")
public List<UserModel> getprofile()
{
	return ls.getprofile();
}
@GetMapping("/admin/getAllLoans")
public List<LoanApplicationModel> getloans()
{
	return ls.getLoan();
}
@PostMapping("/user/addprofile")
public UserModel addprofile(@RequestBody UserModel D)
{
	return ls.addUser(D);
}
@PostMapping("/admin/addLoan")
public LoanApplicationModel addLoan(@RequestBody LoanApplicationModel L)
{
	return ls.adddata(L);
}
@PutMapping("/user/editprofile")
public UserModel updateprofile(@RequestBody UserModel D )
{
	return ls.updateUser(D);
}
@PutMapping("/admin/editLoan")
public LoanApplicationModel updateLaon(@RequestBody LoanApplicationModel L )
{
	return ls.updateLoan(L);
}
@DeleteMapping("/admin/deleteprofile/{id}")
public int deleteprofile(@PathVariable int id)
{
	ls.deleteUser(id);
	return 0;
}
@DeleteMapping("/admin/deleteLoan/{id}")
public int deleteLoan(@PathVariable int id)
{
	ls.deleteLoan(id);
	return 0;
}
//@GetMapping("/user/viewLoan/{user}")
//public Optional<LoanApplicationModel> getbyuser(int user)
//{
//	return ls.getLoanbyid(user);
//}
}
