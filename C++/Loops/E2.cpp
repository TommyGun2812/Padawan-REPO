#include <iostream>

int main(){
    int sum = 0;

    for(int i = 0; i <= 100; i++){
        sum += i;
    }

    std::cout << "Total sum: " << sum << std::endl;
    return 0;
}