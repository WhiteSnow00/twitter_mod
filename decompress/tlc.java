import java.util.AbstractMap;
import com.google.android.exoplayer2.source.hls.playlist.c$d;
import java.util.Map;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.source.hls.playlist.c$a;
import android.util.Pair;
import com.google.android.exoplayer2.source.hls.playlist.c;
import java.util.Collections;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.List;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.n;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tlc
{
    public final vlc a;
    public final a b;
    public final a c;
    public final sog d;
    public final Uri[] e;
    public final n[] f;
    public final HlsPlaylistTracker g;
    public final swt h;
    public final List<n> i;
    public final ctb j;
    public final cok k;
    public boolean l;
    public byte[] m;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public tha q;
    public long r;
    public boolean s;
    
    public tlc(final vlc a, final HlsPlaylistTracker g, final Uri[] e, final n[] f, final ulc ulc, final hzt hzt, final sog d, final List<n> i, final cok k) {
        this.a = a;
        this.g = g;
        this.e = e;
        this.f = f;
        this.d = d;
        this.i = i;
        this.k = k;
        this.j = new ctb();
        this.m = rnw.f;
        this.r = -9223372036854775807L;
        final a a2 = ulc.a(1);
        this.b = a2;
        if (hzt != null) {
            a2.g(hzt);
        }
        this.c = ulc.a(3);
        this.h = new swt("", f);
        final ArrayList list = new ArrayList();
        for (int j = 0; j < e.length; ++j) {
            if ((f[j].J0 & 0x4000) == 0x0) {
                list.add(j);
            }
        }
        this.q = (tha)new tlc.tlc$d(this.h, l0e.t(list));
    }
    
    public final gsg[] a(final xlc xlc, final long n) {
        int a;
        if (xlc == null) {
            a = -1;
        }
        else {
            a = this.h.a(((pa4)xlc).d);
        }
        final int length = ((xwt)this.q).length();
        final gsg[] array = new gsg[length];
        for (int i = 0; i < length; ++i) {
            final int j = ((xwt)this.q).i(i);
            final Uri uri = this.e[j];
            if (!this.g.j(uri)) {
                array[i] = (gsg)gsg.a;
            }
            else {
                final c o = this.g.o(uri, false);
                Objects.requireNonNull(o);
                final long n2 = o.h - this.g.d();
                final Pair<Long, Integer> c = this.c(xlc, j != a, o, n2, n);
                final long longValue = (long)c.first;
                final int intValue = (int)c.second;
                final int n3 = (int)(longValue - o.k);
                List<Object> list2;
                if (n3 >= 0 && o.r.size() >= n3) {
                    final ArrayList<Object> list = new ArrayList<Object>();
                    int n4 = intValue;
                    if (n3 < o.r.size()) {
                        int n5 = n3;
                        if (intValue != -1) {
                            final c$c c$c = (c$c)o.r.get(n3);
                            if (intValue == 0) {
                                list.add(c$c);
                            }
                            else if (intValue < c$c.R0.size()) {
                                final eed r0 = c$c.R0;
                                list.addAll(r0.subList(intValue, r0.size()));
                            }
                            n5 = n3 + 1;
                        }
                        final eed r2 = o.r;
                        list.addAll(r2.subList(n5, r2.size()));
                        n4 = 0;
                    }
                    if (o.n != -9223372036854775807L) {
                        int n6;
                        if ((n6 = n4) == -1) {
                            n6 = 0;
                        }
                        if (n6 < o.s.size()) {
                            final eed s = o.s;
                            list.addAll(s.subList(n6, s.size()));
                        }
                    }
                    list2 = Collections.unmodifiableList((List<?>)list);
                }
                else {
                    final eed.b g0 = eed.G0;
                    list2 = nbm.J0;
                }
                array[i] = (gsg)new tlc.tlc$c(n2, (List)list2);
            }
        }
        return array;
    }
    
    public final int b(final xlc xlc) {
        final int o = xlc.o;
        int n = 1;
        if (o == -1) {
            return 1;
        }
        final c o2 = this.g.o(this.e[this.h.a(((pa4)xlc).d)], false);
        Objects.requireNonNull(o2);
        final int n2 = (int)(((fsg)xlc).j - o2.k);
        if (n2 < 0) {
            return 1;
        }
        eed eed;
        if (n2 < o2.r.size()) {
            eed = ((c$c)o2.r.get(n2)).R0;
        }
        else {
            eed = o2.s;
        }
        if (xlc.o >= eed.size()) {
            return 2;
        }
        final c$a c$a = (c$a)eed.get(xlc.o);
        if (c$a.R0) {
            return 0;
        }
        if (!rnw.a((Object)Uri.parse(n6w.c(o2.a, ((c$d)c$a).F0)), (Object)((pa4)xlc).b.a)) {
            n = 2;
        }
        return n;
    }
    
    public final Pair<Long, Integer> c(final xlc xlc, final boolean b, final c c, long j, long n) {
        final boolean b2 = true;
        int n2 = -1;
        if (xlc != null && !b) {
            Pair pair;
            if (xlc.H) {
                if (xlc.o == -1) {
                    n = ((fsg)xlc).j;
                    j = -1L;
                    if (n != -1L) {
                        j = n + 1L;
                    }
                }
                else {
                    j = ((fsg)xlc).j;
                }
                final int o = xlc.o;
                if (o != -1) {
                    n2 = o + 1;
                }
                pair = new Pair((Object)j, (Object)n2);
            }
            else {
                pair = new Pair((Object)((fsg)xlc).j, (Object)xlc.o);
            }
            return (Pair<Long, Integer>)pair;
        }
        final long u = c.u;
        if (xlc != null) {
            if (!this.p) {
                n = ((pa4)xlc).g;
            }
        }
        if (!c.o && n >= j + u) {
            return (Pair<Long, Integer>)new Pair((Object)(c.k + c.r.size()), (Object)(-1));
        }
        final long n3 = n - j;
        final eed r = c.r;
        final boolean k = this.g.k();
        int n4 = 0;
        boolean b3 = b2;
        if (k) {
            b3 = (xlc == null && b2);
        }
        final int d = rnw.d((List)r, (Comparable)n3, b3);
        n = d + c.k;
        int n5 = n2;
        j = n;
        if (d >= 0) {
            final c$c c$c = (c$c)c.r.get(d);
            eed eed;
            if (n3 < ((c$d)c$c).J0 + ((c$d)c$c).H0) {
                eed = c$c.R0;
            }
            else {
                eed = c.s;
            }
            while (true) {
                n5 = n2;
                j = n;
                if (n4 >= eed.size()) {
                    break;
                }
                final c$a c$a = (c$a)eed.get(n4);
                if (n3 < ((c$d)c$a).J0 + ((c$d)c$a).H0) {
                    n5 = n2;
                    j = n;
                    if (c$a.Q0) {
                        if (eed == c.s) {
                            j = 1L;
                        }
                        else {
                            j = 0L;
                        }
                        j += n;
                        n5 = n4;
                        break;
                    }
                    break;
                }
                else {
                    ++n4;
                }
            }
        }
        return (Pair<Long, Integer>)new Pair((Object)j, (Object)n5);
    }
    
    public final pa4 d(final Uri uri, final int n) {
        if (uri == null) {
            return null;
        }
        final byte[] array = ((AbstractMap<K, byte[]>)this.j.a).remove(uri);
        if (array != null) {
            final byte[] array2 = ((AbstractMap<Uri, byte[]>)this.j.a).put(uri, array);
            return null;
        }
        return (pa4)new tlc.tlc$a(this.c, new com.google.android.exoplayer2.upstream.b(uri, 0L, 1, (byte[])null, (Map)Collections.emptyMap(), 0L, -1L, (String)null, 1, (Object)null), this.f[n], this.q.s(), this.q.k(), this.m);
    }
    
    public static final class b
    {
        public pa4 a;
        public boolean b;
        public Uri c;
        
        public b() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }
    
    public static final class e
    {
        public final c$d a;
        public final long b;
        public final int c;
        public final boolean d;
        
        public e(final c$d a, final long b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (a instanceof c$a && ((c$a)a).R0);
        }
    }
}
