package com.joeunseo.hotel.model.querydsl.impl;

import com.joeunseo.hotel.model.entity.QTeamEntity;
import com.joeunseo.hotel.model.entity.TeamEntity;
import com.joeunseo.hotel.model.querydsl.TeamQueryDSL;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TeamQueryDSLImpl implements TeamQueryDSL {
    private final JPAQueryFactory jpaQueryFactory;
    private QTeamEntity qTeam = QTeamEntity.teamEntity;

    @Override
    public List<TeamEntity> getList() {
        return List.of();
    }

    @Override
    public TeamEntity getById(Long id) {
        return null;
    }

    @Override
    public Boolean existsTeam(Long id) {
        return jpaQueryFactory.selectFrom(qTeam).where(qTeam.teamId.eq(qTeam.teamId)).fetchCount() > 0;
    }

    @Override
    public Long getRowCount() {
        return jpaQueryFactory.select(qTeam.teamId.count()).from(qTeam).fetchOne();


    }

    @Override
    public Optional<TeamEntity> getByStadium(TeamEntity entity) {
        return Optional.empty();
    }
}
