public class Counter {
    /*

    Create Counter class
        which has a counter (integer) field
            at creation it should have a default value 0
        there are two ways to create the class:
            with 0 input parameters
            with 1 input parameter called counter which is set as the initial value of the counter field
        we can add another whole number to this counter: add(number)
        we can just increase the counter's value by one: add() (no parameters)
        we can get() the current counter value
        and we can reset() the counter to the initial value set during the construction of the class
    Check if everything works fine with the proper tests:
        Download CounterTest.java and place it next to your solution
        If you are unsure about how to get this running, you can watch a video tutorial
        Other hints for running:
            If something gets red:
                Windows, Linux:
                    press ALT+Enter and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
                OSX:
                    press ⌥⏎ and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
            Run the tests one by one with the green play button before the method name (or run all of by pressing the button before the classname)

     */
    int counter;
    int initCounter;
    public Counter(int counter) {
        this.counter = counter;
        this.initCounter = counter;
    }
    public Counter() {}

    public int add(int number) {
        this.counter += number;
        return this.counter;
    }
    public int add() {
        this.counter ++;
        return this.counter;
    }
    public int get() {
        System.out.println(this.counter);
        return this.counter;
    }
    public void reset() {
        this.counter = initCounter;
    }
}
