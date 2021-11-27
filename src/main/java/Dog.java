public class Dog extends Animals {

    public Integer swim;
    protected Integer run;


    public Dog() {

    }


    @Override
    public int getRun() {
        if (run > 500)
            throw new IllegalArgumentException("Собака может пробежать не больше 500 метров");
        return run;
    }

    @Override
    public void setRun(Integer run) {
        this.run = run;
    }

    @Override
    public Integer getSwim() {
        if (swim > 10)
            throw new IllegalArgumentException("Собака может проплыть не больше 10м");
        return swim;
    }

    @Override
    public void setSwim(Integer swim) {
        this.swim = swim;
    }


}
