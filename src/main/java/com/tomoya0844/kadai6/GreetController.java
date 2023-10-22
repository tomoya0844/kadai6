package com.tomoya0844.kadai6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public List<Greet> getGreet() {
        return List.of(

                new Greet("JAPAN", "こんにちは", "肉じゃが", "https://www.kurashiru.com/recipes/82b3201b-29f4-4db9-9fbb-82a1ce16d247"),
                new Greet("USA", "Hello!", "hamburger ", "https://www.kurashiru.com/recipes/29f32e79-b407-446b-9411-2170a1d686d0"),
                new Greet("France", "Bonjour", "bouillabaisse", "https://www.salad-cafe.com/recipes/recipe-0141/"),
                new Greet("Turkey", "İyi günler", "kebab", "https://www.kurashiru.com/lists/2b208f24-1e22-42f0-bf06-d2222a6c5c3e")
        );
    }
}

