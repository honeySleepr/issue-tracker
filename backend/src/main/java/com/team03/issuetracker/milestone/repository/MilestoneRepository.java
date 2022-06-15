package com.team03.issuetracker.milestone.repository;

import com.team03.issuetracker.milestone.domain.Milestone;
import com.team03.issuetracker.milestone.repository.custom.MilestoneRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilestoneRepository extends JpaRepository<Milestone, Long>,
	MilestoneRepositoryCustom {

}
