
    class pen{
        String color;
        String type;//ball,jel

        public void write() {
            System.out.println("Writing something");
        }

        public void printcolor(){
            System.out.println(this.color);
        }
    }
    class student{
        String name;
        int age;

        public void printinfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
    }
    
    public class oops {
        public static void main(String[] args) {
            student s1 = new student();
            s1.name="nikhil";
            s1.age=18;

            s1.printinfo();
        }
    }
