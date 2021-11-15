package tn.g3.spring.service;

import tn.g3.spring.entity.CommentProduct;

public interface ICommentProductService {
	void addComment(CommentProduct c);
	void deleteComment(CommentProduct c);
	void updateComment(CommentProduct c);
}
