/*
 * Copyright 2011-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.integration.issues.gh2474;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * @author Stephen Jackson
 */
@RelationshipProperties
public class JobRelationship {
	@Id
	@GeneratedValue
	private Long id;

	@TargetNode
	private PersonModel person;

	private String jobTitle;

	public JobRelationship() {
	}

	public Long getId() {
		return this.id;
	}

	public PersonModel getPerson() {
		return this.person;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerson(PersonModel person) {
		this.person = person;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof JobRelationship)) {
			return false;
		}
		final JobRelationship other = (JobRelationship) o;
		if (!other.canEqual((Object) this)) {
			return false;
		}
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
			return false;
		}
		final Object this$person = this.getPerson();
		final Object other$person = other.getPerson();
		if (this$person == null ? other$person != null : !this$person.equals(other$person)) {
			return false;
		}
		final Object this$jobTitle = this.getJobTitle();
		final Object other$jobTitle = other.getJobTitle();
		if (this$jobTitle == null ? other$jobTitle != null : !this$jobTitle.equals(other$jobTitle)) {
			return false;
		}
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof JobRelationship;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final Object $person = this.getPerson();
		result = result * PRIME + ($person == null ? 43 : $person.hashCode());
		final Object $jobTitle = this.getJobTitle();
		result = result * PRIME + ($jobTitle == null ? 43 : $jobTitle.hashCode());
		return result;
	}

	public String toString() {
		return "JobRelationship(id=" + this.getId() + ", person=" + this.getPerson() + ", jobTitle=" + this.getJobTitle() + ")";
	}
}
