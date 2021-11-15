package tn.g3.spring.service;

import tn.g3.spring.entity.RateProduct;

public interface IRateProductService {
	RateProduct addRate(RateProduct r);

	void deleteRate(RateProduct r);

	void updateRate(RateProduct r);

	//public RateProduct getRate(long idProduct , long user_ID);

}