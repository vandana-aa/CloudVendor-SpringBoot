package com.crud_apiexample.restdemo.service.impl;

import com.crud_apiexample.restdemo.Model.CLoudVendor;
import com.crud_apiexample.restdemo.repository.CloudVendorRepository;
import com.crud_apiexample.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;



    @Override
    public String createCloudVendor(CLoudVendor cLoudVendor) {
        //more business logic
        cloudVendorRepository.save(cLoudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CLoudVendor cloudVendor) {
        //more business logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //more business logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success delete";
    }

    @Override
    public CLoudVendor getCloudVendor(String cloudVendorId) {
        //more business logic
        return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CLoudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
