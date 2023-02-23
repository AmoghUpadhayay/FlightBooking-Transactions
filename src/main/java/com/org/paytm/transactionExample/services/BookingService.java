package com.org.paytm.transactionExample.services;

import com.org.paytm.transactionExample.datatransferobjects.FlightBookingRequest;
import com.org.paytm.transactionExample.datatransferobjects.FlightBookingResponse;
import com.org.paytm.transactionExample.model.PassengerInfo;
import com.org.paytm.transactionExample.model.PaymentInfo;
import com.org.paytm.transactionExample.repository.PassengerRepo;
import com.org.paytm.transactionExample.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.paytm.transactionExample.utils.PaymentUtils;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class BookingService {
    @Autowired
    private PassengerRepo passengerRepo;
    @Autowired
    private PaymentRepo paymentRepo;

    @Transactional
    public FlightBookingResponse bookFlightTicket(FlightBookingRequest request){
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerRepo.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerInfo(passengerInfo);
        paymentInfo.setAmount(passengerInfo.getFare());

        paymentRepo.save(paymentInfo);

        return new FlightBookingResponse("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString(),passengerInfo);
    }
}
