#include <iostream>

int main(){
    int number = 0;

    for(int i = number - 1; i > 0; i--){
        number *= i;
    }

    std::cout << "Factorial: " << number << std::endl;
    return 0;
}