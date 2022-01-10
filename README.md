# Sveta Training
## Java 8 & Springboot application
### Tech Stack
    * Java 8 
    * Springboot
    * Spring-Data-JPA + JDBC 
    * RDBMS: H2 
    * Build Tool: Maven 
    * VCS: GitHub

## Getting Started

### Your assignment(s):
* Complete Student model entiry as you want.
* Create Repository interface class for Student entity 
  (Interface class that extends JpaRepository).
* Create a Service class for Student with CRUD aperations:
  * Create a new student
  * Read/Retrieve all students
  * Read/Retrieve a specific student by id.
  * Update a specific student data
  * Delete a specific student by id.
* Create Controller class for student exposing endpoints for the CRUD operations.
    
### Advanced Assignments:
* Student Repository:
  * Add method to retrieve student by last/first name.
    Hint: You don't need to add implementation, only a method.
  * Add method to retrieve student by main-subject, secondary-subject AND year.
    Note: use ___different___ criteria operators for each column.
    For example: mainSubject = "subject" and secondSubject contains "is" and year < 3
                 ("is" like in "history" or "chemistry")
  * Add method to add several students (saveAll).
* Student Service:
  * Add methods to call the repository class method.
* Student Controller:
  * Add method to call the Service class methods.

### Bonus Assignments:
1. Add field/column to Student of enum class: 
    * Create an enum "Gender" with values FEMALE and MALE.
    *  Add a field/column gender of class Gender to Student class.
3. Add field/column to Student of type Address class:  
    * Add field/column address of type Address

## Summery Exercise:
* This will summaries everything and will be a reference for you for the future.
* You MUST e compatible with SOLID design principles.
* Use any Design-Pattern(s) you see fit - no limits.
* The topic covered:
  * Java Annotations - creating and using custom annotations.
  * Validation using Regular-Expressions (we can have another meeting about it, or you can learn it yourself)
  * Spring Validator
  * Find a 3rd party tool/package/library for validation 
  * Spring ORM / Hibernate
  * Spring MVC
  * GIT, using GitHub.

### Spring ORM
* Complete the TODOs in Teacher class
  * Use a 3rd party tool/package/library/dependency for validation of international phone number. 
* Add a new class name Course with at least 2 columns: 
  * id - int, primary-key, not null, unique
  * name - max length 50 characters, valid characters like first & last name in Teacher, plus: 0-9, !@#$%&()+={[]}|;:<>/?
  * At least one more field/property that will not be mapped.
  * More fields/properties as you wish.
* Add a new class name Curriculum (learning schedule) with:
  * id - int, primary-key, not null, unique
  * courseId - int, index, not null, non-unique
  * studentId - int, index, not null, non-unique
  * teacherId - int, index, not null, non-unique
  * Semester - String, enum (Autumn, Winter, Spring, Summer), index, not-null, non-unique
  * startOn - java.util.Date, nullable, non-unique 
  * endsOn - java.time.LocalDate, nullable, non-unique
  * grade - int, positive (0..), nullable, non-unique
  * Note: There are 3 one-to-many and many-to-one relationships from this class.
  * What other relationship2 this table implements?
* Create the proper Repository, Service, and controller classes.
  * Annotate at least 1 controller with @Controller annotation.
  * Create CRUD operations, verify each operation was successful.
    * implement getAll, getById
    * delete several entities
    * saving of several entities
    * For Curriculum implement proper endpoints
* Create a custom annotation and use it validate Teacher first & last name.
* Use Spring Validator in the controller classes. 
* Add other classes at your discretion.

### Tips:
* Use small commits - it will enable you to do more accurate/focused _cherrypick_. 
* Having several commits in a _Push_ (PR) you can practice doing ***Squash***, making several commits into one.
* You can use FlyWay to insert initial data into your database.
* After you finish - you can fork this repository to your GitHub account and torture it. 