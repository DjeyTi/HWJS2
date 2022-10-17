import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Zoo {
    public static Zoo[] addAnimal(Zoo[] arg, int k, Zoo animal) {
        Zoo[] newArray = new Zoo[arg.length + 1];
        for (int i = 0; i < k - 1; i++)
            newArray[i] = arg[i];
        for (int i = k - 1; i < newArray.length; i++) {
            if (i == k - 1) {
                newArray[i] = animal;
            } else {
                newArray[i] = arg[i - 1];
            }
        }
        arg = newArray;
        return arg;
    }

    public static Stack<Zoo> addAnimal(Stack<Zoo> arg, int k, Zoo animal) {
        arg.add(k - 1, animal);
        return arg;
    }
    
    public static Queue<Zoo> addAnimal(Queue<Zoo> arg, int k, Zoo animal) {
        Queue<Zoo> newQueue = new LinkedList<Zoo>();
        for (int i = 0; i < k - 1; i++) {
            newQueue.add(arg.element());
            arg.remove();
        }
        for (int i = k - 1; arg.size() > 0; i++) {
            if (i == k - 1) {
                newQueue.add(animal);
            } else {
                newQueue.add(arg.element());
                arg.remove();
            }
        }
        return newQueue;
    }   

    public static Zoo[] deleteAnimal(Zoo[] arg, int k) {
        Zoo[] newArray = new Zoo[arg.length - 1];
        int j = 0;
        for (int i = 0; i < arg.length; i++) {
            if (i == k - 1) {
                continue;
            } else {
                newArray[j] = arg[i];
                j++;
            }
        }
        return newArray;
    }

    public static Stack<Zoo> deleteAnimal(Stack<Zoo> arg, int k) {
        arg.remove(k - 1);
        return arg;
    }

    public static Queue<Zoo> deleteAnimal(Queue<Zoo> arg, int k) {
        Queue<Zoo> newQueue = new LinkedList<Zoo>();
        for (int i = 0; i < k - 1; i++) {
            newQueue.add(arg.element());
            arg.remove();
        }
        for (int i = k - 1; 0 < arg.size(); i++) {
            if (i == k - 1) {
                arg.remove();
            } else {
                newQueue.add(arg.element());
                arg.remove();
            }
        }
        return newQueue;
    }

    public static void checkAnimal(Zoo[] arg, int k) {
        Zoo element = arg[k - 1];
        if (element instanceof Cat) {
            ((Cat) element).getInfo();
        } else if (element instanceof Dog) {
            ((Dog) element).getInfo();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getInfo();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getInfo();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getInfo();
        } else if (element instanceof Stork) {
            ((Stork) element).getInfo();
        }
    }

    public static void checkAnimal(Stack<Zoo> arg, int k) {
        Zoo element = arg.elementAt(k - 1);
        if (element instanceof Cat) {
            ((Cat) element).getInfo();
        } else if (element instanceof Dog) {
            ((Dog) element).getInfo();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getInfo();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getInfo();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getInfo();
        } else if (element instanceof Stork) {
            ((Stork) element).getInfo();
        }
    }

    public static void checkAnimal(Queue<Zoo> arg, int k) {
        Queue<Zoo> newQueue = arg;
        for (int i = 0; i < k - 1; i++) {
            newQueue.remove();
        }
        Zoo element = newQueue.element();
        if (element instanceof Cat) {
            ((Cat) element).getInfo();
        } else if (element instanceof Dog) {
            ((Dog) element).getInfo();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getInfo();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getInfo();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getInfo();
        } else if (element instanceof Stork) {
            ((Stork) element).getInfo();
        }        
    }

    public static void getSound(Zoo[] arg, int k) {
        Zoo element = arg[k - 1];
        if (element instanceof Cat) {
            ((Cat) element).getSound();
        } else if (element instanceof Dog) {
            ((Dog) element).getSound();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getSound();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getSound();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getSound();
        } else if (element instanceof Stork) {
            ((Stork) element).getSound();
        }
    }

    public static void getSound(Stack<Zoo> arg, int k) {
        Zoo element = arg.elementAt(k - 1);
        if (element instanceof Cat) {
            ((Cat) element).getSound();
        } else if (element instanceof Dog) {
            ((Dog) element).getSound();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getSound();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getSound();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getSound();
        } else if (element instanceof Stork) {
            ((Stork) element).getSound();
        }
    }

    public static void getSound(Queue<Zoo> arg, int k) {
        Queue<Zoo> newQueue = arg;
        for (int i = 0; i < k - 1; i++) {
            newQueue.remove();
        }
        Zoo element = newQueue.element();
        if (element instanceof Cat) {
            ((Cat) element).getSound();
        } else if (element instanceof Dog) {
            ((Dog) element).getSound();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getSound();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getSound();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getSound();
        } else if (element instanceof Stork) {
            ((Stork) element).getSound();
        }
    }

    public static void getAllInfo(Zoo[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.println("------------------------");
            Zoo element = arg[i];
            if (element instanceof Cat) {
                ((Cat) element).getInfo();
            } else if (element instanceof Dog) {
                ((Dog) element).getInfo();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getInfo();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getInfo();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getInfo();
            } else if (element instanceof Stork) {
                ((Stork) element).getInfo();
            }
            System.out.println("------------------------");
        }        
    }

    public static void getAllInfo(Stack<Zoo> arg) {
        for (int i = 0; i < arg.size(); i++) {
            System.out.println("------------------------");
            Zoo element = arg.elementAt(i);
            if (element instanceof Cat) {
                ((Cat) element).getInfo();
            } else if (element instanceof Dog) {
                ((Dog) element).getInfo();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getInfo();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getInfo();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getInfo();
            } else if (element instanceof Stork) {
                ((Stork) element).getInfo();
            }
            System.out.println("------------------------");
        }
    }

    public static void getAllInfo(Queue<Zoo> arg) {
        Queue<Zoo> newQueue = arg;
        while (newQueue.size() > 1) {
            System.out.println("------------------------");
            Zoo element = newQueue.element();
            if (element instanceof Cat) {
                ((Cat) element).getInfo();
            } else if (element instanceof Dog) {
                ((Dog) element).getInfo();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getInfo();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getInfo();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getInfo();
            } else if (element instanceof Stork) {
                ((Stork) element).getInfo();
            }
            if (newQueue.size() > 0)
                newQueue.remove(); 
            System.out.println("------------------------");
        }
        System.out.println("------------------------");
        Zoo element = newQueue.element();
        if (element instanceof Cat) {
            ((Cat) element).getInfo();
        } else if (element instanceof Dog) {
            ((Dog) element).getInfo();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getInfo();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getInfo();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getInfo();
        } else if (element instanceof Stork) {
            ((Stork) element).getInfo();
        }
        System.out.println("------------------------");
    }

    public static void playZooSound(Zoo[] arg) {
        for (int i = 0; i < arg.length; i++) {
            Zoo element = arg[i];
            if (element instanceof Cat) {
                ((Cat) element).getSound();
            } else if (element instanceof Dog) {
                ((Dog) element).getSound();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getSound();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getSound();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getSound();
            } else if (element instanceof Stork) {
                ((Stork) element).getSound();
            }
        }  
    }

    public static void playZooSound(Stack<Zoo> arg) {
        for (int i = 0; i < arg.size(); i++) {
            Zoo element = arg.elementAt(i);
            if (element instanceof Cat) {
                ((Cat) element).getSound();
            } else if (element instanceof Dog) {
                ((Dog) element).getSound();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getSound();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getSound();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getSound();
            } else if (element instanceof Stork) {
                ((Stork) element).getSound();
            }
        }
    }

    public static void playZooSound(Queue<Zoo> arg) {
        Queue<Zoo> newQueue = arg;
        while (newQueue.size() > 1) {
            Zoo element = newQueue.element();
            if (element instanceof Cat) {
                ((Cat) element).getSound();
            } else if (element instanceof Dog) {
                ((Dog) element).getSound();
            } else if (element instanceof Tiger) {
                ((Tiger) element).getSound();
            } else if (element instanceof Wolf) {
                ((Wolf) element).getSound();
            } else if (element instanceof Chicken) {
                ((Chicken) element).getSound();
            } else if (element instanceof Stork) {
                ((Stork) element).getSound();
            }
            if (newQueue.size() > 0)
                newQueue.remove(); 
        }
        Zoo element = newQueue.element();
        if (element instanceof Cat) {
            ((Cat) element).getSound();
        } else if (element instanceof Dog) {
            ((Dog) element).getSound();
        } else if (element instanceof Tiger) {
            ((Tiger) element).getSound();
        } else if (element instanceof Wolf) {
            ((Wolf) element).getSound();
        } else if (element instanceof Chicken) {
            ((Chicken) element).getSound();
        } else if (element instanceof Stork) {
            ((Stork) element).getSound();
        }
    }
}
