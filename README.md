# CS-320-Software-Test-Automation-QA

Coursework and selected projects from CS 320: Software Test Automation and Quality Assurance. This repository includes service classes, JUnit testing files, and a written reflection summarizing what I learned throughout the course.



# CS 320 Portfolio Reflection  
Allie Lankford  

## How can I ensure that my code, program, or software is functional and secure?

This course reinforced for me that functionality and security start with thorough testing. Writing JUnit tests for the Contact and ContactService classes helped me understand how important it is to validate every requirement, not just assume the code works because it compiles. For example, in my Contact class, I enforced non null fields and maximum length requirements, and then wrote tests to confirm those constraints were actually enforced. I also tested for duplicate IDs in the ContactService class to make sure invalid data could not be stored. By writing both positive tests for valid input and negative tests for invalid input, I learned that testing is what truly proves functionality. Security, even at a basic level, comes from validating input and preventing bad data from entering the system. This course showed me that clean and secure code depends on disciplined testing practices.

## How do I interpret user needs and incorporate them into a program?

I learned that user needs must be translated into clear technical requirements before writing any code. In Project One, the requirements specified things like field length limits and restrictions on appointment dates. Instead of seeing those as small details, I learned to treat them as critical rules that the program must enforce. By carefully reviewing each requirement before writing tests, I ensured that my implementation matched what the user or stakeholder expected. Writing tests directly aligned to each requirement helped me stay focused on what the program was supposed to do. This approach helped me see that understanding user needs is not just about building features, but about protecting constraints and ensuring consistent behavior.

## How do I approach designing software?

This course changed how I think about designing software. I no longer see design and testing as separate steps. Instead, I think about how the code will be tested while I design it. When I created the ContactService class, I structured methods in a way that made them easy to test individually. I also reused setup methods in my test classes to keep the design organized and efficient. I approach software design now with more discipline and caution. I assume there could be errors and I design my code in a way that makes those errors easier to detect. Overall, I learned that thoughtful design, aligned with strong testing practices, leads to cleaner code and reduces the risk of defects later in development.
