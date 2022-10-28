package ch.bbw.cardgame;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardNoSQLConnector {
    public List<Car> getCarsFromDB() {
        List<Car> result = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(
                MongoClientSettings.builder().applyConnectionString(new ConnectionString("mongodb://root:root@localhost/carCards")).build()
        )) {
            MongoDatabase database = mongoClient.getDatabase("carCards");
            try {
                MongoCollection<Document> carDocs = database.getCollection("car");
                FindIterable<Document> iterDoc = carDocs.find();
                Iterator<Document> it = iterDoc.iterator();
                while(it.hasNext()){
                    Document doc = it.next();
                    Gson gson = new GsonBuilder().create();
                    Car car = gson.fromJson(doc.toJson(), Car.class);
                    result.add(car);
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to run a command: " + me);
            }

        }
        System.out.println("Found " + result.size());
        return result;
    }

    public List<Statistic> getStatistic() {
        List<Statistic> result = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(
                MongoClientSettings.builder().applyConnectionString(new ConnectionString("mongodb://root:root@localhost/carCards")).build())) {
            MongoDatabase database = mongoClient.getDatabase("carCards");
            try {
                MongoCollection<Document> statisticDocs = database.getCollection("game");
                FindIterable<Document> iterDoc = statisticDocs.find();
                Iterator<Document> it = iterDoc.iterator();
                Gson gson = new GsonBuilder().create();
                while(it.hasNext()){
                    Document doc = it.next();
                    Statistic st = gson.fromJson(doc.toJson(), Statistic.class);
                    /*
                    st.setStartTime(doc.getString("time"));
                    for(Document leftcards : (ArrayList<Document>) doc.get("leftcards")){
                        st.getLeftcars().add(mapCar(leftcards));
                    }
                    for(Document rightcards : (ArrayList<Document>) doc.get("rightcards")){
                        st.getRightcars().add(mapCar(rightcards));
                    }
                    for(Document battles : (ArrayList<Document>) doc.get("battles")){
                        st.getBattles().add(new Battle(mapCar((Document) battles.get("leftcard")),mapCar((Document) battles.get("rightcard")), battles.getString("winner")));
                    }
                    st.setWinTime(doc.getString("wintime"));
                    st.setWinner(doc.getString(("gamewinner")));

                     */
                    result.add(st);
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to run a command: " + me);
            }

        }
        System.out.println(result);
        System.out.println("Found " + result.size());
        return result;
    }

    private Car mapCar(Document doc){
        Car c = new Car();
        c.setPrize(doc.getDouble("prize"));
        c.setModel(doc.getString("model"));
        c.setTradeName(doc.getString("tradeName"));
        c.setImageUrl(doc.getString("imageUrl"));
        return c;
    }

}


