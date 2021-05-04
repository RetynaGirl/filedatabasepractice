package com.teknoserval.filedatabasepractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teknoserval.filedatabasepractice.model.FileDB;

public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
