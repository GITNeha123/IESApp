package com.del.ies.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
@Component
public class DCGenerator implements IdentifierGenerator {
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
     int seqVal = 0;
		try {
			Connection con = session.connection();
			Statement stmt = con.createStatement();
			String qry = "select cID.nextval from dual";
			ResultSet rs = stmt.executeQuery(qry);
			if (rs.next()) {
				seqVal = rs.getInt(1);
				System.out.println("=================seqVal================="+seqVal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seqVal;

	}
	

}
