package com.exam.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.exam.model.Book;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class BookServiceImpl implements BookService {
	public List<Book> readJson() throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
        List<Book> books = objectMapper.readValue(new File("test.json"), new TypeReference<List<Book>>() {});
        return books;
	}
}