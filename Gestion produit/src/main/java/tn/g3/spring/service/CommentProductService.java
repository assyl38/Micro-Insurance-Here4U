package tn.g3.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.g3.spring.entity.CommentProduct;
import tn.g3.spring.repository.CommentProductRepository;

@Service
public class CommentProductService implements ICommentProductService {
	@Autowired
	CommentProductRepository commentRepo;

	@Autowired
	ProductServiceImpl psi;

	@Override
	public void addComment(CommentProduct c) {
		commentRepo.save(c);
	}


	@Override
	public void deleteComment(CommentProduct c) {
		commentRepo.delete(c);
	}


	@Override
	public void updateComment(CommentProduct c) {
		commentRepo.save(c);
	}


	//  public List<CommentProduct> getListComment(Product p) {
	//    return commentRepo.getAllByProductId(p.getIdProduct());
	//}


}
