// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;

public final class NumberTypeAdapter extends TypeAdapter<Number>
{
    public static final div b;
    public final mft a;
    
    static {
        b = new NumberTypeAdapter$1(new NumberTypeAdapter((mft)lft.E0));
    }
    
    public NumberTypeAdapter(final mft a) {
        this.a = a;
    }
    
    public static div a(final mft mft) {
        if (mft == lft.E0) {
            return NumberTypeAdapter.b;
        }
        return new NumberTypeAdapter$1(new NumberTypeAdapter(mft));
    }
    
    public final Object read(final phe phe) throws IOException {
        final int u2 = phe.U2();
        final int e = ib0.E(u2);
        Object b;
        if (e != 5 && e != 6) {
            if (e != 8) {
                final StringBuilder j = fu8.j("Expecting number, got: ");
                j.append(x1b.i(u2));
                j.append("; at path ");
                j.append(phe.r());
                throw new JsonSyntaxException(j.toString());
            }
            phe.J2();
            b = null;
        }
        else {
            b = this.a.b(phe);
        }
        return b;
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        zke.N((Number)o);
    }
}
