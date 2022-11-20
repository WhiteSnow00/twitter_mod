// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

class TypeAdapters$33 implements div
{
    public final Class D0;
    public final Class E0;
    public final TypeAdapter F0;
    
    public TypeAdapters$33(final Class d0, final Class e0, final TypeAdapter f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        final Class rawType = blv.rawType;
        TypeAdapter f0;
        if (rawType != this.D0 && rawType != this.E0) {
            f0 = null;
        }
        else {
            f0 = this.F0;
        }
        return (TypeAdapter<T>)f0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Factory[type=");
        j.append(this.D0.getName());
        j.append("+");
        j.append(this.E0.getName());
        j.append(",adapter=");
        j.append(this.F0);
        j.append("]");
        return j.toString();
    }
}
