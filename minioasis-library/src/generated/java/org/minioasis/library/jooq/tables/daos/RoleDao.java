/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.minioasis.library.jooq.tables.Role;
import org.minioasis.library.jooq.tables.records.RoleRecord;


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
public class RoleDao extends DAOImpl<RoleRecord, org.minioasis.library.jooq.tables.pojos.Role, Long> {

    /**
     * Create a new RoleDao without any configuration
     */
    public RoleDao() {
        super(Role.ROLE, org.minioasis.library.jooq.tables.pojos.Role.class);
    }

    /**
     * Create a new RoleDao with an attached configuration
     */
    public RoleDao(Configuration configuration) {
        super(Role.ROLE, org.minioasis.library.jooq.tables.pojos.Role.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.minioasis.library.jooq.tables.pojos.Role object) {
        return object.getRoleId();
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Role> fetchByRoleId(Long... values) {
        return fetch(Role.ROLE.ROLE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>ROLE_ID = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Role fetchOneByRoleId(Long value) {
        return fetchOne(Role.ROLE.ROLE_ID, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<org.minioasis.library.jooq.tables.pojos.Role> fetchByName(String... values) {
        return fetch(Role.ROLE.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>NAME = value</code>
     */
    public org.minioasis.library.jooq.tables.pojos.Role fetchOneByName(String value) {
        return fetchOne(Role.ROLE.NAME, value);
    }
}
