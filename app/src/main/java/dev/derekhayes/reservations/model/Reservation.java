package dev.derekhayes.reservations.model;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(foreignKeys = @ForeignKey(entity = Seat.class, parentColumns = "pKey", childColumns = "seatID", onDelete = CASCADE))
public class Reservation {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "reservationID")
    private long mReservationID;

    @ColumnInfo(name = "customerName")
    private String mCustomerName;

    @ColumnInfo(name = "seatID")
    private int mSeatID;

    @ColumnInfo(name = "day")
    private String mDay;

    @ColumnInfo(name = "time")
    private String mTime;

    public Reservation(String mCustomerName, int mSeatID, String mDay, String mTime) {
        this.mCustomerName = mCustomerName;
        this.mSeatID = mSeatID;
        this.mDay = mDay;
        this.mTime = mTime;
    }

    public long getReservationID() {
        return mReservationID;
    }

    public void setReservationID(long mReservationID) {
        this.mReservationID = mReservationID;
    }

    public String getCustomerName() {
        return mCustomerName;
    }

    public void setCustomerName(String mCustomerName) {
        this.mCustomerName = mCustomerName;
    }

    public int getSeatID() {
        return mSeatID;
    }

    public void setSeatID(int mSeatID) {
        this.mSeatID = mSeatID;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String mDay) {
        this.mDay = mDay;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String mTime) {
        this.mTime = mTime;
    }
}
