/**
 * Revenue Settlement and Sharing System GE
 * Copyright (C) 2011-2014,  Javier Lucio - lucio@tid.es
 * Telefonica Investigacion y Desarrollo, S.A.
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.tid.fiware.rss.model;

// Generated 24-abr-2012 17:09:13 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BmServiceProductTypeId generated by hbm2java.
 */
@Embeddable
public class BmServiceProductTypeId implements java.io.Serializable {

    private long nuServiceId;
    private long nuServiceProductTypeId;

    /**
     * Constructor.
     */
    public BmServiceProductTypeId() {
    }

    /**
     * Constructor.
     * 
     * @param nuServiceId
     * @param nuServiceProductTypeId
     */
    public BmServiceProductTypeId(long nuServiceId, long nuServiceProductTypeId) {
        this.nuServiceId = nuServiceId;
        this.nuServiceProductTypeId = nuServiceProductTypeId;
    }

    @Column(name = "NU_SERVICE_ID", nullable = false, precision = 10, scale = 0)
    public long getNuServiceId() {
        return this.nuServiceId;
    }

    public void setNuServiceId(long nuServiceId) {
        this.nuServiceId = nuServiceId;
    }

    @Column(name = "NU_SERVICE_PRODUCT_TYPE_ID", nullable = false, precision = 10, scale = 0)
    public long getNuServiceProductTypeId() {
        return this.nuServiceProductTypeId;
    }

    public void setNuServiceProductTypeId(long nuServiceProductTypeId) {
        this.nuServiceProductTypeId = nuServiceProductTypeId;
    }

    /**
     * Overriden.
     * 
     * @param other
     * @return boolean
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof BmServiceProductTypeId)) {
            return false;
        }
        BmServiceProductTypeId castOther = (BmServiceProductTypeId) other;

        return (this.getNuServiceId() == castOther.getNuServiceId())
            && (this.getNuServiceProductTypeId() == castOther.getNuServiceProductTypeId());
    }

    /**
     * Overriden.
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getNuServiceId();
        result = 37 * result + (int) this.getNuServiceProductTypeId();
        return result;
    }

}
