package dev.derekhayes.reservations.repo;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import dev.derekhayes.reservations.dao.ReservationDao;
import dev.derekhayes.reservations.dao.SeatDao;
import dev.derekhayes.reservations.model.Reservation;
import dev.derekhayes.reservations.model.Seat;

@Database(entities = {Reservation.class, Seat.class}, version = 1)
public abstract class ReservationsDatabase extends RoomDatabase {

    public abstract ReservationDao reservationDao();
    public abstract SeatDao seatDao();
}
