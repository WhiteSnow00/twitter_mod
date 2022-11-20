// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.sql;

import java.util.Date;
import java.io.IOException;
import java.text.ParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Gson;
import java.text.SimpleDateFormat;
import java.sql.Time;
import com.google.gson.TypeAdapter;

final class SqlTimeTypeAdapter extends TypeAdapter<Time>
{
    public static final div b;
    public final SimpleDateFormat a;
    
    static {
        b = new div() {
            @Override
            public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
                final Class rawType = blv.rawType;
                Object o = null;
                if (rawType == Time.class) {
                    o = new SqlTimeTypeAdapter(null);
                }
                return (TypeAdapter<T>)o;
            }
        };
    }
    
    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
    
    public SqlTimeTypeAdapter(final SqlTimeTypeAdapter$1 div) {
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
                final Object o2 = new Time(this.a.parse(r1).getTime());
                monitorexit(this);
                o = o2;
                return o;
            }
        }
        catch (final ParseException ex) {
            final StringBuilder y = pd.y("Failed parsing '", r1, "' as SQL Time; at path ");
            y.append(((phe)o).j());
            throw new JsonSyntaxException(y.toString(), ex);
        }
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        final Time time = (Time)o;
        if (time == null) {
            zke.j();
            return;
        }
        synchronized (this) {
            final String format = this.a.format(time);
            monitorexit(this);
            zke.O(format);
        }
    }
}
