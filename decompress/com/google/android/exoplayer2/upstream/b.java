// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import android.net.Uri;

public final class b
{
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;
    
    static {
        hga.a("goog.exo.datasource");
    }
    
    public b(final Uri uri) {
        this(uri, 0L, -1L);
    }
    
    public b(final Uri a, final long b, final int c, byte[] d, final Map<String, String> map, final long f, final long g, final String h, final int i, final Object j) {
        final boolean b2 = true;
        omy.g(b + f >= 0L);
        omy.g(f >= 0L);
        boolean b3 = b2;
        if (g <= 0L) {
            b3 = (g == -1L && b2);
        }
        omy.g(b3);
        this.a = a;
        this.b = b;
        this.c = c;
        if (d == null || d.length == 0) {
            d = null;
        }
        this.d = d;
        this.e = Collections.unmodifiableMap((Map<? extends String, ? extends String>)new HashMap<String, String>(map));
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public b(final Uri uri, final long n, final long n2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), n, n2, null, 0, null);
    }
    
    public static String b(final int n) {
        if (n == 1) {
            return "GET";
        }
        if (n == 2) {
            return "POST";
        }
        if (n == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }
    
    public final a a() {
        return new a(this);
    }
    
    public final boolean c(final int n) {
        return (this.i & n) == n;
    }
    
    public final b d(final long n, final long n2) {
        if (n == 0L && this.g == n2) {
            return this;
        }
        return new b(this.a, this.b, this.c, this.d, this.e, this.f + n, n2, this.h, this.i, this.j);
    }
    
    @Override
    public final String toString() {
        final String b = b(this.c);
        final String value = String.valueOf(this.a);
        final long f = this.f;
        final long g = this.g;
        final String h = this.h;
        final int i = this.i;
        final StringBuilder d = x70.D(wnj.f(h, value.length() + (b.length() + 70)), "DataSpec[", b, " ", value);
        e1.C(d, ", ", f, ", ");
        e1.B(d, g, ", ", h);
        d.append(", ");
        d.append(i);
        d.append("]");
        return d.toString();
    }
    
    public static final class a
    {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;
        
        public a(final b b) {
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
        }
        
        public final b a() {
            if (this.a != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }
}
