all: playground
	mkdir -p "./bin"
	scalac -classpath "./bin" -d "./bin" jason/program/Main.scala
	cd "./bin" && scala jason.program.Main
	
playground:
	scalac -d ./bin jason/playground/*.scala
	
clean:
	cd "./bin" && rm -rf ./*