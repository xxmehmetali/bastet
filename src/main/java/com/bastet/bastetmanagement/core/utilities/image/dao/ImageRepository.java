package com.bastet.bastetmanagement.core.utilities.image.dao;

import com.bastet.bastetmanagement.core.utilities.image.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);
}
