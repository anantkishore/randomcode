package com.kishore.anant.meesho;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;


interface TheatreAPI {

    /*
    returns unique theatre id and city name
     */
    public Pair<Long, String> getTheatreInfo();

    /*
    returns list of all running shows for today
     */
    List<Long> getAllShowsForToday();

    /*
    Given a show id returns list of empty seats at the moment
     */
    List<Long> getAvailableSeats(Long showId);

    /*
    Given a show id and list of seats, book seats if available
     */
    Boolean bookSeats(Long showId, List<Long> seats);
}

interface BookingAggregator {
    /*
    Onboard a theatre
     */
    void onBoardTheatre(Theatre theatre);

    /*
    create a new user on the platform
     */
    Long createUser(String name, String phoneNumber);

    /*
    returns list of theatres for a given city
     */
    Map<Long, List<Long>> getTheatresAndShowsRunningInACity(String city);

    /*
    Return list of seat numbers which are vacant
     */
    List<Long> getSeatsAvailability(Long theatreId, Long showId);

    /*
    API takes theatreId, showId, userId and seat numbers as parameters and tries to book the seats requested
    Returns bookingId if successfully booked else returns null
     */
    Long bookShow(Long theatreId, Long showId, Long userId, List<Long> seatNumbers);

    /*
    return all bookingIds the given user has booked
     */
    List<Long> getAllBookingsOfUser(Long userId);
}

class Pair<Long, String> {
    Long id;
    String text;

    public Pair(String textParam) {
        this.id = (Long) AutoIncrementGenerator.getNextId();
        this.text = textParam;
    }
}

class Constants {
    public static final String USERNAME1 = "user1";
    public static final String PHONENUMBER1 = "928";
    public static final String USERNAME2 = "userName2";
    public static final String PHONENUMBER2 = "987";
    public static final String CITY = "delhi";
}

class AutoIncrementGenerator {

    static AtomicLong id = new AtomicLong(1L);

    public static Long getNextId() {
        return id.getAndIncrement();
    }

}

class Theatre implements TheatreAPI {

    Long id;

    public Theatre() {
        this.id = AutoIncrementGenerator.getNextId();
    }

    public Pair<Long, String> getTheatreInfo() {
        return new Pair<>("");
    }

    public List<Long> getAllShowsForToday() {
        return new ArrayList<Long>();
    }

    public List<Long> getAvailableSeats(Long showId) {
        return new ArrayList<Long>();
    }

    public Boolean bookSeats(Long showId, List<Long> seats) {
        return false;
    }

}

class Aggregator implements BookingAggregator {

    @Override
    public void onBoardTheatre(Theatre theatre) {
        // TODO document why this method is empty
    }

    @Override
    public Long createUser(String name, String phoneNumber) {
        return null;
    }

    @Override
    public Map<Long, List<Long>> getTheatresAndShowsRunningInACity(String city) {
        return null;
    }

    @Override
    public List<Long> getSeatsAvailability(Long theatreId, Long showId) {
        return null;
    }

    @Override
    public Long bookShow(Long theatreId, Long showId, Long userId, List<Long> seatNumbers) {
        return null;
    }

    @Override
    public List<Long> getAllBookingsOfUser(Long userId) {
        return null;
    }
}


class TicketBookingSystemApplication {

    public static void main(String[] args) {
        // initialize booking agg
        BookingAggregator bookingAggregator = new Aggregator(); // update this
        //initialize theatre and onboard
        bookingAggregator.onBoardTheatre(new Theatre()); // update this
        Map<Long, List<Long>> theatresAndShowsMap = bookingAggregator.getTheatresAndShowsRunningInACity(Constants.CITY);

        executeTests(bookingAggregator, theatresAndShowsMap);
    }

    public static void executeTests(BookingAggregator bookingAggregator, Map<Long, List<Long>> theatreAndShowsMap) {
        Long userId1 = bookingAggregator.createUser(Constants.USERNAME1, Constants.PHONENUMBER1);

        // User should not be able to register using existing phone no
        System.out.printf("Test case 1 : %s%n",
                Objects.isNull(bookingAggregator.createUser(Constants.USERNAME2, Constants.PHONENUMBER2)) ? "pass" : "fail");

        // User should be able to register
        Long userId2 = bookingAggregator.createUser(Constants.USERNAME2, Constants.PHONENUMBER2);
        System.out.printf("Test case 2 : %s%n", Objects.nonNull(userId2) ? "pass" : "fail");

        // get theatre, shows and seats information
        Map.Entry<Long, List<Long>> entry = theatreAndShowsMap.entrySet().iterator().next();
        Long theatreId = entry.getKey();
        Long showId = entry.getValue().get(0);
        List<Long> seats = bookingAggregator.getSeatsAvailability(theatreId, showId);

        // book first two seats
        Long user1BookingId1 = bookingAggregator.bookShow(theatreId, showId, userId1, seats.subList(0, 2));
        System.out.printf("Test case 3 : %s%n", Objects.nonNull(user1BookingId1) ? "pass" : "fail");

        // user2 tries to book same seats - should fail
        Long failedBooking1 = bookingAggregator.bookShow(theatreId, showId, userId2, seats.subList(0, 2));
        System.out.printf("Test case 4 : %s%n", Objects.isNull(failedBooking1) ? "pass" : "fail");
        Long failedBooking2 = bookingAggregator.bookShow(theatreId, showId, userId2, seats.subList(1, 3));
        System.out.printf("Test case 5 : %s%n", Objects.isNull(failedBooking2) ? "pass" : "fail");

        // user2 tries to book different seats - should be success
        Long user2BookingId1 = bookingAggregator.bookShow(theatreId, showId, userId2, seats.subList(2, 4));
        System.out.printf("Test case 6 : %s%n", Objects.nonNull(user2BookingId1) ? "pass" : "fail");

        /*// bookingId should exist in bookings of user1
        List<Long> allBookingsOfUser1 = bookingAggregator.getAllBookingsOfUser(userId1);
        System.out.printf("Test case 7: %s%n", allBookingsOfUser1.contains(user1BookingId1) ? "pass": "fail");

        // bookingId should exist in bookings of user2
        List<Long> allBookingsOfUser2 = bookingAggregator.getAllBookingsOfUser(userId2);
        System.out.printf("Test case 8: %s%n", allBookingsOfUser2.contains(user2BookingId1) ? "pass": "fail");

        // user2BookingId should not exist in bookings of user1
        System.out.printf("Test case 9: %s%n", allBookingsOfUser1.contains(user2BookingId1) ? "fail": "pass");*/
    }

}