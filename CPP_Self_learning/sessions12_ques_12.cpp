#include <iostream>
using namespace std;

class Product
{

private:
    string title;
    double price;

public:
    Product(void) : title(" "), price(0.0) {}
    Product(string title, double price) : title(title), price(price) {}
    void acceptRecords()
    {
        cout << "Enter the title: ";
        cin >> title;
        cout << "Enter the price: ";
        cin >> price;
    }
    void displayRecord()
    {
        cout << "Title: " << title<<endl;
        cout << "price: " << price<<endl;
    }
};

class Book : public Product
{
private:
    int pageCount;

public:
    Book(void) : pageCount(0) {}
    Book(int pageCount) : pageCount(pageCount) {}

    void acceptRecords()
    {
        Product ::acceptRecords();
        cout << "Enter the Number of pages: ";
        cin >> pageCount;
    }

    void displayRecord()
    {
        Product::displayRecord();
        cout << "Pages are: " << pageCount<<endl;
    }
};

class Tape : public Product
{
private:
    int playTime;

public:
    Tape(void) : playTime(0) {}
    Tape(int playTime) : playTime(playTime) {}

    void acceptRecords()
    {
        Product ::acceptRecords();
        cout << "Enter the play time: ";
        cin >> playTime;
    }

    void displayRecord()
    {
        Product::displayRecord();
        cout << "Play time is: " << playTime;
    }
};

int main()
{
    int choice;
    Product **arr = new Product *[5];
    for (int i = 0; i < 5; i++)
    {
        cout << "1. Book, 2. Tape, Enter choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            arr[i] = new Book;
            arr[i]->acceptRecords();
            arr[i]->displayRecord();
            break;
        case 2:
            arr[i] = new Tape;
            arr[i]->acceptRecords();
            arr[i]->displayRecord();
            break;
        }
    }
}