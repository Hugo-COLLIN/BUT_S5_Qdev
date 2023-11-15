

import java.util.*;
import java.util.function.Consumer;

    class Resource {
        private Resource() { System.out.println("created..."); }
        public Resource op1() {
            System.out.println("op1...");
            return this;
        }
        public Resource op2() {
            System.out.println("op2...");
            return this;
        }
        private void close() {
            System.out.println("release external resource");
        }

        public static void use(Consumer<Resource> block) {
            Resource resource = new Resource(); // avant
            try {
                block.accept(resource);
            } finally {
                resource.close();               // après
            }
        }
    }

//Exectute Around Method: wrapper avec une partie avant/après

public class Secu12 {
        public static void main(String[] args) {
            Resource.use(resource ->
                    resource.op1()
                            .op2());
        }
    }