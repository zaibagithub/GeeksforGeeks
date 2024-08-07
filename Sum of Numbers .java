class HelloWorld {
    public static void main(String[] args) {
        int num = 12345;
        int temp =0;
        int sum = 0;
        while(num>0){
            temp = num%10;
            sum += temp;
            num = num/10;
        }
        System.out.println(sum);
    }
}
