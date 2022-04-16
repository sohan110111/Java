public class MyStack {
    int capacity = 3;
    int stackArray[] = new int[capacity];
    static int top = -1;
    void push(int element) {
        if (top < capacity-1) {
            top = top + 1;
            stackArray[top] = element;
        } else {
            System.out.println("It's overflowing");
        }
    }

    int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Exception! Array is empty in a sense");
        }

        return -1;
    }

    int pop() {
        if (top >= 0) {
            top = top - 1;
            return stackArray[top];
        } else {
            System.out.println("Exception! Array is empty in a sense");
        }

        return -1;
    }
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        //obj.push(40);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.push(80);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.push(70);
        obj.push(90);
        System.out.println(obj.peek());
    }
}