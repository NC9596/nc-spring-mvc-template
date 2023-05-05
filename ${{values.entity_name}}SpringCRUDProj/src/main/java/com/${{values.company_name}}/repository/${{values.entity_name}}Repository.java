package com.${{values.company_name}}.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.${{values.company_name}}.entity.${{values.entity_name}};

public interface ${{values.entity_name}}Repository extends JpaRepository<${{values.entity_name}},Integer> {

}
