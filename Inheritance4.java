 class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  // create a method called work() that prints what the employee does
  public void work() {
    System.out.println(name + " is working hard.");
  }

  public double getSalary() {
    return salary;
  }
}

 class HRManager extends Employee {
  private int employeesAdded;

  public HRManager(String name, double salary) {
    super(name, salary);
    employeesAdded = 0;
  }

  public void work() {
    System.out.println(name + " is hiring new employees.");
  }

  public void addEmployee() {
    employeesAdded++;
    System.out.println(name + " has added " + employeesAdded + " employee(s) so far.");
  }
}

