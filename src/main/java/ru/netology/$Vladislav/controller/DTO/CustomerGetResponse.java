package ru.netology.$Vladislav.controller.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.$Vladislav.controller.DTO.CustomerDTO;

import java.util.List;

@Data
@AllArgsConstructor
public class CustomerGetResponse {
    private final List<CustomerDTO> clients;
}
