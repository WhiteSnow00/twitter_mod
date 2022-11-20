// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.sql;

import java.io.IOException;
import java.text.ParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Gson;
import java.text.SimpleDateFormat;
import java.sql.Date;
import com.google.gson.TypeAdapter;

final class SqlDateTypeAdapter extends TypeAdapter<Date>
{
    public static final div b;
    public final SimpleDateFormat a;
    
    static {
        b = new div() {
            @Override
            public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
                final Class rawType = blv.rawType;
                Object o = null;
                if (rawType == Date.class) {
                    o = new SqlDateTypeAdapter(null);
                }
                return (TypeAdapter<T>)o;
            }
        };
    }
    
    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
    
    public SqlDateTypeAdapter(final SqlDateTypeAdapter$1 div) {
        this();
    }
    
    public final Object read(phe o) throws IOException {
        if (((phe)o).U2() == 9) {
            ((phe)o).J2();
            o = null;
            return o;
        }
        final String r1 = ((phe)o).R1();
        try {
            synchronized (this) {
                final java.util.Date parse = this.a.parse(r1);
                monitorexit(this);
                o = new Date(parse.getTime());
                return o;
            }
        }
        catch (final ParseException ex) {
            final StringBuilder y = pd.y("Failed parsing '", r1, "' as SQL Date; at path ");
            y.append(((phe)o).j());
            throw new JsonSyntaxException(y.toString(), ex);
        }
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        final Date date = (Date)o;
        if (date == null) {
            zke.j();
            return;
        }
        synchronized (this) {
            final String format = this.a.format(date);
            monitorexit(this);
            zke.O(format);
        }
    }
}
