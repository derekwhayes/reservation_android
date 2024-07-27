package dev.derekhayes.reservations.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import dev.derekhayes.reservations.model.Reservation;

@Dao
public interface ReservationDao {
    @Query("SELECT * FROM Reservation WHERE reservationID = :id")
    Reservation getReservation(long id);

    @Query("SELECT * FROM Reservation ORDER BY reservationID")
    List<Reservation> getReservations();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addReservation(Reservation reservation);

    @Update
    void updateReservation(Reservation reservation);

    @Delete
    void deleteReservation(Reservation reservation);
}
