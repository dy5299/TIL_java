package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")         // class에 대해서는 주소 겹쳐도 실행 가능. method에 대해서만 안 겹치면 돼.
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain 등 여러가지 타입 가능 -> PostMapping 시 produces로 지정


//    @RequestMapping(method= RequestMethod.POST, path="/postMethod")   //아래와 같음
    @PostMapping(value="/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping
    public void put(){

    }

    @PatchMapping()
    public void patch(){

    }
}
