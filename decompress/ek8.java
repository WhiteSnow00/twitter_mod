import android.os.BaseBundle;
import java.util.AbstractCollection;
import java.util.Arrays;
import android.graphics.Point;
import java.util.HashMap;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.f$a;
import android.os.Bundle;
import java.util.Iterator;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import android.annotation.SuppressLint;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;
import android.util.Pair;
import android.util.SparseArray;
import android.text.TextUtils;
import com.google.android.exoplayer2.n;
import android.content.Context;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public class ek8 extends pkg
{
    public static final loj<Integer> e;
    public static final loj<Integer> f;
    public final kga.b c;
    public final AtomicReference<c> d;
    
    static {
        e = loj.a((Comparator)ck8.E0);
        f = loj.a((Comparator)uve.F0);
    }
    
    public ek8(final Context context) {
        final dr$b c = new dr$b(10000, 25000, 25000, 0.7f);
        final c s1 = ek8.c.s1;
        final c e = new d(context).e();
        this.c = (kga.b)c;
        this.d = new AtomicReference<c>(e);
    }
    
    @Deprecated
    public ek8(final kga.b c) {
        final c s1 = ek8.c.s1;
        this.c = c;
        this.d = new AtomicReference<c>(s1);
    }
    
    public static int f(int bitCount, final int n) {
        if (bitCount != 0 && bitCount == n) {
            bitCount = Integer.MAX_VALUE;
        }
        else {
            bitCount = Integer.bitCount(bitCount & n);
        }
        return bitCount;
    }
    
    public static int g(final n n, String k, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)k) && k.equals(n.F0)) {
            return 4;
        }
        k = k(k);
        final String i = k(n.F0);
        final boolean b2 = false;
        if (i == null || k == null) {
            int n2 = b2 ? 1 : 0;
            if (b) {
                n2 = (b2 ? 1 : 0);
                if (i == null) {
                    n2 = 1;
                }
            }
            return n2;
        }
        if (i.startsWith(k) || k.startsWith(i)) {
            return 3;
        }
        final int a = cnw.a;
        if (i.split("-", 2)[0].equals(k.split("-", 2)[0])) {
            return 2;
        }
        return 0;
    }
    
    public static boolean i(int n, final boolean b) {
        n &= 0x7;
        return n == 4 || (b && n == 3);
    }
    
    public static String k(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final String s2 = s;
            if (!TextUtils.equals((CharSequence)s, (CharSequence)"und")) {
                return s2;
            }
        }
        return null;
    }
    
    public final /* bridge */ jwt a() {
        return this.h();
    }
    
    public final boolean c() {
        return true;
    }
    
    public final c h() {
        return this.d.get();
    }
    
    public final void j(final SparseArray<Pair<iwt$a, Integer>> sparseArray, final iwt$a iwt$a, final int n) {
        if (iwt$a == null) {
            return;
        }
        final int h = bbh.h(iwt$a.D0.F0[0].O0);
        final Pair pair = (Pair)sparseArray.get(h);
        if (pair == null || ((AbstractCollection)((iwt$a)pair.first).E0).isEmpty()) {
            sparseArray.put(h, (Object)Pair.create((Object)iwt$a, (Object)n));
        }
    }
    
    public kga.a[] l(final pkg$a pkg$a, final int[][][] array, final int[] array2, final c c) throws ExoPlaybackException {
        final int a = pkg$a.a;
        final kga.a[] array3 = new kga.a[a];
        final Pair<kga.a, Integer> o = this.o(2, pkg$a, array, (g.a<g>)new poo((Object)c, (Object)array2, 4), (Comparator<List<g>>)dk8.E0);
        if (o != null) {
            array3[o.second] = (kga.a)o.first;
        }
        final int n = 0;
        while (true) {
            for (int i = 0; i < pkg$a.a; ++i) {
                if (2 == pkg$a.b[i] && pkg$a.c[i].D0 > 0) {
                    final boolean b = true;
                    final Pair<kga.a, Integer> o2 = this.o(1, pkg$a, array, (g.a<g>)new ak8(c, b), zjb.F0);
                    if (o2 != null) {
                        array3[o2.second] = (kga.a)o2.first;
                    }
                    String f0;
                    if (o2 == null) {
                        f0 = null;
                    }
                    else {
                        final kga.a a2 = (kga.a)o2.first;
                        f0 = a2.a.F0[a2.b[0]].F0;
                    }
                    final Pair<kga.a, Integer> n2 = this.n(pkg$a, array, c, f0);
                    int j = n;
                    if (n2 != null) {
                        array3[n2.second] = (kga.a)n2.first;
                        j = n;
                    }
                    while (j < a) {
                        final int n3 = pkg$a.b[j];
                        if (n3 != 2 && n3 != 1 && n3 != 3) {
                            array3[j] = this.m(n3, pkg$a.c[j], array[j], c);
                        }
                        ++j;
                    }
                    return array3;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public kga.a m(int i, final cwt cwt, final int[][] array, final c c) throws ExoPlaybackException {
        final kga.a a = null;
        bwt bwt = null;
        b b = null;
        int j = 0;
        int n = 0;
        while (j < cwt.D0) {
            final bwt a2 = cwt.a(j);
            final int[] array2 = array[j];
            bwt bwt2;
            int n2;
            b b2;
            b b3;
            for (i = 0; i < a2.D0; ++i, bwt = bwt2, n = n2, b = b2) {
                bwt2 = bwt;
                n2 = n;
                b2 = b;
                if (i(array2[i], c.n1)) {
                    b3 = new b(a2.F0[i], array2[i]);
                    if (b != null) {
                        bwt2 = bwt;
                        n2 = n;
                        b2 = b;
                        if (b3.b(b) <= 0) {
                            continue;
                        }
                    }
                    bwt2 = a2;
                    n2 = i;
                    b2 = b3;
                }
            }
            ++j;
        }
        Object o;
        if (bwt == null) {
            o = a;
        }
        else {
            o = new kga.a(bwt, new int[] { n });
        }
        return (kga.a)o;
    }
    
    @SuppressLint({ "WrongConstant" })
    public Pair<kga.a, Integer> n(final pkg$a pkg$a, final int[][][] array, final c c, final String s) throws ExoPlaybackException {
        return this.o(3, pkg$a, array, (g.a<g>)new d71((Object)c, s, 3), (Comparator<List<g>>)bk8.E0);
    }
    
    public final <T extends g<T>> Pair<kga.a, Integer> o(int i, final pkg$a pkg$a, final int[][][] array, final g.a<T> a, final Comparator<List<T>> comparator) {
        final ArrayList list = new ArrayList();
        int n;
        for (int a2 = pkg$a.a, j = 0; j < a2; ++j, a2 = n) {
            n = a2;
            if (i == pkg$a.b[j]) {
                final cwt cwt = pkg$a.c[j];
                int n2 = 0;
                while (true) {
                    n = a2;
                    if (n2 >= cwt.D0) {
                        break;
                    }
                    final bwt a3 = cwt.a(n2);
                    final List<T> b = a.b(j, a3, array[j][n2]);
                    final boolean[] array2 = new boolean[a3.D0];
                    for (int k = 0; k < a3.D0; ++k) {
                        final g<T> g = b.get(k);
                        final int b2 = g.b();
                        if (!array2[k]) {
                            if (b2 != 0) {
                                RandomAccess t;
                                if (b2 == 1) {
                                    t = edd.t(g);
                                }
                                else {
                                    t = new ArrayList<Object>();
                                    ((ArrayList<g>)t).add(g);
                                    for (int l = k + 1; l < a3.D0; ++l) {
                                        final g<T> g2 = b.get(l);
                                        if (g2.b() == 2 && g.e((g)g2)) {
                                            ((ArrayList<g>)t).add(g2);
                                            array2[l] = true;
                                        }
                                    }
                                }
                                list.add(t);
                            }
                        }
                    }
                    ++n2;
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        final List list2 = Collections.max((Collection<? extends List>)list, (Comparator<? super List>)comparator);
        final int[] array3 = new int[list2.size()];
        for (i = 0; i < list2.size(); ++i) {
            array3[i] = ((g)list2.get(i)).F0;
        }
        final g g3 = (g)list2.get(0);
        return (Pair<kga.a, Integer>)Pair.create((Object)new kga.a(g3.E0, array3), (Object)g3.D0);
    }
    
    public final void p(final jwt jwt) {
        this.q((c)jwt);
        final d d = new d(this.d.get());
        ((jwt.a)d).a(jwt);
        this.q(new c(d));
    }
    
    public final void q(final c c) {
        if (!this.d.getAndSet(c).equals(c)) {
            ((lwt)this).b();
        }
    }
    
    public static final class a extends g<a> implements Comparable<a>
    {
        public final int H0;
        public final boolean I0;
        public final String J0;
        public final c K0;
        public final boolean L0;
        public final int M0;
        public final int N0;
        public final int O0;
        public final boolean P0;
        public final int Q0;
        public final int R0;
        public final boolean S0;
        public final int T0;
        public final int U0;
        public final int V0;
        public final int W0;
        public final boolean X0;
        public final boolean Y0;
        
        public a(int i, final bwt bwt, int n, final c k0, final int n2, final boolean b) {
            super(i, bwt, n);
            this.K0 = k0;
            this.J0 = ek8.k(super.G0.F0);
            final int n3 = 0;
            this.L0 = ek8.i(n2, false);
            i = 0;
            int n4;
            while (true) {
                n = ((AbstractCollection)k0.Q0).size();
                n4 = Integer.MAX_VALUE;
                if (i >= n) {
                    i = Integer.MAX_VALUE;
                    n = 0;
                    break;
                }
                n = ek8.g(super.G0, (String)k0.Q0.get(i), false);
                if (n > 0) {
                    break;
                }
                ++i;
            }
            this.N0 = i;
            this.M0 = n;
            this.O0 = ek8.f(super.G0.H0, k0.R0);
            final n g0 = super.G0;
            i = g0.H0;
            this.P0 = (i == 0 || (i & 0x1) != 0x0);
            this.S0 = ((g0.G0 & 0x1) != 0x0);
            i = g0.b1;
            this.T0 = i;
            this.U0 = g0.c1;
            n = g0.K0;
            this.V0 = n;
            this.I0 = ((n == -1 || n <= k0.T0) && (i == -1 || i <= k0.S0));
            while (true) {
                String[] a;
                String o0;
                c k2;
                for (a = cnw.A(), i = 0; i < a.length; ++i) {
                    n = ek8.g(super.G0, a[i], false);
                    if (n > 0) {
                        this.Q0 = i;
                        this.R0 = n;
                        i = 0;
                        while (true) {
                            n = n4;
                            if (i >= ((AbstractCollection)k0.U0).size()) {
                                break;
                            }
                            o0 = super.G0.O0;
                            if (o0 != null && o0.equals(k0.U0.get(i))) {
                                n = i;
                                break;
                            }
                            ++i;
                        }
                        this.W0 = n;
                        this.X0 = ((n2 & 0x80) == 0x80);
                        this.Y0 = ((n2 & 0x40) == 0x40);
                        Label_0542: {
                            if (!ek8.i(n2, this.K0.n1)) {
                                i = n3;
                            }
                            else if (!this.I0 && !this.K0.i1) {
                                i = n3;
                            }
                            else {
                                if (ek8.i(n2, false) && this.I0 && super.G0.K0 != -1) {
                                    k2 = this.K0;
                                    if (!k2.Z0 && !k2.Y0 && (k2.p1 || !b)) {
                                        i = 2;
                                        break Label_0542;
                                    }
                                }
                                i = 1;
                            }
                        }
                        this.H0 = i;
                        return;
                    }
                }
                i = Integer.MAX_VALUE;
                n = 0;
                continue;
            }
        }
        
        @Override
        public final int b() {
            return this.H0;
        }
        
        @Override
        public final /* bridge */ int compareTo(final Object o) {
            return this.f((a)o);
        }
        
        @Override
        public final boolean e(final g g) {
            final a a = (a)g;
            final c k0 = this.K0;
            if (!k0.l1) {
                final int b1 = super.G0.b1;
                if (b1 == -1 || b1 != a.G0.b1) {
                    return false;
                }
            }
            if (!k0.j1) {
                final String o0 = super.G0.O0;
                if (o0 == null || !TextUtils.equals((CharSequence)o0, (CharSequence)a.G0.O0)) {
                    return false;
                }
            }
            final c k2 = this.K0;
            if (!k2.k1) {
                final int c1 = super.G0.c1;
                if (c1 == -1 || c1 != a.G0.c1) {
                    return false;
                }
            }
            if (k2.m1 || (this.X0 == a.X0 && this.Y0 == a.Y0)) {
                return true;
            }
            return false;
        }
        
        public final int f(final a a) {
            loj loj;
            if (this.I0 && this.L0) {
                loj = ek8.e;
            }
            else {
                loj = ek8.e.b();
            }
            final ky5 d = ky5.a.d(this.L0, a.L0);
            final int n0 = this.N0;
            final int n2 = a.N0;
            final jvm d2 = jvm.D0;
            final ky5 c = d.c(n0, n2, (Comparator<Integer>)d2).a(this.M0, a.M0).a(this.O0, a.O0).d(this.S0, a.S0).d(this.P0, a.P0).c(this.Q0, a.Q0, (Comparator<Integer>)d2).a(this.R0, a.R0).d(this.I0, a.I0).c(this.W0, a.W0, (Comparator<Integer>)d2);
            final int v0 = this.V0;
            final int v2 = a.V0;
            loj loj2;
            if (this.K0.Y0) {
                loj2 = ek8.e.b();
            }
            else {
                loj2 = ek8.f;
            }
            final ky5 c2 = c.c(v0, v2, (Comparator<Integer>)loj2).d(this.X0, a.X0).d(this.Y0, a.Y0).c(this.T0, a.T0, (Comparator<Integer>)loj).c(this.U0, a.U0, (Comparator<Integer>)loj);
            final int v3 = this.V0;
            final int v4 = a.V0;
            if (!cnw.a(this.J0, a.J0)) {
                loj = ek8.f;
            }
            return c2.c(v3, v4, (Comparator<Integer>)loj).f();
        }
    }
    
    public static final class b implements Comparable<b>
    {
        public final boolean D0;
        public final boolean E0;
        
        public b(final n n, final int n2) {
            final int g0 = n.G0;
            boolean d0 = true;
            if ((g0 & 0x1) == 0x0) {
                d0 = false;
            }
            this.D0 = d0;
            this.E0 = ek8.i(n2, false);
        }
        
        public final int b(final b b) {
            return ky5.a.d(this.E0, b.E0).d(this.D0, b.D0).f();
        }
        
        @Override
        public final /* bridge */ int compareTo(final Object o) {
            return this.b((b)o);
        }
    }
    
    public static final class c extends jwt
    {
        public static final c s1;
        public final int d1;
        public final boolean e1;
        public final boolean f1;
        public final boolean g1;
        public final boolean h1;
        public final boolean i1;
        public final boolean j1;
        public final boolean k1;
        public final boolean l1;
        public final boolean m1;
        public final boolean n1;
        public final boolean o1;
        public final boolean p1;
        public final SparseArray<Map<cwt, e>> q1;
        public final SparseBooleanArray r1;
        
        static {
            s1 = new d().e();
        }
        
        public c(final d d) {
            super((jwt.a)d);
            this.e1 = d.z;
            this.f1 = d.A;
            this.g1 = d.B;
            this.h1 = d.C;
            this.i1 = d.D;
            this.j1 = d.E;
            this.k1 = d.F;
            this.l1 = d.G;
            this.m1 = d.H;
            this.d1 = d.I;
            this.n1 = d.J;
            this.o1 = d.K;
            this.p1 = d.L;
            this.q1 = d.M;
            this.r1 = d.N;
        }
        
        public static String b(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && c.class == o.getClass()) {
                final c c = (c)o;
                if (super.equals((Object)c) && this.e1 == c.e1 && this.f1 == c.f1 && this.g1 == c.g1 && this.h1 == c.h1 && this.i1 == c.i1 && this.j1 == c.j1 && this.k1 == c.k1 && this.l1 == c.l1 && this.m1 == c.m1 && this.d1 == c.d1 && this.n1 == c.n1 && this.o1 == c.o1 && this.p1 == c.p1) {
                    final SparseBooleanArray r1 = this.r1;
                    final SparseBooleanArray r2 = c.r1;
                    final int size = r1.size();
                    boolean b2 = false;
                    Label_0259: {
                        Label_0223: {
                            if (r2.size() == size) {
                                for (int i = 0; i < size; ++i) {
                                    if (r2.indexOfKey(r1.keyAt(i)) < 0) {
                                        break Label_0223;
                                    }
                                }
                                b2 = true;
                                break Label_0259;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        final SparseArray<Map<cwt, e>> q1 = this.q1;
                        final SparseArray<Map<cwt, e>> q2 = c.q1;
                        final int size2 = q1.size();
                        boolean b4 = false;
                        Label_0466: {
                            Label_0291: {
                                if (q2.size() == size2) {
                                    for (int j = 0; j < size2; ++j) {
                                        final int indexOfKey = q2.indexOfKey(q1.keyAt(j));
                                        if (indexOfKey < 0) {
                                            break Label_0291;
                                        }
                                        final Map map = (Map)q1.valueAt(j);
                                        final Map map2 = (Map)q2.valueAt(indexOfKey);
                                        boolean b3 = false;
                                        Label_0451: {
                                            Label_0444: {
                                                if (map2.size() == map.size()) {
                                                    for (final Map.Entry<cwt, V> entry : map.entrySet()) {
                                                        final cwt cwt = entry.getKey();
                                                        if (!map2.containsKey(cwt) || !cnw.a(entry.getValue(), map2.get(cwt))) {
                                                            break Label_0444;
                                                        }
                                                    }
                                                    b3 = true;
                                                    break Label_0451;
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (!b3) {
                                            break Label_0291;
                                        }
                                    }
                                    b4 = true;
                                    break Label_0466;
                                }
                            }
                            b4 = false;
                        }
                        if (b4) {
                            return b;
                        }
                    }
                }
                b = false;
                return b;
            }
            return false;
        }
        
        public final int hashCode() {
            return (((((((((((((super.hashCode() + 31) * 31 + (this.e1 ? 1 : 0)) * 31 + (this.f1 ? 1 : 0)) * 31 + (this.g1 ? 1 : 0)) * 31 + (this.h1 ? 1 : 0)) * 31 + (this.i1 ? 1 : 0)) * 31 + (this.j1 ? 1 : 0)) * 31 + (this.k1 ? 1 : 0)) * 31 + (this.l1 ? 1 : 0)) * 31 + (this.m1 ? 1 : 0)) * 31 + this.d1) * 31 + (this.n1 ? 1 : 0)) * 31 + (this.o1 ? 1 : 0)) * 31 + (this.p1 ? 1 : 0);
        }
    }
    
    public static final class d extends jwt.a
    {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public int I;
        public boolean J;
        public boolean K;
        public boolean L;
        public final SparseArray<Map<cwt, e>> M;
        public final SparseBooleanArray N;
        public boolean z;
        
        @Deprecated
        public d() {
            this.M = (SparseArray<Map<cwt, e>>)new SparseArray();
            this.N = new SparseBooleanArray();
            this.f();
        }
        
        public d(final Context context) {
            this.c(context);
            this.i(context, true);
            this.M = (SparseArray<Map<cwt, e>>)new SparseArray();
            this.N = new SparseBooleanArray();
            this.f();
        }
        
        public d(final Bundle bundle) {
            super(bundle);
            final c s1 = c.s1;
            this.z = bundle.getBoolean(c.b(1000), s1.e1);
            this.A = bundle.getBoolean(c.b(1001), s1.f1);
            this.B = bundle.getBoolean(c.b(1002), s1.g1);
            this.C = bundle.getBoolean(c.b(1015), s1.h1);
            this.D = bundle.getBoolean(c.b(1003), s1.i1);
            this.E = bundle.getBoolean(c.b(1004), s1.j1);
            this.F = bundle.getBoolean(c.b(1005), s1.k1);
            this.G = bundle.getBoolean(c.b(1006), s1.l1);
            this.H = bundle.getBoolean(c.b(1016), s1.m1);
            this.I = ((BaseBundle)bundle).getInt(c.b(1007), s1.d1);
            this.J = bundle.getBoolean(c.b(1008), s1.n1);
            this.K = bundle.getBoolean(c.b(1009), s1.o1);
            this.L = bundle.getBoolean(c.b(1010), s1.p1);
            this.M = (SparseArray<Map<cwt, e>>)new SparseArray();
            final int[] intArray = ((BaseBundle)bundle).getIntArray(c.b(1011));
            final List<com.google.android.exoplayer2.f> b = dt2.b((com.google.android.exoplayer2.f$a<com.google.android.exoplayer2.f>)cwt.H0, bundle.getParcelableArrayList(c.b(1012)), (List<com.google.android.exoplayer2.f>)abm.H0);
            final a71 g0 = ek8.e.G0;
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(c.b(1013));
            SparseArray sparseArray = new SparseArray();
            final int n = 0;
            if (sparseParcelableArray != null) {
                final SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                int n2 = 0;
                while (true) {
                    sparseArray = sparseArray2;
                    if (n2 >= sparseParcelableArray.size()) {
                        break;
                    }
                    sparseArray2.put(sparseParcelableArray.keyAt(n2), (Object)g0.m((Bundle)sparseParcelableArray.valueAt(n2)));
                    ++n2;
                }
            }
            if (intArray != null) {
                if (intArray.length == b.size()) {
                    for (int i = 0; i < intArray.length; ++i) {
                        final int n3 = intArray[i];
                        final cwt cwt = (cwt)b.get(i);
                        final e e = (e)sparseArray.get(i);
                        Map map;
                        if ((map = (Map)this.M.get(n3)) == null) {
                            map = new HashMap();
                            this.M.put(n3, (Object)map);
                        }
                        if (!map.containsKey(cwt) || !cnw.a(map.get(cwt), e)) {
                            map.put(cwt, e);
                        }
                    }
                }
            }
            final int[] intArray2 = ((BaseBundle)bundle).getIntArray(c.b(1014));
            SparseBooleanArray n4;
            if (intArray2 == null) {
                n4 = new SparseBooleanArray();
            }
            else {
                n4 = new SparseBooleanArray(intArray2.length);
                for (int length = intArray2.length, j = n; j < length; ++j) {
                    n4.append(intArray2[j], true);
                }
            }
            this.N = n4;
        }
        
        public d(final c c) {
            super(c);
            this.I = c.d1;
            this.z = c.e1;
            this.A = c.f1;
            this.B = c.g1;
            this.C = c.h1;
            this.D = c.i1;
            this.E = c.j1;
            this.F = c.k1;
            this.G = c.l1;
            this.H = c.m1;
            this.J = c.n1;
            this.K = c.o1;
            this.L = c.p1;
            final SparseArray<Map<cwt, e>> q1 = c.q1;
            final SparseArray m = new SparseArray();
            for (int i = 0; i < q1.size(); ++i) {
                m.put(q1.keyAt(i), (Object)new HashMap((Map<?, ?>)q1.valueAt(i)));
            }
            this.M = (SparseArray<Map<cwt, e>>)m;
            this.N = c.r1.clone();
        }
        
        @Override
        public final jwt.a c(final Context context) {
            super.c(context);
            return this;
        }
        
        @Override
        public final jwt.a d(final String[] array) {
            super.d(array);
            return this;
        }
        
        public final c e() {
            return new c(this);
        }
        
        public final void f() {
            this.z = true;
            this.A = false;
            this.B = true;
            this.C = false;
            this.D = true;
            this.E = false;
            this.F = false;
            this.G = false;
            this.H = false;
            this.I = 0;
            this.J = true;
            this.K = false;
            this.L = true;
        }
        
        public final d g(final String... array) {
            super.d(array);
            return this;
        }
        
        public final jwt.a h(final int i, final int j) {
            super.i = i;
            super.j = j;
            super.k = true;
            return this;
        }
        
        public final jwt.a i(final Context context, final boolean b) {
            final Point s = cnw.s(context);
            this.h(s.x, s.y);
            return this;
        }
    }
    
    public static final class e implements com.google.android.exoplayer2.f
    {
        public static final f$a<e> G0;
        public final int D0;
        public final int[] E0;
        public final int F0;
        
        static {
            e.G0 = a71.I0;
        }
        
        public e(final int d0, int[] copy, final int f0) {
            this.D0 = d0;
            copy = Arrays.copyOf(copy, copy.length);
            this.E0 = copy;
            this.F0 = f0;
            Arrays.sort(copy);
        }
        
        public static String a(final int n) {
            return Integer.toString(n, 36);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e.class == o.getClass()) {
                final e e = (e)o;
                if (this.D0 != e.D0 || !Arrays.equals(this.E0, e.E0) || this.F0 != e.F0) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return (Arrays.hashCode(this.E0) + this.D0 * 31) * 31 + this.F0;
        }
    }
    
    public static final class f extends g<f> implements Comparable<f>
    {
        public final int H0;
        public final boolean I0;
        public final boolean J0;
        public final boolean K0;
        public final int L0;
        public final int M0;
        public final int N0;
        public final int O0;
        public final boolean P0;
        
        public f(int i, final bwt bwt, int g, final c c, final int n, final String s) {
            super(i, bwt, g);
            final int n2 = 0;
            this.I0 = ek8.i(n, false);
            i = (super.G0.G0 & ~c.d1);
            this.J0 = ((i & 0x1) != 0x0);
            this.K0 = ((i & 0x2) != 0x0);
            g = Integer.MAX_VALUE;
            edd<String> edd;
            if (((AbstractCollection)c.V0).isEmpty()) {
                edd = edd.t("");
            }
            else {
                edd = c.V0;
            }
            while (true) {
                int g2;
                int f;
                for (i = 0; i < ((AbstractCollection)edd).size(); ++i) {
                    g2 = ek8.g(super.G0, edd.get(i), c.X0);
                    if (g2 > 0) {
                        g = i;
                        i = g2;
                        this.L0 = g;
                        this.M0 = i;
                        f = ek8.f(super.G0.H0, c.W0);
                        this.N0 = f;
                        this.P0 = ((super.G0.H0 & 0x440) != 0x0);
                        g = ek8.g(super.G0, s, ek8.k(s) == null);
                        this.O0 = g;
                        if (i <= 0 && (!((AbstractCollection)c.V0).isEmpty() || f <= 0) && !this.J0 && (!this.K0 || g <= 0)) {
                            g = 0;
                        }
                        else {
                            g = 1;
                        }
                        i = n2;
                        if (ek8.i(n, c.n1)) {
                            i = n2;
                            if (g != 0) {
                                i = 1;
                            }
                        }
                        this.H0 = i;
                        return;
                    }
                }
                i = 0;
                continue;
            }
        }
        
        @Override
        public final int b() {
            return this.H0;
        }
        
        @Override
        public final /* bridge */ int compareTo(final Object o) {
            return this.f((f)o);
        }
        
        @Override
        public final /* bridge */ boolean e(final g g) {
            final f f = (f)g;
            return false;
        }
        
        public final int f(final f f) {
            final ky5 d = ky5.a.d(this.I0, f.I0);
            final int l0 = this.L0;
            final int l2 = f.L0;
            final z9i d2 = z9i.D0;
            Object d3 = jvm.D0;
            final ky5 d4 = d.c(l0, l2, (Comparator<Integer>)d3).a(this.M0, f.M0).a(this.N0, f.N0).d(this.J0, f.J0);
            final boolean k0 = this.K0;
            final boolean k2 = f.K0;
            if (this.M0 == 0) {
                d3 = d2;
            }
            ky5 ky5 = d4.c(k0, k2, (Comparator<Boolean>)d3).a(this.O0, f.O0);
            if (this.N0 == 0) {
                ky5 = ky5.e(this.P0, f.P0);
            }
            return ky5.f();
        }
    }
    
    public abstract static class g<T extends g<T>>
    {
        public final int D0;
        public final bwt E0;
        public final int F0;
        public final n G0;
        
        public g(final int d0, final bwt e0, final int f0) {
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            this.G0 = e0.F0[f0];
        }
        
        public abstract int b();
        
        public abstract boolean e(final T p0);
        
        public interface a<T extends g<T>>
        {
            List<T> b(final int p0, final bwt p1, final int[] p2);
        }
    }
    
    public static final class h extends g<h>
    {
        public final boolean H0;
        public final c I0;
        public final boolean J0;
        public final boolean K0;
        public final int L0;
        public final int M0;
        public final int N0;
        public final int O0;
        public final boolean P0;
        public final boolean Q0;
        public final int R0;
        public final boolean S0;
        public final boolean T0;
        public final int U0;
        
        public h(int n, final bwt bwt, int t0, final c i0, final int n2, int n3, final boolean b) {
            super(n, bwt, t0);
            this.I0 = i0;
            int n4;
            if (i0.g1) {
                n4 = 24;
            }
            else {
                n4 = 16;
            }
            final boolean f1 = i0.f1;
            final int n5 = 0;
            this.Q0 = (f1 && (n3 & n4) != 0x0);
            boolean h0 = false;
            Label_0172: {
                if (b) {
                    final n g0 = super.G0;
                    n = g0.T0;
                    if (n == -1 || n <= i0.D0) {
                        n = g0.U0;
                        if (n == -1 || n <= i0.E0) {
                            final float v0 = g0.V0;
                            if (v0 == -1.0f || v0 <= i0.F0) {
                                n = g0.K0;
                                if (n == -1 || n <= i0.G0) {
                                    h0 = true;
                                    break Label_0172;
                                }
                            }
                        }
                    }
                }
                h0 = false;
            }
            this.H0 = h0;
            boolean j0 = false;
            Label_0280: {
                if (b) {
                    final n g2 = super.G0;
                    n = g2.T0;
                    if (n == -1 || n >= i0.H0) {
                        n = g2.U0;
                        if (n == -1 || n >= i0.I0) {
                            final float v2 = g2.V0;
                            if (v2 == -1.0f || v2 >= i0.J0) {
                                n = g2.K0;
                                if (n == -1 || n >= i0.K0) {
                                    j0 = true;
                                    break Label_0280;
                                }
                            }
                        }
                    }
                }
                j0 = false;
            }
            this.J0 = j0;
            this.K0 = ek8.i(n2, false);
            final n g3 = super.G0;
            this.L0 = g3.K0;
            t0 = g3.T0;
            Label_0341: {
                if (t0 != -1) {
                    n = g3.U0;
                    if (n != -1) {
                        n *= t0;
                        break Label_0341;
                    }
                }
                n = -1;
            }
            this.M0 = n;
            this.O0 = ek8.f(g3.H0, i0.P0);
            n = super.G0.H0;
            this.P0 = (n == 0 || (n & 0x1) != 0x0);
            n3 = Integer.MAX_VALUE;
            n = 0;
            while (true) {
                t0 = n3;
                if (n >= ((AbstractCollection)i0.O0).size()) {
                    break;
                }
                final String o0 = super.G0.O0;
                if (o0 != null && o0.equals(i0.O0.get(n))) {
                    t0 = n;
                    break;
                }
                ++n;
            }
            this.N0 = t0;
            this.S0 = ((n2 & 0x80) == 0x80);
            this.T0 = ((n2 & 0x40) == 0x40);
            final n g4 = super.G0;
            final String o2 = g4.O0;
            t0 = 3;
            Label_0693: {
                if (o2 != null) {
                    Label_0657: {
                        switch (o2) {
                            case "video/x-vnd.on2.vp9": {
                                n = 3;
                                break Label_0657;
                            }
                            case "video/avc": {
                                n = 2;
                                break Label_0657;
                            }
                            case "video/hevc": {
                                n = 1;
                                break Label_0657;
                            }
                            case "video/av01": {
                                n = 0;
                                break Label_0657;
                            }
                            default:
                                break;
                        }
                        n = -1;
                    }
                    if (n == 0) {
                        t0 = 4;
                        break Label_0693;
                    }
                    if (n == 1) {
                        break Label_0693;
                    }
                    if (n == 2) {
                        t0 = 1;
                        break Label_0693;
                    }
                    if (n == 3) {
                        t0 = 2;
                        break Label_0693;
                    }
                }
                t0 = 0;
            }
            this.U0 = t0;
            Label_0828: {
                if ((g4.H0 & 0x4000) != 0x0) {
                    n = n5;
                }
                else if (!ek8.i(n2, this.I0.n1)) {
                    n = n5;
                }
                else if (!this.H0 && !this.I0.e1) {
                    n = n5;
                }
                else {
                    if (ek8.i(n2, false) && this.J0 && this.H0 && super.G0.K0 != -1) {
                        final c i2 = this.I0;
                        if (!i2.Z0 && !i2.Y0 && (n4 & n2) != 0x0) {
                            n = 2;
                            break Label_0828;
                        }
                    }
                    n = 1;
                }
            }
            this.R0 = n;
        }
        
        public static int f(final h h, final h h2) {
            ky5 ky6;
            final ky5 ky5 = ky6 = ky5.a.d(h.K0, h2.K0).a(h.O0, h2.O0).d(h.P0, h2.P0).d(h.H0, h2.H0).d(h.J0, h2.J0).c(h.N0, h2.N0, (Comparator<Integer>)jvm.D0).d(h.S0, h2.S0).d(h.T0, h2.T0);
            if (h.S0) {
                ky6 = ky5;
                if (h.T0) {
                    ky6 = ky5.a(h.U0, h2.U0);
                }
            }
            return ky6.f();
        }
        
        public static int g(final h h, final h h2) {
            loj loj;
            if (h.H0 && h.K0) {
                loj = ek8.e;
            }
            else {
                loj = ek8.e.b();
            }
            final ky5$a a = ky5.a;
            final int l0 = h.L0;
            final int l2 = h2.L0;
            loj loj2;
            if (h.I0.Y0) {
                loj2 = ek8.e.b();
            }
            else {
                loj2 = ek8.f;
            }
            return a.c((Object)l0, (Object)l2, (Comparator)loj2).c(h.M0, h2.M0, (Comparator<Integer>)loj).c(h.L0, h2.L0, (Comparator<Integer>)loj).f();
        }
        
        @Override
        public final int b() {
            return this.R0;
        }
        
        @Override
        public final boolean e(final g g) {
            final h h = (h)g;
            return (this.Q0 || cnw.a(super.G0.O0, h.G0.O0)) && (this.I0.h1 || (this.S0 == h.S0 && this.T0 == h.T0));
        }
    }
}
