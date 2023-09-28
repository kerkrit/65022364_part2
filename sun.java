public class Employee {

    private String name;

    private double age;

    private String position;

    private String empID;

    private ArrayList<Project> myProjects;

    private Person person;

    private Job job;

    public Employee(String name, double age, String position, String empID, Person person, Job job) {

        this.name = name;

        this.age = age;

        this.position = position;

        this.empID = empID;

        this.myProjects = new ArrayList<Project>();

        this.person = person;

        this.job = job;

    }

    public void addProject(Project project) {

        myProjects.add(project);

    }

    public void showDetails() {

        System.out.println("Name: " + person.getName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Position: " + job.getPosition());

        System.out.println("Employee ID: " + job.getEmpID());

        System.out.println("Projects:");

        for (Project project : myProjects) {

            System.out.println("- " + project.getName());

        }

    }

}

public class Job {

    private String position;

    private String empID;

    public Job(String position, String empID) {

        this.position = position;

        this.empID = empID;

    }

    public String getPosition() {

        return position;

    }

    public void setPosition(String position) {

        this.position = position;

    }

    public String getEmpID() {

        return empID;

    }

    public void setEmpID(String empID) {

        this.empID = empID;

    }

}

public class Person {

    private String name;

    private int age;

 

    public Person(String name, int age) {

this.name = name;

        this.age = age;

    }

 

    public String getName() {

        return name;

    }

 

    public void setName(String name) {

this.name = name;

    }

 

    public int getAge() {

        return age;

    }

 

    public void setAge(int age) {

        this.age = age;

    }

}

has context menu