package com.example.form_backend.repositories;

import com.example.form_backend.models.FormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDataRepository extends JpaRepository<FormData, Long> {
}
