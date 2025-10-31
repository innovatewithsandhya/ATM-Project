class SumGenerics<T>{
    public static <T extends Number>
    int sum (T[] numbers){
        int total = 0;
        for(T num:numbers){
            total += num.intValue();
        }
        return total;
    }

    public static void main (String[] args){
        Integer [] numbers = {1,2,3,4,5};
        System.out.println("SUM: " + sum(numbers));
    }
}