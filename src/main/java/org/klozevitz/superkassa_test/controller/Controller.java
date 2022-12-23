package org.klozevitz.superkassa_test.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.klozevitz.superkassa_test.model.entities.JsonObject;
import org.klozevitz.superkassa_test.model.entities.PostEntity;
import org.klozevitz.superkassa_test.model.entities.TestObject;
import org.klozevitz.superkassa_test.model.services.TestObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    TestObjectService testObjectService;

    @PostMapping("/modify")
    @Transactional
    public ResponseEntity<?> modify(@ModelAttribute PostEntity request) {
        TestObject object = testObjectService.findById(request.getId());
        if (object == null)
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("418");

        int currentToSet = testObjectService.findById(request.getId()).getObj().getCurrent()
                                                        + request.getAdd();
        object.getObj().setCurrent(currentToSet);
        return ResponseEntity.status(HttpStatus.OK)
                .body(getJson(testObjectService.findById(request.getId()).getObj()));
    }

    public static String getJson(Object resp) {
        GsonBuilder builder = new GsonBuilder();
        Gson response = builder.create();
        return response.toJson(resp);
    }
}


//    @GetMapping("/add")
//    public String add() {
//        testObjectService.save(new TestObject(new JsonObject(0)));
//        testObjectService.save(new TestObject(new JsonObject(50)));
//        testObjectService.save(new TestObject(new JsonObject(100)));
//        return "ok!";
//    }
//
//    @GetMapping("/all")
//    public String all() {
//        return testObjectService.findAll().toString();
//    }