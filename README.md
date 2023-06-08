# CURD_Oprations
REST_APIs


: Rest APIs:
jAVA - JAVA 8, Optional<T> - SPRING-BOOT - HIBERNATE.

________________________________________CURD OPERATIONS____________________________________________________

Here I have created 5 Rest API.

1 , POST   @PostMapping("/department")            -> POSTING DETAILS FROM CLIENT TO DATABASE
2 , GET    @GetMapping("/department/alldata")     -> GETTING ALL DATA
3 , GET    @GetMapping("/department/id")          -> GETTING DATA BY ID
4 , DELETE @DeleteMapping("/department/id")       -> DELETING DATA BY ID
5 ,  UPDATE @PutMapping("/department/update/{id}") -> UPDATING VALUES BY ID GIVEN


-------------USE THIS APPLICATION TO UNDERSTAND THE SIMPLE CURD OPERATIONS BY USING CONSTRUCTORS.-----------

From your end ->  spring.datasource.url=jdbc:mysql://localhost:3306/MAKE YOUR DATA BASE AND GIVE THE DB NAME
              ->  spring.datasource.password=GIVE YOUR PASSWORD WHICH YOU MADE DURING INSTALLATION OF MySQL.


**********************************************NOTE**********************************************************

-> I am not using any Spring Security: This is just a simple explanation of CURD Operation to create REST APIs.

-------
