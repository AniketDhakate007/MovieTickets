package com.MoviesTicket.MovieService.service.concretes;

import com.MoviesTicket.MovieService.dao.CategoryDao;
import com.MoviesTicket.MovieService.entity.Category;
import com.MoviesTicket.MovieService.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao categoryDao;

    @Override
    public List<Category> getall() {
        return categoryDao.findAll();
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return categoryDao.getCategoryByCategoryId(categoryId);
    }
}
