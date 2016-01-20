all: bin playground
	scalac -classpath "./bin" -d "./bin" jason/program/Main.scala
	cd "./bin" && scala jason.program.Main

bin:
	mkdir -p "bin"
	
playground:
	scalac -d ./bin jason/playground/*.scala
	
clean:
	cd "./bin" && rm -rf ./*