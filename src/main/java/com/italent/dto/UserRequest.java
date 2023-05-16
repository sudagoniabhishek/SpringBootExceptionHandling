package com.italent.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
	
	   private int userId;
	   
	    @NotNull(message="not vaild username")
	    private String name;
	    
	    @Email(message="not vaild email id")
	    private String email;
	    
	    @Pattern(regexp="^\\d{10}$", message="invaild mobile number enterd")
	    private String mobile;
	    private String gender;
	    
	    @Min(18)
	    @Max(60)
	    private int age;
	    
	    @NotBlank
	    private String nationality;
		
	    
		public int getId() {
			return userId;
		}
		public void setId(int id) {
			this.userId = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public UserRequest(int userId, String name, String email, String mobile, String gender, int age,
				String nationality) {
			super();
			
			this.userId=userId;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			this.gender = gender;
			this.age = age;
			this.nationality = nationality;
		}
		public UserRequest() {
			super();
			
		}

	    
	    
}
