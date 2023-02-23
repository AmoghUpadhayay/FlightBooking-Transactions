package com.org.paytm.transactionExample.datatransferobjects;

import com.org.paytm.transactionExample.model.PassengerInfo;
import com.org.paytm.transactionExample.model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
