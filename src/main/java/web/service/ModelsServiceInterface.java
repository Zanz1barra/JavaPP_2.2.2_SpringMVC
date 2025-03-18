package web.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModelsServiceInterface<ModelType> {
    List<ModelType> getModelsList(int count);
}
