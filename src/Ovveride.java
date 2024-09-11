class AA {

    void input() {
        System.out.println("Hello base class");
    }
}




class BB extends AA {

    void input() {
        System.out.println("hello derived class");
    }
}

class Ovveride {
    public static void main(String[] args) {
        BB aa= new BB();
        aa.input();
        // Closing the scanner to prevent resource leak
    }
}
