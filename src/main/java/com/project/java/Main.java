package com.project.java;

import com.project.java.engine.Calculator;
import com.project.java.engine.io.Console;
import com.project.java.engine.repository.MemoryRepository;
import com.project.java.engine.solver.StackSolver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Console console = new Console();
        StackSolver solver = new StackSolver();
        MemoryRepository repository = new MemoryRepository();

        new Calculator(console, console, solver, repository).run();
    }
}