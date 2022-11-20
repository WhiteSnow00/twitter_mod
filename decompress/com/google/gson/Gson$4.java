// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

class Gson$4 extends TypeAdapter<AtomicLong>
{
    public final TypeAdapter a;
    
    public Gson$4(final TypeAdapter a) {
        this.a = a;
    }
    
    public final Object read(final phe phe) throws IOException {
        return new AtomicLong(((Number)this.a.read(phe)).longValue());
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        this.a.write(zke, (Object)((AtomicLong)o).get());
    }
}
