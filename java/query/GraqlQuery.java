/*
 * Copyright (C) 2020 Grakn Labs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package graql.lang.query;

import graql.lang.common.exception.ErrorMessage;
import graql.lang.common.exception.GraqlException;

public abstract class GraqlQuery {

    public GraqlDefine asDefine() {
        if (this instanceof GraqlDefine) {
            return (GraqlDefine) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlDefine.class.getCanonicalName()
            ));
        }
    }

    public GraqlUndefine asUndefine() {
        if (this instanceof GraqlUndefine) {
            return (GraqlUndefine) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlUndefine.class.getCanonicalName()
            ));
        }
    }

    public GraqlInsert asInsert() {
        if (this instanceof GraqlInsert) {
            return (GraqlInsert) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlInsert.class.getCanonicalName()
            ));
        }
    }

    public GraqlDelete asDelete() {
        if (this instanceof GraqlDelete) {
            return (GraqlDelete) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlDelete.class.getCanonicalName()
            ));
        }
    }

    public GraqlMatch asMatch() {
        if (this instanceof GraqlMatch) {
            return (GraqlMatch) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlMatch.class.getCanonicalName()
            ));
        }
    }

    public GraqlMatch.Aggregate asMatchAggregate() {
        if (this instanceof GraqlMatch.Aggregate) {
            return (GraqlMatch.Aggregate) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlMatch.Aggregate.class.getCanonicalName()
            ));
        }
    }

    public GraqlMatch.Group asMatchGroup() {
        if (this instanceof GraqlMatch.Group) {
            return (GraqlMatch.Group) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlMatch.Group.class.getCanonicalName()
            ));
        }
    }

    public GraqlMatch.Group.Aggregate asMatchGroupAggregate() {
        if (this instanceof GraqlMatch.Group.Aggregate) {
            return (GraqlMatch.Group.Aggregate) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlMatch.Group.Aggregate.class.getCanonicalName()
            ));
        }
    }

    public GraqlCompute.Statistics asComputeStatistics() {
        if (this instanceof GraqlCompute.Statistics) {
            return (GraqlCompute.Statistics) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlCompute.Statistics.class.getCanonicalName()
            ));
        }
    }

    public GraqlCompute.Path asComputePath() {
        if (this instanceof GraqlCompute.Path) {
            return (GraqlCompute.Path) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlCompute.Path.class.getCanonicalName()
            ));
        }
    }

    public GraqlCompute.Centrality asComputeCentrality() {
        if (this instanceof GraqlCompute.Centrality) {
            return (GraqlCompute.Centrality) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlCompute.Centrality.class.getCanonicalName()
            ));
        }
    }

    public GraqlCompute.Cluster asComputeCluster() {
        if (this instanceof GraqlCompute.Cluster) {
            return (GraqlCompute.Cluster) this;
        } else {
            throw GraqlException.create(ErrorMessage.INVALID_CAST_EXCEPTION.message(
                    GraqlQuery.class.getCanonicalName(), GraqlCompute.Cluster.class.getCanonicalName()
            ));
        }
    }

    @Override
    public abstract String toString();
}
