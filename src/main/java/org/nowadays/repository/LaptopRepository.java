package org.nowadays.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.nowadays.configuration.ObjectMapperConfig;
import org.nowadays.model.Laptop;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LaptopRepository {
    private static final LaptopRepository INSTANCE = new LaptopRepository(ObjectMapperConfig.getInstance());

    private final ObjectMapper objectMapper;

    public static LaptopRepository getInstance(){
        return INSTANCE;
    }

    @SneakyThrows
    public List<Laptop> readLaptop(){
        List<Laptop> laptops = new ArrayList<>();
        try(InputStream laptopStream = getClass().getClassLoader().getResourceAsStream("laptop.json")){
            if (laptopStream == null) {
                System.out.println("Файл laptop.json не найден");
            }
            JsonNode rootNode = objectMapper.readTree(laptopStream);
            if(rootNode.hasNonNull("laptops")){
                JsonNode laptopsNode = rootNode.get("laptops");
                laptops.addAll(List.of(objectMapper.convertValue(laptopsNode , Laptop[].class)));
            } else {
                System.out.println("В файле laptop.json отсутствует узел laptops");
            }
        }catch (IOException e) {
            System.out.println("Ошибка при чтении файла laptop.json: " + e.getMessage());
        }
        return laptops;
    }
}
