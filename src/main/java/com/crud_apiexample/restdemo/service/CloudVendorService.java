package com.crud_apiexample.restdemo.service;

import com.crud_apiexample.restdemo.Model.CLoudVendor;
import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CLoudVendor cLoudVendor);
    public String updateCloudVendor(CLoudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CLoudVendor getCloudVendor(String cloudVendorId);
    public List<CLoudVendor> getAllCloudVendor();
}
