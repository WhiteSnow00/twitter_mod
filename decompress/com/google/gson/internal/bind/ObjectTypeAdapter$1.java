// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.Gson;

class ObjectTypeAdapter$1 implements div
{
    public final mft D0;
    
    public ObjectTypeAdapter$1(final mft d0) {
        this.D0 = d0;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        if (blv.rawType == Object.class) {
            return (TypeAdapter<T>)new ObjectTypeAdapter(gson, this.D0);
        }
        return null;
    }
}
