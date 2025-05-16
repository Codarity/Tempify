start:
	g++ -Isrc/main/include -I/home/leodora/.nxpm/packages/cpp/sol2/v3.2.2/include -O3 -o build/main src/main/cpp/*.cpp -L/usr/lib64 -llua5.4

run:
	./build/main
