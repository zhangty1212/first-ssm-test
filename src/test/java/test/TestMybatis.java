/**  
*    文件名:  TestMybatis.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年4月29日  
*/  
package test;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.entity.Book;
import test.service.BookService;

/**
*    类描述: 
*  @author 张涛一 ,2547260515@qq.com
*  @since 2019年4月29日 下午4:40:26
*/

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMybatis {
	
    @Resource
    private	BookService bookService =null;
    
	@Test
	public void test1() {

		List<Book> listbook = bookService.getAllBooks();
		System.out.println(listbook);
	}
    
	@Test
	public void test2() {

		int a = bookService.add(new Book(58, "mybatis 3", 48.1, new Date()));
		System.out.println("书本添加成功：" + a);
	}

}
