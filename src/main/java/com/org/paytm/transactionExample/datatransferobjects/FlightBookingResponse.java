package com.org.paytm.transactionExample.datatransferobjects;

import com.org.paytm.transactionExample.model.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingResponse {
    private String status;
    private Double totalFlare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
