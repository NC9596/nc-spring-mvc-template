package com.${{values.company_name}}.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "${{values.entity_name}}_table")
public class ${{values.entity_name}} {

	@Id
	@GeneratedValue
	@Column(name = "${{values.entity_name}}_id")
	private Integer id;

	@Column
	private ${{values.dataType_of_parameter1}} ${{values.parameter1}};

	@Column
	private ${{values.dataType_of_parameter2}} ${{values.parameter2}};

	@Column
	private ${{values.dataType_of_parameter3}} ${{values.parameter3}};

	public ${{values.entity_name}}() {

	}

	public ${{values.entity_name}}(Integer id, ${{values.dataType_of_parameter1}} ${{values.parameter1}}, ${{values.dataType_of_parameter2}} ${{values.parameter2}}, ${{values.dataType_of_parameter3}} ${{values.parameter3}}) {
		this.id = id;
		this.${{values.parameter1}} = ${{values.parameter1}};
		this.${{values.parameter2}} = ${{values.parameter2}};
		this.${{values.parameter3}} = ${{values.parameter3}};
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public ${{values.dataType_of_parameter1}} get${{values.parameter1}}() {
		return ${{values.parameter1}};
	}

	public void set${{values.parameter1}}(${{values.dataType_of_parameter1}} ${{values.parameter1}}) {
		this.${{values.parameter1}} = ${{values.parameter1}};
	}

	public ${{values.dataType_of_parameter2}} get${{values.parameter2}}() {
		return ${{values.parameter2}};
	}

	public void set${{values.parameter2}}(${{values.dataType_of_parameter2}} ${{values.parameter2}}) {
		this.${{values.parameter2}} = ${{values.parameter2}};
	}
	
	public ${{values.dataType_of_parameter3}} get${{values.parameter3}}() {
		return ${{values.parameter3}};
	}

	public void set${{values.parameter3}}(${{values.dataType_of_parameter3}} ${{values.parameter3}}) {
		this.${{values.parameter3}} = ${{values.parameter3}};
	}

}
