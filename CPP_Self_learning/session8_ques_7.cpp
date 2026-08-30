/* 7. Create `Student` and `Teacher` class inside a namespace `college`. Write constructors,
getter/setters, display() method in both classes. Create objects in main() and call methods.  */

#include <iostream>
using namespace std;

namespace college
{
    class Student
    {
    private:
        int rollNo;
        string name;
        int age;
        double marks;

    public:
        void setRollNo(int rollNo)
        {
            this->rollNo = rollNo;
        };
        int getRollNo(void)
        {
            return rollNo;
        };

        void setName(string name)
        {
            this->name = name;
        };
        string getName()
        {
            return name;
        };

        void setAge(int age)
        {
            this->age = age;
        };
        int getAge()
        {
            return age;
        };

        void setMarks(double marks)
        {
            this->marks = marks;
        };
        double getMarks()
        {
            return marks;
        };

        void acceptDetails(void)
        {
            cout << "Enter Rollno.: ";
            cin >> rollNo;
            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter Age: ";
            cin >> age;
            cout << "Enter Marks: ";
            cin>> marks;
        };

        void display()
        {
            cout << "Roll no: " << rollNo << endl;
            cout << "Name: " << name << endl;
            cout << "Age: " << age << endl;
            cout << "Marks: " << marks << endl;
        };
        
    };
    class Teacher
    {
    private:
        int empId;
        string name;
        int age;
        string subject;
        double salary;

    public:
        void setEmployeeId(int employeeId)
        {
            this->empId = empId;
        };
        int getEmployeeId(void)
        {
            return empId;
        };

        void setName(string name)
        {
            this->name = name;
        };
        string getName()
        {
            return name;
        };

        void setAge(int age)
        {
            this->age = age;
        };
        int getAge()
        {
            return age;
        };

        void setSubject(string subject)
        {
            this->subject = subject;
        };
        string getSubject()
        {
            return subject;
        };

        void setSalary(double salary)
        {
            this->salary = salary;
        };
        double getSalary()
        {
            return salary;
        };

        void acceptDetails(void)
        {
            cout << "Enter Employee Id: ";
            cin >> empId;
            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter Age: ";
            cin >> age;
            cout << "Enter Subject: ";
            cin>> subject;
            cout << "Enter Salary: ";
            cin>> salary;
        };

        void display()
        {
            cout << "Employee Id: " << empId << endl;
            cout << "Name: " << name << endl;
            cout << "Age: " << age << endl;
            cout << "Subject: " << subject << endl;
            cout << "Salary: " << salary << endl;
        }

        
    };
}

using namespace college;

int main()
{
    Student s1;
    s1.acceptDetails();
    s1.display();

    Teacher t1;
    t1.acceptDetails();
    t1.display();
}