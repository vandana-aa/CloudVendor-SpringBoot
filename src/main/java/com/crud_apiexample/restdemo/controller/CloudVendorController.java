package com.crud_apiexample.restdemo.controller;

import com.crud_apiexample.restdemo.Model.CLoudVendor;
import com.crud_apiexample.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {


    //CLoudVendor cloudVendor; don't need this, we use service layer
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



// Read Specific Cloud Vendor details
    @GetMapping("{vendorId}")
    public CLoudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        return cloudVendorService.getCloudVendor(vendorId);
  //      return cloudVendor;
//        return new CLoudVendor("C1","Vendor 1",
//                " Address 1","xxxxx");
    }

//Read All CloudVendor details from db
     @GetMapping()
     public List<CLoudVendor> getAllCloudVendorDetails()
     {
         return cloudVendorService.getAllCloudVendor();
     }




    @PostMapping
    public String createCloudVendorDetails(@RequestBody CLoudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CLoudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);

        return "Cloud Vendor Deleted Successfully";
    }
}

