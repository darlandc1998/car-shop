package com.carshop.app.modules.models.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.carshop.app.adapter.persistence.model.entity.ModelEntity;
import com.carshop.app.infrastructure.exception.CarShopRuleException;

@SpringBootTest
@DisplayName("Model unity tests")
public class ModelServiceTestImpl {

    // private ModelService modelService;

    // @Mock
    // private ModelRepository modelRepository;

    @BeforeEach
    public void setup() {
        // modelService = new ModelServiceImpl(modelRepository);
    }

    @Test
    @DisplayName("It should save a new model")
    public void shouldSaveNewModel() throws Exception {
        final int customerId = 1;
        final ModelEntity model = new ModelEntity();
        // model.setCustomerId(customerId);
        model.setName("Gol");
        model.setCreatedAt(LocalDateTime.now());
        model.setUpdatedAt(LocalDateTime.now());

        // Mockito.when(modelRepository.save(model)).thenReturn(mountInsertedModel(model));

        // final ModelEntity insertedModel = this.modelService.save(model);

        // assertEquals(1, insertedModel.getId());
    }

    @Test
    @DisplayName("It should update model")
    public void shouldUpdateModel() throws Exception {
        final int customerId = 1;
        final ModelEntity model = new ModelEntity();
        // model.setId(1);
        // model.setCustomerId(customerId);
        model.setName("Gol");
        model.setUpdatedAt(LocalDateTime.now());

        // Mockito.when(modelRepository.save(model)).thenReturn(model);

        // final ModelEntity updatedModel = this.modelService.save(model);

        // assertEquals(1, updatedModel.getId());
    }

    @Test
    @DisplayName("It should list models")
    public void shouldListModels() throws Exception {
        final int customerId = 1;
        final ModelEntity model = new ModelEntity();
        // model.setId(1);
        // model.setCustomerId(customerId);
        model.setName("Gol");
        model.setUpdatedAt(LocalDateTime.now());

        final List<ModelEntity> models = new ArrayList<>();
        models.add(model);

        // Mockito.when(modelRepository.findAllByCustomerId(customerId)).thenReturn(models);

        // final List<ModelEntity> fetchedModels = this.modelService.findAllByCustomerId(customerId);

        // assertEquals(1, fetchedModels.size());
    }

    @Test
    @DisplayName("It should get a model")
    public void shouldGetModel() throws Exception {
        final int customerId = 1;
        final ModelEntity model = new ModelEntity();
        // model.setId(1);
        // model.setCustomerId(customerId);
        model.setName("Gol");
        model.setUpdatedAt(LocalDateTime.now());

        // Mockito.when(modelRepository.findByCustomerIdAndId(customerId, model.getId())).thenReturn(Optional.of(model));

        // final ModelEntity fetchedModel = this.modelService.findByCustomerIdAndModelId(customerId, model.getId());

        // assertEquals(1, fetchedModel.getId());
    }

    @Test
    @DisplayName("It should not get a model")
    public void shouldNotGetModel() throws Exception {
        final int customerId = 1;
        final int modelId = 1;

        // Mockito.when(modelRepository.findByCustomerIdAndId(customerId, modelId)).thenReturn(Optional.empty());

        final CarShopRuleException exception = Assertions.assertThrows(CarShopRuleException.class, () -> {
            // this.modelService.findByCustomerIdAndModelId(customerId, modelId);
        });

        assertEquals(CarShopRuleException.MODEL_NOT_FOUND, exception.getMessage());
    }

    @Test
    @DisplayName("It should delete a model")
    public void shouldDeleteModel() throws Exception {
        final int customerId = 1;
        ModelEntity model = new ModelEntity();
        // model.setId(1);
        // model.setCustomerId(customerId);
        model.setName("Gol");
        model.setUpdatedAt(LocalDateTime.now());

        // model = this.modelService.delete(model);

        assertEquals(1, model.getId());
    }

    private ModelEntity mountInsertedModel(final ModelEntity model) {
        // model.setId(1);
        return model;
    }

}
