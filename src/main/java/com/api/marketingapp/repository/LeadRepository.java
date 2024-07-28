package com.api.marketingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.marketingapp.Entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
