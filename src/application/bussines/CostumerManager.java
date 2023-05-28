package application.bussines;

import java.util.List;

import application.dataAccsess.CostumerDao;
import application.entities.Costumer;

public class CostumerManager {
	public static List<Costumer> costumers;

	public static void add(Costumer costumer) throws Exception {
		for (Costumer costumer2 : costumers) {
			if (costumer.getName() == costumer2.getName() && costumer.getPassword() == costumer2.getPassword()) {
				throw new Exception("this costumer is already exist");
			}

		}

		costumers.add(costumer);
		CostumerDao.serialize(costumers);
	}
	public static void isThere(Costumer costumer) throws Exception {
		List<Costumer> costumerTakingDataCostumers=CostumerDao.deserialize();
		for (Costumer costumer2 :costumerTakingDataCostumers ) {
			if (costumer.getName() == costumer2.getName() && costumer.getPassword() == costumer2.getPassword()) {
				
			}

		}
		throw new Exception("User is invalid");
	}

	public static void delete(Costumer costumer) {
//girilenin nesnesi silinecek
		costumers.remove(costumer);
	}

	public static void update(Costumer costumer) {

	}
	
}
