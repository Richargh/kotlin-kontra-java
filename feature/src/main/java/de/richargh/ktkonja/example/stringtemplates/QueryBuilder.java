package de.richargh.ktkonja.example.stringtemplates;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// code taken directly from the string template JEP: https://openjdk.org/jeps/459
public record QueryBuilder(Connection conn)
        implements StringTemplate.Processor<PreparedStatement, SQLException> {

    // just for demo purposes. Has obvious production problems.
    public static QueryBuilder DB = new QueryBuilder(null);

    public PreparedStatement process(StringTemplate st) throws SQLException {
        // 1. Replace StringTemplate placeholders with PreparedStatement placeholders
        String query = String.join("?", st.fragments());

        // 2. Create the PreparedStatement on the connection
        PreparedStatement ps = conn.prepareStatement(query);

        // 3. Set parameters of the PreparedStatement
        int index = 1;
        for (Object value : st.values()) {
            switch (value) {
                case Integer i -> ps.setInt(index++, i);
                case Float f   -> ps.setFloat(index++, f);
                case Double d  -> ps.setDouble(index++, d);
                case Boolean b -> ps.setBoolean(index++, b);
                default        -> ps.setString(index++, String.valueOf(value));
            }
        }
        return ps;
    }
}