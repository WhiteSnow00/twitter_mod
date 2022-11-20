// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

class TypeAdapters$34 implements div
{
    public final Class D0;
    public final TypeAdapter E0;
    
    public TypeAdapters$34(final Class d0, final TypeAdapter e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final <T2> TypeAdapter<T2> create(final Gson gson, final blv<T2> blv) {
        final Class rawType = blv.rawType;
        if (!this.D0.isAssignableFrom(rawType)) {
            return null;
        }
        return (TypeAdapter<T2>)new TypeAdapter<Object>(this, rawType) {
            public final Class a;
            public final TypeAdapters$34 b;
            
            public final Object read(final phe phe) throws IOException {
                final Object read = this.b.E0.read(phe);
                if (read != null && !this.a.isInstance(read)) {
                    final StringBuilder j = fu8.j("Expected a ");
                    j.append(this.a.getName());
                    j.append(" but was ");
                    j.append(read.getClass().getName());
                    j.append("; at path ");
                    j.append(phe.j());
                    throw new JsonSyntaxException(j.toString());
                }
                return read;
            }
            
            public final void write(final zke zke, final Object o) throws IOException {
                this.b.E0.write(zke, o);
            }
        };
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Factory[typeHierarchy=");
        j.append(this.D0.getName());
        j.append(",adapter=");
        j.append(this.E0);
        j.append("]");
        return j.toString();
    }
}
