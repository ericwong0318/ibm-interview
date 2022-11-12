#include <stdio.h>

int main () {
    int n;
    int sum = 0;

    scanf("%d", &n);

    int numbers[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &numbers[i]);
    }

    for (int i = 0; i < n; i++) {
        sum += numbers[i];
    }

    printf("%d\n", sum);
    return 0;
}