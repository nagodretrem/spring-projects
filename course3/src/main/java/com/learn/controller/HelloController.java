package com.learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    // GET      : Veri görüntülemek istediğimiz zaman kullanıyoruz.                 @GetMapping
    // POST     : Veri kaydetmek istediğimiz zaman kullanıyoruz.                    @PostMapping
    // PUT      : Veri güncellemek için kullanıyoruz                                @PutMapping
    // PATCH    : Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz.  @PatchMapping
    //            Örn: Parola güncellemek gibi.
    // DELETE   : Veri silmek istediğimiz zaman kullanıyoruz                        @DeleteMapping


    //@GetMapping(path = "/hello")
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }
    @PostMapping("/save")
    public String save(){ return "Data saved!";}
    @DeleteMapping("/delete")
    public String delete(){return "Data deleted!";}


}
