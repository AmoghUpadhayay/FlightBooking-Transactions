package com.org.paytm.transactionExample.controllers;

import com.org.paytm.transactionExample.datatransferobjects.FlightBookingRequest;
import com.org.paytm.transactionExample.datatransferobjects.FlightBookingResponse;
import com.org.paytm.transactionExample.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookFlightTicket")
    public ResponseEntity<FlightBookingResponse> bookFlightTicket(@RequestBody FlightBookingRequest request){
        return new ResponseEntity<>(bookingService.bookFlightTicket(request),HttpStatus.CREATED);
    }
}
