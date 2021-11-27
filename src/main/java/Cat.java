public class Cat extends Animals {
    protected Integer run;
    private Integer swim;


    public Cat() {

    }

    @Override
    public Integer getSwim() {
        if (swim > 0) {
            throw new IllegalArgumentException("Кот не умеет плавать");
        }
        if (swim == 0) {
            System.out.println(getName() + " не умеет плавать");

        }

        return swim;
    }

    @Override
    public void setSwim(Integer swim) {
        this.swim = swim;
    }


    @Override
    public int getRun() {
        if (run > 200)
            throw new IllegalArgumentException("кот может пробежать не больше 200 метров");
        return run;
    }

    @Override
    public void setRun(Integer run) {
        this.run = run;
    }


}





