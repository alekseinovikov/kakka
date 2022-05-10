package com.kakka.core

interface Processor<S,C,E> {
    fun empty(): S
    fun handleCommand(command: C)
    fun handleEvent(event: E)
}
