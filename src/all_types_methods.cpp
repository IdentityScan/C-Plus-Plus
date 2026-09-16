#include <iostream>
#include<string>

// @author (Sahel_Cavalieri)
// @date 05:32 09/16/2026
// #brief All types of methods in runtime
// Information about total Lines:  56
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

static void firstMethod()
{
	std::cout << "Simple Static Method without arguments and no return.\n";
	std::cout << "This type method don't use outside from .cpp.\n";
}

void secondMethod()
{
	std::cout << "This method can used outside of .cpp.\n";
	std::cout << "Don't return values and no arguments.\n";
}

int thirdMethod()
{
	std::cout << "Method return a integer value.\n";
	return 2;
}

std::string forthMethod(std::string key)
{
	std::string result_return;
	if (key == "unlock")
	{
		result_return = "Door unlocked";
	}
	else
	{
		result_return = "Door still locked.\n";
	}

	return result_return;
}

int main()
{
	firstMethod();
	secondMethod();
	int get_return_integer = thirdMethod();
	std::string get_return_string = forthMethod("unlock");

	get_return_integer += 1; // Output 2 + 1 is 3, no 2.
	get_return_string.append("(0x000)"); // Output Door Unlocked(0x000) or Door still locked(0x000)

	std::cout << get_return_integer << "\n";
	std::cout << get_return_string << "\n";
	return 0;
}
