/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.Public;
import org.minioasis.library.jooq.tables.records.UserRecord;


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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1516033545;

    /**
     * The reference instance of <code>PUBLIC.USER</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>PUBLIC.USER.USER_ID</code>.
     */
    public final TableField<UserRecord, Long> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.USER.ENABLED</code>.
     */
    public final TableField<UserRecord, Boolean> ENABLED = createField("ENABLED", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.USER.LAST_LOGIN</code>.
     */
    public final TableField<UserRecord, Timestamp> LAST_LOGIN = createField("LAST_LOGIN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>PUBLIC.USER.PASSWORD</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField("PASSWORD", org.jooq.impl.SQLDataType.VARCHAR(90).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.USER.USERNAME</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("USERNAME", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.USER</code> table reference
     */
    public User() {
        this(DSL.name("USER"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.USER</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>PUBLIC.USER</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_27, Indexes.UK_SB8BBOUER5WAK8VYIIY4PF2BX_INDEX_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_27;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.CONSTRAINT_27, Keys.UK_SB8BBOUER5WAK8VYIIY4PF2BX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
