#include <iostream>
#include<fstream>

// @author (Sahel_Cavalieri)
// @date 05:12 09/16/2026
// #brief Create and write using file
// Information about total Lines:  17
// Version: 1.0
// Website: https://mundopauta.com.br/ (Portuguese, Brazil)

int main()
{
	std::ofstream File("sahel.txt");
	File << "Record some datas";
	File.close();
	
	return 0;
}
