package com.finzly.reservation;

import java.util.Date;

public class Room {

	private int roomNumber;
	private int capacity;
	private double pricePerNight;

	// how to provide booking status:
	private boolean isBooked = false;

	public Room(int roomNumber, int capacity, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
	}

	// method to provide availability status
	public boolean isAvailable() {
		if (isBooked)
			return false;
		else
			return true;
	}

	// to reserve without check-in check-out date
	public void makeReservation(int numOfPerson) {
		if (isAvailable() && capacity >= numOfPerson) {
			// proceed to payment etc.
			isBooked = true;
			System.out.println("Room reservation done! ");
			
		} else {
			System.out.println("cant be reserved!");
		}
	}

	// with check-in check-out date
	public void makeReservation(int numOfPerson, Date checkinDate, Date checkoutDate) {
		if (isAvailable() && capacity > numOfPerson) {
			// code to validate date data.
			// proceed to payment etc.
			System.out.println("Room reservation done! ");
		} else {
			System.out.println("cant be reserved!");
		}
	}

	@Override
	public String toString() {
		return "Room Number " + this.roomNumber + " with Capacity " + this.capacity + " price per night "
				+ this.pricePerNight;
	}
}
