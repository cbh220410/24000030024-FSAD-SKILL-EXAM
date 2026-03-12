
package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public String addBooking(Booking booking) {
        bookingRepository.save(booking);
        return "Booking Added Successfully";
    }

    @Override
    public String deleteBooking(int id) {
        bookingRepository.deleteById(id);
        return "Booking Deleted Successfully";
    }
}
