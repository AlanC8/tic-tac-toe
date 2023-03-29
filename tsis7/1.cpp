#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int A[n][n];
    int len = n, k = 1, p = 0, i;
    while (k <= n * n)
    {
        for (i = p; i < len; i++)
        {
            A[p][i] = k++;
        }
        for (i = p + 1; i < len; i++)
        {
            A[i][len - 1] = k++;
        }
        for (i = len - 2; i >= p; i--)
        {
            A[len - 1][i] = k++;
        }
        for (i = len - 2; i > p; i--) /*Loop to access the first column of the array*/
        {
            A[i][p] = k++;
        }
        p++, len = len - 1;
    }
    if (!n % 2) /*This block will run only if n is even*/
    {
        A[(n + 1) / 2][(n + 1) / 2] = n * n; /*It will assign the last value to the centremost element*/
    }
    for (i = 0; i < n; i++) /*This loop will print the array in matrix format*/
    {
        for (int j = 0; j < n; j++)
        {
            cout << A[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
