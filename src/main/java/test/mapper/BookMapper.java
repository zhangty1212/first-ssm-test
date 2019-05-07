/**  
*    文件名:  BookMapper.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年4月29日  
*/  
package test.mapper;

import java.util.List;
import test.entity.Book;


/**
*    类描述: 
*  @author 张涛一 ,2547260515@qq.com
*  @since 2019年4月29日 下午3:52:48
*/

public interface BookMapper {
	
	// 添加图书
	public int add(Book entity);
	
	// 根据图书编号，删除图书
	public int delete(int id);
	
	// 更新图书
	public int update(Book entity);
	
	// 查询所有
	public List<Book> getAllBooks();

}
