#include <iostream>
using namespace std;


int Strlen(const char *str)
{
    int length = 0;
    while (str[length] != '\0')
    {
        length++;
    }
    return length;
}

char* Strcpy(char *dest, const char *src)
{
    int i = 0;
    while (src[i] != '\0')
    {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';   // null terminate
    return dest;
}

int main()
{
    char source[100];
    char destination[100];

    cout << "Enter a string: ";
    cin.getline(source, 100);

    cout << "Length of string (Strlen): " << Strlen(source) << endl;

    Strcpy(destination, source);
    cout << "Copied string (Strcpy): " << destination << endl;

    return 0;
}