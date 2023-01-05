package org.flywaydb.community.database.yandex;

import org.flywaydb.core.internal.database.base.Table;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.SQLException;

public class YandexTable extends Table<YandexDatabase, YandexSchema> {
    /**
     * @param jdbcTemplate The JDBC template for communicating with the DB.
     * @param database     The database-specific support.
     * @param schema       The schema this table lives in.
     * @param name         The name of the table.
     */
    public YandexTable(JdbcTemplate jdbcTemplate, YandexDatabase database, YandexSchema schema, String name) {
        super(jdbcTemplate, database, schema, name);
    }

    @Override
    protected void doDrop() throws SQLException {

    }

    @Override
    protected boolean doExists() throws SQLException {
        return false;
    }

    @Override
    protected void doLock() throws SQLException {

    }
}
