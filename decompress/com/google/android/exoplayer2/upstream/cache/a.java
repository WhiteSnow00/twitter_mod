// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream.cache;

import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.io.IOException;
import java.util.Map;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.b;
import android.net.Uri;

public final class a implements com.google.android.exoplayer2.upstream.a
{
    public final Cache a;
    public final com.google.android.exoplayer2.upstream.a b;
    public final scs c;
    public final com.google.android.exoplayer2.upstream.a d;
    public final t73 e;
    public final a.a$a f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public Uri j;
    public b k;
    public b l;
    public com.google.android.exoplayer2.upstream.a m;
    public long n;
    public long o;
    public long p;
    public z73 q;
    public boolean r;
    public boolean s;
    public long t;
    public long u;
    
    public a(final Cache a, final com.google.android.exoplayer2.upstream.a d, final com.google.android.exoplayer2.upstream.a b, final e88 e88, t73 p7, final int n, final a.a$a f) {
        this.a = a;
        this.b = b;
        if (p7 == null) {
            p7 = (t73)t73.p;
        }
        this.e = p7;
        final boolean b2 = false;
        this.g = ((n & 0x1) != 0x0);
        this.h = ((n & 0x2) != 0x0);
        boolean i = b2;
        if ((n & 0x4) != 0x0) {
            i = true;
        }
        this.i = i;
        scs c = null;
        if (d != null) {
            this.d = d;
            if (e88 != null) {
                c = new scs(d, e88);
            }
            this.c = c;
        }
        else {
            this.d = (com.google.android.exoplayer2.upstream.a)com.google.android.exoplayer2.upstream.g.a;
            this.c = null;
        }
        this.f = f;
    }
    
    public final long a(final b b) throws IOException {
        try {
            final String b2 = ((p71)this.e).b(b);
            final Uri a = b.a;
            final long b3 = b.b;
            final int c = b.c;
            final byte[] d = b.d;
            final Map e = b.e;
            final long f = b.f;
            final long g = b.g;
            final int i = b.i;
            final Object j = b.j;
            if (a != null) {
                final b k = new b(a, b3, c, d, e, f, g, b2, i, j);
                this.k = k;
                final Cache a2 = this.a;
                Uri a3 = k.a;
                final byte[] array = ((ig8)a2.c(b2)).b.get("exo_redir");
                final Uri uri = null;
                String s;
                if (array != null) {
                    s = new String(array, au3.c);
                }
                else {
                    s = null;
                }
                Uri parse;
                if (s == null) {
                    parse = uri;
                }
                else {
                    parse = Uri.parse(s);
                }
                if (parse != null) {
                    a3 = parse;
                }
                this.j = a3;
                this.o = b.f;
                final boolean h = this.h;
                boolean s2 = true;
                int n;
                if (h && this.r) {
                    n = 0;
                }
                else if (this.i && b.g == -1L) {
                    n = 1;
                }
                else {
                    n = -1;
                }
                if (n == -1) {
                    s2 = false;
                }
                this.s = s2;
                if (s2) {
                    final a.a$a f2 = this.f;
                    if (f2 != null) {
                        f2.a();
                    }
                }
                if (this.s) {
                    this.p = -1L;
                }
                else {
                    final long e2 = cj2.e(this.a.c(b2));
                    this.p = e2;
                    if (e2 != -1L) {
                        final long p = e2 - b.f;
                        this.p = p;
                        if (p < 0L) {
                            throw new DataSourceException(2008);
                        }
                    }
                }
                long p2 = b.g;
                if (p2 != -1L) {
                    final long p3 = this.p;
                    if (p3 != -1L) {
                        p2 = Math.min(p3, p2);
                    }
                    this.p = p2;
                }
                final long p4 = this.p;
                if (p4 > 0L || p4 == -1L) {
                    this.t(k, false);
                }
                long n2 = b.g;
                if (n2 == -1L) {
                    n2 = this.p;
                }
                return n2;
            }
            throw new IllegalStateException("The uri must be set.");
        }
        finally {
            final Throwable t;
            this.q(t);
        }
    }
    
    public final int b(final byte[] array, int n, final int n2) throws IOException {
        final int n3 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (this.p == 0L) {
            return -1;
        }
        final b k = this.k;
        Objects.requireNonNull(k);
        final b l = this.l;
        Objects.requireNonNull(l);
        try {
            if (this.o >= this.u) {
                this.t(k, true);
            }
            final com.google.android.exoplayer2.upstream.a m = this.m;
            Objects.requireNonNull(m);
            final int b = ((v78)m).b(array, n, n2);
            if (b != -1) {
                if (this.r()) {
                    this.t += b;
                }
                final long o = this.o;
                final long n4 = b;
                this.o = o + n4;
                this.n += n4;
                final long p3 = this.p;
                if (p3 != -1L) {
                    this.p = p3 - n4;
                }
            }
            else {
                if (this.s()) {
                    final long g = l.g;
                    if (g == -1L || this.n < g) {
                        final String h = k.h;
                        n = imw.a;
                        this.p = 0L;
                        n = n3;
                        if (this.m == this.c) {
                            n = 1;
                        }
                        if (n != 0) {
                            final mm6 mm6 = new mm6();
                            mm6.b(mm6, this.o);
                            this.a.q(h, mm6);
                            return b;
                        }
                        return b;
                    }
                }
                final long p4 = this.p;
                if (p4 > 0L || p4 == -1L) {
                    this.p();
                    this.t(k, false);
                    n = this.b(array, n, n2);
                    return n;
                }
            }
            return b;
        }
        finally {
            final Throwable t;
            this.q(t);
        }
    }
    
    public final void close() throws IOException {
        this.k = null;
        this.j = null;
        this.o = 0L;
        final a.a$a f = this.f;
        if (f != null && this.t > 0L) {
            this.a.j();
            f.b(this.t);
            this.t = 0L;
        }
        try {
            this.p();
        }
        finally {
            final Throwable t;
            this.q(t);
        }
    }
    
    public final Map<String, List<String>> d() {
        Map<Object, Object> map;
        if (this.s()) {
            map = this.d.d();
        }
        else {
            map = Collections.emptyMap();
        }
        return (Map<String, List<String>>)map;
    }
    
    public final void g(final zxt zxt) {
        Objects.requireNonNull(zxt);
        this.b.g(zxt);
        this.d.g(zxt);
    }
    
    public final Uri m() {
        return this.j;
    }
    
    public final void p() throws IOException {
        final com.google.android.exoplayer2.upstream.a m = this.m;
        if (m == null) {
            return;
        }
        try {
            m.close();
        }
        finally {
            this.l = null;
            this.m = null;
            final z73 q = this.q;
            if (q != null) {
                this.a.d(q);
                this.q = null;
            }
        }
    }
    
    public final void q(final Throwable t) {
        if (this.r() || t instanceof Cache$CacheException) {
            this.r = true;
        }
    }
    
    public final boolean r() {
        return this.m == this.b;
    }
    
    public final boolean s() {
        return this.r() ^ true;
    }
    
    public final void t(final b b, final boolean b2) throws IOException {
        final String h = b.h;
        final int a = imw.a;
        z73 z73 = null;
        Label_0088: {
            if (this.s) {
                z73 = null;
            }
            else {
                if (this.g) {
                    try {
                        z73 = this.a.n(h, this.o, this.p);
                        break Label_0088;
                    }
                    catch (final InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                z73 = this.a.f(h, this.o, this.p);
            }
        }
        Object m = null;
        b l2 = null;
        z73 q = null;
        Label_0572: {
            b b4;
            if (z73 == null) {
                m = this.d;
                final Uri a2 = b.a;
                final long b3 = b.b;
                final int c = b.c;
                final byte[] d = b.d;
                final Map e = b.e;
                final String h2 = b.h;
                final int i = b.i;
                final Object j = b.j;
                final long o = this.o;
                final long p2 = this.p;
                if (a2 == null) {
                    throw new IllegalStateException("The uri must be set.");
                }
                b4 = new b(a2, b3, c, d, e, o, p2, h2, i, j);
            }
            else if (z73.F0) {
                final Uri fromFile = Uri.fromFile(z73.G0);
                final long d2 = z73.D0;
                final long n = this.o - d2;
                final long n2 = z73.E0 - n;
                final long p3 = this.p;
                long min = n2;
                if (p3 != -1L) {
                    min = Math.min(n2, p3);
                }
                final int c2 = b.c;
                final byte[] d3 = b.d;
                final Map e2 = b.e;
                final String h3 = b.h;
                final int k = b.i;
                final Object l = b.j;
                if (fromFile == null) {
                    throw new IllegalStateException("The uri must be set.");
                }
                b4 = new b(fromFile, d2, c2, d3, e2, n, min, h3, k, l);
                m = this.b;
            }
            else {
                final long e3 = z73.E0;
                long n3;
                if (e3 == -1L) {
                    n3 = this.p;
                }
                else {
                    final long p4 = this.p;
                    n3 = e3;
                    if (p4 != -1L) {
                        n3 = Math.min(e3, p4);
                    }
                }
                final Uri a3 = b.a;
                final long b5 = b.b;
                final int c3 = b.c;
                final byte[] d4 = b.d;
                final Map e4 = b.e;
                final String h4 = b.h;
                final int i2 = b.i;
                final Object j2 = b.j;
                final long o2 = this.o;
                if (a3 == null) {
                    throw new IllegalStateException("The uri must be set.");
                }
                b4 = new b(a3, b5, c3, d4, e4, o2, n3, h4, i2, j2);
                m = this.c;
                if (m == null) {
                    m = this.d;
                    this.a.d(z73);
                    l2 = b4;
                    q = null;
                    break Label_0572;
                }
            }
            final b b6 = b4;
            q = z73;
            l2 = b6;
        }
        long u;
        if (!this.s && m == this.d) {
            u = this.o + 102400L;
        }
        else {
            u = Long.MAX_VALUE;
        }
        this.u = u;
        if (b2) {
            ri4.t(this.m == this.d);
            if (m == this.d) {
                return;
            }
            try {
                this.p();
            }
            finally {
                if (q.F0 ^ true) {
                    this.a.d(q);
                }
            }
        }
        if (q != null && (q.F0 ^ true)) {
            this.q = q;
        }
        this.m = (com.google.android.exoplayer2.upstream.a)m;
        this.l = l2;
        this.n = 0L;
        final long a4 = ((com.google.android.exoplayer2.upstream.a)m).a(l2);
        final mm6 mm6 = new mm6();
        if (l2.g == -1L && a4 != -1L) {
            this.p = a4;
            mm6.b(mm6, this.o + a4);
        }
        if (this.s()) {
            final Uri m2 = ((com.google.android.exoplayer2.upstream.a)m).m();
            this.j = m2;
            Uri j3;
            if (b.a.equals((Object)m2) ^ true) {
                j3 = this.j;
            }
            else {
                j3 = null;
            }
            if (j3 == null) {
                mm6.b.add("exo_redir");
                mm6.a.remove("exo_redir");
            }
            else {
                mm6.a("exo_redir", j3.toString());
            }
        }
        if (this.m == this.c) {
            this.a.q(h, mm6);
        }
    }
}
