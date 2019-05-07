/**  
*    文件名:  BookServiceImpl.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年4月29日  
*/
package test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import test.entity.Book;
import test.mapper.BookMapper;

/**
 * 类描述:
 * 
 * @author 张涛一 ,2547260515@qq.com
 * @since 2019年4月29日 下午4:30:37
 */

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Resource
	private BookMapper bookMapper;

	@Override
	public int add(Book entity) {
		// TODO Auto-generated method stub
		return bookMapper.add(entity);

	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return bookMapper.delete(id);

	}

	@Override
	public int update(Book entity) {
		// TODO Auto-generated method stub
		return bookMapper.update(entity);

	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookMapper.getAllBooks();

	}

}
