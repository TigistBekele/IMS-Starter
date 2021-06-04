Coverage: 88%
# IMS Project

This is a Java application that can process orders from customers. It works with a MySQL database. Uses the JDBC driver.

The purpose of Items_Orders table is to  create a "Many to Many" relationship between the items and the orders.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
### Prerequisites

What things you need to install the software and how to install them
   * We need to create our Project plan in Jira (epic, sprint, backlog etc). So, we have to install Jira tool.
   * We need to create the database in MySQL.So, have to install MySQL workbench too.
   * Installing Maven, we need for data connectivity.
   * JUnit and Mockito for testing.
   * Need to push accordingly every step/task to GitHub (so, command line proper syntax knowledge needed).
   * Presentation: In Power point as per instruction? By following  the IMS Documents.
   

### Insatlling maven

A step by step series of examples that tell you how to get a development env running

#### Steps to Install Maven in Eclipse IDE

1) Click on the Help from the top menu in Eclipse and select ‘Install New Software..‘

2) Click on the Add button on the newly opened window.

3) In the Name box, type ‘Maven‘ and in the Location box, type ‘http://download.eclipse.org/technology/m2e/releases/‘
Note: The URL is the location where you can download the Maven for Eclipse.

4) A check-box will appear in the pop window, Check the check-box and click on the Next button.

5) Please wait for some time and let the window complete its processing. It will not take long but 2 or 3 minutes.

6) Keep the default settings and click on the Next button.

7) Accept the ‘Terms and Conditions‘ and move forward by clicking on the Finish button.

8) Wait while it finishes the installation.

9) Once the installation is finished, it will ask you to restart the Eclipse. Please click on Yes, so that changes can be reflected properly.

## Running the code

The code is designed based on multi-tiered architecture see the diagram at resource folder at src/main/resources

The code has three parts: -POJO -business layer -data layer The entire code can be run using the Runner.java file

## UML diagram
![alt tag](https://github.com/TigistBekele/IMS-Starter/blob/master/src/main/resources/IMS%20UML%20Class%20Diagram.png)

## ERD 
![alt tag](https://github.com/TigistBekele/IMS-Starter/blob/master/src/main/resources/ERD.png)
### Interfaces

The code runs from the console and takes input from the console.

Welcome to the Inventory Management System!
Which entity would you like to use?
* CUSTOMER: Information about customers
* ITEM: Individual Items
* ORDER: Purchases of items
* ORDERITEM: Order of Items
* STOP: To close the application

we can select one from those and we run the code then next we select one from crud

What would you like to do with item:
* CREATE: To save a new entity into the database
* READ: To read an entity from the database
* UPDATE: To change an entity already in the database
* DELETE: To remove an entity from the database
* RETURN: To return to domain selection


### Unit Tests 

Unit testing reduces defects in the newly developed features or reduces bugs when changing the existing functionality. Unit testing verifies the accuracy of the each unit. Afterward, the units are integrated into an application by testing parts of the application via unit testing.
	* Makes the Process Agile
	* Quality of Code
	* Finds Software Bugs Early
	* Facilitates Changes and Simplifies Integration
	* Provides Documentation
	* Debugging Process
	* Design
	* Reduce Costs

To test the OrderItem class we use like this
	* @Test
	public void testCreate() {
		final OrderItem other = new OrderItem(2L,2L, 3L, 2L,40.18);
		assertEquals(other, DAO.create(other));
	}


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

 **Tigist Bekele** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* I would like to thank instructors, Davis Alan, Waish Morgan, Walker Alexander, Wright Ryan and all QA members.
* I would like to extend my deepest gratitude to Infosys for giving me this great training opportunity.

