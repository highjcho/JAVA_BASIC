package downCasting;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    private void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal a : animalList)
        {
            if(a instanceof Human)
                ((Human) a).reading();
            else if (a instanceof Tiger)
                ((Tiger) a).hunting();
            else if (a instanceof Eagle)
                ((Eagle) a).flying();
            else
                System.out.println("지원되지 않는 기능입니다");
        }
    }
}
