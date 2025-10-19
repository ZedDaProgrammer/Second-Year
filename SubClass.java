public class SubClass {
    public int positive;
    public int negative;
    public int[] numbers;

    public void summary(){
        this.numbers = new int[8]; 

        this.positive = 0;
        this.negative = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int positive(){
        return positive;
    }
    public int negative(){
        return negative;
    }

    
}
