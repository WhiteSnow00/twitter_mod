// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Looper;
import java.io.FileDescriptor;
import android.content.Context;
import android.app.Activity;
import java.util.Set;
import java.io.Writer;
import java.io.PrintWriter;
import androidx.lifecycle.d$c;
import androidx.activity.result.ActivityResultRegistry;
import android.annotation.SuppressLint;
import androidx.activity.result.ActivityResultRegistry$b;
import android.os.Parcelable;
import java.util.List;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Objects;
import java.util.HashSet;
import java.util.Collection;
import android.util.Log;
import android.view.ViewParent;
import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import j$.util.DesugarCollections;
import java.util.HashMap;
import android.content.res.Configuration;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.ArrayDeque;
import android.content.Intent;

public abstract class p
{
    public jo<Intent> A;
    public jo<vud> B;
    public jo<String[]> C;
    public ArrayDeque<l> D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<a> J;
    public ArrayList<Boolean> K;
    public ArrayList<Fragment> L;
    public bpb M;
    public p$f N;
    public final ArrayList<m> a;
    public boolean b;
    public final gy8 c;
    public ArrayList<a> d;
    public ArrayList<Fragment> e;
    public final nob f;
    public OnBackPressedDispatcher g;
    public final p$b h;
    public final AtomicInteger i;
    public final Map<String, tf1> j;
    public final Map<String, Bundle> k;
    public final Map<String, Object> l;
    public final o m;
    public final CopyOnWriteArrayList<cpb> n;
    public final hk6<Configuration> o;
    public final hk6<Integer> p;
    public final hk6<ush> q;
    public final hk6<rck> r;
    public final p$c s;
    public int t;
    public lob<?> u;
    public fb v;
    public Fragment w;
    public Fragment x;
    public p$d y;
    public p$e z;
    
    public p() {
        this.a = new ArrayList<m>();
        this.c = new gy8(1);
        this.f = new nob(this);
        this.h = new pgj() {
            @Override
            public final void a() {
                final p c = androidx.fragment.app.p.this;
                c.A(true);
                if (c.h.a) {
                    c.X();
                }
                else {
                    c.g.b();
                }
            }
        };
        this.i = new AtomicInteger();
        this.j = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.k = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.l = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.m = new o(this);
        this.n = new CopyOnWriteArrayList<cpb>();
        this.o = new xob(this);
        this.p = new yob(this);
        this.q = new vob(this);
        this.r = new wob(this);
        this.s = new h5h() {
            @Override
            public final boolean q(final MenuItem menuItem) {
                return androidx.fragment.app.p.this.p(menuItem);
            }
            
            @Override
            public final void r(final Menu menu) {
                androidx.fragment.app.p.this.q(menu);
            }
            
            @Override
            public final void s(final Menu menu) {
                androidx.fragment.app.p.this.t(menu);
            }
            
            @Override
            public final void t(final Menu menu, final MenuInflater menuInflater) {
                androidx.fragment.app.p.this.k(menu, menuInflater);
            }
        };
        this.t = -1;
        this.y = new androidx.fragment.app.n() {
            @Override
            public final Fragment a(final ClassLoader classLoader, final String s) {
                return Fragment.c1(androidx.fragment.app.p.this.u.E0, s);
            }
        };
        this.z = new h0r() {};
        this.D = new ArrayDeque<l>();
        this.N = new Runnable() {
            @Override
            public final void run() {
                androidx.fragment.app.p.this.A(true);
            }
        };
    }
    
    public static <F extends Fragment> F F(final View view) {
        final Fragment i = I(view);
        if (i != null) {
            return (F)i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" does not have a Fragment set");
        throw new IllegalStateException(sb.toString());
    }
    
    public static Fragment I(View view) {
        while (view != null) {
            final Object tag = view.getTag(2131429269);
            Fragment fragment;
            if (tag instanceof Fragment) {
                fragment = (Fragment)tag;
            }
            else {
                fragment = null;
            }
            if (fragment != null) {
                return fragment;
            }
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View)parent;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    public static boolean P(final int n) {
        return Log.isLoggable("FragmentManager", n);
    }
    
    public final boolean A(boolean b) {
        this.z(b);
        b = false;
        while (true) {
            final ArrayList<a> j = this.J;
            final ArrayList<Boolean> k = this.K;
            synchronized (this.a) {
                Label_0125: {
                    if (this.a.isEmpty()) {
                        monitorexit(this.a);
                        final boolean b2 = false;
                        break Label_0125;
                    }
                    try {
                        final int size = this.a.size();
                        int i = 0;
                        boolean b2 = false;
                        while (i < size) {
                            b2 |= this.a.get(i).a(j, k);
                            ++i;
                        }
                        this.a.clear();
                        this.u.F0.removeCallbacks((Runnable)this.N);
                        monitorexit(this.a);
                        if (b2) {
                            this.b = true;
                            try {
                                this.c0(this.J, this.K);
                                this.d();
                                b = true;
                                continue;
                            }
                            finally {
                                this.d();
                            }
                        }
                        this.o0();
                        this.v();
                        this.c.b();
                        return b;
                    }
                    finally {
                        this.a.clear();
                        this.u.F0.removeCallbacks((Runnable)this.N);
                    }
                }
            }
        }
    }
    
    public final void B(final m m, final boolean b) {
        if (b && (this.u == null || this.H)) {
            return;
        }
        this.z(b);
        if (m.a(this.J, this.K)) {
            this.b = true;
            try {
                this.c0(this.J, this.K);
            }
            finally {
                this.d();
            }
        }
        this.o0();
        this.v();
        this.c.b();
    }
    
    public final void C(final ArrayList<a> list, final ArrayList<Boolean> list2, int i, int j) {
        final boolean o = list.get(i).o;
        final ArrayList<Fragment> l = this.L;
        if (l == null) {
            this.L = new ArrayList<Fragment>();
        }
        else {
            l.clear();
        }
        this.L.addAll(this.c.k());
        Fragment fragment = this.x;
        int n = 0;
        Fragment fragment2;
        int n6;
        for (int k = i; k < j; ++k, fragment = fragment2, n = n6) {
            final a a = list.get(k);
            if (!list2.get(k)) {
                final ArrayList<Fragment> m = this.L;
                int n2 = 0;
                while (true) {
                    fragment2 = fragment;
                    if (n2 >= a.a.size()) {
                        break;
                    }
                    final s.a a2 = a.a.get(n2);
                    final int a3 = a2.a;
                    Label_0576: {
                        Label_0565: {
                            if (a3 != 1) {
                                Fragment b;
                                int n3;
                                if (a3 != 2) {
                                    if (a3 != 3 && a3 != 6) {
                                        if (a3 == 7) {
                                            break Label_0565;
                                        }
                                        if (a3 != 8) {
                                            b = fragment;
                                            n3 = n2;
                                        }
                                        else {
                                            a.a.add(n2, new s.a(9, fragment, true));
                                            a2.c = true;
                                            n3 = n2 + 1;
                                            b = a2.b;
                                        }
                                    }
                                    else {
                                        m.remove(a2.b);
                                        final Fragment b2 = a2.b;
                                        b = fragment;
                                        n3 = n2;
                                        if (b2 == fragment) {
                                            a.a.add(n2, new s.a(9, b2));
                                            ++n2;
                                            fragment = null;
                                            break Label_0576;
                                        }
                                    }
                                }
                                else {
                                    final Fragment b3 = a2.b;
                                    final int z0 = b3.Z0;
                                    int n4 = m.size() - 1;
                                    boolean b4 = false;
                                    while (n4 >= 0) {
                                        final Fragment fragment3 = m.get(n4);
                                        if (fragment3.Z0 == z0) {
                                            if (fragment3 == b3) {
                                                b4 = true;
                                            }
                                            else {
                                                if (fragment3 == fragment) {
                                                    a.a.add(n2, new s.a(9, fragment3, true));
                                                    ++n2;
                                                    fragment = null;
                                                }
                                                final s.a a4 = new s.a(3, fragment3, true);
                                                a4.d = a2.d;
                                                a4.f = a2.f;
                                                a4.e = a2.e;
                                                a4.g = a2.g;
                                                a.a.add(n2, a4);
                                                m.remove(fragment3);
                                                ++n2;
                                            }
                                        }
                                        --n4;
                                    }
                                    if (b4) {
                                        a.a.remove(n2);
                                        n3 = n2 - 1;
                                        b = fragment;
                                    }
                                    else {
                                        a2.a = 1;
                                        a2.c = true;
                                        m.add(b3);
                                        b = fragment;
                                        n3 = n2;
                                    }
                                }
                                fragment = b;
                                n2 = n3;
                                break Label_0576;
                            }
                        }
                        m.add(a2.b);
                    }
                    ++n2;
                }
            }
            else {
                final ArrayList<Fragment> l2 = this.L;
                int n5 = a.a.size() - 1;
                while (true) {
                    fragment2 = fragment;
                    if (n5 < 0) {
                        break;
                    }
                    final s.a a5 = a.a.get(n5);
                    final int a6 = a5.a;
                    Label_0737: {
                        Label_0726: {
                            if (a6 != 1) {
                                Label_0712: {
                                    if (a6 != 3) {
                                        switch (a6) {
                                            case 10: {
                                                a5.i = a5.h;
                                                break;
                                            }
                                            case 9: {
                                                fragment = a5.b;
                                                break;
                                            }
                                            case 8: {
                                                fragment = null;
                                                break;
                                            }
                                            case 6: {
                                                break Label_0712;
                                            }
                                            case 7: {
                                                break Label_0726;
                                            }
                                        }
                                        break Label_0737;
                                    }
                                }
                                l2.add(a5.b);
                                break Label_0737;
                            }
                        }
                        l2.remove(a5.b);
                    }
                    --n5;
                }
            }
            if (n == 0 && !a.g) {
                n6 = 0;
            }
            else {
                n6 = 1;
            }
        }
        this.L.clear();
        if (!o && this.t >= 1) {
            for (int n7 = i; n7 < j; ++n7) {
                final Iterator<s.a> iterator = list.get(n7).a.iterator();
                while (iterator.hasNext()) {
                    final Fragment b5 = ((s.a)iterator.next()).b;
                    if (b5 != null && b5.U0 != null) {
                        this.c.l(this.f(b5));
                    }
                }
            }
        }
        final int n8 = j;
        for (int n9 = i; n9 < n8; ++n9) {
            final a a7 = list.get(n9);
            if (list2.get(n9)) {
                a7.i(-1);
                for (int n10 = a7.a.size() - 1; n10 >= 0; --n10) {
                    final s.a a8 = a7.a.get(n10);
                    final Fragment b6 = a8.b;
                    if (b6 != null) {
                        b6.R1(true);
                        final int f = a7.f;
                        j = 4099;
                        if (f != 4097) {
                            if (f != 8194) {
                                if (f != 8197) {
                                    if (f != 4099) {
                                        if (f != 4100) {
                                            j = 0;
                                        }
                                        else {
                                            j = 8197;
                                        }
                                    }
                                }
                                else {
                                    j = 4100;
                                }
                            }
                            else {
                                j = 4097;
                            }
                        }
                        else {
                            j = 8194;
                        }
                        if (b6.m1 != null || j != 0) {
                            b6.K0();
                            b6.m1.f = j;
                        }
                        final ArrayList<String> n11 = a7.n;
                        final ArrayList<String> m2 = a7.m;
                        b6.K0();
                        final Fragment.d m3 = b6.m1;
                        m3.g = n11;
                        m3.h = m2;
                    }
                    switch (a8.a) {
                        default: {
                            final StringBuilder g = w48.g("Unknown cmd: ");
                            g.append(a8.a);
                            throw new IllegalArgumentException(g.toString());
                        }
                        case 10: {
                            a7.p.h0(b6, a8.h);
                            break;
                        }
                        case 9: {
                            a7.p.i0(b6);
                            break;
                        }
                        case 8: {
                            a7.p.i0(null);
                            break;
                        }
                        case 7: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.g0(b6, true);
                            a7.p.g(b6);
                            break;
                        }
                        case 6: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.c(b6);
                            break;
                        }
                        case 5: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.g0(b6, true);
                            a7.p.O(b6);
                            break;
                        }
                        case 4: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.k0(b6);
                            break;
                        }
                        case 3: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.a(b6);
                            break;
                        }
                        case 1: {
                            b6.M1(a8.d, a8.e, a8.f, a8.g);
                            a7.p.g0(b6, true);
                            a7.p.b0(b6);
                            break;
                        }
                    }
                }
            }
            else {
                a7.i(1);
                int size;
                s.a a9;
                Fragment b7;
                int f2;
                ArrayList<String> m4;
                ArrayList<String> n12;
                Fragment.d m5;
                StringBuilder g2;
                for (size = a7.a.size(), j = 0; j < size; ++j) {
                    a9 = (s.a)a7.a.get(j);
                    b7 = a9.b;
                    if (b7 != null) {
                        b7.R1(false);
                        f2 = a7.f;
                        if (b7.m1 != null || f2 != 0) {
                            b7.K0();
                            b7.m1.f = f2;
                        }
                        m4 = a7.m;
                        n12 = a7.n;
                        b7.K0();
                        m5 = b7.m1;
                        m5.g = m4;
                        m5.h = n12;
                    }
                    switch (a9.a) {
                        default: {
                            g2 = w48.g("Unknown cmd: ");
                            g2.append(a9.a);
                            throw new IllegalArgumentException(g2.toString());
                        }
                        case 10: {
                            a7.p.h0(b7, a9.i);
                            break;
                        }
                        case 9: {
                            a7.p.i0(null);
                            break;
                        }
                        case 8: {
                            a7.p.i0(b7);
                            break;
                        }
                        case 7: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.g0(b7, false);
                            a7.p.c(b7);
                            break;
                        }
                        case 6: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.g(b7);
                            break;
                        }
                        case 5: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.g0(b7, false);
                            a7.p.k0(b7);
                            break;
                        }
                        case 4: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.O(b7);
                            break;
                        }
                        case 3: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.b0(b7);
                            break;
                        }
                        case 1: {
                            b7.M1(a9.d, a9.e, a9.f, a9.g);
                            a7.p.g0(b7, false);
                            a7.p.a(b7);
                            break;
                        }
                    }
                }
            }
        }
        final boolean booleanValue = list2.get(n8 - 1);
        a a10;
        int n13;
        Fragment b8;
        Iterator<s.a> iterator2;
        Fragment b9;
        for (j = i; j < n8; ++j) {
            a10 = list.get(j);
            if (booleanValue) {
                for (n13 = a10.a.size() - 1; n13 >= 0; --n13) {
                    b8 = ((s.a)a10.a.get(n13)).b;
                    if (b8 != null) {
                        this.f(b8).k();
                    }
                }
            }
            else {
                iterator2 = a10.a.iterator();
                while (iterator2.hasNext()) {
                    b9 = ((s.a)iterator2.next()).b;
                    if (b9 != null) {
                        this.f(b9).k();
                    }
                }
            }
        }
        this.U(this.t, true);
        final HashSet<v> set = new HashSet<v>();
        Iterator<s.a> iterator3;
        Fragment b10;
        ViewGroup i2;
        for (j = i; j < n8; ++j) {
            iterator3 = list.get(j).a.iterator();
            while (iterator3.hasNext()) {
                b10 = ((s.a)iterator3.next()).b;
                if (b10 != null) {
                    i2 = b10.i1;
                    if (i2 == null) {
                        continue;
                    }
                    set.add(androidx.fragment.app.v.f(i2, this.N()));
                }
            }
        }
        for (final v v : set) {
            v.d = booleanValue;
            v.h();
            v.c();
        }
        while (i < n8) {
            final a a11 = list.get(i);
            if (list2.get(i) && a11.r >= 0) {
                a11.r = -1;
            }
            Objects.requireNonNull(a11);
            ++i;
        }
    }
    
    public final boolean D() {
        final boolean a = this.A(true);
        this.J();
        return a;
    }
    
    public final Fragment E(final String s) {
        return this.c.f(s);
    }
    
    public final Fragment G(final int n) {
        final gy8 c = this.c;
        int size = ((ArrayList)c.a).size();
        Fragment c2 = null;
    Label_0129:
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                for (final r r : ((HashMap)c.b).values()) {
                    if (r != null) {
                        c2 = r.c;
                        if (c2.Y0 == n) {
                            break Label_0129;
                        }
                        continue;
                    }
                }
                c2 = null;
                break;
            }
            c2 = ((ArrayList)c.a).get(n2);
            size = n2;
            if (c2 == null) {
                continue;
            }
            size = n2;
            if (c2.Y0 == n) {
                break;
            }
        }
        return c2;
    }
    
    public final Fragment H(final String s) {
        final gy8 c = this.c;
        Objects.requireNonNull(c);
        if (s != null) {
            int size = ((ArrayList)c.a).size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final Fragment fragment = ((ArrayList)c.a).get(n);
                size = n;
                if (fragment == null) {
                    continue;
                }
                size = n;
                if (s.equals(fragment.a1)) {
                    return fragment;
                }
            }
        }
        if (s != null) {
            for (final r r : ((HashMap)c.b).values()) {
                if (r != null) {
                    final Fragment c2 = r.c;
                    if (s.equals(c2.a1)) {
                        return c2;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    public final void J() {
        for (final v v : (HashSet)this.e()) {
            if (v.e) {
                if (P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                v.e = false;
                v.c();
            }
        }
    }
    
    public final ViewGroup K(final Fragment fragment) {
        final ViewGroup i1 = fragment.i1;
        if (i1 != null) {
            return i1;
        }
        if (fragment.Z0 <= 0) {
            return null;
        }
        if (this.v.r0()) {
            final View q0 = this.v.q0(fragment.Z0);
            if (q0 instanceof ViewGroup) {
                return (ViewGroup)q0;
            }
        }
        return null;
    }
    
    public final androidx.fragment.app.n L() {
        final Fragment w = this.w;
        if (w != null) {
            return w.U0.L();
        }
        return this.y;
    }
    
    public final List<Fragment> M() {
        return this.c.k();
    }
    
    public final h0r N() {
        final Fragment w = this.w;
        if (w != null) {
            return w.U0.N();
        }
        return this.z;
    }
    
    public final void O(final Fragment fragment) {
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.b1) {
            fragment.b1 = true;
            fragment.n1 ^= true;
            this.j0(fragment);
        }
    }
    
    public final boolean Q(final Fragment fragment) {
        final boolean f1 = fragment.f1;
        final boolean b = true;
        if (f1) {
            final boolean b2 = b;
            if (fragment.g1) {
                return b2;
            }
        }
        final apb w0 = fragment.W0;
        final Iterator iterator = ((ArrayList)((p)w0).c.i()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment2 = (Fragment)iterator.next();
            int q = n;
            if (fragment2 != null) {
                q = (((p)w0).Q(fragment2) ? 1 : 0);
            }
            if ((n = q) != 0) {
                final boolean b3 = true;
                return b3 && b;
            }
        }
        final boolean b3 = false;
        return b3 && b;
    }
    
    public final boolean R(final Fragment fragment) {
        final boolean b = true;
        if (fragment == null) {
            return true;
        }
        if (fragment.g1) {
            final p u0 = fragment.U0;
            boolean b2 = b;
            if (u0 == null) {
                return b2;
            }
            if (u0.R(fragment.X0)) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public final boolean S(final Fragment fragment) {
        boolean b = true;
        if (fragment == null) {
            return true;
        }
        final p u0 = fragment.U0;
        if (!fragment.equals((Object)u0.x) || !this.S(u0.w)) {
            b = false;
        }
        return b;
    }
    
    public final boolean T() {
        return this.F || this.G;
    }
    
    public final void U(int t, final boolean b) {
        if (this.u == null && t != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && t == this.t) {
            return;
        }
        this.t = t;
        final gy8 c = this.c;
        final Iterator iterator = ((ArrayList)c.a).iterator();
        while (iterator.hasNext()) {
            final r r = ((HashMap)c.b).get(((Fragment)iterator.next()).H0);
            if (r != null) {
                r.k();
            }
        }
        final Iterator iterator2 = ((HashMap)c.b).values().iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final int n = 0;
            if (!hasNext) {
                break;
            }
            final r r2 = (r)iterator2.next();
            if (r2 == null) {
                continue;
            }
            r2.k();
            final Fragment c2 = r2.c;
            t = n;
            if (c2.O0) {
                t = n;
                if (!c2.f1()) {
                    t = 1;
                }
            }
            if (t == 0) {
                continue;
            }
            c.n(r2);
        }
        this.l0();
        if (this.E) {
            final lob<?> u = this.u;
            if (u != null && this.t == 7) {
                u.w0();
                this.E = false;
            }
        }
    }
    
    public final void V() {
        if (this.u == null) {
            return;
        }
        this.F = false;
        this.G = false;
        this.M.h = false;
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null) {
                ((p)fragment.W0).V();
            }
        }
    }
    
    public final void W(final r r) {
        final Fragment c = r.c;
        if (c.k1) {
            if (this.b) {
                this.I = true;
                return;
            }
            c.k1 = false;
            r.k();
        }
    }
    
    public final boolean X() {
        return this.Y(-1, 0);
    }
    
    public final boolean Y(final int n, final int n2) {
        this.A(false);
        this.z(true);
        final Fragment x = this.x;
        if (x != null && n < 0 && x.M0().X()) {
            return true;
        }
        final boolean z = this.Z((ArrayList)this.J, (ArrayList)this.K, n, n2);
        if (z) {
            this.b = true;
            try {
                this.c0(this.J, this.K);
            }
            finally {
                this.d();
            }
        }
        this.o0();
        this.v();
        this.c.b();
        return z;
    }
    
    public final boolean Z(final ArrayList<a> list, final ArrayList<Boolean> list2, final String s, int i, int n) {
        if ((i & 0x1) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final ArrayList<a> d = this.d;
        final int n2 = i = -1;
        if (d != null) {
            if (d.isEmpty()) {
                i = n2;
            }
            else if (s < 0) {
                if (n != 0) {
                    i = 0;
                }
                else {
                    i = -1 + this.d.size();
                }
            }
            else {
                a a;
                for (i = this.d.size() - 1; i >= 0; --i) {
                    a = this.d.get(i);
                    if (s >= 0 && s == a.r) {
                        break;
                    }
                }
                if (i >= 0) {
                    if (n != 0) {
                        n = i;
                        while (true) {
                            i = n;
                            if (n <= 0) {
                                break;
                            }
                            final ArrayList<a> d2 = this.d;
                            final int n3 = n - 1;
                            final a a2 = d2.get(n3);
                            i = n;
                            if (s < 0) {
                                break;
                            }
                            i = n;
                            if (s != a2.r) {
                                break;
                            }
                            n = n3;
                        }
                    }
                    else if (i == this.d.size() - 1) {
                        i = n2;
                    }
                    else {
                        ++i;
                    }
                }
            }
        }
        if (i < 0) {
            return false;
        }
        for (int j = this.d.size() - 1; j >= i; --j) {
            list.add(this.d.remove(j));
            list2.add(Boolean.TRUE);
        }
        return true;
    }
    
    public final r a(final Fragment fragment) {
        final String p = fragment.p1;
        if (p != null) {
            spb.d(fragment, p);
        }
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        final r f = this.f(fragment);
        fragment.U0 = this;
        this.c.l(f);
        if (!fragment.c1) {
            this.c.a(fragment);
            fragment.O0 = false;
            if (fragment.j1 == null) {
                fragment.n1 = false;
            }
            if (this.Q(fragment)) {
                this.E = true;
            }
        }
        return f;
    }
    
    public final void a0(final k k, final boolean b) {
        this.m.a.add(new o.a(k, b));
    }
    
    @SuppressLint({ "SyntheticAccessor" })
    public final void b(final lob<?> u, final fb v, final Fragment w) {
        if (this.u == null) {
            this.u = u;
            this.v = v;
            if ((this.w = w) != null) {
                this.n.add((cpb)new cpb() {
                    public final void h0() {
                        Objects.requireNonNull(w);
                    }
                });
            }
            else if (u instanceof cpb) {
                this.n.add((cpb)u);
            }
            if (this.w != null) {
                this.o0();
            }
            if (u instanceof rgj) {
                Object o = u;
                final OnBackPressedDispatcher v2 = ((rgj)o).V();
                this.g = v2;
                if (w != null) {
                    o = w;
                }
                v2.a((lbf)o, (pgj)this.h);
            }
            if (w != null) {
                final bpb m = w.U0.M;
                bpb i;
                if ((i = m.d.get(w.H0)) == null) {
                    i = new bpb(m.f);
                    m.d.put(w.H0, i);
                }
                this.M = i;
            }
            else if (u instanceof b9x) {
                final x8x t = ((b9x)u).t();
                final s8x$a j = (s8x$a)bpb.i;
                zzd.f((Object)t, "store");
                this.M = (bpb)new s8x(t, (s8x$a)j, (w57)w57.a.b).a((Class)bpb.class);
            }
            else {
                this.M = new bpb(false);
            }
            this.M.h = this.T();
            this.c.d = this.M;
            final lob<?> u2 = this.u;
            if (u2 instanceof yso && w == null) {
                final wso b = ((yso)u2).B();
                b.b("android:support:fragments", (wso$c)new zob(this));
                final Bundle a = b.a("android:support:fragments");
                if (a != null) {
                    this.d0((Parcelable)a);
                }
            }
            final lob<?> u3 = this.u;
            if (u3 instanceof po) {
                final ActivityResultRegistry k = ((po)u3).m();
                String l;
                if (w != null) {
                    l = hi.I(new StringBuilder(), w.H0, ":");
                }
                else {
                    l = "";
                }
                final String c = l7k.c("FragmentManager:", l);
                this.A = (ActivityResultRegistry$b)k.d(l7k.c(c, "StartActivityForResult"), (fo)new io(), (eo)new eo<ao>() {
                    public final void c(final Object o) {
                        final ao ao = (ao)o;
                        final l l = androidx.fragment.app.p.this.D.pollFirst();
                        if (l == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No Activities were started for result for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                        }
                        else {
                            final String c0 = l.C0;
                            final int d0 = l.D0;
                            final Fragment g = androidx.fragment.app.p.this.c.g(c0);
                            if (g == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Activity result delivered for unknown Fragment ");
                                sb2.append(c0);
                                Log.w("FragmentManager", sb2.toString());
                            }
                            else {
                                g.h1(d0, ao.C0, ao.D0);
                            }
                        }
                    }
                });
                this.B = (ActivityResultRegistry$b)k.d(l7k.c(c, "StartIntentSenderForResult"), (fo)new j(), (eo)new eo<ao>() {
                    public final void c(final Object o) {
                        final ao ao = (ao)o;
                        final l l = androidx.fragment.app.p.this.D.pollFirst();
                        if (l == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No IntentSenders were started for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                        }
                        else {
                            final String c0 = l.C0;
                            final int d0 = l.D0;
                            final Fragment g = androidx.fragment.app.p.this.c.g(c0);
                            if (g == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Intent Sender result delivered for unknown Fragment ");
                                sb2.append(c0);
                                Log.w("FragmentManager", sb2.toString());
                            }
                            else {
                                g.h1(d0, ao.C0, ao.D0);
                            }
                        }
                    }
                });
                this.C = (ActivityResultRegistry$b)k.d(l7k.c(c, "RequestPermissions"), (fo)new go(), (eo)new eo<Map<String, Boolean>>() {
                    @SuppressLint({ "SyntheticAccessor" })
                    public final void c(Object o) {
                        final Map map = (Map)o;
                        final String[] array = (String[])map.keySet().toArray(new String[0]);
                        final ArrayList list = new ArrayList(map.values());
                        final int[] array2 = new int[list.size()];
                        for (int i = 0; i < list.size(); ++i) {
                            int n;
                            if (list.get(i)) {
                                n = 0;
                            }
                            else {
                                n = -1;
                            }
                            array2[i] = n;
                        }
                        final l l = androidx.fragment.app.p.this.D.pollFirst();
                        if (l == null) {
                            o = new StringBuilder();
                            ((StringBuilder)o).append("No permissions were requested for ");
                            ((StringBuilder)o).append(this);
                            Log.w("FragmentManager", ((StringBuilder)o).toString());
                        }
                        else {
                            final String c0 = l.C0;
                            final int d0 = l.D0;
                            final Fragment g = androidx.fragment.app.p.this.c.g(c0);
                            if (g == null) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append("Permission request result delivered for unknown Fragment ");
                                ((StringBuilder)o).append(c0);
                                Log.w("FragmentManager", ((StringBuilder)o).toString());
                            }
                            else {
                                g.y1(d0, array, array2);
                            }
                        }
                    }
                });
            }
            final lob<?> u4 = this.u;
            if (u4 instanceof bhj) {
                ((bhj)u4).r((hk6)this.o);
            }
            final lob<?> u5 = this.u;
            if (u5 instanceof akj) {
                ((akj)u5).M((hk6)this.p);
            }
            final lob<?> u6 = this.u;
            if (u6 instanceof yij) {
                ((yij)u6).J((hk6)this.q);
            }
            final lob<?> u7 = this.u;
            if (u7 instanceof bjj) {
                ((bjj)u7).l((hk6)this.r);
            }
            final lob<?> u8 = this.u;
            if (u8 instanceof s4h && w == null) {
                ((s4h)u8).h((h5h)this.s);
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    public final void b0(final Fragment fragment) {
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.T0);
            Log.v("FragmentManager", sb.toString());
        }
        final boolean f1 = fragment.f1();
        if (fragment.c1 && !(f1 ^ true)) {
            return;
        }
        final gy8 c = this.c;
        synchronized ((ArrayList)c.a) {
            ((ArrayList)c.a).remove(fragment);
            monitorexit((ArrayList)c.a);
            fragment.N0 = false;
            if (this.Q(fragment)) {
                this.E = true;
            }
            fragment.O0 = true;
            this.j0(fragment);
        }
    }
    
    public final void c(final Fragment fragment) {
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.c1) {
            fragment.c1 = false;
            if (!fragment.N0) {
                this.c.a(fragment);
                if (P(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (this.Q(fragment)) {
                    this.E = true;
                }
            }
        }
    }
    
    public final void c0(final ArrayList<a> list, final ArrayList<Boolean> list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!((a)list.get(i)).o) {
                    if (n != i) {
                        this.C(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!(boolean)list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (((a)list.get(n4)).o) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.C(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.C(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    public final void d() {
        this.b = false;
        this.K.clear();
        this.J.clear();
    }
    
    public final void d0(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (s.startsWith("result_")) {
                final Bundle bundle2 = bundle.getBundle(s);
                if (bundle2 == null) {
                    continue;
                }
                bundle2.setClassLoader(this.u.E0.getClassLoader());
                this.k.put(s.substring(7), bundle2);
            }
        }
        final ArrayList<lpb> list = new ArrayList<lpb>();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            if (s2.startsWith("fragment_")) {
                final Bundle bundle3 = bundle.getBundle(s2);
                if (bundle3 == null) {
                    continue;
                }
                bundle3.setClassLoader(this.u.E0.getClassLoader());
                list.add((lpb)bundle3.getParcelable("state"));
            }
        }
        final gy8 c = this.c;
        ((HashMap)c.c).clear();
        for (final lpb lpb : list) {
            ((HashMap)c.c).put(lpb.D0, lpb);
        }
        final q q = (q)bundle.getParcelable("state");
        if (q == null) {
            return;
        }
        ((HashMap)this.c.b).clear();
        final Iterator<String> iterator4 = q.C0.iterator();
        while (iterator4.hasNext()) {
            final lpb q2 = this.c.q(iterator4.next(), null);
            if (q2 != null) {
                final Fragment fragment = this.M.c.get(q2.D0);
                r r;
                if (fragment != null) {
                    if (P(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                    r = new r(this.m, this.c, fragment, q2);
                }
                else {
                    r = new r(this.m, this.c, this.u.E0.getClassLoader(), this.L(), q2);
                }
                final Fragment c2 = r.c;
                c2.U0 = this;
                if (P(2)) {
                    final StringBuilder g = w48.g("restoreSaveState: active (");
                    g.append(c2.H0);
                    g.append("): ");
                    g.append(c2);
                    Log.v("FragmentManager", g.toString());
                }
                r.m(this.u.E0.getClassLoader());
                this.c.l(r);
                r.e = this.t;
            }
        }
        final bpb m = this.M;
        Objects.requireNonNull(m);
        final Iterator iterator5 = new ArrayList(m.c.values()).iterator();
        int n;
        while (true) {
            final boolean hasNext = iterator5.hasNext();
            n = 0;
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final Fragment fragment2 = (Fragment)iterator5.next();
            if (((HashMap)this.c.b).get(fragment2.H0) != null) {
                b = true;
            }
            if (b) {
                continue;
            }
            if (P(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Discarding retained Fragment ");
                sb2.append(fragment2);
                sb2.append(" that was not found in the set of active Fragments ");
                sb2.append(q.C0);
                Log.v("FragmentManager", sb2.toString());
            }
            this.M.e(fragment2);
            fragment2.U0 = this;
            final r r2 = new r(this.m, this.c, fragment2);
            r2.e = 1;
            r2.k();
            fragment2.O0 = true;
            r2.k();
        }
        final gy8 c3 = this.c;
        final ArrayList<String> d0 = q.D0;
        ((ArrayList)c3.a).clear();
        if (d0 != null) {
            for (final String s3 : d0) {
                final Fragment f = c3.f(s3);
                if (f == null) {
                    throw new IllegalStateException(zi.y("No instantiated fragment for (", s3, ")"));
                }
                if (P(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("restoreSaveState: added (");
                    sb3.append(s3);
                    sb3.append("): ");
                    sb3.append(f);
                    Log.v("FragmentManager", sb3.toString());
                }
                c3.a(f);
            }
        }
        if (q.E0 != null) {
            this.d = new ArrayList<a>(q.E0.length);
            int n2 = 0;
            while (true) {
                final b[] e0 = q.E0;
                if (n2 >= e0.length) {
                    break;
                }
                final b b2 = e0[n2];
                Objects.requireNonNull(b2);
                final a a = new a(this);
                int n3 = 0;
                int n4 = 0;
                while (true) {
                    final int[] c4 = b2.C0;
                    if (n3 >= c4.length) {
                        break;
                    }
                    final s.a a2 = new s.a();
                    final int n5 = n3 + 1;
                    a2.a = c4[n3];
                    if (P(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Instantiate ");
                        sb4.append(a);
                        sb4.append(" op #");
                        sb4.append(n4);
                        sb4.append(" base fragment #");
                        sb4.append(b2.C0[n5]);
                        Log.v("FragmentManager", sb4.toString());
                    }
                    a2.h = d$c.values()[b2.E0[n4]];
                    a2.i = d$c.values()[b2.F0[n4]];
                    final int[] c5 = b2.C0;
                    final int n6 = n5 + 1;
                    a2.c = (c5[n5] != 0);
                    final int n7 = n6 + 1;
                    final int n8 = c5[n6];
                    a2.d = n8;
                    final int n9 = n7 + 1;
                    final int n10 = c5[n7];
                    a2.e = n10;
                    final int n11 = n9 + 1;
                    final int n12 = c5[n9];
                    a2.f = n12;
                    final int n13 = c5[n11];
                    a2.g = n13;
                    a.b = n8;
                    a.c = n10;
                    a.d = n12;
                    a.e = n13;
                    a.b(a2);
                    ++n4;
                    n3 = n11 + 1;
                }
                a.f = b2.G0;
                a.h = b2.H0;
                a.g = true;
                a.i = b2.J0;
                a.j = b2.K0;
                a.k = b2.L0;
                a.l = b2.M0;
                a.m = b2.N0;
                a.n = b2.O0;
                a.o = b2.P0;
                a.r = b2.I0;
                for (int i = 0; i < b2.D0.size(); ++i) {
                    final String s4 = b2.D0.get(i);
                    if (s4 != null) {
                        ((s.a)a.a.get(i)).b = this.E(s4);
                    }
                }
                a.i(1);
                if (P(2)) {
                    final StringBuilder j = lwe.j("restoreAllState: back stack #", n2, " (index ");
                    j.append(a.r);
                    j.append("): ");
                    j.append(a);
                    Log.v("FragmentManager", j.toString());
                    final PrintWriter printWriter = new PrintWriter((Writer)new e9g());
                    a.m("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a);
                ++n2;
            }
        }
        else {
            this.d = null;
        }
        this.i.set(q.F0);
        final String g2 = q.G0;
        if (g2 != null) {
            this.r(this.x = this.E(g2));
        }
        final ArrayList<String> h0 = q.H0;
        if (h0 != null) {
            for (int k = n; k < h0.size(); ++k) {
                this.j.put((String)h0.get(k), q.I0.get(k));
            }
        }
        this.D = new ArrayDeque<l>(q.J0);
    }
    
    public final Set<v> e() {
        final HashSet set = new HashSet();
        final Iterator iterator = ((ArrayList)this.c.h()).iterator();
        while (iterator.hasNext()) {
            final ViewGroup i1 = ((r)iterator.next()).c.i1;
            if (i1 != null) {
                set.add(androidx.fragment.app.v.f(i1, this.N()));
            }
        }
        return set;
    }
    
    public final Bundle e0() {
        final Bundle bundle = new Bundle();
        this.J();
        this.x();
        this.A(true);
        this.F = true;
        this.M.h = true;
        final gy8 c = this.c;
        Objects.requireNonNull(c);
        final ArrayList c2 = new ArrayList<String>(((HashMap)c.b).size());
        for (final r r : ((HashMap)c.b).values()) {
            if (r != null) {
                final Fragment c3 = r.c;
                r.p();
                c2.add(c3.H0);
                if (!P(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Saved state of ");
                sb.append(c3);
                sb.append(": ");
                sb.append(c3.D0);
                Log.v("FragmentManager", sb.toString());
            }
        }
        final gy8 c4 = this.c;
        Objects.requireNonNull(c4);
        final ArrayList list = new ArrayList(((HashMap)c4.c).values());
        if (list.isEmpty()) {
            if (P(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
            return bundle;
        }
        final gy8 c5 = this.c;
        Object e0 = c5.a;
        synchronized (e0) {
            final boolean empty = ((ArrayList)c5.a).isEmpty();
            final b[] array = null;
            ArrayList<String> d0;
            if (empty) {
                monitorexit(e0);
                d0 = null;
            }
            else {
                d0 = new ArrayList<String>(((ArrayList)c5.a).size());
                for (final Fragment fragment : (ArrayList)c5.a) {
                    d0.add(fragment.H0);
                    if (P(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(fragment.H0);
                        sb2.append("): ");
                        sb2.append(fragment);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
                monitorexit(e0);
            }
            final ArrayList<a> d2 = this.d;
            e0 = array;
            if (d2 != null) {
                final int size = d2.size();
                e0 = array;
                if (size > 0) {
                    final b[] array2 = new b[size];
                    int n = 0;
                    while (true) {
                        e0 = array2;
                        if (n >= size) {
                            break;
                        }
                        array2[n] = new b(this.d.get(n));
                        if (P(2)) {
                            e0 = lwe.j("saveAllState: adding back stack #", n, ": ");
                            ((StringBuilder)e0).append(this.d.get(n));
                            Log.v("FragmentManager", ((StringBuilder)e0).toString());
                        }
                        ++n;
                    }
                }
            }
            final q q = new q();
            q.C0 = (ArrayList<String>)c2;
            q.D0 = d0;
            q.E0 = (b[])e0;
            q.F0 = this.i.get();
            final Fragment x = this.x;
            if (x != null) {
                q.G0 = x.H0;
            }
            q.H0.addAll(this.j.keySet());
            q.I0.addAll(this.j.values());
            q.J0 = new ArrayList<l>((Collection<? extends l>)this.D);
            bundle.putParcelable("state", (Parcelable)q);
            e0 = this.k.keySet().iterator();
            while (((Iterator)e0).hasNext()) {
                final String s = (String)((Iterator<r>)e0).next();
                bundle.putBundle(l7k.c("result_", s), (Bundle)this.k.get(s));
            }
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                e0 = iterator2.next();
                final Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", (Parcelable)e0);
                final StringBuilder g = w48.g("fragment_");
                g.append(((lpb)e0).D0);
                bundle.putBundle(g.toString(), bundle2);
            }
            return bundle;
        }
    }
    
    public final r f(final Fragment fragment) {
        final r j = this.c.j(fragment.H0);
        if (j != null) {
            return j;
        }
        final r r = new r(this.m, this.c, fragment);
        r.m(this.u.E0.getClassLoader());
        r.e = this.t;
        return r;
    }
    
    public final void f0() {
        synchronized (this.a) {
            final int size = this.a.size();
            boolean b = true;
            if (size != 1) {
                b = false;
            }
            if (b) {
                this.u.F0.removeCallbacks((Runnable)this.N);
                this.u.F0.post((Runnable)this.N);
                this.o0();
            }
        }
    }
    
    public final void g(final Fragment fragment) {
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.c1) {
            fragment.c1 = true;
            if (fragment.N0) {
                if (P(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                final gy8 c = this.c;
                synchronized ((ArrayList)c.a) {
                    ((ArrayList)c.a).remove(fragment);
                    monitorexit((ArrayList)c.a);
                    fragment.N0 = false;
                    if (this.Q(fragment)) {
                        this.E = true;
                    }
                    this.j0(fragment);
                }
            }
        }
    }
    
    public final void g0(final Fragment fragment, final boolean b) {
        final ViewGroup k = this.K(fragment);
        if (k != null && k instanceof FragmentContainerView) {
            ((FragmentContainerView)k).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    public final void h(final Configuration configuration) {
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                ((p)fragment.W0).h(configuration);
            }
        }
    }
    
    public final void h0(final Fragment fragment, final d$c q1) {
        if (fragment.equals((Object)this.E(fragment.H0)) && (fragment.V0 == null || fragment.U0 == this)) {
            fragment.q1 = q1;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean i(final MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null && (!fragment.b1 && ((p)fragment.W0).i(menuItem))) {
                return true;
            }
        }
        return false;
    }
    
    public final void i0(final Fragment x) {
        Label_0085: {
            if (x != null) {
                if (x.equals((Object)this.E(x.H0))) {
                    if (x.V0 == null) {
                        break Label_0085;
                    }
                    if (x.U0 == this) {
                        break Label_0085;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(x);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final Fragment x2 = this.x;
        this.x = x;
        this.r(x2);
        this.r(this.x);
    }
    
    public final void j() {
        this.F = false;
        this.G = false;
        this.M.h = false;
        this.u(1);
    }
    
    public final void j0(final Fragment fragment) {
        final ViewGroup k = this.K(fragment);
        if (k != null && fragment.T0() + (fragment.S0() + (fragment.P0() + fragment.O0())) > 0) {
            if (((View)k).getTag(2131432625) == null) {
                ((View)k).setTag(2131432625, (Object)fragment);
            }
            final Fragment fragment2 = (Fragment)((View)k).getTag(2131432625);
            final Fragment.d m1 = fragment.m1;
            fragment2.R1(m1 != null && m1.a);
        }
    }
    
    public final boolean k(final Menu menu, final MenuInflater menuInflater) {
        final int t = this.t;
        final int n = 0;
        if (t < 1) {
            return false;
        }
        ArrayList e = null;
        final Iterator iterator = this.c.k().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment != null && this.R(fragment)) {
                boolean b3;
                if (!fragment.b1) {
                    boolean b2;
                    if (fragment.f1 && fragment.g1) {
                        fragment.l1(menu);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    b3 = (b2 | ((p)fragment.W0).k(menu, menuInflater));
                }
                else {
                    b3 = false;
                }
                if (!b3) {
                    continue;
                }
                ArrayList list;
                if ((list = e) == null) {
                    list = new ArrayList();
                }
                list.add(fragment);
                b = true;
                e = list;
            }
        }
        if (this.e != null) {
            for (int i = n; i < this.e.size(); ++i) {
                final Fragment fragment2 = this.e.get(i);
                if (e == null || !e.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.e = e;
        return b;
    }
    
    public final void k0(final Fragment fragment) {
        if (P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.b1) {
            fragment.b1 = false;
            fragment.n1 ^= true;
        }
    }
    
    public final void l() {
        boolean g = true;
        this.A(this.H = true);
        this.x();
        final lob<?> u = this.u;
        if (u instanceof b9x) {
            g = ((bpb)this.c.d).g;
        }
        else {
            final Context e0 = u.E0;
            if (e0 instanceof Activity) {
                g = (true ^ ((Activity)e0).isChangingConfigurations());
            }
        }
        if (g) {
            final Iterator<tf1> iterator = this.j.values().iterator();
            while (iterator.hasNext()) {
                for (final String s : iterator.next().C0) {
                    final bpb bpb = (bpb)this.c.d;
                    Objects.requireNonNull(bpb);
                    if (P(3)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Clearing non-config state for saved state of Fragment ");
                        sb.append(s);
                        Log.d("FragmentManager", sb.toString());
                    }
                    bpb.d(s);
                }
            }
        }
        this.u(-1);
        final lob<?> u2 = this.u;
        if (u2 instanceof akj) {
            ((akj)u2).O((hk6)this.p);
        }
        final lob<?> u3 = this.u;
        if (u3 instanceof bhj) {
            ((bhj)u3).Y((hk6)this.o);
        }
        final lob<?> u4 = this.u;
        if (u4 instanceof yij) {
            ((yij)u4).y((hk6)this.q);
        }
        final lob<?> u5 = this.u;
        if (u5 instanceof bjj) {
            ((bjj)u5).e0((hk6)this.r);
        }
        final lob<?> u6 = this.u;
        if (u6 instanceof s4h) {
            ((s4h)u6).X((h5h)this.s);
        }
        this.u = null;
        this.v = null;
        this.w = null;
        if (this.g != null) {
            final Iterator<fg3> iterator3 = this.h.b.iterator();
            while (iterator3.hasNext()) {
                iterator3.next().cancel();
            }
            this.g = null;
        }
        final ActivityResultRegistry$b a = this.A;
        if (a != null) {
            a.b();
            this.B.b();
            this.C.b();
        }
    }
    
    public final void l0() {
        final Iterator iterator = ((ArrayList)this.c.h()).iterator();
        while (iterator.hasNext()) {
            this.W((r)iterator.next());
        }
    }
    
    public final void m() {
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null) {
                fragment.onLowMemory();
                ((p)fragment.W0).m();
            }
        }
    }
    
    public final void m0(final RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter((Writer)new e9g());
        final lob<?> u = this.u;
        if (u != null) {
            try {
                u.t0(printWriter, new String[0]);
            }
            catch (final Exception ex2) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
            }
        }
        else {
            try {
                this.w("  ", null, printWriter, new String[0]);
            }
            catch (final Exception ex3) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex3);
            }
        }
        throw ex;
    }
    
    public final void n(final boolean b) {
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null) {
                ((p)fragment.W0).n(b);
            }
        }
    }
    
    public final void n0(final k k) {
        final o m = this.m;
        final CopyOnWriteArrayList<o.a> a = m.a;
        monitorenter(a);
        int i = 0;
        try {
            while (i < m.a.size()) {
                if (((o.a)m.a.get(i)).a == k) {
                    m.a.remove(i);
                    break;
                }
                ++i;
            }
        }
        finally {
            monitorexit(a);
        }
    }
    
    public final void o() {
        for (final Fragment fragment : (ArrayList)this.c.i()) {
            if (fragment != null) {
                fragment.t1(fragment.e1());
                ((p)fragment.W0).o();
            }
        }
    }
    
    public final void o0() {
        Object o = this.a;
        synchronized (o) {
            final boolean empty = this.a.isEmpty();
            boolean a = true;
            if (!empty) {
                this.h.a = true;
                return;
            }
            monitorexit(o);
            o = this.h;
            final ArrayList<a> d = this.d;
            int size;
            if (d != null) {
                size = d.size();
            }
            else {
                size = 0;
            }
            if (size <= 0 || !this.S(this.w)) {
                a = false;
            }
            ((pgj)o).a = a;
        }
    }
    
    public final boolean p(final MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null && (!fragment.b1 && ((fragment.f1 && fragment.g1 && fragment.v1(menuItem)) || ((p)fragment.W0).p(menuItem)))) {
                return true;
            }
        }
        return false;
    }
    
    public final void q(final Menu menu) {
        if (this.t < 1) {
            return;
        }
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null && !fragment.b1) {
                ((p)fragment.W0).q(menu);
            }
        }
    }
    
    public final void r(final Fragment fragment) {
        if (fragment != null && fragment.equals((Object)this.E(fragment.H0))) {
            final boolean s = fragment.U0.S(fragment);
            final Boolean m0 = fragment.M0;
            if (m0 == null || m0 != s) {
                fragment.M0 = s;
                final apb w0 = fragment.W0;
                ((p)w0).o0();
                ((p)w0).r(((p)w0).x);
            }
        }
    }
    
    public final void s(final boolean b) {
        for (final Fragment fragment : this.c.k()) {
            if (fragment != null) {
                ((p)fragment.W0).s(b);
            }
        }
    }
    
    public final boolean t(final Menu menu) {
        if (this.t < 1) {
            return false;
        }
        final Iterator iterator = this.c.k().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment != null && this.R(fragment)) {
                boolean b3;
                if (!fragment.b1) {
                    boolean b2;
                    if (fragment.f1 && fragment.g1) {
                        fragment.x1(menu);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    b3 = (((p)fragment.W0).t(menu) | b2);
                }
                else {
                    b3 = false;
                }
                if (!b3) {
                    continue;
                }
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final Fragment w = this.w;
        if (w != null) {
            sb.append(w.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.w)));
            sb.append("}");
        }
        else {
            final lob<?> u = this.u;
            if (u != null) {
                sb.append(u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.u)));
                sb.append("}");
            }
            else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final void u(final int e) {
        try {
            this.b = true;
            for (final r r : ((HashMap)this.c.b).values()) {
                if (r != null) {
                    r.e = e;
                }
            }
            this.U(e, false);
            final Iterator iterator2 = ((HashSet)this.e()).iterator();
            while (iterator2.hasNext()) {
                ((v)iterator2.next()).e();
            }
            this.b = false;
            this.A(true);
        }
        finally {
            this.b = false;
        }
    }
    
    public final void v() {
        if (this.I) {
            this.I = false;
            this.l0();
        }
    }
    
    public final void w(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final String c = l7k.c(s, "    ");
        final gy8 c2 = this.c;
        Objects.requireNonNull(c2);
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        if (!((HashMap)c2.b).isEmpty()) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final r r : ((HashMap)c2.b).values()) {
                printWriter.print(s);
                if (r != null) {
                    final Fragment c3 = r.c;
                    printWriter.println(c3);
                    c3.J0(string, fileDescriptor, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = ((ArrayList)c2.a).size();
        final int n = 0;
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final Fragment fragment = ((ArrayList)c2.a).get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        final ArrayList<Fragment> e = this.e;
        if (e != null) {
            final int size2 = e.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int j = 0; j < size2; ++j) {
                    final Fragment fragment2 = this.e.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        final ArrayList<a> d = this.d;
        if (d != null) {
            final int size3 = d.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int k = 0; k < size3; ++k) {
                    final a a = this.d.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(a.toString());
                    a.m(c, printWriter, true);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Back Stack Index: ");
        sb2.append(this.i.get());
        printWriter.println(sb2.toString());
        synchronized (this.a) {
            final int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Pending Actions:");
                for (int l = n; l < size4; ++l) {
                    final m m = this.a.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(m);
                }
            }
            monitorexit(this.a);
            printWriter.print(s);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(s);
            printWriter.print("  mHost=");
            printWriter.println(this.u);
            printWriter.print(s);
            printWriter.print("  mContainer=");
            printWriter.println(this.v);
            if (this.w != null) {
                printWriter.print(s);
                printWriter.print("  mParent=");
                printWriter.println(this.w);
            }
            printWriter.print(s);
            printWriter.print("  mCurState=");
            printWriter.print(this.t);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.F);
            printWriter.print(" mStopped=");
            printWriter.print(this.G);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.H);
            if (this.E) {
                printWriter.print(s);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.E);
            }
        }
    }
    
    public final void x() {
        final Iterator iterator = ((HashSet)this.e()).iterator();
        while (iterator.hasNext()) {
            ((v)iterator.next()).e();
        }
    }
    
    public final void y(final m m, final boolean b) {
        if (!b) {
            if (this.u == null) {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else if (this.T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.u != null) {
                this.a.add(m);
                this.f0();
                return;
            }
            if (b) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }
    
    public final void z(final boolean b) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.u == null) {
            if (this.H) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        else {
            if (Looper.myLooper() != this.u.F0.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            if (!b && this.T()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if (this.J == null) {
                this.J = new ArrayList<a>();
                this.K = new ArrayList<Boolean>();
            }
        }
    }
    
    public static final class j extends fo<vud, ao>
    {
        @Override
        public final Intent a(final Context context, final Object o) {
            final vud vud = (vud)o;
            final Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            final Intent d0 = vud.D0;
            Object o2 = vud;
            if (d0 != null) {
                final Bundle bundleExtra = d0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                o2 = vud;
                if (bundleExtra != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    d0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    o2 = vud;
                    if (d0.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        o2 = new vud(vud.C0, (Intent)null, vud.E0, vud.F0);
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)o2);
            if (androidx.fragment.app.p.P(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
                Log.v("FragmentManager", sb.toString());
            }
            return intent;
        }
        
        @Override
        public final Object c(final int n, final Intent intent) {
            return new ao(n, intent);
        }
    }
    
    public abstract static class k
    {
        public void a(final p p3, final Fragment fragment, final Bundle bundle) {
        }
        
        public void b(final p p2, final Fragment fragment) {
        }
        
        public void c(final p p2, final Fragment fragment) {
        }
        
        public void d(final p p2, final Fragment fragment) {
        }
        
        public void e(final p p2, final Fragment fragment) {
        }
        
        public void f(final p p3, final Fragment fragment, final Bundle bundle) {
        }
        
        public void g(final p p2, final Fragment fragment) {
        }
        
        public void h(final p p2, final Fragment fragment) {
        }
        
        public void i(final p p4, final Fragment fragment, final View view, final Bundle bundle) {
        }
        
        public void j(final p p2, final Fragment fragment) {
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class l implements Parcelable
    {
        public static final Parcelable$Creator<l> CREATOR;
        public String C0;
        public int D0;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<l>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new l(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new l[n];
                }
            };
        }
        
        public l(final Parcel parcel) {
            this.C0 = parcel.readString();
            this.D0 = parcel.readInt();
        }
        
        public l(final String c0, final int d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.C0);
            parcel.writeInt(this.D0);
        }
    }
    
    public interface m
    {
        boolean a(final ArrayList<a> p0, final ArrayList<Boolean> p1);
    }
    
    public final class n implements m
    {
        public final int a;
        public final int b;
        
        public n(final int a) {
            this.a = a;
            this.b = 1;
        }
        
        @Override
        public final boolean a(final ArrayList<a> list, final ArrayList<Boolean> list2) {
            final Fragment x = androidx.fragment.app.p.this.x;
            return (x == null || this.a >= 0 || !x.M0().X()) && androidx.fragment.app.p.this.Z((ArrayList)list, (ArrayList)list2, this.a, this.b);
        }
    }
}
