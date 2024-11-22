package pe.edu.cibertec.spring_data_jpa_jyd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.spring_data_jpa_jyd.entity.Customer;
import pe.edu.cibertec.spring_data_jpa_jyd.repository.CustomerRepository;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringDataJpaJydApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaJydApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * save()
         */
//        for (int i = 0; i < 20; i++) {
//            Customer customer = new Customer(null, 1, "César", "Santos", "cesar@mail.com", 1, 1, new Date(), new Date());
//            customerRepository.save(customer);
//        }

        /**
         * findById() - get()
         */
//        Optional<Customer> optional = customerRepository.findById(605);
//        Customer customer = optional.get();
//        System.out.println(customer);

        /**
         * findById() - orElse()
         */
//        Optional<Customer> optional = customerRepository.findById(605);
//        Customer customer = optional.orElse(null);
//        System.out.println(customer);

        /**
         * findById() - orElseGet()
         */
//        Optional<Customer> optional = customerRepository.findById(602);
//        Customer customer = optional.orElseGet(() -> {
//            LocalDate today = LocalDate.now();
//            System.out.println("Customer not found -> " + today);
//            return null;
//        });
//        System.out.println(customer);

        /**
         * findById() - orElseThrow()
         */
//        Optional<Customer> optional = customerRepository.findById(605);
////        Customer customer = optional.orElseThrow(IllegalArgumentException::new);
//        Customer customer = optional.orElseThrow(() -> {
//            return new IllegalArgumentException("Customer not found");
//        });
//        System.out.println(customer);

        /**
         * isPresent()
         */
//        Optional<Customer> optional = customerRepository.findById(602);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        /**
         * ifPresent()
         */
//        Optional<Customer> optional = customerRepository.findById(605);
//        optional.ifPresent((item) -> {
//            LocalDate today = LocalDate.now();
//            System.out.println("Fecha:" + today);
//            System.out.println(item);
//        });

        /**
         * ifPresentOrElse()
         */
//        Optional<Customer> optional = customerRepository.findById(602);
//        optional.ifPresentOrElse(
//                (element) -> {
//                    LocalDate localDate = LocalDate.now();
//                    System.out.println(localDate);
//                    System.out.println(element.getFirst_name());
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                }
//        );

        /**
         * existsById()
         */
//        if (customerRepository.existsById(605)) {
//            System.out.println("Customer exist");
//        } else {
//            System.out.println("Customer not exist");
//        }

        /**
         * findAll()
         */
//        Iterable<Customer> iterable = customerRepository.findAll();
        // for clasico
//        for (Customer customer : iterable) {
//            System.out.println(customer.getEmail());
//        }

        // forEach
//        iterable.forEach(System.out::println);

        // forEach - Lambda
//        iterable.forEach((item) -> {
//            System.out.println(item.getEmail());
//        });

        /**
         * Convertir Iterable en List
         */
//        List<Customer> customers = List.copyOf((Collection<Customer>) iterable);

        /**
         * findAllById()
         */
//        Iterable<Integer> ids = List.of(600, 601, 602);
//        Iterable<Customer> iterable = customerRepository.findAllById(ids);
//        iterable.forEach(System.out::println);

        /**
         * deleteById()
         */
//        int id = 601;
//        if (customerRepository.existsById(id)) {
//            customerRepository.deleteById(id);
//        }

        /**
         * deleteAllById()
         */
//        List<Integer> lista = List.of(628, 629, 630);
////        lista.stream().filter((id) -> {
////            return customerRepository.existsById(id);
////        }).collect(Collectors.toList());
//        lista.stream().filter(customerRepository::existsById).collect(Collectors.toList());
//        customerRepository.deleteAllById(lista);

        /**
         * delete()
         */
//        Optional<Customer> optional = customerRepository.findById(627);
//        optional.ifPresentOrElse(
//                (item) -> {
//                    customerRepository.delete(item);
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                }
//        );

        /**
         * deleteAll()
         */
//        Iterable<Customer> iterable = customerRepository.findAllById(List.of(624, 625, 626));
//        customerRepository.deleteAll(iterable);

        /**
         * find() - map()
         */
        Optional<Customer> optional = customerRepository.findById(617);
        String email = optional.map(Customer::getEmail).orElseGet(() -> {
            System.out.println("Customer not found");
            return "No-email";
        });
        System.out.println(email);

    }

}
