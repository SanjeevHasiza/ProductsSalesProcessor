package com.javacircle.soa.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacircle.soa.model.Product;
import com.javacircle.soa.model.ProductArr;
import com.javacircle.soa.model.Sales;
import com.javacircle.soa.response.BaseResponse;
import com.javacircle.soa.response.SalesResponse;
import com.javacircle.soa.utils.CommonUtils;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SalesController {

	// Input file name
	public static final String SALES_FILE_PATH = "./sales_data.csv";

	@PostMapping("/v1/sales/report")
	@CrossOrigin
	@ResponseBody
	public ResponseEntity<BaseResponse> processSales(@RequestBody final Product product) {
		SalesResponse salesResponse = null;
		ResponseEntity<BaseResponse> responseEntity = new ResponseEntity(salesResponse, HttpStatus.OK);
		if (product == null) {
			return new ResponseEntity(salesResponse, HttpStatus.BAD_REQUEST);
		}
		this.readSalesData();

		if (product != null) {
			if (CommonUtils.isNotEmpty(product.getProductArr())) {
				List<ProductArr> productArr = product.getProductArr();
				for (ProductArr productObj : productArr) {
					System.out.println("------Name----" + productObj.getProductName());
					System.out.println("------ID----" + productObj.getProductId());
				}

			}
		}

		return responseEntity;

	}

	public List<Sales> readSalesData() {
		List<Sales> salesListObj = new ArrayList<Sales>();
		try {

			List<List<String>> records = new ArrayList<>();
			try (Scanner scanner = new Scanner(new File("sales_data.csv"));) {
				while (scanner.hasNextLine()) {
					records.add(getRecordFromLine(scanner.nextLine()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return salesListObj;
	}
	
	private List<String> getRecordFromLine(String line) {
	    List<String> values = new ArrayList<String>();
	    try (Scanner rowScanner = new Scanner(line)) {
	        rowScanner.useDelimiter(",");
	        while (rowScanner.hasNext()) {
	            values.add(rowScanner.next());
	        }
	        System.out.println(values);
	    }
	    return values;
	}

}
