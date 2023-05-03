package com.joaquinalvarez.reservaespaciosutn.service;

import com.joaquinalvarez.reservaespaciosutn.model.entity.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ResourceService {

    Resource getById(Long id) throws Exception;
    List<Resource> getResources();
    Resource create(Resource resource);
    Resource update(Long id, Resource resource) throws Exception;
    void delete(Long id) throws Exception;

}
