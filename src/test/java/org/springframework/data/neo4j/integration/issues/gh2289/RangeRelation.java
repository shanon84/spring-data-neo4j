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
package org.springframework.data.neo4j.integration.issues.gh2289;

import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

/**
 * @author Michael J. Simons
 */
@RelationshipProperties
public class RangeRelation {
	@RelationshipId
	private Long id;

	@Property
	private double minDelta;
	@Property
	private double maxDelta;
	@Property
	private RelationType relationType;

	@TargetNode
	private Sku targetSku;

	public RangeRelation(Sku targetSku, double minDelta, double maxDelta, RelationType relationType) {
		this.targetSku = targetSku;
		this.minDelta = minDelta;
		this.maxDelta = maxDelta;
		this.relationType = relationType;
	}

	public Long getId() {
		return this.id;
	}

	public double getMinDelta() {
		return this.minDelta;
	}

	public double getMaxDelta() {
		return this.maxDelta;
	}

	public RelationType getRelationType() {
		return this.relationType;
	}

	public Sku getTargetSku() {
		return this.targetSku;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinDelta(double minDelta) {
		this.minDelta = minDelta;
	}

	public void setMaxDelta(double maxDelta) {
		this.maxDelta = maxDelta;
	}

	public void setRelationType(RelationType relationType) {
		this.relationType = relationType;
	}

	public void setTargetSku(Sku targetSku) {
		this.targetSku = targetSku;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof RangeRelation)) {
			return false;
		}
		final RangeRelation other = (RangeRelation) o;
		if (!other.canEqual((Object) this)) {
			return false;
		}
		final Object this$id = this.getId();
		final Object other$id = other.getId();
		if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
			return false;
		}
		if (Double.compare(this.getMinDelta(), other.getMinDelta()) != 0) {
			return false;
		}
		if (Double.compare(this.getMaxDelta(), other.getMaxDelta()) != 0) {
			return false;
		}
		final Object this$relationType = this.getRelationType();
		final Object other$relationType = other.getRelationType();
		if (this$relationType == null ? other$relationType != null : !this$relationType.equals(other$relationType)) {
			return false;
		}
		final Object this$targetSku = this.getTargetSku();
		final Object other$targetSku = other.getTargetSku();
		if (this$targetSku == null ? other$targetSku != null : !this$targetSku.equals(other$targetSku)) {
			return false;
		}
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof RangeRelation;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $id = this.getId();
		result = result * PRIME + ($id == null ? 43 : $id.hashCode());
		final long $minDelta = Double.doubleToLongBits(this.getMinDelta());
		result = result * PRIME + (int) ($minDelta >>> 32 ^ $minDelta);
		final long $maxDelta = Double.doubleToLongBits(this.getMaxDelta());
		result = result * PRIME + (int) ($maxDelta >>> 32 ^ $maxDelta);
		final Object $relationType = this.getRelationType();
		result = result * PRIME + ($relationType == null ? 43 : $relationType.hashCode());
		final Object $targetSku = this.getTargetSku();
		result = result * PRIME + ($targetSku == null ? 43 : $targetSku.hashCode());
		return result;
	}

	public String toString() {
		return "RangeRelation(id=" + this.getId() + ", minDelta=" + this.getMinDelta() + ", maxDelta=" + this.getMaxDelta() + ", relationType=" + this.getRelationType() + ", targetSku=" + this.getTargetSku() + ")";
	}
}
