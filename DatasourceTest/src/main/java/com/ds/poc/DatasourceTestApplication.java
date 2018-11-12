package com.ds.poc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DatasourceTestApplication {

	@Autowired
	DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DatasourceTestApplication.class, args);
	}

	@RestController
	class DemoService {
		@RequestMapping(value = "/verizon/poc/create", method = RequestMethod.POST, produces = {
				"application/json" }, consumes = { "application/json" })
		public void getMessageForService(@RequestBody Order order) throws SQLException {
			Connection con = dataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into test200 values(?,?)");
			stmt.setInt(1,Integer.parseInt(order.getId()));
			stmt.setString(2,order.getName()); 
			int i=stmt.executeUpdate();
			con.close();
			return ;
		}
	}
}
