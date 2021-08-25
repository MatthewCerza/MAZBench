# MAZBench
MAZBench is a mathematical benchmark written in Java

Features:
- Mathematical benchmarks involving irrational numbers and random generation to properly utilize multiple cores
- Torture test function to have tests run without a time limit
- Scoring system based on how quickly your system completes the tests
- Saving text files containing system info and benchmark scores (Saved to Home folder on macOS and User folder on Windows)
- System information display

The program has been tested and working on Java version 11 and 16 on macOS.

KNOWN ISSUES:

MAZBench doesn't function correctly under Windows. Java will only allocate around 10% of the CPU to the program causing incorrect scores and extremely long benchmark times. 


