# Foundational Project - TechnoGamers University Employee Reimbursement System
## Summary 
This project is about making an employee reimbursement system software that allows you to input expenses for approval throught one application. So basically in this software the employee can request to be reimbursed for a particular amount with some discription, so this would generate a reimbursement ticket. Now the manager of the particular employee must process the ticket and decide if the ticket can be approved or denied. It must also be noted that once one a decision is made by the manager and the ticket is send for processing, no further changes can be made after that point. 
## User stories
### Core funcitionaliy 
1. Ability to log into the application
  - Username and password input.
2. Ability to register a new account
  - Must ensure the username is not already registered.
  - Default employee role.
3. Employees can submit reimbursement tickets
  - Must have an amount.
  - Must have a discription.
4. Manager can process the tickets submitted by the employee
  - Tickets can be approved or denied.
  - Tickets cannot change process after processing.
5. Employees can view previous submissions
  - Can filter by pending, approved or denied status.
## Flowcharts 
### Activity Diagram
![](Images/FlowChart.jpg)
### State Flow Chart
![](Images/StateFlow%20Chart.jpg)
### Use-case Diagram
![](Images/use-caseFlowChatrt.jpg)
## Technical Requirements
- Java 8
- Apache Maven
- PostgreSQL (hosted on AWS RDS or localhost)
- Git SCM (hosted on GitHub)
- Postman
