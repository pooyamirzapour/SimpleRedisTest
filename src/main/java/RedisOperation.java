import redis.clients.jedis.Jedis;


public class RedisOperation {
    private Jedis jedis;

    public RedisOperation() {
        jedis = new Jedis("127.0.0.1", 6379, 5000);
    }

    public String set(String key, String value) {
        try {
            return jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String get(String key) {
        try {
            return jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
