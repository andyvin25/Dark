package com.marketplace.UserAccountManagement.api;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;

import com.marketplace.UserAccountManagement.domain.Address;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

@RegisterReflectionForBinding
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record UserAddressDto(
        String addressId,
        String recipientName,
        String recipientNumber,
        Address.AddressLabelEnum addressLabel,
        String cityAndSubsidiary,
        String completeAddress,
        Boolean isPicked
) {
}
