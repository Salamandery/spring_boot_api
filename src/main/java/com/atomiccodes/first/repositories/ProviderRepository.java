package com.atomiccodes.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atomiccodes.first.models.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
	
}
