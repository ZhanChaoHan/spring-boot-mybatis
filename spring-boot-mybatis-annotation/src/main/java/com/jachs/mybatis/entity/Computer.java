package com.jachs.mybatis.entity;

import java.io.Serializable;

public class Computer implements Serializable {
    private String computer_id;

    private String computer_name;

    private Long computer_price;

    private static final long serialVersionUID = 1L;

	public Computer() {
		super();
	}

	public Computer(String computer_id, String computer_name, Long computer_price) {
		super();
		this.computer_id = computer_id;
		this.computer_name = computer_name;
		this.computer_price = computer_price;
	}

	public String getComputer_id() {
		return computer_id;
	}

	public void setComputer_id(String computer_id) {
		this.computer_id = computer_id;
	}

	public String getComputer_name() {
		return computer_name;
	}

	public void setComputer_name(String computer_name) {
		this.computer_name = computer_name;
	}

	public Long getComputer_price() {
		return computer_price;
	}

	public void setComputer_price(Long computer_price) {
		this.computer_price = computer_price;
	}

}