#include <iostream>
#include<string> // It's need for use methoad append(const char*)

// @author (Sahel_Cavalieri)
// @date 10:07 09/15/2026
// #brief String's Operators like .append()
// Information about total Lines:  20
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	std::string title = "The Legend of Zelda - Ocarina of Time";

	title = title.append("(1997)");

	std::cout << title << "\n"; // Output The Legend of Zelda - Ocarina of Time(1997)

	return 0;
}
