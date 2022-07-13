public class lowercase_prog {
    public static void main(String[] args) {
        String product="pan";
        product.toLowerCase();
        System.out.println(product);

        product= product.concat("pan".toLowerCase());
        System.out.println(product.substring(4,6));
    }
}
