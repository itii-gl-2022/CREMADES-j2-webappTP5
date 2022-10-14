package fr.lixtec.form10.j2.exo6;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class IndividuServiceBean
{
    @PersistenceContext(unitName = "individuPersistenceUnit")
    EntityManager em;

    
    
    public Individu persist(Individu individu)
    {
        return em.merge(individu);
    }
    
    
    
    @SuppressWarnings("unchecked")
    public List<Individu> getIndividus()
    {
        Query query = em.createQuery("select individu from Individu individu");
        return query.getResultList();
    }
}
