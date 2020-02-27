package com.codeclan.example.bookingSystem.repositories.CustomerRepository;

import com.codeclan.example.bookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findAllCustomerByCourseId(Long id) {
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);

            cr.createAlias("bookings", "bookingsAlias");
            cr.add(Restrictions.eq("bookingsAlias.course.id", id));

            result = cr.list();
        }
        catch (HibernateException ex){
            ex.printStackTrace();
        }
        finally {
            session.close();
            return result;
        }
    }

}
