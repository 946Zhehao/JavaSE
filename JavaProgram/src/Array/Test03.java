package Array;
/*
引用类型的一维数组
 */
public class Test03 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Birds();
        animals[2] = new Cats();

        for(int i=0; i<animals.length; i++) {

            if(animals[i] instanceof Birds) {
                Birds br = (Birds) animals[i];
                br.move();
                br.stingBug();
            } else if(animals[i] instanceof Cats) {
                Cats ct = (Cats)animals[i];
                ct.move();
                ct.catchMouse();
            } else {
                animals[i].move();
            }

        }
    }
}

class Animal {
    public void move() {
        System.out.println("The animal is walking!");
    }
}

class Cats extends Animal {
    public void move() {
        System.out.println("The cat is running!");
    }

    public void catchMouse() {
        System.out.println("The cat is catching a mouse!");
    }
}

class Birds extends Animal {
    public void move() {
        System.out.println("The bird is flying!");
    }

    public void stingBug() {
        System.out.println("The bird is attacking a bug!");
    }
}
