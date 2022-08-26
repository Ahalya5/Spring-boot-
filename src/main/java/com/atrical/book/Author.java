package com.atrical.book;

import org.springframework.web.bind.annotation.*;

@RestController
public class Author {
    @PostMapping ("/hole")
    public String blockHole(){
        return " black holes that probably found each other late in life.";
    }
    @GetMapping ("/hole")
    public String born(){
        return "the block hole born in U.S";
    }
    @PutMapping ("/hole")
    public String twoHole(){
        return "Two block hole come in separate place";
    }
    @DeleteMapping ("/hole")
    public String wave(){
        return "Gravitational wave astronomy";
    }
}
