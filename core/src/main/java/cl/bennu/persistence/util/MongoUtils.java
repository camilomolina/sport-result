package cl.bennu.persistence.util;

import cl.bennu.common.ms.enums.DBEnum;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoUtils {

    private static final String HOST = "192.168.99.100";
    private static final int PORT = 27017;

    public static MongoDatabase getDatabase(DBEnum dbEnum) {
        MongoClient client = new MongoClient(HOST, PORT);
        return client.getDatabase(dbEnum.getName());
    }

}
