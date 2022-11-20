// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson;

import java.io.IOException;

class Gson$3 extends TypeAdapter<Number>
{
    public Gson$3() {
    }
    
    public final Object read(final phe phe) throws IOException {
        Object value;
        if (phe.U2() == 9) {
            phe.J2();
            value = null;
        }
        else {
            value = phe.m3();
        }
        return value;
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        final Number n = (Number)o;
        if (n == null) {
            zke.j();
        }
        else {
            zke.O(n.toString());
        }
    }
}
