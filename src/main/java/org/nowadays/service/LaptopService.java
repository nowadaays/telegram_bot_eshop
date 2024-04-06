package org.nowadays.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.nowadays.configuration.ObjectMapperConfig;
import org.nowadays.model.Laptop;
import org.nowadays.repository.LaptopRepository;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LaptopService {
    private static final LaptopService INSTANCE = new LaptopService(LaptopRepository.getInstance());

    private final LaptopRepository laptopRepository;

    public List<Laptop> getLaptops(){
        return laptopRepository.readLaptop();
    }

    public static LaptopService getInstance(){
        return INSTANCE;
    }
}
