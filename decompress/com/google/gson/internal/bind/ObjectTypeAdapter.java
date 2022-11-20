// 
// Decompiled by Procyon v0.6.0
// 

package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

public final class ObjectTypeAdapter extends TypeAdapter<Object>
{
    public static final div c;
    public final Gson a;
    public final mft b;
    
    static {
        c = new ObjectTypeAdapter$1((mft)lft.D0);
    }
    
    public ObjectTypeAdapter(final Gson a, final mft b) {
        this.a = a;
        this.b = b;
    }
    
    public static div a(final mft mft) {
        if (mft == lft.D0) {
            return ObjectTypeAdapter.c;
        }
        return new ObjectTypeAdapter$1(mft);
    }
    
    public final Object read(final phe phe) throws IOException {
        final int e = ib0.E(phe.U2());
        if (e == 0) {
            final ArrayList list = new ArrayList();
            phe.a();
            while (phe.hasNext()) {
                list.add(this.read(phe));
            }
            phe.e();
            return list;
        }
        if (e == 2) {
            final yhf yhf = new yhf();
            phe.b();
            while (phe.hasNext()) {
                yhf.put(phe.M0(), this.read(phe));
            }
            phe.f();
            return yhf;
        }
        if (e == 5) {
            return phe.R1();
        }
        if (e == 6) {
            return this.b.b(phe);
        }
        if (e == 7) {
            return phe.J1();
        }
        if (e == 8) {
            phe.J2();
            return null;
        }
        throw new IllegalStateException();
    }
    
    public final void write(final zke zke, final Object o) throws IOException {
        if (o == null) {
            zke.j();
            return;
        }
        final TypeAdapter a = kgi.a(this.a, (Class)o.getClass());
        if (a instanceof ObjectTypeAdapter) {
            zke.c();
            zke.f();
            return;
        }
        a.write(zke, o);
    }
}
