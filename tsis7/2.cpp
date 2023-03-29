#include <iostream>
#include <cmath>
using namespace std;
char b[1000][1000];
int l = 0;
void kol(int x, int y)
{
    if (b[x][y] == '.')
    {
        l++;
        b[x][y] = '*';
        kol(x - 1, y);
        kol(x + 1, y);
        kol(x, y - 1);
        kol(x, y + 1);
    }
}
int main()
{
    int n, i, j, x, y;
    cin >> n;
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            cin >> b[i][j];
        }
    }
    cin >> x >> y;
    kol(x, y);
    cout << l;
    return 0;
}