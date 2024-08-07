package com.hjnoh19.spring.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjnoh19.spring.test.database.domain.Store;
import com.hjnoh19.spring.test.database.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	@RequestMapping("/db/store/list")
	@ResponseBody
	public List<Store> storeList() {
		return storeService.getStoreList();
	}
}
