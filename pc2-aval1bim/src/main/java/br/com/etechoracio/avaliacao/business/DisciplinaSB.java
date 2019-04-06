package br.com.etechoracio.avaliacao.business;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.etechoracio.avaliacao.dao.DisciplinaDAO;
import br.com.etechoracio.avaliacao.model.Disciplina;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class DisciplinaSB extends BaseSB {

	private DisciplinaDAO disciplinaDAO;

	@Override
	protected void postConstructImpl() {

		disciplinaDAO = getDAO(DisciplinaDAO.class);
		// TODO Auto-generated method stub

	}

@Transactional
	public void save(Disciplina disciplina) {
	disciplinaDAO.save(disciplina);
}

}
