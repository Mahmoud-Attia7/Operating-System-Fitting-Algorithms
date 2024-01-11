# Memory Allocation Algorithms in Java

This Java program demonstrates three memory allocation algorithms: First Fit, Worst Fit, and Best Fit. The user inputs sizes for six processes, and the program allocates them in memory using each algorithm. After each allocation, it prints the updated memory block sizes.

## First Fit Algorithm
The First Fit Algorithm allocates a process to the first available memory block that is large enough. It iterates through the memory blocks and allocates the process to the first suitable block.

## Worst Fit Algorithm
The Worst Fit Algorithm allocates a process to the memory block with the largest available size. It iterates through the memory blocks, keeps track of the worst-fit block, and allocates the process to that block.

## Best Fit Algorithm
The Best Fit Algorithm allocates a process to the memory block with the smallest available size that is still sufficient. It iterates through the memory blocks, keeps track of the best-fit block, and allocates the process to that block.

## How to Use
1. Run the program.
2. Enter sizes for six processes when prompted.
3. View the allocation results and updated memory block sizes for each algorithm.
