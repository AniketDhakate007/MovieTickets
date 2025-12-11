package com.MoviesTicket.MovieService.service.abstracts;

import com.MoviesTicket.MovieService.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getall();

    Category getCategoryById(int categoryId);
}
