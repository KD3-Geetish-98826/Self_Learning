#include <iostream>
using namespace std;

class LinkedList; 

class Node
{
private:
    int data;
    Node *next;

    Node(int val)
    {
        data = val;
        next = NULL;
    }

    friend class LinkedList;
};

class LinkedList
{
private:
    Node *head;
    Node *tail;

public:
    LinkedList()
    {
        head = NULL;
        tail = NULL;
    }

    void add_first(int val)
    {
        Node *newNode = new Node(val);   
        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode->next = head;
            head = newNode;
        }
    }

    void add_last(int val)
    {
        Node *newNode = new Node(val);
        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            tail = newNode;
        }
    }

    void display()
    {
        Node *temp = head;
        cout << "List: ";
        while (temp != NULL)
        {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }

    ~LinkedList()
    {
        Node *temp;
        while (head != NULL)
        {
            temp = head;
            head = head->next;
            delete temp;
        }
    }
};

int main()
{
    LinkedList list;

    list.add_last(10);
    list.add_last(20);
    list.add_last(30);
    list.display();     

    list.add_first(5);
    list.display();    

    return 0;
}