#include <iostream>
using namespace std;
int main()
{
    int a;
    int b;
    cin>>a>>b;
    if((a>b) || (a<b))
    {
        a=b;
        b=a;
    }
    else
    {
    a=0;
    b=0;
    }
    cout<<a<<b;
    return 0;
}
