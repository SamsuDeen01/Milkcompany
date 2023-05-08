package com.example.study.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Model.AdminModel;
import com.example.study.Model.LoanApplicationModel;
import com.example.study.Model.LoginModel;
import com.example.study.Model.UserModel;
import com.example.study.Repository.AdminModelrepo;
import com.example.study.Repository.LoanApplicationModelRepo;
import com.example.study.Repository.LoginModelRepo;
import com.example.study.Repository.UserModelRepo;

@Service
public class LoanApplicationService {
@Autowired
public AdminModelrepo ar;
@Autowired
public LoanApplicationModelRepo lar;
@Autowired
public LoginModelRepo lmr;
@Autowired
public UserModelRepo umr;
public UserModel addUser(UserModel um)
{
	return umr.save(um);
}
public AdminModel addAdmin(AdminModel am)
{
	return ar.save(am);
}
public LoginModel adddetails(LoginModel lm)
{
	return lmr.save(lm);
}

public LoanApplicationModel adddata(LoanApplicationModel lam)
{
	return lar.save(lam);
}

public List<UserModel> getprofile()
{
	return umr.findAll();
}
public List<LoanApplicationModel> getLoan()
{
	return lar.findAll();
}
public UserModel updateUser(UserModel D)
{
	return umr.saveAndFlush(D);
	
}
public LoanApplicationModel updateLoan(LoanApplicationModel L)
{
	return lar.saveAndFlush(L);
	
}
public int deleteUser(int id)
{
	umr.deleteById(id);
	return 0;
}
public int deleteLoan(int id)
{
	lar.deleteById(id);
	return 0;
}

public Optional<LoanApplicationModel> getLoanbyid(int id)
{
	return lar.findById(id);
}
public String checkLogin(String Email,String Password)
{
	LoginModel c=lmr.findByEmail(Email);
	if(c==null)
	{
		return "No User Found!..";
	}
	else
	{
		if(c.getPassword().equals(Password))
		{
			return "Login Successful!.";
		}
		else
		{
			return "Invalid Username/password";
		}
	}
}
}
