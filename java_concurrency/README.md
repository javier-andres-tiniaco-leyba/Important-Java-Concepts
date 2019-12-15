# Some Concepts of Java concurrency

## Synchronization
Threads communicate primarily by sharing access to fields and the objects reference
fields refer to. This form of communication is extremely efficient, but makes two kinds
of errors possible: thread interference and memory consistency errors. The tool needed
to prevent these errors is synchronization.

However, syncronization can introduce thread contention, which occurs when two or more
threads try to access the same resource simultaneously and cause the java runtime to
execute one or more threads more slowly, or even suspend their execution.
Deadlock, starvation and livelock are forms of thread contention.

### Thread interference

### Memory consistency errors

### Synchronized methods

### Implicit locks and Synchronization

### Atomic access



## Liveness
A concurrent application's ability to execute in a timely manner is known as its liveness. Deadlock is the most common kind of liveness problem, followed by starvation and livelock.

### Deadlock
Deadlock describes a situation when two or more threads are blocked forever, waiting for each other.

### Starvation and livelock
