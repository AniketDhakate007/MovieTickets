package com.MoviesTicket.MovieService.dao;

import com.MoviesTicket.MovieService.entity.Category;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    Category getCategoryByCategoryId(int categoryId);
}
