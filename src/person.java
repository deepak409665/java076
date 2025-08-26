public class person {
    public String address;

    public person(String address) {
        this.address = address;
    }

    public String getAddress() {
        System.out.println("Address is "+address);
        return address;
    }
}

