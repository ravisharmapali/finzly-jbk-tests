package com.finzly.reservation;

public class HotelManagement {
	private Room[] rooms;

//	private static void loadRooms() {
//
//	}

	public HotelManagement() {
		// initially we are taking 5 rooms
		rooms = new Room[5];
		for (int i = 0; i < rooms.length; i++) {

			rooms[i] = new Room(101 + i, 3, 2000 + i * 500);

		}
	}

	public static void main(String[] args) {

		HotelManagement hotel = new HotelManagement();
		hotel.rooms[2].isAvailable();
		hotel.rooms[2].makeReservation(2);
		System.out.println(hotel.rooms[2].isAvailable());
		

		
	}
}
