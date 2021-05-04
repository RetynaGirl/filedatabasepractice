package com.teknoserval.filedatabasepractice.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.teknoserval.filedatabasepractice.model.FileDB;
import com.teknoserval.filedatabasepractice.repository.FileDBRepository;

public class FileStorageService {
	
	private FileDBRepository fileDBRepository;

	@Autowired
	public FileDB store(MultipartFile file) throws IOException {
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB fileDB = new FileDB(filename, file.getContentType(), file.getBytes());
		
		return fileDBRepository.save(fileDB);
	}
	
	public FileDB getFile(String id) {
		return fileDBRepository.findById(id).get();
	}
	
	public Stream<FileDB> getAllFiles() {
		return fileDBRepository.findAll().stream();
	}
}
