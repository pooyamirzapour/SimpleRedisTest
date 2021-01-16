public class Main {


    public static void main(String[] args) {
        RedisOperation redisOperation = new RedisOperation();
        String result = redisOperation.set("key1", "value1");
        System.out.println(result);
        String value = redisOperation.get("key1");
        System.out.println(value);
    }
}
