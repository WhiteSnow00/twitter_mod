// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.sql;

import java.io.IOException;
import com.google.gson.Gson;
import java.util.Date;
import java.sql.Timestamp;
import com.google.gson.TypeAdapter;

class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp>
{
    public static final div b;
    public final TypeAdapter<Date> a;
    
    static {
        b = new div() {
            @Override
            public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
                if (blv.rawType == Timestamp.class) {
                    return (TypeAdapter<T>)new SqlTimestampTypeAdapter(kgi.a(gson, (Class)Date.class), null);
                }
                return null;
            }
        };
    }
    
    public SqlTimestampTypeAdapter(final TypeAdapter a, final SqlTimestampTypeAdapter$1 div) {
        this.a = (TypeAdapter<Date>)a;
    }
    
    public final Object read(final phe phe) throws IOException {
        final Date date = (Date)this.a.read(phe);
        Timestamp timestamp;
        if (date != null) {
            timestamp = new Timestamp(date.getTime());
        }
        else {
            timestamp = null;
        }
        return timestamp;
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        this.a.write(zke, (Object)o);
    }
}
