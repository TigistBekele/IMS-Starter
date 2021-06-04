Coverage: 88%
# IMS Project

To create a functional application – using supporting tools, methodologies, and technologies – which encapsulates all fundamental modules.

The purpose of Items_Orders table is to  create a "Many to Many" relationship between the items and the orders.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them
   * We need to create our Project plan in Jira (epic, sprint, backlog etc). So, we have to install Jira tool.
   * We need to create the database in MySQL.So, have to install MySQL workbench too.
   * Installing Maven, we need for data connectivity.
   * Java needed for JUnit data testing.
   * Need to push accordingly every step/task to GitHub (so, command line proper syntax knowledge needed).
   * Presentation: In Power point as per instruction? By following  the IMS Documents.

```
Give examples
``
**********Insatlling maven********** 

A step by step series of examples that tell you how to get a development env running

Say what the step will be

Steps to Install Maven in Eclipse IDE

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

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Unit testing reduces defects in the newly developed features or reduces bugs when changing the existing functionality. Unit testing verifies the accuracy of the each unit. Afterward, the units are integrated into an application by testing parts of the application via unit testing.
*Makes the Process Agile
*Quality of Code
*Finds Software Bugs Early
*Facilitates Changes and Simplifies Integration
*Provides Documentation
*Debugging Process
*Design
*Reduce Costs

Give an example
```
	@Test
	public void testCreate() {
		final OrderItem other = new OrderItem(2L,2L, 3L, 2L,40.18);
		assertEquals(other, DAO.create(other));
	}
### Integration Tests 

Explain what these tests test, why and how to run them
Integration testing is taken up to validate the performance of the entire software system as a whole. The main purpose of this testing method is to expand the process and validate the integration of the modules with other groups. It is performed to verify if all the units operate in accordance with their specifications defined.


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Tigist Bekele** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
