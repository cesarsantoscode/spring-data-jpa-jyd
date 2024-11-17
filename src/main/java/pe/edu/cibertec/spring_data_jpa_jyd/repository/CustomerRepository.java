package pe.edu.cibertec.spring_data_jpa_jyd.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.spring_data_jpa_jyd.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
