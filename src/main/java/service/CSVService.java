package service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import helper.CSVHelper;
import model.Product;
import repository.ProductRepository;

@Service
public class CSVService {
	@Autowired
	ProductRepository repository;

	public void save(MultipartFile file) {
		try {
			List<Product> products = CSVHelper.csvToProducts(file.getInputStream());
			repository.saveAll(products);
		} catch (IOException e) {
			throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}
	}

	public List<Product> getAllTutorials() {
		return repository.findAll();
	}
}