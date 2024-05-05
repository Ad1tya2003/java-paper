// class User {
//     private final String name;
//     private final int age;
//     private final int phoneNo;
//     private final String addr;

//     // constructor
//     private User(Builder b) {
//         this.addr = b.addr;
//         this.name = b.name;
//         this.age = b.age;
//         this.phoneNo = b.phoneNo;
//     }

//     public String toString() {
//         return "Name : " + name + " Age : " + age + " Phone no: " + phoneNo + " Address : " + addr;
//     }

//     static class Builder {
//         String name;
//         int age;
//         int phoneNo;
//         String addr; // comp

//         Builder(String addr) {
//             this.addr = addr;
//         }

//         public Builder setName(String name) {
//             this.name = name;
//             return this;
//         }

//         public Builder setAge(int age) {
//             this.age = age;
//             return this;
//         }

//         public Builder setPhoneNo(int phoneNo) {
//             this.phoneNo = phoneNo;
//             return this;
//         }

//         public User Build() {

//             return new User(this);
//         }
//     }
// }

// class Demo22 {
//     public static void main(String om[]) {
//         User u1 = new User.Builder("LPU")
//                 .setPhoneNo(123)
//                 .setAge(25)
//                 .setName("asd").Build();
//         System.out.println(u1);

//         User u2 = new User.Builder("India").setAge(17).Build();
//         // name and phone no is optional
//         System.out.println(u2);

//     }
// }

class User {
    private final String name;
    private final int age;
    private final int phoneNo;

    // constructor
    private User(Builder b) {
        this.name = b.name;
        this.age = b.age;
        this.phoneNo = b.phoneNo;
    }

    public String toString() {
        return "Name : " + name + " Age : " + age + " Phone no: " + phoneNo;
    }

    static class Builder {
        String name;
        int age;
        int phoneNo;

        Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNo(int phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User Build() {

            return new User(this);
        }
    }
}

class Demo22 {
    public static void main(String om[]) {
        User u1 = new User.Builder().setPhoneNo(123).setAge(25).setName("asd").Build();
        System.out.println(u1);
    }
}