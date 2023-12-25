package ru.netology.$Vladislav.controller.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CustomerDTO {
    private int id;
    private String name;
}
