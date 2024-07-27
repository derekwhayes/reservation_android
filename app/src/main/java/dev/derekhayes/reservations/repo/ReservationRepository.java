package dev.derekhayes.reservations.repo;

import android.content.Context;

import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;

import dev.derekhayes.reservations.dao.ReservationDao;
import dev.derekhayes.reservations.dao.SeatDao;
import dev.derekhayes.reservations.model.Reservation;
import dev.derekhayes.reservations.model.Seat;

public class ReservationRepository {

    private static ReservationRepository mReservationsRepo;
    private final ReservationDao mReservationDao;
    private final SeatDao mSeatDao;

    public static ReservationRepository getInstance(Context context) {
        if (mReservationsRepo == null) {
            mReservationsRepo = new ReservationRepository(context);
        }
        return mReservationsRepo;
    }

    private ReservationRepository(Context context) {
        ReservationsDatabase database = Room.databaseBuilder(context, ReservationsDatabase.class, "reservation.db")
                .allowMainThreadQueries()
                .build();

        mReservationDao = database.reservationDao();
        mSeatDao = database.seatDao();

        if (mSeatDao.getSeats().isEmpty()) {
            addStarterData();
        }
    }

    private void addStarterData() {

        Seat seat = new Seat("C1", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("C2", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("C3", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("C4", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("C5", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("C6", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B1", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B2", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B3", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B4", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B5", "Chairs");
        mSeatDao.addSeat(seat);

        seat = new Seat("B6", "Chairs");
        mSeatDao.addSeat(seat);

        Reservation reservation = new Reservation("Clark Kent", 2, "Friday", "5:00");
        mReservationDao.addReservation(reservation);

        reservation = new Reservation("Lois Lane", 8, "Friday", "5:00");
        mReservationDao.addReservation(reservation);
    }

    public void addSeat(Seat seat) {
        long seatId = mSeatDao.addSeat(seat);
        seat.setID(seatId);
    }

    public Seat getSeat(long seatId) {
        return mSeatDao.getSeat(seatId);
    }

    public List<Seat> getSeats() {
        return mSeatDao.getSeats();
    }

    public void updateSeat(Seat seat) {
        mSeatDao.updateSeat(seat);
    }

    public void deleteSeat(Seat seat) {
        mSeatDao.deleteSeat(seat);
    }

    public void addReservation(Reservation reservation) {
        long reservationId = mReservationDao.addReservation(reservation);
        reservation.setReservationID(reservationId);
    }

    public Reservation getReservation(long reservationId) {
        return mReservationDao.getReservation(reservationId);
    }

    public List<Reservation> getReservations() {
        return mReservationDao.getReservations();
    }

    public void updateReservation(Reservation reservation) {
        mReservationDao.updateReservation(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        mReservationDao.deleteReservation(reservation);
    }
}











