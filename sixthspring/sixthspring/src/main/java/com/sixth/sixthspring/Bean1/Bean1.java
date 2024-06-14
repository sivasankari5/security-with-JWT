package com.sixth.sixthspring.Bean1;

public class Bean1 {
		private int id;
		private String name;
		
		public Bean1() {
			super();
		}
		public Bean1(int id,String name)
		{ 
			super();
			this.id=id;
			this.name=name;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Bean1 [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		}


	
