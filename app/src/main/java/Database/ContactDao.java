package Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface ContactDao {
    @Query("SELECT * FROM ContactUser")
    List<ContactUser> getAll();
    @Insert
    void insertAll(ContactUser... mahSis);
    @Insert
    void insert(ContactUser mahSis);
    @Delete
    void delete(ContactUser mahSis);
    @Update
    void update(ContactUser mahSis);
    @Query("DELETE FROM ContactUser")
    void deleteAll();
}