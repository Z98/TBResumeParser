/**
 * 
 */
package com.trainingbasket.resumeparser.beans;

import java.util.List;

/**
 * @author Dheeraj Singh via OpenSource
 * This represents the fields which are required to be captured 
 * from the resume.
 */
public class Resume {
    public String FirstName ;//{ get; set; }
    public String LastName ;//{ get; set; }
    public String Age ;//{ get; set; }
    public String Salary ;//{ get; set; }
    public String MaritalStatus;// { get; set; }
    public String EmployerName ;//{ get; set; }
    public String Gender ;//{ get; set; }
    public String EmailAddress;// { get; set; }
    public String PhoneNumbers ;//{ get; set; }
    public String Experience;// { get; set; }
    public String Address;// { get; set; }
    public String City ;//{ get; set; }
    public String State ;//{ get; set; }
    public String Zip ;//{ get; set; }
    public String Country;// { get; set; }
    public String Path;// { get; set; }
    public String ResumeContent;// { get; set; }
    public String Languages;// { get; set; }       
    public List<String> Skills;// { get; set; }
    public String Location ;//{ get; set; }
    public List<String> Positions;// { get; set; }
    public List<String> Educations;// { get; set; }
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return Age;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return Salary;
	}
	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	/**
	 * @return the employerName
	 */
	public String getEmployerName() {
		return EmployerName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return EmailAddress;
	}
	/**
	 * @return the phoneNumbers
	 */
	public String getPhoneNumbers() {
		return PhoneNumbers;
	}
	/**
	 * @return the experience
	 */
	public String getExperience() {
		return Experience;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return Zip;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return Path;
	}
	/**
	 * @return the resumeContent
	 */
	public String getResumeContent() {
		return ResumeContent;
	}
	/**
	 * @return the languages
	 */
	public String getLanguages() {
		return Languages;
	}
	/**
	 * @return the skills
	 */
	public List<String> getSkills() {
		return Skills;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return Location;
	}
	/**
	 * @return the positions
	 */
	public List<String> getPositions() {
		return Positions;
	}
	/**
	 * @return the educations
	 */
	public List<String> getEducations() {
		return Educations;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		Age = age;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		Salary = salary;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	/**
	 * @param employerName the employerName to set
	 */
	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(String phoneNumbers) {
		PhoneNumbers = phoneNumbers;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(String experience) {
		Experience = experience;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		Zip = zip;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		Path = path;
	}
	/**
	 * @param resumeContent the resumeContent to set
	 */
	public void setResumeContent(String resumeContent) {
		ResumeContent = resumeContent;
	}
	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(String languages) {
		Languages = languages;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		Location = location;
	}
	/**
	 * @param positions the positions to set
	 */
	public void setPositions(List<String> positions) {
		Positions = positions;
	}
	/**
	 * @param educations the educations to set
	 */
	public void setEducations(List<String> educations) {
		Educations = educations;
	}

}
