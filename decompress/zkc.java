import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import java.util.HashSet;
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
import java.util.List;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.f;
import android.net.Uri;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.p;
import java.util.Objects;
import com.google.android.exoplayer2.source.h$a;
import java.util.IdentityHashMap;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.drm.c$a;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.h;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zkc implements h, glc$b, a
{
    public final vkc D0;
    public final HlsPlaylistTracker E0;
    public final ukc F0;
    public final pyt G0;
    public final d H0;
    public final c$a I0;
    public final com.google.android.exoplayer2.upstream.h J0;
    public final j.a K0;
    public final rx L0;
    public final IdentityHashMap<tro, Integer> M0;
    public final yng N0;
    public final jee O0;
    public final boolean P0;
    public final int Q0;
    public final boolean R0;
    public final onk S0;
    public h$a T0;
    public int U0;
    public cwt V0;
    public glc[] W0;
    public glc[] X0;
    public int Y0;
    public mcg Z0;
    
    public zkc(final vkc d0, final HlsPlaylistTracker e0, final ukc f0, final pyt g0, final d h0, final c$a i0, final com.google.android.exoplayer2.upstream.h j0, final j.a k0, final rx l0, final jee o0, final boolean p14, final int q0, final boolean r0, final onk s0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        Objects.requireNonNull(o0);
        this.Z0 = new mcg((Object)new p[0]);
        this.M0 = new IdentityHashMap<tro, Integer>();
        this.N0 = new yng(4);
        this.W0 = new glc[0];
        this.X0 = new glc[0];
    }
    
    public static n m(final n n, final n n2, final boolean b) {
        int j0 = -1;
        z8h i;
        int x;
        int d;
        int e;
        String c;
        String b2;
        String r;
        if (n2 != null) {
            final String l0 = n2.L0;
            i = n2.M0;
            x = n2.b1;
            d = n2.G0;
            e = n2.H0;
            c = n2.F0;
            b2 = n2.E0;
            r = l0;
        }
        else {
            r = cnw.r(n.L0, 1);
            i = n.M0;
            if (b) {
                x = n.b1;
                d = n.G0;
                e = n.H0;
                c = n.F0;
                b2 = n.E0;
            }
            else {
                c = null;
                e = 0;
                d = 0;
                x = -1;
                b2 = null;
            }
        }
        final String d2 = bbh.d(r);
        int i2;
        if (b) {
            i2 = n.I0;
        }
        else {
            i2 = -1;
        }
        if (b) {
            j0 = n.J0;
        }
        final n$a n$a = new n$a();
        n$a.a = n.D0;
        n$a.b = b2;
        n$a.j = n.N0;
        n$a.k = d2;
        n$a.h = r;
        n$a.i = i;
        n$a.f = i2;
        n$a.g = j0;
        n$a.x = x;
        n$a.d = d;
        n$a.e = e;
        n$a.c = c;
        return n$a.a();
    }
    
    public final void A(final long n, final boolean b) {
        for (final glc glc : this.X0) {
            if (glc.f1) {
                if (!glc.C()) {
                    for (int length2 = glc.Y0.length, j = 0; j < length2; ++j) {
                        glc.Y0[j].g(n, b, glc.q1[j]);
                    }
                }
            }
        }
    }
    
    public final void a() {
        for (final glc glc : this.W0) {
            if (!glc.Q0.isEmpty()) {
                final xkc xkc = (xkc)rp9.Z(glc.Q0);
                final int b = glc.G0.b(xkc);
                if (b == 1) {
                    xkc.K = true;
                }
                else if (b == 2 && !glc.w1 && glc.M0.c()) {
                    glc.M0.a();
                }
            }
        }
        ((p.a<zkc>)this.T0).e(this);
    }
    
    public final boolean b(final Uri uri, final com.google.android.exoplayer2.upstream.h.c c, final boolean b) {
        final glc[] w0 = this.W0;
        final int length = w0.length;
        int i = 0;
        boolean b2 = true;
        while (i < length) {
            final glc glc = w0[i];
            boolean b5 = false;
            Label_0293: {
                if (cnw.k(glc.G0.e, uri)) {
                    long b3 = 0L;
                    Label_0115: {
                        if (!b) {
                            final com.google.android.exoplayer2.upstream.h.b a = ((f)glc.L0).a(kwt.a(glc.G0.q), c);
                            if (a != null && a.a == 2) {
                                b3 = a.b;
                                break Label_0115;
                            }
                        }
                        b3 = -9223372036854775807L;
                    }
                    final tkc g0 = glc.G0;
                    int n = 0;
                    while (true) {
                        final Uri[] e = g0.e;
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
                            final int m = ((gwt)g0.q).m(n);
                            if (m != -1) {
                                g0.s |= uri.equals((Object)g0.o);
                                if (b3 != -9223372036854775807L) {
                                    if (!g0.q.e(m, b3) || !g0.g.l(uri, b3)) {
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
        ((p.a<zkc>)this.T0).e(this);
        return b2;
    }
    
    public final boolean c() {
        return this.Z0.c();
    }
    
    public final long d() {
        return this.Z0.d();
    }
    
    public final void e(final p p) {
        final glc glc = (glc)p;
        ((p.a<zkc>)this.T0).e(this);
    }
    
    public final boolean f(final long n) {
        if (this.V0 == null) {
            for (final glc glc : this.W0) {
                if (!glc.g1) {
                    glc.f(glc.s1);
                }
            }
            return false;
        }
        return this.Z0.f(n);
    }
    
    public final long g() {
        return this.Z0.g();
    }
    
    public final void h(final long n) {
        this.Z0.h(n);
    }
    
    public final long j(final kga[] array, final boolean[] array2, final tro[] array3, final boolean[] array4, final long n) {
        final int[] array5 = new int[array.length];
        final int[] array6 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            int intValue;
            if (array3[i] == null) {
                intValue = -1;
            }
            else {
                intValue = this.M0.get(array3[i]);
            }
            array5[i] = intValue;
            array6[i] = -1;
            if (array[i] != null) {
                final bwt o = ((gwt)array[i]).o();
                int n2 = 0;
                while (true) {
                    final glc[] w0 = this.W0;
                    if (n2 >= w0.length) {
                        break;
                    }
                    final glc glc = w0[n2];
                    glc.t();
                    if (glc.l1.b(o) != -1) {
                        array6[i] = n2;
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.M0.clear();
        final int length = array.length;
        final tro[] array7 = new tro[length];
        final int length2 = array.length;
        final tro[] array8 = new tro[length2];
        final int length3 = array.length;
        final kga[] array9 = new kga[length3];
        final glc[] array10 = new glc[this.W0.length];
        int j = 0;
        int n3 = 0;
        int n4 = 0;
        while (j < this.W0.length) {
            for (int k = 0; k < array.length; ++k) {
                tro tro;
                if (array5[k] == j) {
                    tro = array3[k];
                }
                else {
                    tro = null;
                }
                array8[k] = tro;
                kga kga;
                if (array6[k] == j) {
                    kga = array[k];
                }
                else {
                    kga = null;
                }
                array9[k] = kga;
            }
            final glc glc2 = this.W0[j];
            glc2.t();
            final int h1 = glc2.h1;
            for (int l = 0; l < length3; ++l) {
                final flc flc = (flc)array8[l];
                if (flc != null && (array9[l] == null || !array2[l])) {
                    --glc2.h1;
                    if (flc.F0 != -1) {
                        final glc e0 = flc.E0;
                        final int d0 = flc.D0;
                        e0.t();
                        Objects.requireNonNull(e0.n1);
                        final int n5 = e0.n1[d0];
                        omy.k(e0.q1[n5]);
                        e0.q1[n5] = false;
                        flc.F0 = -1;
                    }
                    array8[l] = null;
                }
            }
            int n6;
            if (n4 || (glc2.v1 ? (h1 == 0) : (n != glc2.s1))) {
                n6 = 1;
            }
            else {
                n6 = 0;
            }
            kga q;
            final kga kga2 = q = glc2.G0.q;
            kga kga3;
            int n8;
            for (int n7 = 0; n7 < length3; ++n7, q = kga3, n6 = n8) {
                final kga q2 = array9[n7];
                if (q2 == null) {
                    kga3 = q;
                    n8 = n6;
                }
                else {
                    final int b = glc2.l1.b(((gwt)q2).o());
                    if (b == glc2.o1) {
                        glc2.G0.q = q2;
                        q = q2;
                    }
                    kga3 = q;
                    n8 = n6;
                    if (array8[n7] == null) {
                        ++glc2.h1;
                        array8[n7] = (tro)new flc(glc2, b);
                        array4[n7] = true;
                        kga3 = q;
                        n8 = n6;
                        if (glc2.n1 != null) {
                            ((flc)array8[n7]).a();
                            kga3 = q;
                            if ((n8 = n6) == 0) {
                                final glc.d d2 = glc2.Y0[glc2.n1[b]];
                                int n9;
                                if (!d2.A(n, true) && d2.q + d2.s != 0) {
                                    n9 = 1;
                                }
                                else {
                                    n9 = 0;
                                }
                                n8 = n9;
                                kga3 = q;
                            }
                        }
                    }
                }
            }
            if (glc2.h1 == 0) {
                glc2.G0.n = null;
                glc2.j1 = null;
                glc2.u1 = true;
                glc2.Q0.clear();
                if (glc2.M0.c()) {
                    if (glc2.f1) {
                        final glc.d[] y0 = glc2.Y0;
                        for (int length4 = y0.length, n10 = 0; n10 < length4; ++n10) {
                            y0[n10].h();
                        }
                    }
                    glc2.M0.a();
                }
                else {
                    glc2.G();
                }
            }
            else {
                boolean b3 = false;
                Label_1014: {
                    if (!glc2.Q0.isEmpty() && !cnw.a(q, kga2)) {
                        boolean b2 = false;
                        Label_0990: {
                            if (!glc2.v1) {
                                long n11 = 0L;
                                if (n < 0L) {
                                    n11 = -n;
                                }
                                final xkc z = glc2.z();
                                q.n(n, n11, -9223372036854775807L, glc2.R0, glc2.G0.a(z, n));
                                if (q.q() == glc2.G0.h.a(((m94)z).d)) {
                                    b2 = false;
                                    break Label_0990;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            glc2.u1 = true;
                            b3 = true;
                            n6 = 1;
                            break Label_1014;
                        }
                    }
                    b3 = (n4 != 0);
                }
                if (n6 != 0) {
                    glc2.H(n, b3);
                    for (int n12 = 0; n12 < length2; ++n12) {
                        if (array8[n12] != null) {
                            array4[n12] = true;
                        }
                    }
                }
            }
            glc2.V0.clear();
            for (final tro tro2 : array8) {
                if (tro2 != null) {
                    glc2.V0.add(tro2);
                }
            }
            glc2.v1 = true;
            int n14 = 0;
            int n16;
            for (int n15 = 0; n15 < array.length; ++n15, n14 = n16) {
                final tro tro3 = array8[n15];
                if (array6[n15] == j) {
                    Objects.requireNonNull(tro3);
                    array7[n15] = tro3;
                    this.M0.put(tro3, j);
                    n16 = 1;
                }
                else {
                    n16 = n14;
                    if (array5[n15] == j) {
                        omy.k(tro3 == null);
                        n16 = n14;
                    }
                }
            }
            Label_1349: {
                if (n14 != 0) {
                    array10[n3] = glc2;
                    final int n17 = n3 + 1;
                    if (n3 == 0) {
                        glc2.G0.l = true;
                        if (n6 == 0) {
                            final glc[] x0 = this.X0;
                            if (x0.length != 0) {
                                n3 = n17;
                                if (glc2 == x0[0]) {
                                    break Label_1349;
                                }
                            }
                        }
                        ((SparseArray)this.N0.D0).clear();
                        n4 = (true ? 1 : 0);
                        n3 = n17;
                    }
                    else {
                        glc2.G0.l = (j < this.Y0);
                        n3 = n17;
                    }
                }
            }
            ++j;
        }
        System.arraycopy(array7, 0, array3, 0, length);
        final glc[] x2 = cnw.J(array10, n3);
        this.X0 = x2;
        Objects.requireNonNull(this.O0);
        this.Z0 = new mcg((Object)x2);
        return n;
    }
    
    public final long k(long h0, final wbp wbp) {
        final glc[] x0 = this.X0;
        final int length = x0.length;
        int i = 0;
        while (i < length) {
            final glc glc = x0[i];
            if (glc.d1 == 2) {
                final tkc g0 = glc.G0;
                final int c = g0.q.c();
                final Uri[] e = g0.e;
                c o;
                if (c < e.length && c != -1) {
                    o = g0.g.o(e[g0.q.q()], true);
                }
                else {
                    o = null;
                }
                if (o == null || o.r.isEmpty()) {
                    break;
                }
                if (!((clc)o).c) {
                    break;
                }
                final long n = o.h - g0.g.d();
                final long n2 = h0 - n;
                final int d = cnw.d((List)o.r, (Comparable)n2, true);
                final long h2 = ((c.d)o.r.get(d)).H0;
                if (d != o.r.size() - 1) {
                    h0 = ((c.d)o.r.get(d + 1)).H0;
                }
                else {
                    h0 = h2;
                }
                h0 = wbp.a(n2, h2, h0) + n;
                break;
            }
            else {
                ++i;
            }
        }
        return h0;
    }
    
    public final glc l(final String s, final int n, final Uri[] array, final n[] array2, final n n2, final List<n> list, final Map<String, com.google.android.exoplayer2.drm.b> map, final long n3) {
        return new glc(s, n, (glc$b)this, new tkc(this.D0, this.E0, array, array2, this.F0, this.G0, this.N0, (List)list, this.S0), (Map)map, this.L0, n3, n2, this.H0, this.I0, this.J0, this.K0, this.Q0);
    }
    
    public final void n() {
        final int u0 = this.U0 - 1;
        this.U0 = u0;
        if (u0 > 0) {
            return;
        }
        final glc[] w0 = this.W0;
        final int length = w0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final glc glc = w0[i];
            glc.t();
            n += glc.l1.D0;
            ++i;
        }
        final bwt[] array = new bwt[n];
        final glc[] w2 = this.W0;
        final int length2 = w2.length;
        int j = 0;
        int n2 = 0;
        while (j < length2) {
            final glc glc2 = w2[j];
            glc2.t();
            for (int d0 = glc2.l1.D0, k = 0; k < d0; ++k, ++n2) {
                glc2.t();
                array[n2] = glc2.l1.a(k);
            }
            ++j;
        }
        this.V0 = new cwt(array);
        this.T0.i((h)this);
    }
    
    public final long o(final long n) {
        final glc[] x0 = this.X0;
        if (x0.length > 0) {
            final boolean h = x0[0].H(n, false);
            int n2 = 1;
            while (true) {
                final glc[] x2 = this.X0;
                if (n2 >= x2.length) {
                    break;
                }
                x2[n2].H(n, h);
                ++n2;
            }
            if (h) {
                ((SparseArray)this.N0.D0).clear();
            }
        }
        return n;
    }
    
    public final long p() {
        return -9223372036854775807L;
    }
    
    public final void q(final h$a t0, final long n) {
        this.T0 = t0;
        this.E0.h((HlsPlaylistTracker.a)this);
        final com.google.android.exoplayer2.source.hls.playlist.d f = this.E0.f();
        Objects.requireNonNull(f);
        Map<String, com.google.android.exoplayer2.drm.b> emptyMap;
        if (this.R0) {
            final List m = f.m;
            final ArrayList list = new ArrayList(m);
            final HashMap hashMap = new HashMap();
            int n2 = 0;
            while (true) {
                emptyMap = hashMap;
                if (n2 >= list.size()) {
                    break;
                }
                com.google.android.exoplayer2.drm.b b = m.get(n2);
                final String f2 = b.F0;
                int i = ++n2;
                while (i < list.size()) {
                    final com.google.android.exoplayer2.drm.b b2 = (com.google.android.exoplayer2.drm.b)list.get(i);
                    if (TextUtils.equals((CharSequence)b2.F0, (CharSequence)f2)) {
                        final String f3 = b.F0;
                        boolean b3 = false;
                        Label_0188: {
                            if (f3 != null) {
                                final String f4 = b2.F0;
                                if (f4 != null) {
                                    if (!TextUtils.equals((CharSequence)f3, (CharSequence)f4)) {
                                        b3 = false;
                                        break Label_0188;
                                    }
                                }
                            }
                            b3 = true;
                        }
                        omy.k(b3);
                        String s = b.F0;
                        if (s == null) {
                            s = b2.F0;
                        }
                        final b$b[] d0 = b.D0;
                        final b$b[] d2 = b2.D0;
                        final int a = cnw.a;
                        final b$b[] copy = Arrays.copyOf(d0, d0.length + d2.length);
                        System.arraycopy(d2, 0, copy, d0.length, d2.length);
                        b = new com.google.android.exoplayer2.drm.b(s, true, (b$b[])copy);
                        list.remove(i);
                    }
                    else {
                        ++i;
                    }
                }
                hashMap.put(f2, b);
            }
        }
        else {
            emptyMap = Collections.emptyMap();
        }
        final boolean empty = f.e.isEmpty();
        final List g = f.g;
        final List h = f.h;
        this.U0 = 0;
        final ArrayList<glc> list2 = new ArrayList<glc>();
        final ArrayList<int[]> list3 = new ArrayList<int[]>();
        Label_1375: {
            if (empty ^ true) {
                final int size = f.e.size();
                final int[] array = new int[size];
                int j = 0;
                int n3 = 0;
                int n4 = 0;
                while (j < f.e.size()) {
                    final n b4 = f.e.get(j).b;
                    if (b4.U0 <= 0 && cnw.r(b4.L0, 2) == null) {
                        if (cnw.r(b4.L0, 1) != null) {
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
                                final com.google.android.exoplayer2.source.hls.playlist.d.b b7 = f.e.get(k);
                                array2[n5] = b7.a;
                                array3[n5] = b7.b;
                                array4[n5] = k;
                                n6 = n5 + 1;
                            }
                            ++k;
                            n5 = n6;
                        }
                        final String l0 = array3[0].L0;
                        final int q = cnw.q(l0, 2);
                        final int q2 = cnw.q(l0, 1);
                        final boolean b8 = q2 <= 1 && q <= 1 && q2 + q > 0;
                        int n7;
                        if (!b5 && q2 > 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        final glc l2 = this.l("main", n7, array2, array3, f.j, f.k, emptyMap, n);
                        list2.add(l2);
                        list3.add(array4);
                        if (this.P0 && b8) {
                            final ArrayList<bwt> list4 = new ArrayList<bwt>();
                            if (q > 0) {
                                final n[] array5 = new n[n3];
                                for (int n8 = 0; n8 < n3; ++n8) {
                                    final n n9 = array3[n8];
                                    final String r = cnw.r(n9.L0, 2);
                                    final String d3 = bbh.d(r);
                                    final n$a n$a = new n$a();
                                    n$a.a = n9.D0;
                                    n$a.b = n9.E0;
                                    n$a.j = n9.N0;
                                    n$a.k = d3;
                                    n$a.h = r;
                                    n$a.i = n9.M0;
                                    n$a.f = n9.I0;
                                    n$a.g = n9.J0;
                                    n$a.p = n9.T0;
                                    n$a.q = n9.U0;
                                    n$a.r = n9.V0;
                                    n$a.d = n9.G0;
                                    n$a.e = n9.H0;
                                    array5[n8] = new n(n$a);
                                }
                                list4.add(new bwt("main", array5));
                                if (q2 > 0 && (f.j != null || f.g.isEmpty())) {
                                    list4.add(new bwt("main".concat(":audio"), new n[] { m(array3[0], f.j, false) }));
                                }
                                final List k2 = f.k;
                                if (k2 != null) {
                                    for (int n10 = 0; n10 < k2.size(); ++n10) {
                                        final StringBuilder sb = new StringBuilder(19);
                                        sb.append("main");
                                        sb.append(":cc:");
                                        sb.append(n10);
                                        list4.add(new bwt(sb.toString(), new n[] { k2.get(n10) }));
                                    }
                                }
                            }
                            else {
                                final n[] array6 = new n[n3];
                                for (int n11 = 0; n11 < n3; ++n11) {
                                    array6[n11] = m(array3[n11], f.j, true);
                                }
                                list4.add(new bwt("main", array6));
                            }
                            final String concat = "main".concat(":id3");
                            final n$a n$a2 = new n$a();
                            n$a2.a = "ID3";
                            n$a2.k = "application/id3";
                            final bwt bwt = new bwt(concat, new n[] { new n(n$a2) });
                            list4.add(bwt);
                            l2.F((bwt[])list4.toArray(new bwt[0]), new int[] { list4.indexOf(bwt) });
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
        for (int n12 = 0; n12 < g.size(); ++n12) {
            final String c = g.get(n12).c;
            if (set.add(c)) {
                list5.clear();
                list6.clear();
                list7.clear();
                int n13 = 0;
                int n14 = 1;
                while (n13 < g.size()) {
                    int n15 = n14;
                    if (cnw.a(c, ((com.google.android.exoplayer2.source.hls.playlist.d.a)g.get(n13)).c)) {
                        final com.google.android.exoplayer2.source.hls.playlist.d.a a2 = g.get(n13);
                        list7.add((Object)n13);
                        list5.add((Object)a2.a);
                        list6.add((Object)a2.b);
                        n15 = (n14 & ((cnw.q(a2.b.L0, 1) == 1) ? 1 : 0));
                    }
                    ++n13;
                    n14 = n15;
                }
                final String value = String.valueOf(c);
                String concat2;
                if (value.length() != 0) {
                    concat2 = "audio:".concat(value);
                }
                else {
                    concat2 = new String("audio:");
                }
                final int a3 = cnw.a;
                final glc l3 = this.l(concat2, 1, (Uri[])list5.toArray((Object[])new Uri[0]), (n[])list6.toArray((Object[])new n[0]), null, Collections.emptyList(), emptyMap, n);
                list3.add(jzd.r((Collection)list7));
                list2.add(l3);
                if (this.P0 && n14 != 0) {
                    l3.F(new bwt[] { new bwt(concat2, (n[])list6.toArray((Object[])new n[0])) }, new int[0]);
                }
            }
        }
        this.Y0 = list2.size();
        for (int n16 = 0; n16 < h.size(); ++n16) {
            final com.google.android.exoplayer2.source.hls.playlist.d.a a4 = h.get(n16);
            final String c2 = a4.c;
            final StringBuilder sb2 = new StringBuilder(wnj.f(c2, 21));
            sb2.append("subtitle:");
            sb2.append(n16);
            sb2.append(":");
            sb2.append(c2);
            final String string = sb2.toString();
            final glc l4 = this.l(string, 3, new Uri[] { a4.a }, new n[] { a4.b }, null, Collections.emptyList(), emptyMap, n);
            list3.add(new int[] { n16 });
            list2.add(l4);
            l4.F(new bwt[] { new bwt(string, new n[] { a4.b }) }, new int[0]);
        }
        this.W0 = list2.toArray(new glc[0]);
        final int[][] array7 = list3.toArray(new int[0][]);
        final glc[] w0 = this.W0;
        this.U0 = w0.length;
        w0[0].G0.l = true;
        for (final glc glc : w0) {
            if (!glc.g1) {
                glc.f(glc.s1);
            }
        }
        this.X0 = this.W0;
    }
    
    public final void s() throws IOException {
        for (final glc glc : this.W0) {
            glc.E();
            if (glc.w1 && !glc.g1) {
                throw ParserException.a("Loading finished before preparation is complete.", (Throwable)null);
            }
        }
    }
    
    public final cwt x() {
        final cwt v0 = this.V0;
        Objects.requireNonNull(v0);
        return v0;
    }
}
