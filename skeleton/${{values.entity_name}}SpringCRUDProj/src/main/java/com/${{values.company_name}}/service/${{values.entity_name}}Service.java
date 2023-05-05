package com.${{values.company_name}}.service;

import java.util.List;

import com.${{values.company_name}}.entity.${{values.entity_name}};

public interface ${{values.entity_name}}Service {

	public Integer save${{values.entity_name}}(${{values.entity_name}} objectOf${{values.entity_name}});
	public ${{values.entity_name}} update${{values.entity_name}}(${{values.entity_name}} objectOf${{values.entity_name}});
	public void delete${{values.entity_name}}(int id);
	public ${{values.entity_name}} getOne${{values.entity_name}}(int id);
	public List<${{values.entity_name}}> getAll${{values.entity_name}}s();
	
}
