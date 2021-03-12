package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")  // localhost:9090/api

public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")  // localhost:9090/api/getMethod
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")    // localhost:9090:api/getparameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name="password") String pwd){
        String password = "bbbb";   // 굳이 로컬변수를 password로 설정해야 하는 경우, 위 param에서 name 설정해서 가능

        System.out.println("id :"+id);
        System.out.println("password :"+pwd);

        return id+pwd;
    }


    // localhost:9090/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public String getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }


    @GetMapping("/getMultiParameter2")
    public SearchParam getMultiParameter2(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
        // localhost:9090/api/getMultiParameter2?account=abcd&email=study@gmail.com&page=10
        // {"account":"abcd","email":"study@gmail.com","page":10}
    }
}
