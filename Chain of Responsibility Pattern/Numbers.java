public class Numbers {
    private int number1;
    private int number2;

    private String calcuationWanted;

    public Numbers(int number1, int number2, String calcuationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calcuationWanted = calcuationWanted;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalcuationWanted() {
        return calcuationWanted;
    }

    public void setCalcuationWanted(String calcuationWanted) {
        this.calcuationWanted = calcuationWanted;
    }

}
