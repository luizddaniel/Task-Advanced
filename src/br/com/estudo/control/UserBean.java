package br.com.estudo.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estudo.model.UserDAO;
import br.com.estudo.model.UserImp;

@ManagedBean
@SessionScoped
public class UserBean extends CrudBean<UserImp, UserDAO>{

	private UserDAO userDAO;
	
	@Override
	public UserDAO getDao() {
		if(userDAO == null){
			userDAO = new UserDAO();
		}
		return userDAO;
	}

	@Override
	public UserImp criarNovaEntidade() {
		return new UserImp();
	}

}
