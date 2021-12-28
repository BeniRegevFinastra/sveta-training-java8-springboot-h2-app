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
  * Update a pecific student data
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

