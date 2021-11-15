package tn.g3.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.g3.spring.entity.*;
import tn.g3.spring.service.CommentProductService;

@RestController

public class CommentProductController {
	
	    @Autowired
	    CommentProductService commentService;


	    @PostMapping("/addComment")
	    @ResponseBody
	    public void addComment(@RequestBody CommentProduct c) {
	        commentService.addComment(c);
	    }

	    @PostMapping("/deleteComment")
	    @ResponseBody
	    public void deleteComment(@RequestBody CommentProduct c) {
	        commentService.deleteComment(c);
	    }

	    @PostMapping("/updateComment")
	    @ResponseBody
	    public void updateComment(@RequestBody CommentProduct c) {
	        commentService.updateComment(c);
	    }


	   // @GetMapping("/getListComment")
	    //public List<CommentProduct> getListComment(@RequestBody Product p) {
	      //  return commentService.getListComment(p);
	    //}

}
