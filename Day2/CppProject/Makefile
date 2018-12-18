all: target/main.o target/hello.o
	g++ -o target/hello.exe target/main.o target/hello.o

target/main.o: src/main.cpp
	g++ -c src/main.cpp -o target/main.o

target/hello.o: src/hello.cpp
	g++ -c src/hello.cpp -o target/hello.o

