package dev.derekhayes.reservations.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Seat {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "pKey")
    private long mID;

    @ColumnInfo(name = "ID")
    private String mTableId;

    @ColumnInfo(name = "type")
    private String mTableType;

    public Seat(String mTableId, String mTableType) {
        this.mTableId = mTableId;
        this.mTableType = mTableType;
    }

    public long getID() {
        return mID;
    }

    public void setID(long mID) {
        this.mID = mID;
    }

    public String getTableId() {
        return mTableId;
    }

    public void setTableId(String mTableId) {
        this.mTableId = mTableId;
    }

    public String getTableType() {
        return mTableType;
    }

    public void setTableType(String mTableType) {
        this.mTableType = mTableType;
    }
}
