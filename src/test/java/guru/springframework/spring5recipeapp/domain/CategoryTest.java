package guru.springframework.spring5recipeapp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category category;

    public void setUp(){
        category = new Category(); // whenever we run we will get new test category
    }

    @Test
    void getId() {
        Long idValue = 4L;
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}