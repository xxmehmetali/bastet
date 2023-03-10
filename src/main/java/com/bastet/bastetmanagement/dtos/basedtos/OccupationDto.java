package com.bastet.bastetmanagement.dtos.basedtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OccupationDto {
    private UUID id;

    private String occupation;

    private String detail;

    private Date createdAt;

    private Date updatedAt;

}
