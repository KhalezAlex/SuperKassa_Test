package org.klozevitz.superkassa_test.model.services;

import org.klozevitz.superkassa_test.model.dao.ITestObjectDAO;
import org.klozevitz.superkassa_test.model.entities.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestObjectService {
    @Autowired
    ITestObjectDAO testObjectDAO;

    public void save(TestObject obj) {
        testObjectDAO.save(obj);
    }

    public TestObject findById(int id) {
        return testObjectDAO.findById(id).orElse(null);
    }

    public List<TestObject> findAll() {
        return testObjectDAO.findAll();
    }
}
