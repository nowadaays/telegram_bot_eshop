package testservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.nowadays.model.Laptop;
import org.nowadays.repository.LaptopRepository;
import org.nowadays.service.LaptopService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class testLaptopService {
    private LaptopRepository laptopRepository;
    private LaptopService laptopService;

    @BeforeEach
    void setUp(){
        laptopRepository = Mockito.mock(LaptopRepository.class);
        laptopService = new LaptopService(laptopRepository);
    }

    @Test
    void testGetLaptop(){
        List<Laptop> expectedLaptops = Arrays.asList(new Laptop("unique_id_1" , "Macbook 13 2016" , new BigDecimal(127999.99) , "256 ГБ SSD , 8 ГБ оперативной памяти , Silver" , "https://cdsassets.apple.com/live/SZLF0YNV/images/sp/111999_SP747_mbp13-silver.jpg"));
    }
}
