import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p$a;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.d$a;
import java.util.HashSet;
import java.util.Map;
import com.google.android.exoplayer2.source.hls.playlist.d$b;
import java.util.Collections;
import com.google.android.exoplayer2.drm.b$b;
import java.util.Arrays;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.b;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.h$b;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.h$c;
import com.google.android.exoplayer2.source.hls.playlist.c;
import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import java.util.List;
import android.util.SparseArray;
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

public final class zlc implements h, gmc$b, HlsPlaylistTracker$a
{
    public final vlc C0;
    public final HlsPlaylistTracker D0;
    public final ulc E0;
    public final zxt F0;
    public final d G0;
    public final c$a H0;
    public final com.google.android.exoplayer2.upstream.h I0;
    public final j$a J0;
    public final qx K0;
    public final IdentityHashMap<bro, Integer> L0;
    public final zng M0;
    public final b9a N0;
    public final boolean O0;
    public final int P0;
    public final boolean Q0;
    public final hnk R0;
    public h$a S0;
    public int T0;
    public mvt U0;
    public gmc[] V0;
    public gmc[] W0;
    public int X0;
    public wcg Y0;
    
    public zlc(final vlc c0, final HlsPlaylistTracker d0, final ulc e0, final zxt f0, final d g0, final c$a h0, final com.google.android.exoplayer2.upstream.h i0, final j$a j0, final qx k0, final b9a n0, final boolean o0, final int p14, final boolean q0, final hnk r0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
        this.R0 = r0;
        Objects.requireNonNull(n0);
        this.Y0 = new wcg(new p[0]);
        this.L0 = new IdentityHashMap<bro, Integer>();
        this.M0 = new zng(4);
        this.V0 = new gmc[0];
        this.W0 = new gmc[0];
    }
    
    public static n q(final n n, final n n2, final boolean b) {
        int i0 = -1;
        x8h l0;
        int x;
        int d;
        int e;
        String c;
        String b2;
        String h;
        if (n2 != null) {
            final String k0 = n2.K0;
            l0 = n2.L0;
            x = n2.a1;
            d = n2.F0;
            e = n2.G0;
            c = n2.E0;
            b2 = n2.D0;
            h = k0;
        }
        else {
            final String r = imw.r(n.K0, 1);
            final x8h l2 = n.L0;
            if (b) {
                x = n.a1;
                d = n.F0;
                e = n.G0;
                c = n.E0;
                b2 = n.D0;
                l0 = l2;
                h = r;
            }
            else {
                c = null;
                e = 0;
                d = 0;
                x = -1;
                b2 = c;
                l0 = l2;
                h = r;
            }
        }
        final String d2 = zah.d(h);
        int h2;
        if (b) {
            h2 = n.H0;
        }
        else {
            h2 = -1;
        }
        if (b) {
            i0 = n.I0;
        }
        final n$a n$a = new n$a();
        n$a.a = n.C0;
        n$a.b = b2;
        n$a.j = n.M0;
        n$a.k = d2;
        n$a.h = h;
        n$a.i = l0;
        n$a.f = h2;
        n$a.g = i0;
        n$a.x = x;
        n$a.d = d;
        n$a.e = e;
        n$a.c = c;
        return n$a.a();
    }
    
    public final void a() {
        for (final gmc gmc : this.V0) {
            if (!gmc.P0.isEmpty()) {
                final xlc xlc = (xlc)fk7.H(gmc.P0);
                final int b = gmc.F0.b(xlc);
                if (b == 1) {
                    xlc.K = true;
                }
                else if (b == 2 && !gmc.v1 && gmc.L0.c()) {
                    gmc.L0.a();
                }
            }
        }
        ((p$a)this.S0).m((p)this);
    }
    
    public final long b() {
        return this.Y0.b();
    }
    
    public final boolean c() {
        return this.Y0.c();
    }
    
    public final boolean d(final long n) {
        if (this.U0 == null) {
            for (final gmc gmc : this.V0) {
                if (!gmc.f1) {
                    gmc.d(gmc.r1);
                }
            }
            return false;
        }
        return this.Y0.d(n);
    }
    
    public final long e() {
        return this.Y0.e();
    }
    
    public final void f(final long n) {
        this.Y0.f(n);
    }
    
    public final long g(final hha[] array, final boolean[] array2, final bro[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            int intValue;
            if (array3[i] == null) {
                intValue = -1;
            }
            else {
                intValue = this.L0.get(array3[i]);
            }
            array5[i] = intValue;
            array6[i] = -1;
            if (array[i] != null) {
                final lvt o = ((qvt)array[i]).o();
                int n2 = 0;
                while (true) {
                    final gmc[] v0 = this.V0;
                    if (n2 >= v0.length) {
                        break;
                    }
                    final gmc gmc = v0[n2];
                    gmc.v();
                    if (gmc.k1.b(o) != -1) {
                        array6[i] = n2;
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.L0.clear();
        final int length = array.length;
        bro[] array7 = new bro[length];
        final int length2 = array.length;
        final bro[] array8 = new bro[length2];
        final int length3 = array.length;
        final hha[] array9 = new hha[length3];
        final gmc[] array10 = new gmc[this.V0.length];
        int j = 0;
        int n3 = 0;
        int n4 = 0;
        bro[] array11 = array8;
        while (j < this.V0.length) {
            for (int k = 0; k < array.length; ++k) {
                bro bro;
                if (array5[k] == j) {
                    bro = array3[k];
                }
                else {
                    bro = null;
                }
                array11[k] = bro;
                hha hha;
                if (array6[k] == j) {
                    hha = array[k];
                }
                else {
                    hha = null;
                }
                array9[k] = hha;
            }
            final gmc gmc2 = this.V0[j];
            gmc2.v();
            final int g1 = gmc2.g1;
            for (int l = 0; l < length3; ++l) {
                final fmc fmc = (fmc)array11[l];
                if (fmc != null && (array9[l] == null || !array2[l])) {
                    --gmc2.g1;
                    if (fmc.E0 != -1) {
                        final gmc d0 = fmc.D0;
                        final int c0 = fmc.C0;
                        d0.v();
                        Objects.requireNonNull(d0.m1);
                        final int n5 = d0.m1[c0];
                        ri4.t(d0.p1[n5]);
                        d0.p1[n5] = false;
                        fmc.E0 = -1;
                    }
                    array11[l] = null;
                }
            }
            int n6;
            if (n4 || (gmc2.u1 ? (g1 == 0) : (n != gmc2.r1))) {
                n6 = 1;
            }
            else {
                n6 = 0;
            }
            hha q;
            final hha hha2 = q = gmc2.F0.q;
            hha hha3;
            int n8;
            for (int n7 = 0; n7 < length3; ++n7, q = hha3, n6 = n8) {
                final hha q2 = array9[n7];
                if (q2 == null) {
                    hha3 = q;
                    n8 = n6;
                }
                else {
                    final int b = gmc2.k1.b(((qvt)q2).o());
                    if (b == gmc2.n1) {
                        gmc2.F0.q = q2;
                        q = q2;
                    }
                    hha3 = q;
                    n8 = n6;
                    if (array11[n7] == null) {
                        ++gmc2.g1;
                        array11[n7] = (bro)new fmc(gmc2, b);
                        array4[n7] = true;
                        hha3 = q;
                        n8 = n6;
                        if (gmc2.m1 != null) {
                            ((fmc)array11[n7]).c();
                            hha3 = q;
                            if ((n8 = n6) == 0) {
                                final gmc$d gmc$d = gmc2.X0[gmc2.m1[b]];
                                int n9;
                                if (!((o)gmc$d).A(n, true) && ((o)gmc$d).q + ((o)gmc$d).s != 0) {
                                    n9 = 1;
                                }
                                else {
                                    n9 = 0;
                                }
                                n8 = n9;
                                hha3 = q;
                            }
                        }
                    }
                }
            }
            if (gmc2.g1 == 0) {
                gmc2.F0.n = null;
                gmc2.i1 = null;
                gmc2.t1 = true;
                gmc2.P0.clear();
                if (gmc2.L0.c()) {
                    if (gmc2.e1) {
                        final gmc$d[] x0 = gmc2.X0;
                        for (int length4 = x0.length, n10 = 0; n10 < length4; ++n10) {
                            ((o)x0[n10]).h();
                        }
                    }
                    gmc2.L0.a();
                }
                else {
                    gmc2.G();
                }
            }
            else {
                boolean b3 = false;
                Label_1039: {
                    if (!gmc2.P0.isEmpty() && !imw.a((Object)q, (Object)hha2)) {
                        boolean b2 = false;
                        Label_1015: {
                            if (!gmc2.u1) {
                                long n11 = 0L;
                                if (n < 0L) {
                                    n11 = -n;
                                }
                                final xlc a = gmc2.A();
                                q.n(n, n11, -9223372036854775807L, gmc2.Q0, gmc2.F0.a(a, n));
                                if (q.q() == gmc2.F0.h.a(((ia4)a).d)) {
                                    b2 = false;
                                    break Label_1015;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            gmc2.t1 = true;
                            b3 = true;
                            n6 = 1;
                            break Label_1039;
                        }
                    }
                    b3 = (n4 != 0);
                }
                if (n6 != 0) {
                    gmc2.H(n, b3);
                    for (int n12 = 0; n12 < length2; ++n12) {
                        if (array11[n12] != null) {
                            array4[n12] = true;
                        }
                    }
                }
            }
            final bro[] array12 = array7;
            final bro[] array13 = array11;
            gmc2.U0.clear();
            for (final bro bro2 : array13) {
                if (bro2 != null) {
                    gmc2.U0.add(bro2);
                }
            }
            gmc2.u1 = true;
            int n14 = 0;
            int n15 = 0;
            final bro[] array14 = array12;
            while (n15 < array.length) {
                final bro bro3 = array13[n15];
                int n16;
                if (array6[n15] == j) {
                    Objects.requireNonNull(bro3);
                    array14[n15] = bro3;
                    this.L0.put(bro3, j);
                    n16 = 1;
                }
                else {
                    n16 = n14;
                    if (array5[n15] == j) {
                        ri4.t(bro3 == null);
                        n16 = n14;
                    }
                }
                ++n15;
                n14 = n16;
            }
            Label_1386: {
                if (n14 != 0) {
                    array10[n3] = gmc2;
                    final int n17 = n3 + 1;
                    if (n3 == 0) {
                        gmc2.F0.l = true;
                        if (n6 == 0) {
                            final gmc[] w0 = this.W0;
                            if (w0.length != 0) {
                                n3 = n17;
                                if (gmc2 == w0[0]) {
                                    break Label_1386;
                                }
                            }
                        }
                        ((SparseArray)this.M0.C0).clear();
                        n4 = (true ? 1 : 0);
                        n3 = n17;
                    }
                    else {
                        gmc2.F0.l = (j < this.X0);
                        n3 = n17;
                    }
                }
            }
            ++j;
            final bro[] array15 = array14;
            array11 = array13;
            array7 = array15;
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final gmc[] w2 = (gmc[])imw.J((Object[])array10, n3);
        this.W0 = w2;
        Objects.requireNonNull(this.N0);
        this.Y0 = new wcg(w2);
        return n;
    }
    
    public final long h(long g0, final fbp fbp) {
        final gmc[] w0 = this.W0;
        final int length = w0.length;
        int i = 0;
        while (i < length) {
            final gmc gmc = w0[i];
            if (gmc.c1 == 2) {
                final tlc f0 = gmc.F0;
                final int c = f0.q.c();
                final Uri[] e = f0.e;
                c o;
                if (c < e.length && c != -1) {
                    o = f0.g.o(e[f0.q.q()], true);
                }
                else {
                    o = null;
                }
                if (o == null || ((List)o.r).isEmpty()) {
                    break;
                }
                if (!o.c) {
                    break;
                }
                final long n = o.h - f0.g.d();
                final long n2 = g0 - n;
                final int d = imw.d((List)o.r, (Comparable)n2, true);
                final long g2 = ((c$d)((List<c$c>)o.r).get(d)).G0;
                if (d != ((List)o.r).size() - 1) {
                    g0 = ((c$d)((List<Object>)o.r).get(d + 1)).G0;
                }
                else {
                    g0 = g2;
                }
                g0 = fbp.a(n2, g2, g0) + n;
                break;
            }
            else {
                ++i;
            }
        }
        return g0;
    }
    
    public final boolean i(final Uri uri, final h$c h$c, final boolean b) {
        final gmc[] v0 = this.V0;
        final int length = v0.length;
        int i = 0;
        boolean b2 = true;
        while (i < length) {
            final gmc gmc = v0[i];
            boolean b5 = false;
            Label_0293: {
                if (imw.k((Object[])gmc.F0.e, (Object)uri)) {
                    long b3 = 0L;
                    Label_0115: {
                        if (!b) {
                            final h$b a = ((f)gmc.K0).a(uvt.a(gmc.F0.q), h$c);
                            if (a != null && a.a == 2) {
                                b3 = a.b;
                                break Label_0115;
                            }
                        }
                        b3 = -9223372036854775807L;
                    }
                    final tlc f0 = gmc.F0;
                    int n = 0;
                    while (true) {
                        final Uri[] e = f0.e;
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
                            final int m = ((qvt)f0.q).m(n);
                            if (m != -1) {
                                f0.s |= uri.equals((Object)f0.o);
                                if (b3 != -9223372036854775807L) {
                                    if (!f0.q.e(m, b3) || !f0.g.k(uri, b3)) {
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
        ((p$a)this.S0).m((p)this);
        return b2;
    }
    
    public final long j(final long n) {
        final gmc[] w0 = this.W0;
        if (w0.length > 0) {
            final boolean h = w0[0].H(n, false);
            int n2 = 1;
            while (true) {
                final gmc[] w2 = this.W0;
                if (n2 >= w2.length) {
                    break;
                }
                w2[n2].H(n, h);
                ++n2;
            }
            if (h) {
                ((SparseArray)this.M0.C0).clear();
            }
        }
        return n;
    }
    
    public final long k() {
        return -9223372036854775807L;
    }
    
    public final void l(final h$a s0, final long n) {
        this.S0 = s0;
        this.D0.g((HlsPlaylistTracker$a)this);
        final com.google.android.exoplayer2.source.hls.playlist.d e = this.D0.e();
        Objects.requireNonNull(e);
        Map<Object, Object> emptyMap;
        if (this.Q0) {
            final List<b> m = e.m;
            final ArrayList list = new ArrayList(m);
            final HashMap hashMap = new HashMap();
            int n2 = 0;
            while (true) {
                emptyMap = hashMap;
                if (n2 >= list.size()) {
                    break;
                }
                b b = m.get(n2);
                final String e2 = b.E0;
                int i = ++n2;
                while (i < list.size()) {
                    final b b2 = (b)list.get(i);
                    if (TextUtils.equals((CharSequence)b2.E0, (CharSequence)e2)) {
                        final String e3 = b.E0;
                        boolean b3 = false;
                        Label_0188: {
                            if (e3 != null) {
                                final String e4 = b2.E0;
                                if (e4 != null) {
                                    if (!TextUtils.equals((CharSequence)e3, (CharSequence)e4)) {
                                        b3 = false;
                                        break Label_0188;
                                    }
                                }
                            }
                            b3 = true;
                        }
                        ri4.t(b3);
                        String s2 = b.E0;
                        if (s2 == null) {
                            s2 = b2.E0;
                        }
                        final b$b[] c0 = b.C0;
                        final b$b[] c2 = b2.C0;
                        final int a = imw.a;
                        final b$b[] copy = Arrays.copyOf(c0, c0.length + c2.length);
                        System.arraycopy(c2, 0, copy, c0.length, c2.length);
                        b = new b(s2, true, (b$b[])copy);
                        list.remove(i);
                    }
                    else {
                        ++i;
                    }
                }
                hashMap.put(e2, b);
            }
        }
        else {
            emptyMap = Collections.emptyMap();
        }
        final boolean empty = e.e.isEmpty();
        final List<d$a> g = e.g;
        final List<d$a> h = e.h;
        this.T0 = 0;
        final ArrayList<gmc> list2 = new ArrayList<gmc>();
        final ArrayList<int[]> list3 = new ArrayList<int[]>();
        Label_1375: {
            if (empty ^ true) {
                final int size = e.e.size();
                final int[] array = new int[size];
                int j = 0;
                int n3 = 0;
                int n4 = 0;
                while (j < e.e.size()) {
                    final n b4 = ((d$b)e.e.get(j)).b;
                    if (b4.T0 <= 0 && imw.r(b4.K0, 2) == null) {
                        if (imw.r(b4.K0, 1) != null) {
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
                        while (k < e.e.size()) {
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
                                final d$b d$b = e.e.get(k);
                                array2[n5] = d$b.a;
                                array3[n5] = d$b.b;
                                array4[n5] = k;
                                n6 = n5 + 1;
                            }
                            ++k;
                            n5 = n6;
                        }
                        final String k2 = array3[0].K0;
                        final int q = imw.q(k2, 2);
                        final int q2 = imw.q(k2, 1);
                        final boolean b7 = q2 <= 1 && q <= 1 && q2 + q > 0;
                        int n7;
                        if (!b5 && q2 > 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        final gmc o = this.o("main", n7, array2, array3, e.j, e.k, (Map<String, b>)emptyMap, n);
                        list2.add(o);
                        list3.add(array4);
                        if (this.O0 && b7) {
                            final ArrayList<lvt> list4 = new ArrayList<lvt>();
                            if (q > 0) {
                                final n[] array5 = new n[n3];
                                for (int l = 0; l < n3; ++l) {
                                    final n n8 = array3[l];
                                    final String r = imw.r(n8.K0, 2);
                                    final String d = zah.d(r);
                                    final n$a n$a = new n$a();
                                    n$a.a = n8.C0;
                                    n$a.b = n8.D0;
                                    n$a.j = n8.M0;
                                    n$a.k = d;
                                    n$a.h = r;
                                    n$a.i = n8.L0;
                                    n$a.f = n8.H0;
                                    n$a.g = n8.I0;
                                    n$a.p = n8.S0;
                                    n$a.q = n8.T0;
                                    n$a.r = n8.U0;
                                    n$a.d = n8.F0;
                                    n$a.e = n8.G0;
                                    array5[l] = new n(n$a);
                                }
                                list4.add(new lvt("main", array5));
                                if (q2 > 0 && (e.j != null || e.g.isEmpty())) {
                                    list4.add(new lvt("main".concat(":audio"), new n[] { q(array3[0], e.j, false) }));
                                }
                                final List<n> k3 = e.k;
                                if (k3 != null) {
                                    for (int n9 = 0; n9 < k3.size(); ++n9) {
                                        final StringBuilder sb = new StringBuilder(19);
                                        sb.append("main");
                                        sb.append(":cc:");
                                        sb.append(n9);
                                        list4.add(new lvt(sb.toString(), new n[] { k3.get(n9) }));
                                    }
                                }
                            }
                            else {
                                final n[] array6 = new n[n3];
                                for (int n10 = 0; n10 < n3; ++n10) {
                                    array6[n10] = q(array3[n10], e.j, true);
                                }
                                list4.add(new lvt("main", array6));
                            }
                            final String concat = "main".concat(":id3");
                            final n$a n$a2 = new n$a();
                            n$a2.a = "ID3";
                            n$a2.k = "application/id3";
                            final lvt lvt = new lvt(concat, new n[] { new n(n$a2) });
                            list4.add(lvt);
                            o.F((lvt[])list4.toArray(new lvt[0]), new int[] { list4.indexOf(lvt) });
                        }
                        break Label_1375;
                    }
                    final boolean b6 = false;
                    continue;
                }
            }
        }
        final Map<Object, Object> map = emptyMap;
        final ArrayList<int[]> list5 = list3;
        final ArrayList list6 = new ArrayList(g.size());
        final ArrayList list7 = new ArrayList(g.size());
        final ArrayList list8 = new ArrayList(g.size());
        final HashSet<String> set = new HashSet<String>();
        for (int n11 = 0; n11 < g.size(); ++n11) {
            final String c3 = g.get(n11).c;
            if (set.add(c3)) {
                list6.clear();
                list7.clear();
                list8.clear();
                int n12 = 0;
                int n13 = 1;
                while (n12 < g.size()) {
                    int n14 = n13;
                    if (imw.a((Object)c3, (Object)((d$a)g.get(n12)).c)) {
                        final d$a d$a = g.get(n12);
                        list8.add((Object)n12);
                        list6.add((Object)d$a.a);
                        list7.add((Object)d$a.b);
                        n14 = (n13 & ((imw.q(d$a.b.K0, 1) == 1) ? 1 : 0));
                    }
                    ++n12;
                    n13 = n14;
                }
                final String value = String.valueOf(c3);
                String concat2;
                if (value.length() != 0) {
                    concat2 = "audio:".concat(value);
                }
                else {
                    concat2 = new String("audio:");
                }
                final int a2 = imw.a;
                final gmc o2 = this.o(concat2, 1, (Uri[])list6.toArray((Object[])new Uri[0]), (n[])list7.toArray((Object[])new n[0]), null, Collections.emptyList(), (Map<String, b>)map, n);
                list5.add(g0e.t((Collection)list8));
                list2.add(o2);
                if (this.O0 && n13 != 0) {
                    o2.F(new lvt[] { new lvt(concat2, (n[])list7.toArray((Object[])new n[0])) }, new int[0]);
                }
            }
        }
        this.X0 = list2.size();
        for (int n15 = 0; n15 < h.size(); ++n15) {
            final d$a d$a2 = h.get(n15);
            final String c4 = d$a2.c;
            final StringBuilder sb2 = new StringBuilder(dia.o(c4, 21));
            sb2.append("subtitle:");
            sb2.append(n15);
            sb2.append(":");
            sb2.append(c4);
            final String string = sb2.toString();
            final gmc o3 = this.o(string, 3, new Uri[] { d$a2.a }, new n[] { d$a2.b }, null, Collections.emptyList(), (Map<String, b>)map, n);
            list5.add(new int[] { n15 });
            list2.add(o3);
            o3.F(new lvt[] { new lvt(string, new n[] { d$a2.b }) }, new int[0]);
        }
        this.V0 = list2.toArray(new gmc[0]);
        final int[][] array7 = list5.toArray(new int[0][]);
        final gmc[] v0 = this.V0;
        this.T0 = v0.length;
        v0[0].F0.l = true;
        for (final gmc gmc : v0) {
            if (!gmc.f1) {
                gmc.d(gmc.r1);
            }
        }
        this.W0 = this.V0;
    }
    
    public final void m(final p p) {
        final gmc gmc = (gmc)p;
        ((p$a)this.S0).m((p)this);
    }
    
    public final gmc o(final String s, final int n, final Uri[] array, final n[] array2, final n n2, final List<n> list, final Map<String, b> map, final long n3) {
        return new gmc(s, n, (gmc$b)this, new tlc(this.C0, this.D0, array, array2, this.E0, this.F0, this.M0, list, this.R0), (Map)map, this.K0, n3, n2, this.G0, this.H0, this.I0, this.J0, this.P0);
    }
    
    public final void p() throws IOException {
        for (final gmc gmc : this.V0) {
            gmc.E();
            if (gmc.v1 && !gmc.f1) {
                throw ParserException.a("Loading finished before preparation is complete.", (Throwable)null);
            }
        }
    }
    
    public final mvt r() {
        final mvt u0 = this.U0;
        Objects.requireNonNull(u0);
        return u0;
    }
    
    public final void s() {
        final int t0 = this.T0 - 1;
        this.T0 = t0;
        if (t0 > 0) {
            return;
        }
        final gmc[] v0 = this.V0;
        final int length = v0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final gmc gmc = v0[i];
            gmc.v();
            n += gmc.k1.C0;
            ++i;
        }
        final lvt[] array = new lvt[n];
        final gmc[] v2 = this.V0;
        final int length2 = v2.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final gmc gmc2 = v2[j];
            gmc2.v();
            for (int c0 = gmc2.k1.C0, k = 0; k < c0; ++k, ++n2) {
                gmc2.v();
                array[n2] = gmc2.k1.a(k);
            }
            ++j;
        }
        this.U0 = new mvt(array);
        this.S0.n((h)this);
    }
    
    public final void u(final long n, final boolean b) {
        for (final gmc gmc : this.W0) {
            if (gmc.e1) {
                if (!gmc.C()) {
                    for (int length2 = gmc.X0.length, j = 0; j < length2; ++j) {
                        ((o)gmc.X0[j]).g(n, b, gmc.p1[j]);
                    }
                }
            }
        }
    }
}
