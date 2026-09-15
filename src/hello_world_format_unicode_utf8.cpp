#include <iostream>
#include <Windows.h>

// @author (Sahel_Cavalieri)
// @date 09:21 09/15/2026
// #brief Simple Hello World (Use unicode UTF-8)
// Information about total Lines:  17
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	SetConsoleOutputCP(CP_UTF8);
	std::cout << "Olá Mundo!";

	return 0;
}
