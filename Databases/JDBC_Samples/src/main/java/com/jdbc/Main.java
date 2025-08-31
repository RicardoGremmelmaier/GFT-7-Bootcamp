package com.jdbc;

import com.jdbc.persistence.ConnectionUtil;
import com.jdbc.persistence.EmployeeDAO;
import com.jdbc.persistence.entity.EmployeeEntity;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.OffsetDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static EmployeeDAO employeeDao = new EmployeeDAO();

    public static void main(String[] args) {
        var flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/JDBC_Sample", "root", "Ricardo2012")
                .load();

        flyway.migrate();

//        This is how to insert in database
//        var employee = new EmployeeEntity();
//        employee.setName("Marlon");
//        employee.setSalary(new BigDecimal(15000));
//        employee.setBirthday(OffsetDateTime.now().minusYears(20));
//        employeeDao.insert(employee);

//        This is how to findAll
//        employeeDao.findAll().forEach(System.out::println);

//        This is how to find one
//        System.out.println(employeeDao.findById(1));

//        This is how to update
//        var employee = new EmployeeEntity();
//        employee.setId(1);
//        employee.setName("Rick");
//        employee.setSalary(new BigDecimal(20000));
//        employee.setBirthday(OffsetDateTime.now().minusYears(25));
//        employeeDao.update(employee);

//        This is how to delete
//        employeeDao.delete(3);
    }
}