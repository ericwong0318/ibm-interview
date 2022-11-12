#include <iostream>

int main () {
    int n;
    int sum = 0;

    std::cin >> n;

    int numbers[n];
    for (int i = 0; i < n; i++) {
        std::cin >> numbers[i];
    }

    for (int i = 0; i < n; i++) {
        sum += numbers[i];
    }

    std::cout << sum << std::endl;
    return 0;
}