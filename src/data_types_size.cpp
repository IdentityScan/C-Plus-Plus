#include <iostream>
#include<iomanip> // From std::fixed and std::setprecision for float
#include<typeinfo> // From typeid(variable).name() information about data type

// @author (Sahel_Cavalieri)
// @date 09:33 09/15/2026
// #brief Each Data Type, Information and Size in Bytes
// Information about total Lines:  61
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	float myFloat = 4.0f;
	int myInt = 4;
	double myDouble = 4.0;
	bool myBool = true;
	short myShort = 126;
	std::string myString = "Example";
	char myChar = 'S';
	int sizeF, sizeI, sizeD, sizeB, sizeS, sizeStr, sizeC;

	// Byte's Size each Data Type
	sizeF = sizeof(myFloat);
	sizeI = sizeof(myInt);
	sizeD = sizeof(myDouble);
	sizeB = sizeof(myBool);
	sizeS = sizeof(myShort);
	sizeStr = sizeof(myString);
	sizeC = sizeof(myChar);

	std::cout << "Float: " << std::fixed << std::setprecision(2) << myFloat << "\n";
	std::cout << "Type (float): " << typeid(myFloat).name() << "\n";
	std::cout << sizeF << " bytes.\n\n";

	std::cout << "Integer: " << myInt << "\n";
	std::cout << "Type (int): " << typeid(myInt).name() << "\n";
	std::cout << sizeI << " bytes.\n\n";

	std::cout << "Double: " << std::fixed << std::setprecision(2) << myDouble << "\n";
	std::cout << "Type (double): " << typeid(myDouble).name() << "\n";
	std::cout << sizeD << " bytes.\n\n";

	std::cout << "Boolean: " <<  myBool << "\n";
	std::cout << "Type (bool): " << typeid(myBool).name() << "\n";
	std::cout << sizeB << " bytes.\n\n";

	std::cout << "Short: " << myShort << "\n";
	std::cout << "Type (short): " << typeid(myShort).name() << "\n";
	std::cout << sizeS << " bytes.\n\n";

	std::cout << "String: " << myString << "\n";
	std::cout << "Type (string): " << typeid(myString).name() << "\n";
	std::cout << sizeStr << " bytes.\n\n";

	std::cout << "Character: " << myChar << "\n";
	std::cout << "Type (char): " << typeid(myChar).name() << "\n";
	std::cout << sizeC << " bytes.\n\n";

	return 0;
}
