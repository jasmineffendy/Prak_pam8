package Database;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ContactUser.class}, version = 1)
public abstract class ContactDatabase extends RoomDatabase {
    private static ContactDatabase sInstance;
    private static String DATABASE_NAME = "Database";
    public abstract ContactDao contactDao();

    public static ContactDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (ContactDatabase.class) {
                Log.d("dbConnection", "Creating new database instance");
                sInstance = Room.databaseBuilder(context.getApplicationContext(),ContactDatabase.class, ContactDatabase.DATABASE_NAME).build();
            }
        }
        Log.d("dbConnection", "Getting the database instance");
        return sInstance;
    }
}