package com.${{values.company_name}}.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.${{values.company_name}}.entity.${{values.entity_name}};
import com.${{values.company_name}}.repository.${{values.entity_name}}Repository;

@Service
public class ${{values.entity_name}}ServiceImpl implements ${{values.entity_name}}Service{
	
	@Autowired
	private ${{values.entity_name}}Repository repo;

	@Override
	public Integer save${{values.entity_name}}(${{values.entity_name}} objectOf${{values.entity_name}}) {
		return repo.save(objectOf${{values.entity_name}}).getid();
	}

	@Override
	public ${{values.entity_name}} update${{values.entity_name}}(${{values.entity_name}} objectOf${{values.entity_name}}) {
		return repo.save(objectOf${{values.entity_name}});
	}
	
	@Override
	public void delete${{values.entity_name}}(int id) {
			repo.deleteById(id);
	}
	
	@Override
	public ${{values.entity_name}} getOne${{values.entity_name}}(int id) {
		Optional<${{values.entity_name}}> objectOf${{values.entity_name}}gt = repo.findById(id);
		if(objectOf${{values.entity_name}}gt.isPresent())
		{
			return objectOf${{values.entity_name}}gt.get();
		}
		else return null;
	} 

	@Override
	public List<${{values.entity_name}}> getAll${{values.entity_name}}s() {
		return repo.findAll();
	}

}
