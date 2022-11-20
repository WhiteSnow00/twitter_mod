// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

class Gson$5 extends TypeAdapter<AtomicLongArray>
{
    public final TypeAdapter a;
    
    public Gson$5(final TypeAdapter a) {
        this.a = a;
    }
    
    public final Object read(final phe phe) throws IOException {
        final ArrayList list = new ArrayList();
        phe.a();
        while (phe.hasNext()) {
            list.add(((Number)this.a.read(phe)).longValue());
        }
        phe.e();
        final int size = list.size();
        final AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; ++i) {
            atomicLongArray.set(i, (long)list.get(i));
        }
        return atomicLongArray;
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        final AtomicLongArray atomicLongArray = (AtomicLongArray)o;
        zke.b();
        for (int length = atomicLongArray.length(), i = 0; i < length; ++i) {
            this.a.write(zke, (Object)atomicLongArray.get(i));
        }
        zke.e();
    }
}
