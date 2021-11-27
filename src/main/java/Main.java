public class Main {


    public static void main(String[] args) {

        Cat murzik = new Cat();
        murzik.setName("Мурзик");
        murzik.setColor("Рыжий");
        murzik.setRun(150);
        murzik.setAge(3);
        murzik.setSwim(0);


        Cat barsik = new Cat();
        barsik.setName("Барсик");
        barsik.setColor("Черный");
        barsik.setRun(120);
        barsik.setAge(10);
        barsik.setSwim(0);


        Cat pushok = new Cat();
        pushok.setName("Пушок");
        pushok.setColor("Белый");
        pushok.setRun(200);
        pushok.setAge(2);
        pushok.setSwim(0);


        Cat ryzhik = new Cat();
        ryzhik.setName("Рыжик");
        ryzhik.setColor("Рыжий");
        ryzhik.setRun(200);
        ryzhik.setAge(5);
        ryzhik.setSwim(0);


        Dog trezor = new Dog();
        trezor.setName("Трезор");
        trezor.setColor("Черный");
        trezor.setRun(150);
        trezor.setAge(3);
        trezor.setSwim(3);


        Animals muhtar = new Dog();
        muhtar.setName("Мухтар");
        muhtar.setColor("Рыже-черный");
        muhtar.setRun(400);
        muhtar.setAge(5);
        ((Dog) muhtar).setSwim(10);


        Dog barbos = new Dog();
        barbos.setName("Барбос");
        barbos.setColor("Белый");
        barbos.setRun(190);
        barbos.setAge(6);
        barbos.setSwim(8);

        Dog bim = new Dog();
        bim.setName("Бим");
        bim.setColor("Белый");
        bim.setRun(300);
        bim.setAge(6);
        bim.setSwim(6);


        Animals[] animals = new Animals[8];
        animals[0] = murzik;
        animals[1] = barsik;
        animals[2] = ryzhik;
        animals[3] = pushok;
        animals[4] = trezor;
        animals[5] = muhtar;
        animals[6] = barbos;
        animals[7] = bim;


        for (int i = 0; i < animals.length; i++) {
            System.out.println(new StringBuilder().append(animals[i].run()).toString());
            System.out.println(new StringBuilder().append(animals[i].swim()).toString());
        }

    }


}


