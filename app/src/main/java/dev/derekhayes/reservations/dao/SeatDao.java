package dev.derekhayes.reservations.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import dev.derekhayes.reservations.model.Seat;

@Dao
public interface SeatDao {
    @Query("SELECT * FROM Seat WHERE pKey = :id")
    Seat getSeat(long id);

    @Query("SELECT * FROM Seat ORDER BY pKey")
    List<Seat> getSeats();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addSeat(Seat seat);

    @Update
    void updateSeat(Seat seat);

    @Delete
    void deleteSeat(Seat seat);
}

