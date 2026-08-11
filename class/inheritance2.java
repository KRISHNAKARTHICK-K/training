class Management {
    void management() {
        System.out.println("Management");
    }
}

class Schools extends Management {
    void schools() {
        System.out.println("Schools");
    }
}

class Teachers extends Schools {
    void teachers() {
        System.out.println("Teachers");
    }
}

class Workers extends Teachers {
    void workers() {
        System.out.println("Workers");
    }
}

class Student1 extends Workers {
    void student1() {
        System.out.println("Student 1");
    }
}

class College extends Management {
    void college() {
        System.out.println("College");
    }
}

class Professors extends College {
    void professors() {
        System.out.println("Professors");
    }
}

class Transport extends Professors {
    void transport() {
        System.out.println("Transport");
    }
}

class Student2 extends Transport {
    void student2() {
        System.out.println("Student 2");
    }
}
           
class Placement extends Management {
    void placement() {
        System.out.println("Placement");
    }
}

class Staffs extends Placement {
    void staffs() {
        System.out.println("Staffs");
    }
}

class Company extends Staffs {
    void company() {
        System.out.println("Company");
    }
}

class Training extends Company {
    void training() {
        System.out.println("Training");
    }
}

class Student3 extends Training {
    void student3() {
        System.out.println("Student 3");
    }
}


public class inheritance2 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();

        System.out.println("Student 1");
        s1.management();
        s1.schools();
        s1.teachers();
        s1.workers();
        s1.student1();


        Student2 s2 = new Student2();

        System.out.println("\n Student 2");
        s2.management();
        s2.college();
        s2.professors();
        s2.transport();
        s2.student2();


        Student3 s3 = new Student3();

        System.out.println("\nStudent 3");
        s3.management();
        s3.placement();
        s3.staffs();
        s3.company();
        s3.training();
        s3.student3();
    }
}