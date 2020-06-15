Problem Statement:
Assume you will be given threads of varying lengths; we need to connect these thread into one single thread. We can connect only 2 threads at a time. The cost required to connect 2 threads is equal to sum of their lengths. The length of this connected thread is also equal to the sum of their lengths. This process is repeated until all the threads are connected into a single thread. Find the min possible cost required to connect all thread.

Example 1:

Input: thread = [4, 6, 8, 12]
Output: 58

Example 2:

Input: thread = [20, 4, 8, 2]
Output: 54

Constraints: 
    • Array elements would always be greater than zero.
    • Array elements max value will always be equal and less than integer maximum value.
    • Try to avoid using any external or pre built utility classes from any library. Focus on implementing the entire logic from scratch without any external dependency.