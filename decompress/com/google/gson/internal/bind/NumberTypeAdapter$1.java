// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.Gson;

class NumberTypeAdapter$1 implements div
{
    public final NumberTypeAdapter D0;
    
    public NumberTypeAdapter$1(final NumberTypeAdapter d0) {
        this.D0 = d0;
    }
    
    @Override
    public final <T> TypeAdapter<T> create(final Gson gson, final blv<T> blv) {
        Object d0;
        if (blv.rawType == Number.class) {
            d0 = this.D0;
        }
        else {
            d0 = null;
        }
        return (TypeAdapter<T>)d0;
    }
}
