/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Location;
import org.minioasis.library.jooq.tables.records.LocationRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LocationDao extends DAOImpl<LocationRecord, org.minioasis.library.jooq.tables.pojos.Location, Long> {

    /**
     * Create a new LocationDao without any configuration
     */
    public LocationDao() {
        super(Location.LOCATION, org.minioasis.library.jooq.tables.pojos.Location.class);
    }

    /**
     * Create a new LocationDao with an attached configuration
     */
    public LocationDao(Configuration configuration) {
        super(Location.LOCATION, org.minioasis.library.jooq.tables.pojos.Location.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Location object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Location> fetchById(Long... values) {
        return fetch(Location.LOCATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Location fetchOneById(Long value) {
        return fetchOne(Location.LOCATION.ID, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Location> fetchByName(String... values) {
        return fetch(Location.LOCATION.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Location fetchOneByName(String value) {
        return fetchOne(Location.LOCATION.NAME, value);
    }
}