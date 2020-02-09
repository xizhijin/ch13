package com.ssm.demo.service;

import java.util.List;

import com.ssm.demo.po.Book;


/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Book> getAll();

}
