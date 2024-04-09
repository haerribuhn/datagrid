package com.example.application.services;

import com.example.application.data.SampleData;
import com.example.application.data.SampleDataRepository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class SampleDataService {

    private final SampleDataRepository repository;

    public SampleDataService(SampleDataRepository repository) {
        this.repository = repository;
    }

    public Optional<SampleData> get(Long id) {
        return repository.findById(id);
    }

    public SampleData update(SampleData entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<SampleData> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<SampleData> list(Pageable pageable, Specification<SampleData> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
