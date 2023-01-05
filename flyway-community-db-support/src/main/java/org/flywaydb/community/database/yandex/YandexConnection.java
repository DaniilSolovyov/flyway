package org.flywaydb.community.database.yandex;

import org.flywaydb.core.internal.database.base.Connection;
import org.flywaydb.core.internal.database.base.Schema;

import java.sql.SQLException;

public class YandexConnection extends Connection<YandexDatabase> {
    protected YandexConnection(YandexDatabase database, java.sql.Connection connection) {
        super(database, connection);
    }

    @Override
    protected String getCurrentSchemaNameOrSearchPath() throws SQLException {
        return null;
    }

    @Override
    public Schema getSchema(String name) {
        return null;
    }
}
