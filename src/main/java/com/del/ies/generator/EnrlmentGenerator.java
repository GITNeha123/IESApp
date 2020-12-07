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
public class EnrlmentGenerator implements IdentifierGenerator{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prefix="AR00";
		String sfix="";
		int seqVal = 0;
		System.out.println("==========prefix================="+prefix);
		
		try {
			Connection con = session.connection();
			Statement stmt = con.createStatement();
			String qry = " select ar_ID.nextval from dual";
			ResultSet rs = stmt.executeQuery(qry);
			if (rs.next()) {
				seqVal = rs.getInt(1);
				System.out.println("=======================================seqVal=================="+seqVal);
				sfix=String.valueOf(seqVal);
				System.out.println("==========sfix================="+sfix);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===========Generater==========================="+prefix+sfix);
		
		return prefix+sfix;
		

	}
}
