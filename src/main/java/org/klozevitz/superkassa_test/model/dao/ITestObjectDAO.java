package org.klozevitz.superkassa_test.model.dao;

import org.klozevitz.superkassa_test.model.entities.TestObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITestObjectDAO extends JpaRepository<TestObject, Integer> {
}
