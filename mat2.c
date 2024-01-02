#include <stdio.h>

int main()
{
    int i,j,m,n;
    int matr[10][20];
    printf("Enter the number of rows: ");
    scanf("%d",&m);
    printf("Enter the number of columns: ");
    scanf("%d",&n);
    /*Input the elements of the matrix*/
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("Enter the values: [%d][%d]",i,j);
            scanf("%d",&matr[i][j]);
        }
    }

    /*Now displaying the matrix in the current manner*/
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d\t",matr[i][j]);
        }
        printf("\n");
    }
    return 0;
}