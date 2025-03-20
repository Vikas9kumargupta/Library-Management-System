package com.example.lms.services.impls;

import com.example.lms.entities.Publisher;
import com.example.lms.exceptions.ResourceNotFoundException;
import com.example.lms.repositories.PublisherRepository;
import com.example.lms.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    public PublisherRepository publisherRepository;

    @Override
    public List<Publisher> findAllPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public void createPublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    @Override
    public Publisher findPublisherById(Long publisherId){
        return publisherRepository.findById(publisherId).orElseThrow(
                ()-> new ResourceNotFoundException("Publisher not found with id: " + publisherId));
    }

    public void updatePublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long publisherId){
        Publisher publisher = publisherRepository.findById(publisherId).orElseThrow(
                () -> new ResourceNotFoundException("Publisher does not exist with id "+publisherId)
        );
        publisherRepository.deleteById(publisher.getId());
    }


}
