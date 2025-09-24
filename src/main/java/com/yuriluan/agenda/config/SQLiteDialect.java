package com.yuriluan.agenda.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;
import org.hibernate.dialect.identity.IdentityColumnSupport;
import java.sql.Types;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        registerColumnType(Types.INTEGER, "integer");
        registerColumnType(Types.VARCHAR, "varchar");
        registerColumnType(Types.BLOB, "blob");
        registerColumnType(Types.REAL, "real");
        registerColumnType(Types.DOUBLE, "double");
        registerColumnType(Types.FLOAT, "float");
        registerColumnType(Types.BOOLEAN, "boolean");
    }

    private void registerColumnType(int integer, String integer1) {
    }

    @Override
    public IdentityColumnSupport getIdentityColumnSupport() {
        return new IdentityColumnSupportImpl();
    }

    @Override
    public boolean hasAlterTable() {
        return false;
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

    @Override
    public String getDropForeignKeyString() {
        return "";
    }

    @Override
    public String getAddForeignKeyConstraintString(String constraintName,
                                                   String[] foreignKey,
                                                   String referencedTable,
                                                   String[] primaryKey,
                                                   boolean referencesPrimaryKey) {
        return "";
    }

    @Override
    public String getAddPrimaryKeyConstraintString(String constraintName) {
        return "";
    }
}