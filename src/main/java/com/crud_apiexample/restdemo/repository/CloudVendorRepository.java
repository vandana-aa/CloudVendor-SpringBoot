package com.crud_apiexample.restdemo.repository;

import com.crud_apiexample.restdemo.Model.CLoudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CLoudVendor, String> {
}
