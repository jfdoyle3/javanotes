[TOC]

# Java Notebook

Quick reference guide to Java code

*Environment*

JDK: 14

IDE: IntellJ community edition 2019.3.4

------

**Running a .class file from cmd prompt**

..\src$java packageName.NameofClass (com.company.Main (com/company/Main)) runs Main.class



------

## Basics

### 	Primitives Types

|    Type | Bytes |   Range    | Usage                                                   |
| ------: | :---: | :--------: | :------------------------------------------------------ |
|    byte |   1   | [-128,127] | if the variable isn't ever going beyond -/+ 127.        |
|   short |   2   | [-32k,32k] |                                                         |
|     int |   4   |  [-2B,2B]  |                                                         |
|    long |   8   |            | 'L' with long. *int* is always assumed when using long. |
|   float |   4   |            | 'F' with float. double is assumed.                      |
|  double |   8   |            |                                                         |
|    char |   2   |  A,B,C...  | single quote for single characters.                     |
| boolean |   1   | true/false |                                                         |

------

### 	Reference Types

------

### Arrays

Java Arrays work like other languages.

`Arrays.deepToString(multiDimensionalArrayName)` Console output Multi-Dimensional Arrays.

------

### Constants

use `final` as constants. Capitalize constant variables.

```java
final float PI=3.14F;

```

### Math Operations

```java
int x=1;

int y=x++;
ouptut: x=2 y=1
int y=++x;
output: x=2 y=2
```

