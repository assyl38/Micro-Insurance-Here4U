package tn.g3.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.g3.spring.entity.RateProduct;
import tn.g3.spring.repository.RateProductRepository;

@Service
public class RateProductServiceImpl implements IRateProductService{
	@Autowired 
	RateProductRepository rateRepo;


	@Override
	public RateProduct addRate(RateProduct r) {
		return rateRepo.save(r);
	}

	@Override
	public void deleteRate(RateProduct r) {
		rateRepo.delete(r);
	}

	@Override
	public void updateRate(RateProduct r) {
		rateRepo.save(r);
	}


	//public RateProduct getRate(long idProduct , long user_ID) {
	//  return  rateRepo.getRateByProductIdAndUserId(idProduct,user_ID);
	//}


}
