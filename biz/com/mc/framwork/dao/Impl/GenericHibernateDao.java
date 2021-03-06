/**
 * 
 */
package com.mc.framwork.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mc.framwork.dao.GenericDao;

/**
 * @author kongfeiquan
 *
 */
public class GenericHibernateDao<T> implements GenericDao<T> {  
    
    private Class<T> entityClass;  
    
    public GenericHibernateDao() {
		
	}
  
    public GenericHibernateDao(Class<T> clazz) {  
        this.entityClass = clazz;  
    }  
  
    private SessionFactory sessionFactory;  
  
    @Override  
    public int insert(T t) {  
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        int result = (Integer) session.save(session.merge(t));
        transaction.commit();
        return result;
    }  
  
    @Override  
    public void delete(T t) {  
    	Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.merge(t));  
        transaction.commit();
    }  
  
    @Override  
    public void update(T t) {  
    	Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(session.merge(t));  
        transaction.commit();
    }  
  
    @SuppressWarnings("unchecked")  
    @Override  
    public T queryById(Integer id) {  
        return (T) sessionFactory.openSession().get(entityClass, id);  
    }  
    
    @Override  
    public List<T> queryAll() {  
        String hql = "from " + entityClass.getSimpleName();  
        return queryForList(hql, null);  
    }  
  
    @SuppressWarnings("unchecked")  
    protected T queryForObject(String hql, Object[] params) {  
        Query query = sessionFactory.openSession().createQuery(hql);  
        setQueryParams(query, params);  
        return (T) query.uniqueResult();  
    }  
  
    @SuppressWarnings("unchecked")  
    protected T queryForTopObject(String hql, Object[] params) {  
        Query query = sessionFactory.openSession().createQuery(hql);  
        setQueryParams(query, params);  
        return (T) query.setFirstResult(0).setMaxResults(1).uniqueResult();  
    }  
  
    @SuppressWarnings("unchecked")  
    protected List<T> queryForList(String hql, Object[] params) {  
        Query query = sessionFactory.openSession().createQuery(hql);  
        setQueryParams(query, params);  
        return query.list();  
    }  
  
    @SuppressWarnings("unchecked")  
    protected List<T> queryForList(final String hql, final Object[] params,  
            final int recordNum) {  
        Query query = sessionFactory.openSession().createQuery(hql);  
        setQueryParams(query, params);  
        return query.setFirstResult(0).setMaxResults(recordNum).list();  
    }  
  
    private void setQueryParams(Query query, Object[] params) {  
        if (null == params) {  
            return;  
        }  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
    }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}  
    
    
  
}  