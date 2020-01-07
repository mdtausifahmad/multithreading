# multithreading


##Program vs Process vs Thread

####Program
```

A program is a set of instructions and associated data that resides on the disk and is  
loaded by the operating system to perform some task.In order to run a program,  
the operating system's kernel is first asked to create a new process, which is an   
environment in which a program executes.

```

####Process
```
A process is a program in execution. A process is an execution environment that consists  
of instructions, user-data, and system-data segments, as well as lots of other resources  
such as CPU, memory, address-space, disk and network I/O acquired at runtime. A program   
can have several copies of it running at the same time but a process necessarily belongs   
to only one program.
```

####Thread
```
Thread is the smallest unit of execution in a process. A thread simply executes instructions  
serially.A process can have multiple threads running as part of it. Usually, there would be   
some state associated with the process that is shared among all the threads and in turn each   
thread would have some state private to itself. The globally shared state amongst the threads   
of a process is visible and accessible to all the threads, and special attention needs to be   
paid when any thread tries to read or write to this global shared state. There are several   
constructs offered by various programming languages to guard and discipline the access to  
this global state, which we will go into further detail in upcoming lessons.
```
