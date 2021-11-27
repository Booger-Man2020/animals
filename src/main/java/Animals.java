public class Animals {

    protected String name;
    protected String color;
    protected Integer run;
    protected Integer age;
    protected Integer swim;


    public Animals() {

    }

    public String run() {

        System.out.print(new StringBuilder().append(getName()).append(" пробежал ").append(getRun() + (" метров").toString()));
        return " ";
    }

    public String swim() {

        System.out.print(new StringBuilder().append(getName()).append(" проплыл ").append(getSwim() + (" метров").toString()));
        return " ";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Integer getRun(int i) {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSwim() {
        return swim;
    }

    public void setSwim(Integer swim) {
        this.swim = swim;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected int getRun() {
        return run.intValue();

    }
}
