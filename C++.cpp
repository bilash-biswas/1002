#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
    double A,R,N;
    N = 3.14159;
    cin>>R;
    A = N * R * R;
    cout<<"A="<<fixed<<setprecision(4)<<A<<endl;

    return 0;
}
