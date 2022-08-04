public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
    }

// HW1

    int arr[]={12,1,4,8,16};
        try{
        int i= getSmallPositive(arr);
        System.out.println(i);
    } catch (Exception e){
        System.out.println("wrong");
    }
}
    public static int getSmallPositive (int arr[] ) throws Exception {
        int total=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                throw new Exception("it is negative number");
            }else if (arr[i]<total){
                total=arr[i];
            }

        }

        return total;

    }


//HW2

public class Customer {

    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) throws RuntimeException {
        if (gender!='m'&&gender!='f'){
            throw new RuntimeException("the gender is other than 'm' or 'f'");
        }
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", name=" + name + '}';
    }
}



















}
