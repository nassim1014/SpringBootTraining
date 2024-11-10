package com.rungroup.web.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.models.Club;
import com.rungroup.web.repository.ClubRepository;
import com.rungroup.web.service.ClubService;

@Service
public class ClubServiceImpl implements ClubService{
    private ClubRepository clubRepository;
    public ClubServiceImpl(ClubRepository ClubRepository) {
        this.clubRepository = clubRepository;
    }
    @Override
    public List<ClubDto> findAllClubs() {
        // TODO Auto-generated method stub
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());

    }
    
    private ClubDto mapToClubDto(Club club){
        ClubDto clubDto = ClubDto.builder()
                            .id(club.getId())
                            .title(club.getTitle())
                            .photoUrl(club.getPhotoUrl())
                            .content(club.getContent())
                            .createdOn(club.getCreatedOn())
                            .updatedOn(club.getUpdatedOn())
                            .build();
        return clubDto;
    }
}
