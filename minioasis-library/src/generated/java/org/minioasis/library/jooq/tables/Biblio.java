/*
 * This file is generated by jOOQ.
 */
package org.minioasis.library.jooq.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.minioasis.library.jooq.DefaultSchema;
import org.minioasis.library.jooq.Indexes;
import org.minioasis.library.jooq.Keys;
import org.minioasis.library.jooq.tables.records.BiblioRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Biblio extends TableImpl<BiblioRecord> {

    private static final long serialVersionUID = -1466788855;

    /**
     * The reference instance of <code>BIBLIO</code>
     */
    public static final Biblio BIBLIO = new Biblio();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BiblioRecord> getRecordType() {
        return BiblioRecord.class;
    }

    /**
     * The column <code>BIBLIO.ID</code>.
     */
    public final TableField<BiblioRecord, Long> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>BIBLIO.ACTIVE</code>.
     */
    public final TableField<BiblioRecord, String> ACTIVE = createField(DSL.name("ACTIVE"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * The column <code>BIBLIO.AUTHOR</code>.
     */
    public final TableField<BiblioRecord, String> AUTHOR = createField(DSL.name("AUTHOR"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.BIBLIO_TYPE</code>.
     */
    public final TableField<BiblioRecord, String> BIBLIO_TYPE = createField(DSL.name("BIBLIO_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>BIBLIO.BINDING</code>.
     */
    public final TableField<BiblioRecord, String> BINDING = createField(DSL.name("BINDING"), org.jooq.impl.SQLDataType.CHAR(1), this, "");

    /**
     * The column <code>BIBLIO.CLASS_MARK</code>.
     */
    public final TableField<BiblioRecord, String> CLASS_MARK = createField(DSL.name("CLASS_MARK"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.DESCRIPTION</code>.
     */
    public final TableField<BiblioRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.EDITION</code>.
     */
    public final TableField<BiblioRecord, String> EDITION = createField(DSL.name("EDITION"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.IMAGE_ID</code>.
     */
    public final TableField<BiblioRecord, String> IMAGE_ID = createField(DSL.name("IMAGE_ID"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.ISBN</code>.
     */
    public final TableField<BiblioRecord, String> ISBN = createField(DSL.name("ISBN"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.CODEN</code>.
     */
    public final TableField<BiblioRecord, String> CODEN = createField(DSL.name("CODEN"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.ISSN</code>.
     */
    public final TableField<BiblioRecord, String> ISSN = createField(DSL.name("ISSN"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.PUBLISHING_DATE</code>.
     */
    public final TableField<BiblioRecord, Date> PUBLISHING_DATE = createField(DSL.name("PUBLISHING_DATE"), org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>BIBLIO.VOLUME_NO</code>.
     */
    public final TableField<BiblioRecord, String> VOLUME_NO = createField(DSL.name("VOLUME_NO"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>BIBLIO.LANGUAGE</code>.
     */
    public final TableField<BiblioRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>BIBLIO.NOTE</code>.
     */
    public final TableField<BiblioRecord, String> NOTE = createField(DSL.name("NOTE"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>BIBLIO.PAGES</code>.
     */
    public final TableField<BiblioRecord, Integer> PAGES = createField(DSL.name("PAGES"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>BIBLIO.PUBLICATION_PLACE</code>.
     */
    public final TableField<BiblioRecord, String> PUBLICATION_PLACE = createField(DSL.name("PUBLICATION_PLACE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.PUBLISHING_YEAR</code>.
     */
    public final TableField<BiblioRecord, Integer> PUBLISHING_YEAR = createField(DSL.name("PUBLISHING_YEAR"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>BIBLIO.TOPIC</code>.
     */
    public final TableField<BiblioRecord, String> TOPIC = createField(DSL.name("TOPIC"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>BIBLIO.TITLE</code>.
     */
    public final TableField<BiblioRecord, String> TITLE = createField(DSL.name("TITLE"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>BIBLIO.UPDATED</code>.
     */
    public final TableField<BiblioRecord, Timestamp> UPDATED = createField(DSL.name("UPDATED"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(6), this, "");

    /**
     * The column <code>BIBLIO.PUBLISHER_ID</code>.
     */
    public final TableField<BiblioRecord, Long> PUBLISHER_ID = createField(DSL.name("PUBLISHER_ID"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>BIBLIO.SERIES_ID</code>.
     */
    public final TableField<BiblioRecord, Long> SERIES_ID = createField(DSL.name("SERIES_ID"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>BIBLIO</code> table reference
     */
    public Biblio() {
        this(DSL.name("BIBLIO"), null);
    }

    /**
     * Create an aliased <code>BIBLIO</code> table reference
     */
    public Biblio(String alias) {
        this(DSL.name(alias), BIBLIO);
    }

    /**
     * Create an aliased <code>BIBLIO</code> table reference
     */
    public Biblio(Name alias) {
        this(alias, BIBLIO);
    }

    private Biblio(Name alias, Table<BiblioRecord> aliased) {
        this(alias, aliased, null);
    }

    private Biblio(Name alias, Table<BiblioRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Biblio(Table<O> child, ForeignKey<O, BiblioRecord> key) {
        super(child, key, BIBLIO);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_BIBLIO_PUBLISHER_INDEX_7, Indexes.FK_BIBLIO_SERIES_INDEX_7, Indexes.PRIMARY_KEY_7);
    }

    @Override
    public Identity<BiblioRecord, Long> getIdentity() {
        return Keys.IDENTITY_BIBLIO;
    }

    @Override
    public UniqueKey<BiblioRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    @Override
    public List<UniqueKey<BiblioRecord>> getKeys() {
        return Arrays.<UniqueKey<BiblioRecord>>asList(Keys.CONSTRAINT_7);
    }

    @Override
    public List<ForeignKey<BiblioRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BiblioRecord, ?>>asList(Keys.FK_BIBLIO_PUBLISHER, Keys.FK_BIBLIO_SERIES);
    }

    public Publisher publisher() {
        return new Publisher(this, Keys.FK_BIBLIO_PUBLISHER);
    }

    public Series series() {
        return new Series(this, Keys.FK_BIBLIO_SERIES);
    }

    @Override
    public Biblio as(String alias) {
        return new Biblio(DSL.name(alias), this);
    }

    @Override
    public Biblio as(Name alias) {
        return new Biblio(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Biblio rename(String name) {
        return new Biblio(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Biblio rename(Name name) {
        return new Biblio(name, null);
    }
}
