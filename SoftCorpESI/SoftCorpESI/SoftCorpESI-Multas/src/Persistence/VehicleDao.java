package Persistence;

import org.hibernate.HibernateException;

import Domain.Vehicle;

import javax.persistence.Query;

public class VehicleDao extends GeneralDao<Vehicle> {
	public VehicleDao() {
		super();
	}
	
	public Vehicle findByLicense(String license) throws HibernateException {
		Vehicle vehicle = null;
        try {
            startOperation();
            Query query=session.createQuery("from Vehicle where license=?");
            query.setParameter(0, license);
            vehicle = (Vehicle) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }
        return vehicle;
	}
}

