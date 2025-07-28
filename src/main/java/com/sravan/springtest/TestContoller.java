package com.sravan.springtest;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class TestContoller {

    @GetMapping("/test1")
    public String getTest1() {
        return "Get Test 1";
    }

    @PostMapping("/test2")
    public String postTest2() {
        return "Post Test 2";
    }

    @PutMapping("/test3")
    public String putTest3() {
        return "Put Test 3";
    }

    @DeleteMapping("/test4")
    public String deleteTest4() {
        return "Delete Test 4";
    }

    @GetMapping("/test5/{id}")
    public String getTest5(@PathVariable Long id) {
        return "Get Test 5 with id: " + id;
    }

    @PostMapping("/test6")
    public String postTest6(@RequestBody String data) {
        return "Post Test 6 with data: " + data;
    }

    @PatchMapping("/test7")
    public String patchTest7() {
        return "Patch Test 7";
    }

    @GetMapping("/test8")
    public String getTest8(@RequestParam String query) {
        return "Get Test 8 with query: " + query;
    }

    @PostMapping("/test9/{id}")
    public String postTest9(@PathVariable Long id, @RequestBody String data) {
        return "Post Test 9 with id: " + id + " and data: " + data;
    }

    @GetMapping("/test10")
    public String getTest10() {
        return "Get Test 10";
    }
}
