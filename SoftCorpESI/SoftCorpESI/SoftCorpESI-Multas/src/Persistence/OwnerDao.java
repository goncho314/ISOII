package Persistence;

import org.hibernate.HibernateException;

import Domain.Owner;
import Domain.Vehicle;

import javax.persistence.Query;

public class OwnerDao extends GeneralDao<Owner> {
	public OwnerDao() {
		super();
	}
	
	public Owner findByDni(String dni) throws HibernateException {
		Owner owner = null;
        try {
            startOperation();
            Query query=session.createQuery("idOwner from OwnerVehicle where license=? and ");
            query.setParameter(1, dni);
            owner = (Owner) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return owner;
	}
	
	public Owner findByLicense(String license) throws HibernateException {
		Owner owner = null;
        try {
            startOperation();
            Query query=session.createQuery("from Vehicle where license=?");
            query.setParameter(0, license);
            Vehicle vehicle=(Vehicle) query.getSingleResult();
            owner=vehicle.getOwner();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return owner;
	}
}

