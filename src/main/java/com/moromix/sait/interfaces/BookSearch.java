package com.moromix.sait.interfaces;


import com.moromix.sait.objects.Author;
import com.moromix.sait.objects.Book;
import com.moromix.sait.objects.Genre;

import java.util.List;

public interface BookSearch {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
