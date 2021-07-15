package com.example.demo.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StockDao;
import com.example.demo.model.Stock;

@Repository
public class StockDaoImpl implements StockDao{

	// Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
	@Autowired	
	JdbcTemplate jdbctemplate;
	
	List<Stock> stock;
	
	private final String insert = "insert into stock (category,stockname,quantity,baseprice,profit,expirydate) values(?,?,?,?,?,?)";
	private final String getbyid = "select * from stock where id = ?";
	private final String deletebyid = "delete from stock where id = ?";
	private final String getsotcks = "select * from stock";
	private final String getbystockname = "select stockname from stock";
	
	//create stock
	public Stock save(Stock stock) {
		jdbctemplate.update(insert,stock.getCategory(),stock.getStockname(),stock.getQuantity(),stock.getBaseprice(),stock.getProfit(),stock.getExpirydate());	
		return stock;
	}

	//findbyid
	public Stock updateById(Stock stock,Integer id) {
		String update = "insert into stock SET category = ?,stockname = ?,quantity = ?,baseprice = ?,profit = ?,expirydate = ? where id = ?";
		jdbctemplate.update(update,stock.getCategory(),stock.getStockname(),stock.getQuantity(),stock.getBaseprice(),stock.getProfit(),stock.getExpirydate());
		return stock;
//		return jdbctemplate.queryForObject(getbyid, (rs,rowNum)->{
//			return new Stock(rs.getString("category"),rs.getString("stockname"),rs.getInt("quantity"),rs.getInt("baseprice"),rs.getInt("profit"),rs.getDate("expirydate"))
//		})
	}
	
	//getallstocks
	@Override
	public List<Stock> getallStocks() {
		List<Stock> liststock = jdbctemplate.query(getsotcks, new StockRowMapper());
		return liststock;
	}


	//delete by id
	@Override
	public String deletebyid(Integer id) {
		try {
		jdbctemplate.update(deletebyid,id);
		}
		catch(RuntimeException e) {
			System.out.println(e);
			throw e;
		}
		return "Deleted";
	}
	
	//find by id
	@SuppressWarnings("deprecation")
	@Override
	public Stock findSpecific(Integer id) {
		// TODO Auto-generated method stub
		 return jdbctemplate.queryForObject(getbyid, new Object[]{id}, new StockRowMapper());
	}

	
	@Override
	public boolean existsbyStockname(Stock stock) {
		Stock obj = new Stock();
		obj = jdbctemplate.queryForObject(getbystockname, new Object[] {stock.getStockname()},new StockRowMapper()); 
		if(stock.getStockname().equalsIgnoreCase(obj.getStockname())) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
}
