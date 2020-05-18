package br.com.ecommerce.manufacturer.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.manufacturer.service.model.Manufacturer;
import br.com.ecommerce.manufacturer.service.service.ManufacturerService;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerSerivceRest {

    @Autowired
    ManufacturerService manufacturerService;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Manufacturer getManufacturer(@PathVariable("id") int id){
    	Manufacturer manufacturer = manufacturerService.getManufacturer(id);
    	System.out.println("getManufacturer method : "+ manufacturer);
        return manufacturer;
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Manufacturer> getAllManufacturer(){
    	List<Manufacturer> manufacturerList = manufacturerService.getAllManufacturer();
    	System.out.println("getManufacturer method : "+ manufacturerList);
        return manufacturerList;
    }
}
