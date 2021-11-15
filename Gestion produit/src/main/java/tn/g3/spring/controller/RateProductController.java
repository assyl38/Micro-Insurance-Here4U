package tn.g3.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.g3.spring.entity.RateProduct;
import tn.g3.spring.service.IRateProductService;

@RestController
public class RateProductController {
	@Autowired
	IRateProductService rs;
	 @PostMapping("/addRate")
	 @ResponseBody
	    public RateProduct addRate(@RequestBody RateProduct r) {
	        return rs.addRate(r);
	    }

	    @PostMapping("/deleteRate")
	    @ResponseBody
	    public void deleteRate(@RequestBody RateProduct r) {
	        rs.deleteRate(r);
	    }

	    @PostMapping("/updateRate")
	    @ResponseBody
	    public void updateRate(@RequestBody RateProduct r) {
	        rs.updateRate(r);
	    }



}

