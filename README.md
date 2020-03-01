<h1>Java Employee Management Modelling</h1>
<h2>Brief</h2>
<p>The task is to model and create a system to store information for employees of a large development company. TDD, inheritance, packages and abstract classes should be used for this.</p>
<h3>Create an abstract Employee parent class in a package called staff.</h3>
<ul>
<li>Employee will have a name, NI number and salary.</li>
<li>Create Getters for all properties.</li>
<li>Add a method named raiseSalary with takes in a parameter of type double to increment the salary.</li>
<li>Add a method called payBonus which returns 1% of the employees salary.</li>
</ul>
<h3>Create a subclass of Employee called Manager in a package called management.</h3>
<ul>
<li>Create a class for Manager.</li>
<li>Add a property to store the department name in a property called deptName.</li>
<li>Create a constructor that includes all the parameters needed for Employee and deptName.</li>
<li>Add a getter method for deptName.</li>
<li>Test all methods including raiseSalary and payBonus</li>
</ul>
<h3>Create subclasses of Employee: Developer and DatabaseAdmin in a package called techStaff.</h3>
<p>Create 2 new classes for Developer and DatabaseAdmin.<p>
<ul>
<li>These should take in the same parameters as Employee and pass them to Employee constructor.</li>
<li>Again test all methods for both classes.</li>
</ul>
<h3>Create a subclass of Manager called Director in the management package.</h3>
<li>Add a private property to store a double value budget.</li>
<li>Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.</li>
<li>Create a getter method for this property.</li>
<li>Test all methods.</li>
<h2>Extensions</h2>
<ul>
<li>Prevent unwanted values</li>
<li>Prevent a negative value for the raiseSalary method.</li>
<li>Allow the user to change the Employees name and prevent a null value from being entered.</li>
<li>Override the payBonus in director to return 2% of their salary.</li>
</ul>
