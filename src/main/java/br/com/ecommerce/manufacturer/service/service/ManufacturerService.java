package br.com.ecommerce.manufacturer.service.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.ecommerce.manufacturer.service.model.Manufacturer;

@Service
public class ManufacturerService {

    private static final Map<Integer, Manufacturer> manufacturerMap = new HashMap<Integer, Manufacturer>();
    static {
        manufacturerMap.put(1, new Manufacturer(1, "Manufacturer 1"));
        manufacturerMap.put(1, new Manufacturer(2, "Manufacturer 2"));
        manufacturerMap.put(1, new Manufacturer(3, "Manufacturer 3"));
        manufacturerMap.put(1, new Manufacturer(4, "Manufacturer 4"));
        manufacturerMap.put(1, new Manufacturer(5, "Manufacturer 5"));
        manufacturerMap.put(1, new Manufacturer(6, "Manufacturer 6"));
        manufacturerMap.put(1, new Manufacturer(7, "Manufacturer 7"));
        manufacturerMap.put(1, new Manufacturer(8, "Manufacturer 8"));
        manufacturerMap.put(1, new Manufacturer(9, "Manufacturer 9"));
        manufacturerMap.put(1, new Manufacturer(10, "Manufacturer 10"));
    }

    public Manufacturer getManufacturer(int id) {
        return manufacturerMap.get(id);
    }

    public List<Manufacturer> getAllManufacturer() {
        List<Manufacturer> manufacturers =  new ArrayList<Manufacturer>();
        manufacturers.addAll(manufacturerMap.values());
        return manufacturers;
    }
    
}
