// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.topicselector;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public final class b
{
    public final List<String> a;
    public final List<String> b;
    public final List<String> c;
    public final List<String> d;
    public final List<String> e;
    public final uv1<List<String>> f;
    public final uv1<List<String>> g;
    public final uv1<List<String>> h;
    public final uv1<List<String>> i;
    public final uv1<String> j;
    public final uv1<Boolean> k;
    public final Map<String, List<String>> l;
    public final Map<String, List<String>> m;
    public final Map<String, ult> n;
    public final Map<String, ilt> o;
    public final bgt p;
    
    public b(final bur bur) {
        this.a = (luh$a)luh.a(0);
        this.b = (luh$a)luh.a(0);
        this.c = (luh$a)luh.a(0);
        this.d = (luh$a)luh.a(0);
        this.e = (luh$a)luh.a(0);
        this.f = (uv1<List<String>>)new uv1();
        this.g = (uv1<List<String>>)new uv1();
        this.h = (uv1<List<String>>)new uv1();
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        this.i = (uv1<List<String>>)uv1.e((Object)g0);
        this.j = (uv1<String>)new uv1();
        this.k = (uv1<Boolean>)uv1.e((Object)Boolean.FALSE);
        this.l = (nuh$a)nuh.a(0);
        this.m = (nuh$a)nuh.a(0);
        final Map a2 = nuh.a(0);
        this.n = (nuh$a)a2;
        final Map a3 = nuh.a(0);
        this.o = (nuh$a)a3;
        final fut fut = (fut)bur;
        final Map<String, ult> l = fut.l;
        final HashMap hashMap = (HashMap)a2;
        hashMap.putAll(l);
        ((HashMap)a3).putAll(fut.m);
        for (final ult ult : hashMap.values()) {
            final ojf h = ojf.H();
            final ojf h2 = ojf.H();
            for (final vlt vlt : ult.c) {
                if (vlt.b == 2) {
                    h2.p((Object)vlt.a);
                }
                else {
                    h.p((Object)vlt.a);
                }
            }
            ((HashMap<String, List>)this.l).put(ult.a, (List)((z4j)h2).e());
            ((HashMap<String, List>)this.m).put(ult.a, (List)((z4j)h).e());
        }
        ((List<Object>)this.a).addAll(fut.k);
        ((List)this.d).clear();
        if (fut.s == 1) {
            if (!kr4.t((Collection)fut.n)) {
                ((List<Object>)this.d).addAll(fut.n);
                final String s = (String)kr4.z((List)fut.n);
                vmw.g((Object)s);
                this.a(s);
            }
            else if (!kr4.t((Collection)fut.k)) {
                this.a(fut.k.get(0));
            }
        }
        this.f.onNext((Object)this.a);
        final mrt o = fut.o;
        if (o != null) {
            ((List<Object>)this.b).addAll(o.a);
        }
        this.g.onNext((Object)this.b);
        final afj f = fut.f;
        final pej a4 = f.a;
        if (a4 == null && f.b == null) {
            this.p = null;
        }
        else {
            this.p = new bgt(a4, f.b);
        }
    }
    
    public static StringBuilder b(final StringBuilder sb, final String s) {
        if (sb.length() != 0) {
            sb.append(",");
        }
        sb.append(s);
        return sb;
    }
    
    public static String c(final String s, final int n, final String s2) {
        final StringBuilder sb = new StringBuilder();
        if (flr.g((CharSequence)s)) {
            sb.append("id=");
            sb.append(s);
        }
        if (n >= 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("row=");
            sb2.append(n);
            b(sb, sb2.toString());
        }
        if (flr.g((CharSequence)s2)) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("location=");
            sb3.append(s2);
            b(sb, sb3.toString());
        }
        return sb.toString();
    }
    
    public final void a(final String s) {
        if (!((List)this.d).contains(s)) {
            ((List<String>)this.d).add(s);
        }
        final List list = ((HashMap<K, List>)this.l).get(s);
        if (!kr4.t((Collection)list)) {
            this.a((String)list.get(0));
        }
    }
    
    public final boolean d(final String s) {
        return ((List)this.d).contains(s);
    }
    
    public static final class a
    {
        public final List<wlt> a;
        
        public a(final List<wlt> a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final List<ort> a;
        
        public b(final List<ort> a) {
            this.a = a;
        }
    }
}
