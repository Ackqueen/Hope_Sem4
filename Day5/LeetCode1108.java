package Day5;

class LeetCode1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(new LeetCode1108().defangIPaddr(address));
    }
}
