import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.FindIterable;

/*
 * Requires the MongoDB Java Driver.
 * https://mongodb.github.io/mongo-java-driver
 */

Bson filter = new Document();

MongoClient mongoClient = new MongoClient(
    new MongoClientURI(
        "mongodb://localhost:27017/"
    )
);
MongoDatabase database = mongoClient.getDatabase("commit");
MongoCollection<Document> collection = database.getCollection("campKerala");
FindIterable<Document> result = collection.find(filter);