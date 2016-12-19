package test;

import Persistence.DriverDao;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Driver;
import Domain.Manager;
import Domain.Sanction;

public class TestMultas {

	@Test
	public void test190_120() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0000", 190, "Murcia", 120);
		Sanction sanction=m.identifyDriver(idInquiry, "5000000");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000000");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test50_30() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 50, "Murcia",30);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test60_30() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 60, "Murcia",30);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test70_30() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 70, "Murcia",30);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test80_30() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 80, "Murcia",30);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test81_30() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 81, "Murcia",30);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test60_40() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 60, "Murcia",40);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test70_40() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 70, "Murcia",40);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test80_40() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 80, "Murcia",40);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test90_40() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 90, "Murcia",40);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test91_40() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 91, "Murcia",40);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test70_50() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 70, "Murcia",50);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test80_50() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 80, "Murcia",50);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test90_50() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 90, "Murcia",50);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test100_50() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 100, "Murcia",50);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test101_50() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 101, "Murcia",50);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	public void test90_60() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 90, "Murcia",60);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test110_60() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 110, "Murcia",60);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test120_60() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 120, "Murcia",60);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test130_60() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 130, "Murcia",60);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test131_60() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 131, "Murcia",60);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test100_70() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 100, "Murcia",70);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test120_70() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 120, "Murcia",70);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test130_70() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 130, "Murcia",70);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test140_70() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 140, "Murcia",70);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test141_70() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 141, "Murcia",70);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test110_80() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 110, "Murcia",80);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test130_80() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 130, "Murcia",80);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test140_80() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 140, "Murcia",80);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test150_80() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 150, "Murcia",80);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test151_80() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 151, "Murcia",80);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test120_90() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 120, "Murcia",90);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test140_90() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 140, "Murcia",90);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test150_90() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 150, "Murcia",90);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test160_90() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 160, "Murcia",90);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test161_90() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 161, "Murcia",90);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test130_100() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 130, "Murcia",100);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test150_100() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 150, "Murcia",100);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test160_100() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 160, "Murcia",100);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test170_100() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 170, "Murcia",100);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==500);
	}
	@Test
	public void test171_100() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 171, "Murcia",100);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test140_110() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 140, "Murcia",110);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test160_110() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 160, "Murcia",110);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test170_110() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 170, "Murcia",110);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test180_110() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 180, "Murcia",110);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==5);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test181_110() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 181, "Murcia",110);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
	@Test
	public void test150_120() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 150, "Murcia",120);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==0);
		assertTrue(sanction.getAmount()==100);
	}
	@Test
	public void test170_120() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 170, "Murcia",120);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==2);
		assertTrue(sanction.getAmount()==300);
	}
	@Test
	public void test180_120() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 180, "Murcia",120);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==4);
		assertTrue(sanction.getAmount()==400);
	}
	@Test
	public void test191_120() {
		Manager m=Manager.get();
		int idInquiry=m.openInquiry("0007", 191, "Murcia",120);
		Sanction sanction=m.identifyDriver(idInquiry, "5000002");
		m.pay(sanction.getId());
		//assertNotNull(sanction.getDateOfPayment());
		DriverDao dao=new DriverDao();
		Driver driver=dao.findByDni("5000002");
		assertTrue(driver.getPoints()==6);
		assertTrue(sanction.getAmount()==600);
	}
}
