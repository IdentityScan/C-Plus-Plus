#include <iostream>

// @author (Sahel_Cavalieri)
// @date 05:58 09/16/2026
// #brief Strutc like global variable and object
// Information about total Lines:  42
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

struct Person
{
	std::string fullname = "Claire Redfield";
	int age = 47;
};

struct {
	std::string stationname = "Paddington London";
}TrainStation;

int main()
{
	
	struct Person p;

	std::cout << p.fullname << "\n";
	std::cout << p.age << "\n";

	// This struct is a global variable, you can't create a object like Person
	std::cout << TrainStation.stationname << "\n";

	// If you want can define new values for each members of struct.

	p.fullname = "Lara Croft";
	p.age = 30;
	TrainStation.stationname = "Tokyo";

	std::cout << p.fullname << "\n"; // Output is not anymore Claire Redfield, is Lara Croft
	std::cout << p.age << "\n"; // Output 30 and no 47.
	std::cout << TrainStation.stationname << "\n";

	return 0;
}
