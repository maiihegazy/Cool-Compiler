# Cool-Compiler

Shoubra faculty of engineering Compilers Course Project - Cool

## Introduction

"Cool" is abbreviation for "Classroom Object-Oriented Language"

The full name of "Cool" is "The Classroom Object-Oriented Language". It is a small language designed for use in an undergraduate compiler course project

Cool has many of the features of modern programming languages, including objects, automatic memory management, and strong static typing. It generates three address code 

More info:
COOL manual : https://theory.stanford.edu/~aiken/software/cool/cool-manual.pdf

## Assignments

### A1: Lexer 
Lexical analysis is the first phase of a compiler. The lexical analyzer breaks the source code into a series of tokens, and passes the data to the parser when it demands.

### A2: Parser
Parsing (or syntax analysis) is the second phase of a compiler. A parser takes the input from a lexical analyzer in the form of token streams and analyzes the source code (token stream) against the production rules to detect any errors in the code. The output of this phase is an abstract syntax tree (AST).

### A3: Three Address Code 
Three address code is an intermediate code used by optimizing compilers to aid in the implementation of code-improving transformations. Each TAC instruction has at most three operands and is typically a combination of assignment and a binary operator. For example, t1 := t2 + t3. The name derives from the use of three operands in these statements even though instructions with fewer operands may occur.

## Run Antlr Files 

```
$ cd /tmp
$ antlr4 lex.g4
$ antlr4 parse.g4
$ javac *.java
$ javac CodegenTest.java
$ java CodegenTest file_name.cl
```



