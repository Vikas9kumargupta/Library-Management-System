package com.example.lms.services;

import com.example.lms.entities.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findAllPublishers();
    Publisher findPublisherById(Long publisherId);
    void createPublisher(Publisher publisher);
    void updatePublisher(Publisher publisher);
    void deletePublisher(Long publisherId);

}
