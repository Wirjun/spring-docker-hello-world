package dae.example.template.services;

import dae.example.template.entities.Expansion;
import dae.example.template.repos.ExpansionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ExpansionService {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private ExpansionRepo expansionRepo;

    @Transactional
    public void saveOrUpdate(Expansion expansion){
        em.merge(expansion);
    }

    public List<Expansion> findAll(){
        return expansionRepo.findAll();
    }
}
