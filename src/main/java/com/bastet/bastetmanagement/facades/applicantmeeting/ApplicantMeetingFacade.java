package com.bastet.bastetmanagement.facades.applicantmeeting;

import com.bastet.bastetmanagement.dtos.basedtos.ApplicantMeetingDto;
import com.bastet.bastetmanagement.dtos.simplifieddtos.ApplicantMeetingSimplifiedDto;
import com.bastet.bastetmanagement.models.ApplicantMeeting;

import java.util.UUID;

public interface ApplicantMeetingFacade {
    ApplicantMeetingDto findById(UUID id);
    ApplicantMeetingSimplifiedDto findByIdSimplified(UUID id);
}
