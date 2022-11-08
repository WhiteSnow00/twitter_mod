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
    public final zng d;
    public final Uri[] e;
    public final n[] f;
    public final HlsPlaylistTracker g;
    public final lvt h;
    public final List<n> i;
    public final btb j;
    public final hnk k;
    public boolean l;
    public byte[] m;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public hha q;
    public long r;
    public boolean s;
    
    public tlc(final vlc a, final HlsPlaylistTracker g, final Uri[] e, final n[] f, final ulc ulc, final zxt zxt, final zng d, final List<n> i, final hnk k) {
        this.a = a;
        this.g = g;
        this.e = e;
        this.f = f;
        this.d = d;
        this.i = i;
        this.k = k;
        this.j = new btb();
        this.m = imw.f;
        this.r = -9223372036854775807L;
        final a a2 = ulc.a(1);
        this.b = a2;
        if (zxt != null) {
            a2.g(zxt);
        }
        this.c = ulc.a(3);
        this.h = new lvt("", f);
        final ArrayList list = new ArrayList();
        for (int j = 0; j < e.length; ++j) {
            if ((f[j].G0 & 0x4000) == 0x0) {
                list.add(j);
            }
        }
        this.q = (hha)new tlc.tlc$d(this.h, g0e.t((Collection)list));
    }
    
    public final org[] a(final xlc xlc, final long n) {
        int a;
        if (xlc == null) {
            a = -1;
        }
        else {
            a = this.h.a(((ia4)xlc).d);
        }
        final int length = ((qvt)this.q).length();
        final org[] array = new org[length];
        for (int i = 0; i < length; ++i) {
            final int j = ((qvt)this.q).i(i);
            final Uri uri = this.e[j];
            if (!this.g.h(uri)) {
                array[i] = (org)org.a;
            }
            else {
                final c o = this.g.o(uri, false);
                Objects.requireNonNull(o);
                final long n2 = o.h - this.g.d();
                final Pair<Long, Integer> c = this.c(xlc, j != a, o, n2, n);
                final long longValue = (long)c.first;
                final int intValue = (int)c.second;
                final int n3 = (int)(longValue - o.k);
                Object o3;
                if (n3 >= 0 && ((List)o.r).size() >= n3) {
                    final ArrayList<Object> list = new ArrayList<Object>();
                    int n4 = intValue;
                    if (n3 < ((List)o.r).size()) {
                        int n5 = n3;
                        if (intValue != -1) {
                            final c$c c$c = ((List<c$c>)o.r).get(n3);
                            if (intValue == 0) {
                                list.add(c$c);
                            }
                            else if (intValue < ((List)c$c.O0).size()) {
                                final aed o2 = c$c.O0;
                                list.addAll(((List)o2).subList(intValue, ((List)o2).size()));
                            }
                            n5 = n3 + 1;
                        }
                        final aed r = o.r;
                        list.addAll(((List)r).subList(n5, ((List)r).size()));
                        n4 = 0;
                    }
                    if (o.n != -9223372036854775807L) {
                        int n6;
                        if ((n6 = n4) == -1) {
                            n6 = 0;
                        }
                        if (n6 < ((List)o.s).size()) {
                            final aed s = o.s;
                            list.addAll(((List)s).subList(n6, ((List)s).size()));
                        }
                    }
                    o3 = Collections.unmodifiableList((List<?>)list);
                }
                else {
                    final aed$b d0 = aed.D0;
                    o3 = lam.G0;
                }
                array[i] = (org)new tlc.tlc$c(n2, (List)o3);
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
        final c o2 = this.g.o(this.e[this.h.a(((ia4)xlc).d)], false);
        Objects.requireNonNull(o2);
        final int n2 = (int)(((nrg)xlc).j - o2.k);
        if (n2 < 0) {
            return 1;
        }
        aed aed;
        if (n2 < ((List)o2.r).size()) {
            aed = ((List<c$c>)o2.r).get(n2).O0;
        }
        else {
            aed = o2.s;
        }
        if (xlc.o >= ((List)aed).size()) {
            return 2;
        }
        final c$a c$a = (c$a)((List)aed).get(xlc.o);
        if (c$a.O0) {
            return 0;
        }
        if (!imw.a((Object)Uri.parse(n5w.c(o2.a, ((c$d)c$a).C0)), (Object)((ia4)xlc).b.a)) {
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
                    n = ((nrg)xlc).j;
                    j = -1L;
                    if (n != -1L) {
                        j = n + 1L;
                    }
                }
                else {
                    j = ((nrg)xlc).j;
                }
                final int o = xlc.o;
                if (o != -1) {
                    n2 = o + 1;
                }
                pair = new Pair((Object)j, (Object)n2);
            }
            else {
                pair = new Pair((Object)((nrg)xlc).j, (Object)xlc.o);
            }
            return (Pair<Long, Integer>)pair;
        }
        final long u = c.u;
        if (xlc != null) {
            if (!this.p) {
                n = ((ia4)xlc).g;
            }
        }
        if (!c.o && n >= j + u) {
            return (Pair<Long, Integer>)new Pair((Object)(c.k + ((List)c.r).size()), (Object)(-1));
        }
        final long n3 = n - j;
        final aed r = c.r;
        final boolean i = this.g.j();
        int n4 = 0;
        boolean b3 = b2;
        if (i) {
            b3 = (xlc == null && b2);
        }
        final int d = imw.d((List)r, (Comparable)n3, b3);
        n = d + c.k;
        int n5 = n2;
        j = n;
        if (d >= 0) {
            final c$c c$c = ((List<c$c>)c.r).get(d);
            aed aed;
            if (n3 < ((c$d)c$c).G0 + ((c$d)c$c).E0) {
                aed = c$c.O0;
            }
            else {
                aed = c.s;
            }
            while (true) {
                n5 = n2;
                j = n;
                if (n4 >= ((List)aed).size()) {
                    break;
                }
                final c$a c$a = (c$a)((List)aed).get(n4);
                if (n3 < ((c$d)c$a).G0 + ((c$d)c$a).E0) {
                    n5 = n2;
                    j = n;
                    if (c$a.N0) {
                        if (aed == c.s) {
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
    
    public final ia4 d(final Uri uri, final int n) {
        if (uri == null) {
            return null;
        }
        final byte[] array = ((AbstractMap<K, byte[]>)this.j.a).remove(uri);
        if (array != null) {
            final byte[] array2 = this.j.a.put(uri, array);
            return null;
        }
        return (ia4)new tlc.tlc$a(this.c, new com.google.android.exoplayer2.upstream.b(uri, 0L, 1, (byte[])null, (Map)Collections.emptyMap(), 0L, -1L, (String)null, 1, (Object)null), this.f[n], this.q.s(), this.q.k(), this.m);
    }
    
    public static final class b
    {
        public ia4 a;
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
            this.d = (a instanceof c$a && ((c$a)a).O0);
        }
    }
}
