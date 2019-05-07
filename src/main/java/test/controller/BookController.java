/**  
*    文件名:  BookController.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年4月29日  
*/  
package test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test.entity.Book;
import test.service.BookService;

/**
*    类描述: 
*  @author 张涛一 ,2547260515@qq.com
*  @since 2019年4月29日 下午7:00:41
*/

@Controller
@RequestMapping("/book")
public class BookController {

	@Resource
	private BookService bookService;

	@RequestMapping("/showbooks")
	public String showbooks(HttpServletRequest request, Model model) {

		List<Book> booklist = bookService.getAllBooks();
		model.addAttribute("booklist", booklist);
		return "/jsp/showBook.jsp";
	}

}
