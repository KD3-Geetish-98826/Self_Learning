#include <iostream>
#include <cstring>
using namespace std;

class Payment
{
public:
    Payment(void) {}

    virtual void makePayment(double amount) = 0;

    virtual ~Payment(void) {}
};

class CreditCard : public Payment
{
public:
    CreditCard(void) {}

    void makePayment(double amount)
    {
        cout << "Payment of Rs. " << amount << " made using Credit Card." << endl;
    }
};

class UPI : public Payment
{
public:
    UPI(void) {}

    void makePayment(double amount)
    {
        cout << "Payment of Rs. " << amount << " made using UPI." << endl;
    }
};

class Cash : public Payment
{
public:
    Cash(void) {}

    void makePayment(double amount)
    {
        cout << "Payment of Rs. " << amount << " made using Cash." << endl;
    }
};

class PaymentFactory
{
public:
    static Payment* create(char *mode)
    {
        if (strcmp(mode, "CreditCard") == 0)
        {
            return new CreditCard();
        }
        else if (strcmp(mode, "UPI") == 0)
        {
            return new UPI();
        }
        else if (strcmp(mode, "Cash") == 0)
        {
            return new Cash();
        }
        else
        {
            return NULL;
        }
    }
};

int main()
{
    char mode[20];
    double amount;

    cout << "Enter Payment Mode (CreditCard / UPI / Cash): ";
    cin >> mode;

    cout << "Enter Amount: ";
    cin >> amount;

    Payment *payment = PaymentFactory::create(mode);

    if (payment != NULL)
    {
        payment->makePayment(amount);
        delete payment;
        payment = NULL;
    }
    else
    {
        cout << "Invalid Payment Mode." << endl;
    }

    return 0;
}