package Concrete;

import Abstract.PersonCheckService;
import Entities.Customer;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
