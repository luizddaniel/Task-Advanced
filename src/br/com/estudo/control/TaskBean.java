package br.com.estudo.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.estudo.model.TaskDAO;
import br.com.estudo.model.TaskImp;

@ManagedBean
@SessionScoped
public class TaskBean extends CrudBean<TaskImp, TaskDAO> {

	private TaskDAO taskDAO;

	@Override
	public TaskDAO getDao() {
		if (taskDAO == null) {
			taskDAO = new TaskDAO();
		}
		return taskDAO;
	}

	@Override
	public TaskImp criarNovaEntidade() {
		return new TaskImp();
	}

}
