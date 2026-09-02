#include <iostream>
using namespace std;

namespace college
{
    // Custom Exception Class
    class NegativeMarksException
    {
    private:
        string message;

    public:
        NegativeMarksException(string message)
        {
            this->message = message;
        }

        string getMessage(void)
        {
            return message;
        }
    };


    class Student
    {
    private:
        int rollNo;
        string name;
        int age;
        double marks;

    public:
        Student(void)
        {
            rollNo = 0;
            name = "";
            age = 0;
            marks = 0.0;
        }

        Student(int rollNo, string name, int age, double marks)
        {
            this->rollNo = rollNo;
            this->name = name;
            this->age = age;

            if (marks < 0)
            {
                throw NegativeMarksException("Marks cannot be negative.");
            }

            this->marks = marks;
        }

        void setRollNo(int rollNo)
        {
            this->rollNo = rollNo;
        }

        int getRollNo(void)
        {
            return rollNo;
        }

        void setName(string name)
        {
            this->name = name;
        }

        string getName(void)
        {
            return name;
        }

        void setAge(int age)
        {
            this->age = age;
        }

        int getAge(void)
        {
            return age;
        }

        void setMarks(double marks)
        {
            if (marks < 0)
            {
                throw NegativeMarksException("Marks cannot be negative.");
            }

            this->marks = marks;
        }

        double getMarks(void)
        {
            return marks;
        }

        void acceptDetails(void)
        {
            cout << "Enter Rollno.: ";
            cin >> rollNo;

            cout << "Enter Name: ";
            cin >> name;

            cout << "Enter Age: ";
            cin >> age;

            cout << "Enter Marks: ";
            cin >> marks;

            if (marks < 0)
            {
                throw NegativeMarksException("Marks cannot be negative.");
            }
        }

        void display(void)
        {
            cout << "Roll no: " << rollNo << endl;
            cout << "Name: " << name << endl;
            cout << "Age: " << age << endl;
            cout << "Marks: " << marks << endl;
        }
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
        Teacher(void)
        {
            empId = 0;
            name = "";
            age = 0;
            subject = "";
            salary = 0.0;
        }

        void setEmployeeId(int employeeId)
        {
            this->empId = employeeId;
        }

        int getEmployeeId(void)
        {
            return empId;
        }

        void setName(string name)
        {
            this->name = name;
        }

        string getName(void)
        {
            return name;
        }

        void setAge(int age)
        {
            this->age = age;
        }

        int getAge(void)
        {
            return age;
        }

        void setSubject(string subject)
        {
            this->subject = subject;
        }

        string getSubject(void)
        {
            return subject;
        }

        void setSalary(double salary)
        {
            this->salary = salary;
        }

        double getSalary(void)
        {
            return salary;
        }

        void acceptDetails(void)
        {
            cout << "Enter Employee Id: ";
            cin >> empId;

            cout << "Enter Name: ";
            cin >> name;

            cout << "Enter Age: ";
            cin >> age;

            cout << "Enter Subject: ";
            cin >> subject;

            cout << "Enter Salary: ";
            cin >> salary;
        }

        void display(void)
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

    try
    {
        s1.acceptDetails();
        s1.display();
    }
    catch (NegativeMarksException e)
    {
        cout << "Exception caught: "
             << e.getMessage() << endl;
    }


    Teacher t1;

    t1.acceptDetails();
    t1.display();

    return 0;
}