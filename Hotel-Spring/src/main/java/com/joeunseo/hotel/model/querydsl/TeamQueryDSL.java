package com.joeunseo.hotel.model.querydsl;

import com.joeunseo.hotel.model.entity.TeamEntity;

import java.util.List;
import java.util.Optional;

public interface TeamQueryDSL {
    List<TeamEntity> getList();
    TeamEntity getById(Long id);
    Boolean existsTeam(Long id);
    Long getRowCount();
    Optional<TeamEntity> getByStadium(TeamEntity entity);
}
