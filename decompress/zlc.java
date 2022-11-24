import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.android.exoplayer2.source.p$a;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.d$a;
import java.util.HashSet;
import com.google.android.exoplayer2.source.hls.playlist.d$b;
import java.util.Collections;
import com.google.android.exoplayer2.drm.b$b;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.exoplayer2.drm.b;
import java.util.Map;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import android.util.SparseArray;
import java.util.List;
import com.google.android.exoplayer2.upstream.h$b;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.h$c;
import android.net.Uri;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.p;
import java.util.Objects;
import com.google.android.exoplayer2.source.h$a;
import java.util.IdentityHashMap;
import com.google.android.exoplayer2.source.j$a;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a;
import com.google.android.exoplayer2.source.h;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zlc implements h, b, HlsPlaylistTracker$a
{
    public final vlc F0;
    public final HlsPlaylistTracker G0;
    public final ulc H0;
    public final hzt I0;
    public final com.google.android.exoplayer2.drm.d J0;
    public final c$a K0;
    public final com.google.android.exoplayer2.upstream.h L0;
    public final j$a M0;
    public final sx N0;
    public final IdentityHashMap<mso, Integer> O0;
    public final sog P0;
    public final jb2 Q0;
    public final boolean R0;
    public final int S0;
    public final boolean T0;
    public final cok U0;
    public h$a V0;
    public int W0;
    public twt X0;
    public gmc[] Y0;
    public gmc[] Z0;
    public int a1;
    public gdg b1;
    
    public zlc(final vlc f0, final HlsPlaylistTracker g0, final ulc h0, final hzt i0, final com.google.android.exoplayer2.drm.d j0, final c$a k0, final com.google.android.exoplayer2.upstream.h l0, final j$a m0, final sx n0, final jb2 q0, final boolean r0, final int s0, final boolean t0, final cok u0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = u0;
        Objects.requireNonNull(q0);
        this.b1 = new gdg(new p[0]);
        this.O0 = new IdentityHashMap<mso, Integer>();
        this.P0 = new sog(5);
        this.Y0 = new gmc[0];
        this.Z0 = new gmc[0];
    }
    
    public static n p(final n n, final n n2, final boolean b) {
        int l0 = -1;
        q9h i;
        int x;
        int d;
        int e;
        String c;
        String b2;
        String r;
        if (n2 != null) {
            final String n3 = n2.N0;
            i = n2.O0;
            x = n2.d1;
            d = n2.I0;
            e = n2.J0;
            c = n2.H0;
            b2 = n2.G0;
            r = n3;
        }
        else {
            r = rnw.r(n.N0, 1);
            i = n.O0;
            if (b) {
                x = n.d1;
                d = n.I0;
                e = n.J0;
                c = n.H0;
                b2 = n.G0;
            }
            else {
                c = null;
                e = 0;
                d = 0;
                x = -1;
                b2 = null;
            }
        }
        final String d2 = rbh.d(r);
        int k0;
        if (b) {
            k0 = n.K0;
        }
        else {
            k0 = -1;
        }
        if (b) {
            l0 = n.L0;
        }
        final n$a n$a = new n$a();
        n$a.a = n.F0;
        n$a.b = b2;
        n$a.j = n.P0;
        n$a.k = d2;
        n$a.h = r;
        n$a.i = i;
        n$a.f = k0;
        n$a.g = l0;
        n$a.x = x;
        n$a.d = d;
        n$a.e = e;
        n$a.c = c;
        return n$a.a();
    }
    
    public final void a() {
        for (final gmc gmc : this.Y0) {
            if (!gmc.S0.isEmpty()) {
                final xlc xlc = (xlc)tpz.F(gmc.S0);
                final int b = gmc.I0.b(xlc);
                if (b == 1) {
                    xlc.K = true;
                }
                else if (b == 2 && !gmc.y1 && gmc.O0.c()) {
                    gmc.O0.a();
                }
            }
        }
        ((p$a)this.V0).e((p)this);
    }
    
    public final boolean b() {
        return this.b1.b();
    }
    
    public final boolean c(final Uri uri, final h$c h$c, final boolean b) {
        final gmc[] y0 = this.Y0;
        final int length = y0.length;
        int i = 0;
        boolean b2 = true;
        while (i < length) {
            final gmc gmc = y0[i];
            boolean b5 = false;
            Label_0293: {
                if (rnw.k((Object[])gmc.I0.e, (Object)uri)) {
                    long b3 = 0L;
                    Label_0115: {
                        if (!b) {
                            final h$b a = ((f)gmc.N0).a(bxt.a(gmc.I0.q), h$c);
                            if (a != null && a.a == 2) {
                                b3 = a.b;
                                break Label_0115;
                            }
                        }
                        b3 = -9223372036854775807L;
                    }
                    final tlc i2 = gmc.I0;
                    int n = 0;
                    while (true) {
                        final Uri[] e = i2.e;
                        if (n >= e.length) {
                            n = -1;
                            break;
                        }
                        if (e[n].equals((Object)uri)) {
                            break;
                        }
                        ++n;
                    }
                    boolean b4 = false;
                    Label_0270: {
                        if (n != -1) {
                            final int m = ((xwt)i2.q).m(n);
                            if (m != -1) {
                                i2.s |= uri.equals((Object)i2.o);
                                if (b3 != -9223372036854775807L) {
                                    if (!i2.q.e(m, b3) || !i2.g.l(uri, b3)) {
                                        b4 = false;
                                        break Label_0270;
                                    }
                                }
                            }
                        }
                        b4 = true;
                    }
                    if (!b4 || b3 == -9223372036854775807L) {
                        b5 = false;
                        break Label_0293;
                    }
                }
                b5 = true;
            }
            b2 &= b5;
            ++i;
        }
        ((p$a)this.V0).e((p)this);
        return b2;
    }
    
    public final long d() {
        return this.b1.d();
    }
    
    public final void e(final p p) {
        final gmc gmc = (gmc)p;
        ((p$a)this.V0).e((p)this);
    }
    
    public final boolean f(final long n) {
        if (this.X0 == null) {
            for (final gmc gmc : this.Y0) {
                if (!gmc.i1) {
                    gmc.f(gmc.u1);
                }
            }
            return false;
        }
        return this.b1.f(n);
    }
    
    public final long g() {
        return this.b1.g();
    }
    
    public final void h(final long n) {
        this.b1.h(n);
    }
    
    public final long j(final tha[] array, final boolean[] array2, final mso[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            int intValue;
            if (array3[i] == null) {
                intValue = -1;
            }
            else {
                intValue = this.O0.get(array3[i]);
            }
            array5[i] = intValue;
            array6[i] = -1;
            if (array[i] != null) {
                final swt o = ((xwt)array[i]).o();
                int n2 = 0;
                while (true) {
                    final gmc[] y0 = this.Y0;
                    if (n2 >= y0.length) {
                        break;
                    }
                    final gmc gmc = y0[n2];
                    gmc.t();
                    if (gmc.n1.b(o) != -1) {
                        array6[i] = n2;
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.O0.clear();
        final int length = array.length;
        final mso[] array7 = new mso[length];
        final int length2 = array.length;
        final mso[] array8 = new mso[length2];
        final int length3 = array.length;
        final tha[] array9 = new tha[length3];
        final gmc[] array10 = new gmc[this.Y0.length];
        int j = 0;
        int n3 = 0;
        int n4 = 0;
        while (j < this.Y0.length) {
            for (int k = 0; k < array.length; ++k) {
                mso mso;
                if (array5[k] == j) {
                    mso = array3[k];
                }
                else {
                    mso = null;
                }
                array8[k] = mso;
                tha tha;
                if (array6[k] == j) {
                    tha = array[k];
                }
                else {
                    tha = null;
                }
                array9[k] = tha;
            }
            final gmc gmc2 = this.Y0[j];
            gmc2.t();
            final int j2 = gmc2.j1;
            for (int l = 0; l < length3; ++l) {
                final fmc fmc = (fmc)array8[l];
                if (fmc != null && (array9[l] == null || !array2[l])) {
                    --gmc2.j1;
                    if (fmc.H0 != -1) {
                        final gmc g0 = fmc.G0;
                        final int f0 = fmc.F0;
                        g0.t();
                        Objects.requireNonNull(g0.p1);
                        final int n5 = g0.p1[f0];
                        omi.p(g0.s1[n5]);
                        g0.s1[n5] = false;
                        fmc.H0 = -1;
                    }
                    array8[l] = null;
                }
            }
            int n6;
            if (n4 || (gmc2.x1 ? (j2 == 0) : (n != gmc2.u1))) {
                n6 = 1;
            }
            else {
                n6 = 0;
            }
            tha q;
            final tha tha2 = q = gmc2.I0.q;
            tha tha3;
            int n8;
            for (int n7 = 0; n7 < length3; ++n7, q = tha3, n6 = n8) {
                final tha q2 = array9[n7];
                if (q2 == null) {
                    tha3 = q;
                    n8 = n6;
                }
                else {
                    final int b = gmc2.n1.b(((xwt)q2).o());
                    if (b == gmc2.q1) {
                        gmc2.I0.q = q2;
                        q = q2;
                    }
                    tha3 = q;
                    n8 = n6;
                    if (array8[n7] == null) {
                        ++gmc2.j1;
                        array8[n7] = (mso)new fmc(gmc2, b);
                        array4[n7] = true;
                        tha3 = q;
                        n8 = n6;
                        if (gmc2.p1 != null) {
                            ((fmc)array8[n7]).a();
                            tha3 = q;
                            if ((n8 = n6) == 0) {
                                final gmc.d d = gmc2.a1[gmc2.p1[b]];
                                int n9;
                                if (!d.A(n, true) && d.q + d.s != 0) {
                                    n9 = 1;
                                }
                                else {
                                    n9 = 0;
                                }
                                n8 = n9;
                                tha3 = q;
                            }
                        }
                    }
                }
            }
            if (gmc2.j1 == 0) {
                gmc2.I0.n = null;
                gmc2.l1 = null;
                gmc2.w1 = true;
                gmc2.S0.clear();
                if (gmc2.O0.c()) {
                    if (gmc2.h1) {
                        final gmc.d[] a1 = gmc2.a1;
                        for (int length4 = a1.length, n10 = 0; n10 < length4; ++n10) {
                            a1[n10].h();
                        }
                    }
                    gmc2.O0.a();
                }
                else {
                    gmc2.G();
                }
            }
            else {
                boolean b3 = false;
                Label_1014: {
                    if (!gmc2.S0.isEmpty() && !rnw.a((Object)q, (Object)tha2)) {
                        boolean b2 = false;
                        Label_0990: {
                            if (!gmc2.x1) {
                                long n11 = 0L;
                                if (n < 0L) {
                                    n11 = -n;
                                }
                                final xlc a2 = gmc2.A();
                                q.n(n, n11, -9223372036854775807L, (List<? extends fsg>)gmc2.T0, gmc2.I0.a(a2, n));
                                if (q.q() == gmc2.I0.h.a(((pa4)a2).d)) {
                                    b2 = false;
                                    break Label_0990;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            gmc2.w1 = true;
                            b3 = true;
                            n6 = 1;
                            break Label_1014;
                        }
                    }
                    b3 = (n4 != 0);
                }
                if (n6 != 0) {
                    gmc2.H(n, b3);
                    for (int n12 = 0; n12 < length2; ++n12) {
                        if (array8[n12] != null) {
                            array4[n12] = true;
                        }
                    }
                }
            }
            gmc2.X0.clear();
            for (final mso mso2 : array8) {
                if (mso2 != null) {
                    gmc2.X0.add((fmc)mso2);
                }
            }
            gmc2.x1 = true;
            int n14 = 0;
            int n16;
            for (int n15 = 0; n15 < array.length; ++n15, n14 = n16) {
                final mso mso3 = array8[n15];
                if (array6[n15] == j) {
                    Objects.requireNonNull(mso3);
                    array7[n15] = mso3;
                    this.O0.put(mso3, j);
                    n16 = 1;
                }
                else {
                    n16 = n14;
                    if (array5[n15] == j) {
                        omi.p(mso3 == null);
                        n16 = n14;
                    }
                }
            }
            Label_1349: {
                if (n14 != 0) {
                    array10[n3] = gmc2;
                    final int n17 = n3 + 1;
                    if (n3 == 0) {
                        gmc2.I0.l = true;
                        if (n6 == 0) {
                            final gmc[] z0 = this.Z0;
                            if (z0.length != 0) {
                                n3 = n17;
                                if (gmc2 == z0[0]) {
                                    break Label_1349;
                                }
                            }
                        }
                        ((SparseArray)this.P0.F0).clear();
                        n4 = (true ? 1 : 0);
                        n3 = n17;
                    }
                    else {
                        gmc2.I0.l = (j < this.a1);
                        n3 = n17;
                    }
                }
            }
            ++j;
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final gmc[] z2 = (gmc[])rnw.J((Object[])array10, n3);
        this.Z0 = z2;
        Objects.requireNonNull(this.Q0);
        this.b1 = new gdg(z2);
        return n;
    }
    
    public final long k(long j0, final rcp rcp) {
        final gmc[] z0 = this.Z0;
        final int length = z0.length;
        int i = 0;
        while (i < length) {
            final gmc gmc = z0[i];
            if (gmc.f1 == 2) {
                final tlc i2 = gmc.I0;
                final int c = i2.q.c();
                final Uri[] e = i2.e;
                com.google.android.exoplayer2.source.hls.playlist.c o;
                if (c < e.length && c != -1) {
                    o = i2.g.o(e[i2.q.q()], true);
                }
                else {
                    o = null;
                }
                if (o == null || o.r.isEmpty()) {
                    break;
                }
                if (!o.c) {
                    break;
                }
                final long n = o.h - i2.g.d();
                final long n2 = j0 - n;
                final int d = rnw.d((List)o.r, (Comparable)n2, true);
                final long j2 = ((c$d)o.r.get(d)).J0;
                if (d != o.r.size() - 1) {
                    j0 = ((c$d)o.r.get(d + 1)).J0;
                }
                else {
                    j0 = j2;
                }
                j0 = rcp.a(n2, j2, j0) + n;
                break;
            }
            else {
                ++i;
            }
        }
        return j0;
    }
    
    public final gmc l(final String s, final int n, final Uri[] array, final n[] array2, final n n2, final List<n> list, final Map<String, com.google.android.exoplayer2.drm.b> map, final long n3) {
        return new gmc(s, n, (gmc.b)this, new tlc(this.F0, this.G0, array, array2, this.H0, this.I0, this.P0, list, this.U0), map, this.N0, n3, n2, this.J0, this.K0, this.L0, this.M0, this.S0);
    }
    
    public final long m(final long n) {
        final gmc[] z0 = this.Z0;
        if (z0.length > 0) {
            final boolean h = z0[0].H(n, false);
            int n2 = 1;
            while (true) {
                final gmc[] z2 = this.Z0;
                if (n2 >= z2.length) {
                    break;
                }
                z2[n2].H(n, h);
                ++n2;
            }
            if (h) {
                ((SparseArray)this.P0.F0).clear();
            }
        }
        return n;
    }
    
    public final long n() {
        return -9223372036854775807L;
    }
    
    public final void o(final h$a v0, final long n) {
        this.V0 = v0;
        this.G0.h((HlsPlaylistTracker$a)this);
        final com.google.android.exoplayer2.source.hls.playlist.d f = this.G0.f();
        Objects.requireNonNull(f);
        Map<String, com.google.android.exoplayer2.drm.b> emptyMap;
        if (this.T0) {
            final List<com.google.android.exoplayer2.drm.b> m = f.m;
            final ArrayList list = new ArrayList(m);
            final HashMap hashMap = new HashMap();
            int n2 = 0;
            while (true) {
                emptyMap = hashMap;
                if (n2 >= list.size()) {
                    break;
                }
                com.google.android.exoplayer2.drm.b b = m.get(n2);
                final String h0 = b.H0;
                int i = ++n2;
                while (i < list.size()) {
                    final com.google.android.exoplayer2.drm.b b2 = (com.google.android.exoplayer2.drm.b)list.get(i);
                    if (TextUtils.equals((CharSequence)b2.H0, (CharSequence)h0)) {
                        final String h2 = b.H0;
                        boolean b3 = false;
                        Label_0188: {
                            if (h2 != null) {
                                final String h3 = b2.H0;
                                if (h3 != null) {
                                    if (!TextUtils.equals((CharSequence)h2, (CharSequence)h3)) {
                                        b3 = false;
                                        break Label_0188;
                                    }
                                }
                            }
                            b3 = true;
                        }
                        omi.p(b3);
                        String s = b.H0;
                        if (s == null) {
                            s = b2.H0;
                        }
                        final b$b[] f2 = b.F0;
                        final b$b[] f3 = b2.F0;
                        final int a = rnw.a;
                        final b$b[] copy = Arrays.copyOf(f2, f2.length + f3.length);
                        System.arraycopy(f3, 0, copy, f2.length, f3.length);
                        b = new com.google.android.exoplayer2.drm.b(s, true, (b$b[])copy);
                        list.remove(i);
                    }
                    else {
                        ++i;
                    }
                }
                hashMap.put(h0, b);
            }
        }
        else {
            emptyMap = Collections.emptyMap();
        }
        final boolean empty = f.e.isEmpty();
        final List<d$a> g = f.g;
        final List<d$a> h4 = f.h;
        this.W0 = 0;
        final ArrayList<gmc> list2 = new ArrayList<gmc>();
        final ArrayList<int[]> list3 = new ArrayList<int[]>();
        Label_1375: {
            if (empty ^ true) {
                final int size = f.e.size();
                final int[] array = new int[size];
                int j = 0;
                int n3 = 0;
                int n4 = 0;
                while (j < f.e.size()) {
                    final n b4 = ((d$b)f.e.get(j)).b;
                    if (b4.W0 <= 0 && rnw.r(b4.N0, 2) == null) {
                        if (rnw.r(b4.N0, 1) != null) {
                            array[j] = 1;
                            ++n4;
                        }
                        else {
                            array[j] = -1;
                        }
                    }
                    else {
                        array[j] = 2;
                        ++n3;
                    }
                    ++j;
                }
                while (true) {
                    Label_0535: {
                        if (n3 > 0) {
                            final boolean b5 = true;
                            break Label_0535;
                        }
                        if (n4 >= size) {
                            final boolean b5 = false;
                            n3 = size;
                            break Label_0535;
                        }
                        n3 = size - n4;
                        final boolean b5 = false;
                        final boolean b6 = true;
                        final Uri[] array2 = new Uri[n3];
                        final n[] array3 = new n[n3];
                        final int[] array4 = new int[n3];
                        int k = 0;
                        int n5 = 0;
                        while (k < f.e.size()) {
                            int n6 = 0;
                            Label_0671: {
                                if (b5) {
                                    n6 = n5;
                                    if (array[k] != 2) {
                                        break Label_0671;
                                    }
                                }
                                if (b6) {
                                    n6 = n5;
                                    if (array[k] == 1) {
                                        break Label_0671;
                                    }
                                }
                                final d$b d$b = f.e.get(k);
                                array2[n5] = d$b.a;
                                array3[n5] = d$b.b;
                                array4[n5] = k;
                                n6 = n5 + 1;
                            }
                            ++k;
                            n5 = n6;
                        }
                        final String n7 = array3[0].N0;
                        final int q = rnw.q(n7, 2);
                        final int q2 = rnw.q(n7, 1);
                        final boolean b7 = q2 <= 1 && q <= 1 && q2 + q > 0;
                        int n8;
                        if (!b5 && q2 > 0) {
                            n8 = 1;
                        }
                        else {
                            n8 = 0;
                        }
                        final gmc l = this.l("main", n8, array2, array3, f.j, f.k, emptyMap, n);
                        list2.add(l);
                        list3.add(array4);
                        if (this.R0 && b7) {
                            final ArrayList<swt> list4 = new ArrayList<swt>();
                            if (q > 0) {
                                final n[] array5 = new n[n3];
                                for (int n9 = 0; n9 < n3; ++n9) {
                                    final n n10 = array3[n9];
                                    final String r = rnw.r(n10.N0, 2);
                                    final String d = rbh.d(r);
                                    final n$a n$a = new n$a();
                                    n$a.a = n10.F0;
                                    n$a.b = n10.G0;
                                    n$a.j = n10.P0;
                                    n$a.k = d;
                                    n$a.h = r;
                                    n$a.i = n10.O0;
                                    n$a.f = n10.K0;
                                    n$a.g = n10.L0;
                                    n$a.p = n10.V0;
                                    n$a.q = n10.W0;
                                    n$a.r = n10.X0;
                                    n$a.d = n10.I0;
                                    n$a.e = n10.J0;
                                    array5[n9] = new n(n$a);
                                }
                                list4.add(new swt("main", array5));
                                if (q2 > 0 && (f.j != null || f.g.isEmpty())) {
                                    list4.add(new swt("main".concat(":audio"), new n[] { p(array3[0], f.j, false) }));
                                }
                                final List<n> k2 = f.k;
                                if (k2 != null) {
                                    for (int n11 = 0; n11 < k2.size(); ++n11) {
                                        final StringBuilder sb = new StringBuilder(19);
                                        sb.append("main");
                                        sb.append(":cc:");
                                        sb.append(n11);
                                        list4.add(new swt(sb.toString(), new n[] { k2.get(n11) }));
                                    }
                                }
                            }
                            else {
                                final n[] array6 = new n[n3];
                                for (int n12 = 0; n12 < n3; ++n12) {
                                    array6[n12] = p(array3[n12], f.j, true);
                                }
                                list4.add(new swt("main", array6));
                            }
                            final String concat = "main".concat(":id3");
                            final n$a n$a2 = new n$a();
                            n$a2.a = "ID3";
                            n$a2.k = "application/id3";
                            final swt swt = new swt(concat, new n[] { new n(n$a2) });
                            list4.add(swt);
                            l.F(list4.toArray(new swt[0]), list4.indexOf(swt));
                        }
                        break Label_1375;
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        final ArrayList list5 = new ArrayList(g.size());
        final ArrayList list6 = new ArrayList(g.size());
        final ArrayList list7 = new ArrayList<Integer>(g.size());
        final HashSet<String> set = new HashSet<String>();
        for (int n13 = 0; n13 < g.size(); ++n13) {
            final String c = g.get(n13).c;
            if (set.add(c)) {
                list5.clear();
                list6.clear();
                list7.clear();
                int n14 = 0;
                int n15 = 1;
                while (n14 < g.size()) {
                    int n16 = n15;
                    if (rnw.a((Object)c, (Object)((d$a)g.get(n14)).c)) {
                        final d$a d$a = g.get(n14);
                        list7.add((Object)n14);
                        list5.add((Object)d$a.a);
                        list6.add((Object)d$a.b);
                        n16 = (n15 & ((rnw.q(d$a.b.N0, 1) == 1) ? 1 : 0));
                    }
                    ++n14;
                    n15 = n16;
                }
                final String value = String.valueOf(c);
                String concat2;
                if (value.length() != 0) {
                    concat2 = "audio:".concat(value);
                }
                else {
                    concat2 = new String("audio:");
                }
                final int a2 = rnw.a;
                final gmc l2 = this.l(concat2, 1, (Uri[])list5.toArray((Object[])new Uri[0]), (n[])list6.toArray((Object[])new n[0]), null, Collections.emptyList(), emptyMap, n);
                list3.add(l0e.t((Collection<? extends Number>)list7));
                list2.add(l2);
                if (this.R0 && n15 != 0) {
                    l2.F(new swt[] { new swt(concat2, (n[])list6.toArray((Object[])new n[0])) }, new int[0]);
                }
            }
        }
        this.a1 = list2.size();
        for (int n17 = 0; n17 < h4.size(); ++n17) {
            final d$a d$a2 = h4.get(n17);
            final String c2 = d$a2.c;
            final StringBuilder sb2 = new StringBuilder(l58.g(c2, 21));
            sb2.append("subtitle:");
            sb2.append(n17);
            sb2.append(":");
            sb2.append(c2);
            final String string = sb2.toString();
            final gmc l3 = this.l(string, 3, new Uri[] { d$a2.a }, new n[] { d$a2.b }, null, Collections.emptyList(), emptyMap, n);
            list3.add(new int[] { n17 });
            list2.add(l3);
            l3.F(new swt[] { new swt(string, new n[] { d$a2.b }) }, new int[0]);
        }
        this.Y0 = list2.toArray(new gmc[0]);
        final int[][] array7 = list3.toArray(new int[0][]);
        final gmc[] y0 = this.Y0;
        this.W0 = y0.length;
        y0[0].I0.l = true;
        for (final gmc gmc : y0) {
            if (!gmc.i1) {
                gmc.f(gmc.u1);
            }
        }
        this.Z0 = this.Y0;
    }
    
    public final void q() throws IOException {
        for (final gmc gmc : this.Y0) {
            gmc.E();
            if (gmc.y1 && !gmc.i1) {
                throw ParserException.a("Loading finished before preparation is complete.", (Throwable)null);
            }
        }
    }
    
    public final void r() {
        final int w0 = this.W0 - 1;
        this.W0 = w0;
        if (w0 > 0) {
            return;
        }
        final gmc[] y0 = this.Y0;
        final int length = y0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final gmc gmc = y0[i];
            gmc.t();
            n += gmc.n1.F0;
            ++i;
        }
        final swt[] array = new swt[n];
        final gmc[] y2 = this.Y0;
        final int length2 = y2.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final gmc gmc2 = y2[j];
            gmc2.t();
            for (int f0 = gmc2.n1.F0, k = 0; k < f0; ++k, ++n2) {
                gmc2.t();
                array[n2] = gmc2.n1.a(k);
            }
            ++j;
        }
        this.X0 = new twt(array);
        this.V0.i((h)this);
    }
    
    public final twt v() {
        final twt x0 = this.X0;
        Objects.requireNonNull(x0);
        return x0;
    }
    
    public final void x(final long n, final boolean b) {
        for (final gmc gmc : this.Z0) {
            if (gmc.h1) {
                if (!gmc.C()) {
                    for (int length2 = gmc.a1.length, j = 0; j < length2; ++j) {
                        gmc.a1[j].g(n, b, gmc.s1[j]);
                    }
                }
            }
        }
    }
}
