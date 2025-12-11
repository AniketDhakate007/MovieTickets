package com.MoviesTicket.MovieService.controller;

import com.MoviesTicket.MovieService.entity.Category;
import com.MoviesTicket.MovieService.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/movie/categories/")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("getAll")
    public List<Category> getAll(){
        return categoryService.getall();
    }
}
