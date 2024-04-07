package testrepository;

import org.junit.jupiter.api.Test;
import org.nowadays.model.Laptop;
import org.nowadays.repository.LaptopRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testLaptopRepository {
    @Test
    void testReadLaptop(){
        LaptopRepository repository = LaptopRepository.getInstance();
        List<Laptop> laptops = repository.readLaptop();

        assertNotNull(laptops);
        assertFalse(laptops.isEmpty());

        for(Laptop laptop : laptops){
            assertNotNull(laptop.getId());
            assertNotNull(laptop.getName());
            assertNotNull(laptop.getDescription());
            assertNotNull(laptop.getPrice());
            assertNotNull(laptop.getPhoto());
        }
    }

}
