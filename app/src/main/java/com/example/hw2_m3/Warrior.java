package com.example.hw2_m3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Warrior implements Parcelable {
    private String name;
    private int health;
    private int damage;

    public Warrior(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    protected Warrior(Parcel in) {
        name = in.readString();
        damage = in.readInt();
        health = in.readInt();
    }

    public static final Creator<Warrior> CREATOR = new Creator<Warrior>() {
        @Override
        public Warrior createFromParcel(Parcel in) {
            return new Warrior(in);
        }

        @Override
        public Warrior[] newArray(int size) {
            return new Warrior[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(damage);
        dest.writeInt(health);
    }
}
