package com.team03.issuetracker.milestone.dto;

import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDate;
import lombok.Getter;

@Getter
public class MilestoneData {

	private String title;
	private String description;
	private LocalDate dueDate;
	private Long openIssueCount;
	private Long closedIssueCount;

	@QueryProjection
	public MilestoneData(String title, String description, LocalDate dueDate,
		Long openIssueCount, Long closedIssueCount) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.openIssueCount = openIssueCount;
		this.closedIssueCount = closedIssueCount;
	}
}