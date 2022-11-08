// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.os.Parcelable;
import androidx.lifecycle.f;
import android.view.ViewParent;
import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import android.content.res.Resources$NotFoundException;
import java.util.Iterator;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Objects;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.d$b;
import android.util.Log;
import androidx.lifecycle.d$c;
import android.os.Bundle;

public final class r
{
    public final o a;
    public final gy8 b;
    public final Fragment c;
    public boolean d;
    public int e;
    
    public r(final o a, final gy8 b, final Fragment c) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public r(final o a, final gy8 b, final Fragment c, final lpb lpb) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.E0 = null;
        c.F0 = null;
        c.T0 = 0;
        c.Q0 = false;
        c.N0 = false;
        final Fragment j0 = c.J0;
        String h0;
        if (j0 != null) {
            h0 = j0.H0;
        }
        else {
            h0 = null;
        }
        c.K0 = h0;
        c.J0 = null;
        final Bundle o0 = lpb.O0;
        if (o0 != null) {
            c.D0 = o0;
        }
        else {
            c.D0 = new Bundle();
        }
    }
    
    public r(final o a, final gy8 b, final ClassLoader classLoader, final n n, final lpb lpb) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        final Fragment a2 = n.a(classLoader, lpb.C0);
        final Bundle l0 = lpb.L0;
        if (l0 != null) {
            l0.setClassLoader(classLoader);
        }
        a2.N1(lpb.L0);
        a2.H0 = lpb.D0;
        a2.P0 = lpb.E0;
        a2.R0 = true;
        a2.Y0 = lpb.F0;
        a2.Z0 = lpb.G0;
        a2.a1 = lpb.H0;
        a2.d1 = lpb.I0;
        a2.O0 = lpb.J0;
        a2.c1 = lpb.K0;
        a2.b1 = lpb.M0;
        a2.q1 = d$c.values()[lpb.N0];
        final Bundle o0 = lpb.O0;
        if (o0 != null) {
            a2.D0 = o0;
        }
        else {
            a2.D0 = new Bundle();
        }
        this.c = a2;
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(a2);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void a() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto ACTIVITY_CREATED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final Bundle d0 = c.D0;
        ((p)c.W0).V();
        c.C0 = 3;
        c.h1 = false;
        c.g1(d0);
        if (c.h1) {
            if (p.P(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("moveto RESTORE_VIEW_STATE: ");
                sb.append(c);
                Log.d("FragmentManager", sb.toString());
            }
            final View j1 = c.j1;
            if (j1 != null) {
                final Bundle d2 = c.D0;
                final SparseArray e0 = c.E0;
                if (e0 != null) {
                    j1.restoreHierarchyState(e0);
                    c.E0 = null;
                }
                if (c.j1 != null) {
                    c.s1.F0.c(c.F0);
                    c.F0 = null;
                }
                c.h1 = false;
                c.E1(d2);
                if (!c.h1) {
                    throw new dyr(aob.g("Fragment ", c, " did not call through to super.onViewStateRestored()"));
                }
                if (c.j1 != null) {
                    c.s1.a(d$b.ON_CREATE);
                }
            }
            c.D0 = null;
            final apb w0 = c.W0;
            ((p)w0).F = false;
            ((p)w0).G = false;
            ((p)w0).M.h = false;
            ((p)w0).u(4);
            final o a = this.a;
            final Fragment c2 = this.c;
            a.a(c2, c2.D0, false);
            return;
        }
        throw new dyr(aob.g("Fragment ", c, " did not call through to super.onActivityCreated()"));
    }
    
    public final void b() {
        final gy8 b = this.b;
        final Fragment c = this.c;
        Objects.requireNonNull(b);
        final ViewGroup i1 = c.i1;
        final int n = -1;
        int indexOfChild = 0;
        Label_0186: {
            if (i1 == null) {
                indexOfChild = n;
            }
            else {
                final int index = ((ArrayList)b.a).indexOf(c);
                int n2 = index - 1;
                int n3;
                while (true) {
                    n3 = index;
                    if (n2 < 0) {
                        break;
                    }
                    final Fragment fragment = ((ArrayList)b.a).get(n2);
                    if (fragment.i1 == i1) {
                        final View j1 = fragment.j1;
                        if (j1 != null) {
                            indexOfChild = i1.indexOfChild(j1) + 1;
                            break Label_0186;
                        }
                    }
                    --n2;
                }
                while (true) {
                    final int n4 = n3 + 1;
                    indexOfChild = n;
                    if (n4 >= ((ArrayList)b.a).size()) {
                        break;
                    }
                    final Fragment fragment2 = ((ArrayList)b.a).get(n4);
                    n3 = n4;
                    if (fragment2.i1 != i1) {
                        continue;
                    }
                    final View j2 = fragment2.j1;
                    n3 = n4;
                    if (j2 != null) {
                        indexOfChild = i1.indexOfChild(j2);
                        break;
                    }
                }
            }
        }
        final Fragment c2 = this.c;
        c2.i1.addView(c2.j1, indexOfChild);
    }
    
    public final void c() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto ATTACHED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final Fragment j0 = c.J0;
        r r = null;
        if (j0 != null) {
            r = this.b.j(j0.H0);
            if (r == null) {
                final StringBuilder g2 = w48.g("Fragment ");
                g2.append(this.c);
                g2.append(" declared target fragment ");
                g2.append(this.c.J0);
                g2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(g2.toString());
            }
            final Fragment c2 = this.c;
            c2.K0 = c2.J0.H0;
            c2.J0 = null;
        }
        else {
            final String k0 = c.K0;
            if (k0 != null) {
                r = this.b.j(k0);
                if (r == null) {
                    final StringBuilder g3 = w48.g("Fragment ");
                    g3.append(this.c);
                    g3.append(" declared target fragment ");
                    throw new IllegalStateException(hi.I(g3, this.c.K0, " that does not belong to this FragmentManager!"));
                }
            }
        }
        if (r != null) {
            r.k();
        }
        final Fragment c3 = this.c;
        final p u0 = c3.U0;
        c3.V0 = u0.u;
        c3.X0 = u0.w;
        this.a.g(c3, false);
        final Fragment c4 = this.c;
        final Iterator iterator = c4.w1.iterator();
        while (iterator.hasNext()) {
            ((Fragment.e)iterator.next()).a();
        }
        c4.w1.clear();
        ((p)c4.W0).b(c4.V0, c4.I0(), c4);
        c4.C0 = 0;
        c4.h1 = false;
        c4.j1(c4.V0.E0);
        if (c4.h1) {
            final Iterator<cpb> iterator2 = c4.U0.n.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().h0();
            }
            final apb w0 = c4.W0;
            ((p)w0).F = false;
            ((p)w0).G = false;
            ((p)w0).M.h = false;
            ((p)w0).u(0);
            this.a.b(this.c, false);
            return;
        }
        throw new dyr(aob.g("Fragment ", c4, " did not call through to super.onAttach()"));
    }
    
    public final int d() {
        final Fragment c = this.c;
        if (c.U0 == null) {
            return c.C0;
        }
        final int e = this.e;
        final int ordinal = ((Enum)c.q1).ordinal();
        final int n = 0;
        int b = 0;
        int n2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    n2 = e;
                    if (ordinal != 4) {
                        n2 = Math.min(e, -1);
                    }
                }
                else {
                    n2 = Math.min(e, 5);
                }
            }
            else {
                n2 = Math.min(e, 1);
            }
        }
        else {
            n2 = Math.min(e, 0);
        }
        final Fragment c2 = this.c;
        int n3 = n2;
        if (c2.P0) {
            if (c2.Q0) {
                final int max = Math.max(this.e, 2);
                final View j1 = this.c.j1;
                n3 = max;
                if (j1 != null) {
                    n3 = max;
                    if (j1.getParent() == null) {
                        n3 = Math.min(max, 2);
                    }
                }
            }
            else if (this.e < 4) {
                n3 = Math.min(n2, c2.C0);
            }
            else {
                n3 = Math.min(n2, 1);
            }
        }
        int min = n3;
        if (!this.c.N0) {
            min = Math.min(n3, 1);
        }
        final Fragment c3 = this.c;
        final ViewGroup i1 = c3.i1;
        final v.b b2 = null;
        int b3 = n;
        if (i1 != null) {
            final v f = v.f(i1, c3.R0().N());
            Objects.requireNonNull(f);
            final v.b d = f.d(this.c);
            if (d != null) {
                b = d.b;
            }
            final Fragment c4 = this.c;
            final Iterator<v.b> iterator = f.c.iterator();
            v.b b4;
            do {
                b4 = b2;
                if (!iterator.hasNext()) {
                    break;
                }
                b4 = iterator.next();
            } while (!b4.c.equals((Object)c4) || b4.f);
            b3 = b;
            if (b4 != null && (b == 0 || (b3 = b) == 1)) {
                b3 = b4.b;
            }
        }
        int n4;
        if (b3 == 2) {
            n4 = Math.min(min, 6);
        }
        else if (b3 == 3) {
            n4 = Math.max(min, 3);
        }
        else {
            final Fragment c5 = this.c;
            n4 = min;
            if (c5.O0) {
                if (c5.f1()) {
                    n4 = Math.min(min, 1);
                }
                else {
                    n4 = Math.min(min, -1);
                }
            }
        }
        final Fragment c6 = this.c;
        int min2 = n4;
        if (c6.k1) {
            min2 = n4;
            if (c6.C0 < 5) {
                min2 = Math.min(n4, 4);
            }
        }
        if (p.P(2)) {
            final StringBuilder k = lwe.j("computeExpectedState() of ", min2, " for ");
            k.append(this.c);
            Log.v("FragmentManager", k.toString());
        }
        return min2;
    }
    
    public final void e() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto CREATED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        if (!c.o1) {
            this.a.h(c, c.D0, false);
            final Fragment c2 = this.c;
            final Bundle d0 = c2.D0;
            ((p)c2.W0).V();
            c2.C0 = 1;
            c2.h1 = false;
            c2.r1.a((kbf)new Fragment$6(c2));
            c2.u1.c(d0);
            c2.k1(d0);
            c2.o1 = true;
            if (!c2.h1) {
                throw new dyr(aob.g("Fragment ", c2, " did not call through to super.onCreate()"));
            }
            c2.r1.f(d$b.ON_CREATE);
            final o a = this.a;
            final Fragment c3 = this.c;
            a.c(c3, c3.D0, false);
        }
        else {
            c.L1(c.D0);
            this.c.C0 = 1;
        }
    }
    
    public final void f() {
        if (this.c.P0) {
            return;
        }
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto CREATE_VIEW: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final LayoutInflater s1 = c.s1(c.D0);
        ViewGroup i1 = null;
        final Fragment c2 = this.c;
        final ViewGroup i2 = c2.i1;
        if (i2 != null) {
            i1 = i2;
        }
        else {
            final int z0 = c2.Z0;
            if (z0 != 0) {
                if (z0 == -1) {
                    final StringBuilder g2 = w48.g("Cannot create fragment ");
                    g2.append(this.c);
                    g2.append(" for a container view with no id");
                    throw new IllegalArgumentException(g2.toString());
                }
                final ViewGroup viewGroup = (ViewGroup)c2.U0.v.q0(z0);
                if (viewGroup == null) {
                    final Fragment c3 = this.c;
                    if (!c3.R0) {
                        String resourceName;
                        try {
                            resourceName = c3.U0().getResourceName(this.c.Z0);
                        }
                        catch (final Resources$NotFoundException ex) {
                            resourceName = "unknown";
                        }
                        final StringBuilder g3 = w48.g("No view found for id 0x");
                        g3.append(Integer.toHexString(this.c.Z0));
                        g3.append(" (");
                        g3.append(resourceName);
                        g3.append(") for fragment ");
                        g3.append(this.c);
                        throw new IllegalArgumentException(g3.toString());
                    }
                    i1 = viewGroup;
                }
                else {
                    i1 = viewGroup;
                    if (!(viewGroup instanceof FragmentContainerView)) {
                        final Fragment c4 = this.c;
                        final spb a = spb.a;
                        zzd.f((Object)c4, "fragment");
                        final WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(c4, viewGroup);
                        final spb a2 = spb.a;
                        spb.c((Violation)wrongFragmentContainerViolation);
                        final spb$c a3 = spb.a(c4);
                        i1 = viewGroup;
                        if (a3.a.contains(spb$a.J0)) {
                            i1 = viewGroup;
                            if (spb.f(a3, (Class)c4.getClass(), (Class)WrongFragmentContainerViolation.class)) {
                                spb.b(a3, (Violation)wrongFragmentContainerViolation);
                                i1 = viewGroup;
                            }
                        }
                    }
                }
            }
        }
        final Fragment c5 = this.c;
        c5.F1(s1, c5.i1 = i1, c5.D0);
        final View j1 = this.c.j1;
        if (j1 != null) {
            j1.setSaveFromParentEnabled(false);
            final Fragment c6 = this.c;
            c6.j1.setTag(2131429269, (Object)c6);
            if (i1 != null) {
                this.b();
            }
            final Fragment c7 = this.c;
            if (c7.b1) {
                c7.j1.setVisibility(8);
            }
            final View j2 = this.c.j1;
            final WeakHashMap a4 = p5x.a;
            if (p5x$g.b(j2)) {
                p5x$h.c(this.c.j1);
            }
            else {
                final View j3 = this.c.j1;
                j3.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                    public final void onViewAttachedToWindow(final View view) {
                        j3.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                        final View c0 = j3;
                        final WeakHashMap a = p5x.a;
                        p5x$h.c(c0);
                    }
                    
                    public final void onViewDetachedFromWindow(final View view) {
                    }
                });
            }
            final Fragment c8 = this.c;
            c8.D1(c8.j1, c8.D0);
            ((p)c8.W0).u(2);
            final o a5 = this.a;
            final Fragment c9 = this.c;
            a5.m(c9, c9.j1, c9.D0, false);
            final int visibility = this.c.j1.getVisibility();
            this.c.K0().l = this.c.j1.getAlpha();
            final Fragment c10 = this.c;
            if (c10.i1 != null && visibility == 0) {
                final View focus = c10.j1.findFocus();
                if (focus != null) {
                    this.c.O1(focus);
                    if (p.P(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(focus);
                        sb.append(" for Fragment ");
                        sb.append(this.c);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                this.c.j1.setAlpha(0.0f);
            }
        }
        this.c.C0 = 2;
    }
    
    public final void g() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("movefrom CREATED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final boolean o0 = c.O0;
        final int n = 1;
        final boolean b = o0 && !c.f1();
        if (b) {
            Objects.requireNonNull(this.c);
            this.b.q(this.c.H0, null);
        }
        boolean b2 = false;
        Label_0169: {
            if (!b) {
                final bpb bpb = (bpb)this.b.d;
                boolean g2 = false;
                Label_0153: {
                    if (bpb.c.containsKey(this.c.H0)) {
                        if (bpb.f) {
                            g2 = bpb.g;
                            break Label_0153;
                        }
                    }
                    g2 = true;
                }
                if (!g2) {
                    b2 = false;
                    break Label_0169;
                }
            }
            b2 = true;
        }
        if (b2) {
            final lob v0 = this.c.V0;
            int g3;
            if (v0 instanceof b9x) {
                g3 = (((bpb)this.b.d).g ? 1 : 0);
            }
            else {
                final Context e0 = v0.E0;
                g3 = n;
                if (e0 instanceof Activity) {
                    g3 = ((true ^ ((Activity)e0).isChangingConfigurations()) ? 1 : 0);
                }
            }
            Label_0267: {
                if (b) {
                    Objects.requireNonNull(this.c);
                }
                else if (g3 == 0) {
                    break Label_0267;
                }
                ((bpb)this.b.d).c(this.c);
            }
            final Fragment c2 = this.c;
            ((p)c2.W0).l();
            c2.r1.f(d$b.ON_DESTROY);
            c2.C0 = 0;
            c2.h1 = false;
            c2.o1 = false;
            c2.o1();
            if (!c2.h1) {
                throw new dyr(aob.g("Fragment ", c2, " did not call through to super.onDestroy()"));
            }
            this.a.d(this.c, false);
            for (final r r : (ArrayList)this.b.h()) {
                if (r != null) {
                    final Fragment c3 = r.c;
                    if (!this.c.H0.equals(c3.K0)) {
                        continue;
                    }
                    c3.J0 = this.c;
                    c3.K0 = null;
                }
            }
            final Fragment c4 = this.c;
            final String k0 = c4.K0;
            if (k0 != null) {
                c4.J0 = this.b.f(k0);
            }
            this.b.n(this);
        }
        else {
            final String k2 = this.c.K0;
            if (k2 != null) {
                final Fragment f = this.b.f(k2);
                if (f != null && f.d1) {
                    this.c.J0 = f;
                }
            }
            this.c.C0 = 0;
        }
    }
    
    public final void h() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("movefrom CREATE_VIEW: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final ViewGroup i1 = c.i1;
        if (i1 != null) {
            final View j1 = c.j1;
            if (j1 != null) {
                i1.removeView(j1);
            }
        }
        final Fragment c2 = this.c;
        ((p)c2.W0).u(1);
        if (c2.j1 != null) {
            final cqb s1 = c2.s1;
            s1.c();
            if (s1.E0.b.b(d$c.E0)) {
                c2.s1.a(d$b.ON_DESTROY);
            }
        }
        c2.C0 = 1;
        c2.h1 = false;
        c2.q1();
        if (c2.h1) {
            final h3g$c b = ((h3g)g3g.b((lbf)c2)).b;
            for (int e0 = b.c.E0, k = 0; k < e0; ++k) {
                ((h3g$a)b.c.D0[k]).m();
            }
            c2.S0 = false;
            this.a.n(this.c, false);
            final Fragment c3 = this.c;
            c3.i1 = null;
            c3.j1 = null;
            c3.s1 = null;
            c3.t1.k(null);
            this.c.Q0 = false;
            return;
        }
        throw new dyr(aob.g("Fragment ", c2, " did not call through to super.onDestroyView()"));
    }
    
    public final void i() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("movefrom ATTACHED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        c.C0 = -1;
        final boolean b = false;
        c.h1 = false;
        c.r1();
        if (c.h1) {
            final apb w0 = c.W0;
            if (!((p)w0).H) {
                ((p)w0).l();
                c.W0 = new apb();
            }
            this.a.e(this.c, false);
            final Fragment c2 = this.c;
            c2.C0 = -1;
            c2.V0 = null;
            c2.X0 = null;
            c2.U0 = null;
            final boolean o0 = c2.O0;
            boolean g2 = true;
            int n = b ? 1 : 0;
            if (o0) {
                n = (b ? 1 : 0);
                if (!c2.f1()) {
                    n = 1;
                }
            }
            if (n == 0) {
                final bpb bpb = (bpb)this.b.d;
                if (bpb.c.containsKey(this.c.H0)) {
                    if (bpb.f) {
                        g2 = bpb.g;
                    }
                }
                if (!g2) {
                    return;
                }
            }
            if (p.P(3)) {
                final StringBuilder g3 = w48.g("initState called for fragment: ");
                g3.append(this.c);
                Log.d("FragmentManager", g3.toString());
            }
            this.c.a1();
            return;
        }
        throw new dyr(aob.g("Fragment ", c, " did not call through to super.onDetach()"));
    }
    
    public final void j() {
        final Fragment c = this.c;
        if (c.P0 && c.Q0 && !c.S0) {
            if (p.P(3)) {
                final StringBuilder g = w48.g("moveto CREATE_VIEW: ");
                g.append(this.c);
                Log.d("FragmentManager", g.toString());
            }
            final Fragment c2 = this.c;
            c2.F1(c2.s1(c2.D0), (ViewGroup)null, this.c.D0);
            final View j1 = this.c.j1;
            if (j1 != null) {
                j1.setSaveFromParentEnabled(false);
                final Fragment c3 = this.c;
                c3.j1.setTag(2131429269, (Object)c3);
                final Fragment c4 = this.c;
                if (c4.b1) {
                    c4.j1.setVisibility(8);
                }
                final Fragment c5 = this.c;
                c5.D1(c5.j1, c5.D0);
                ((p)c5.W0).u(2);
                final o a = this.a;
                final Fragment c6 = this.c;
                a.m(c6, c6.j1, c6.D0, false);
                this.c.C0 = 2;
            }
        }
    }
    
    public final void k() {
        if (this.d) {
            if (p.P(2)) {
                final StringBuilder g = w48.g("Ignoring re-entrant call to moveToExpectedState() for ");
                g.append(this.c);
                Log.v("FragmentManager", g.toString());
            }
            return;
        }
        try {
            this.d = true;
            boolean b = false;
            Fragment c;
            int c2;
            while (true) {
                final int d = this.d();
                c = this.c;
                c2 = c.C0;
                if (d == c2) {
                    break;
                }
                if (d > c2) {
                    switch (c2 + 1) {
                        case 7: {
                            this.n();
                            break;
                        }
                        case 6: {
                            c.C0 = 6;
                            break;
                        }
                        case 5: {
                            this.r();
                            break;
                        }
                        case 4: {
                            if (c.j1 != null) {
                                final ViewGroup i1 = c.i1;
                                if (i1 != null) {
                                    final v f = v.f(i1, c.R0().N());
                                    final int b2 = mag.b(this.c.j1.getVisibility());
                                    Objects.requireNonNull(f);
                                    if (p.P(2)) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
                                        sb.append(this.c);
                                        Log.v("FragmentManager", sb.toString());
                                    }
                                    f.a(b2, 2, this);
                                }
                            }
                            this.c.C0 = 4;
                            break;
                        }
                        case 3: {
                            this.a();
                            break;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            break;
                        }
                        case 1: {
                            this.e();
                            break;
                        }
                        case 0: {
                            this.c();
                            break;
                        }
                    }
                }
                else {
                    switch (c2 - 1) {
                        case 6: {
                            this.l();
                            break;
                        }
                        case 5: {
                            c.C0 = 5;
                            break;
                        }
                        case 4: {
                            this.s();
                            break;
                        }
                        case 3: {
                            if (p.P(3)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.c);
                                Log.d("FragmentManager", sb2.toString());
                            }
                            Objects.requireNonNull(this.c);
                            final Fragment c3 = this.c;
                            if (c3.j1 != null && c3.E0 == null) {
                                this.q();
                            }
                            final Fragment c4 = this.c;
                            if (c4.j1 != null) {
                                final ViewGroup i2 = c4.i1;
                                if (i2 != null) {
                                    final v f2 = v.f(i2, c4.R0().N());
                                    Objects.requireNonNull(f2);
                                    if (p.P(2)) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
                                        sb3.append(this.c);
                                        Log.v("FragmentManager", sb3.toString());
                                    }
                                    f2.a(1, 3, this);
                                }
                            }
                            this.c.C0 = 3;
                            break;
                        }
                        case 2: {
                            c.Q0 = false;
                            c.C0 = 2;
                            break;
                        }
                        case 1: {
                            this.h();
                            this.c.C0 = 1;
                            break;
                        }
                        case 0: {
                            this.g();
                            break;
                        }
                        case -1: {
                            this.i();
                            break;
                        }
                    }
                }
                b = true;
            }
            if (!b && c2 == -1 && c.O0 && !c.f1()) {
                Objects.requireNonNull(this.c);
                if (p.P(3)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cleaning up state of never attached fragment: ");
                    sb4.append(this.c);
                    Log.d("FragmentManager", sb4.toString());
                }
                ((bpb)this.b.d).c(this.c);
                this.b.n(this);
                if (p.P(3)) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("initState called for fragment: ");
                    sb5.append(this.c);
                    Log.d("FragmentManager", sb5.toString());
                }
                this.c.a1();
            }
            final Fragment c5 = this.c;
            if (c5.n1) {
                if (c5.j1 != null) {
                    final ViewGroup i3 = c5.i1;
                    if (i3 != null) {
                        final v f3 = v.f(i3, c5.R0().N());
                        if (this.c.b1) {
                            Objects.requireNonNull(f3);
                            if (p.P(2)) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
                                sb6.append(this.c);
                                Log.v("FragmentManager", sb6.toString());
                            }
                            f3.a(3, 1, this);
                        }
                        else {
                            Objects.requireNonNull(f3);
                            if (p.P(2)) {
                                final StringBuilder sb7 = new StringBuilder();
                                sb7.append("SpecialEffectsController: Enqueuing show operation for fragment ");
                                sb7.append(this.c);
                                Log.v("FragmentManager", sb7.toString());
                            }
                            f3.a(2, 1, this);
                        }
                    }
                }
                final Fragment c6 = this.c;
                final p u0 = c6.U0;
                if (u0 != null && c6.N0 && u0.Q(c6)) {
                    u0.E = true;
                }
                final Fragment c7 = this.c;
                c7.n1 = false;
                c7.t1(c7.b1);
                ((p)this.c.W0).o();
            }
        }
        finally {
            this.d = false;
        }
    }
    
    public final void l() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("movefrom RESUMED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        ((p)c.W0).u(5);
        if (c.j1 != null) {
            c.s1.a(d$b.ON_PAUSE);
        }
        c.r1.f(d$b.ON_PAUSE);
        c.C0 = 6;
        c.h1 = false;
        c.w1();
        if (c.h1) {
            this.a.f(this.c, false);
            return;
        }
        throw new dyr(aob.g("Fragment ", c, " did not call through to super.onPause()"));
    }
    
    public final void m(final ClassLoader classLoader) {
        final Bundle d0 = this.c.D0;
        if (d0 == null) {
            return;
        }
        d0.setClassLoader(classLoader);
        final Fragment c = this.c;
        c.E0 = c.D0.getSparseParcelableArray("android:view_state");
        final Fragment c2 = this.c;
        c2.F0 = c2.D0.getBundle("android:view_registry_state");
        final Fragment c3 = this.c;
        c3.K0 = ((BaseBundle)c3.D0).getString("android:target_state");
        final Fragment c4 = this.c;
        if (c4.K0 != null) {
            c4.L0 = ((BaseBundle)c4.D0).getInt("android:target_req_state", 0);
        }
        final Fragment c5 = this.c;
        final Boolean g0 = c5.G0;
        if (g0 != null) {
            c5.l1 = g0;
            this.c.G0 = null;
        }
        else {
            c5.l1 = c5.D0.getBoolean("android:user_visible_hint", true);
        }
        final Fragment c6 = this.c;
        if (!c6.l1) {
            c6.k1 = true;
        }
    }
    
    public final void n() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto RESUMED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final Fragment.d m1 = c.m1;
        View i;
        if (m1 == null) {
            i = null;
        }
        else {
            i = m1.m;
        }
        if (i != null) {
            boolean b = false;
            Label_0109: {
                Label_0092: {
                    if (i != c.j1) {
                        for (ViewParent viewParent = i.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                            if (viewParent == this.c.j1) {
                                break Label_0092;
                            }
                        }
                        b = false;
                        break Label_0109;
                    }
                }
                b = true;
            }
            if (b) {
                final boolean requestFocus = i.requestFocus();
                if (p.P(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(i);
                    sb.append(" ");
                    String s;
                    if (requestFocus) {
                        s = "succeeded";
                    }
                    else {
                        s = "failed";
                    }
                    sb.append(s);
                    sb.append(" on Fragment ");
                    sb.append(this.c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.c.j1.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.c.O1((View)null);
        final Fragment c2 = this.c;
        ((p)c2.W0).V();
        ((p)c2.W0).A(true);
        c2.C0 = 7;
        c2.h1 = false;
        c2.z1();
        if (c2.h1) {
            final f r1 = c2.r1;
            final d$b on_RESUME = d$b.ON_RESUME;
            r1.f(on_RESUME);
            if (c2.j1 != null) {
                c2.s1.a(on_RESUME);
            }
            final apb w0 = c2.W0;
            ((p)w0).F = false;
            ((p)w0).G = false;
            ((p)w0).M.h = false;
            ((p)w0).u(7);
            this.a.i(this.c, false);
            final Fragment c3 = this.c;
            c3.D0 = null;
            c3.E0 = null;
            c3.F0 = null;
            return;
        }
        throw new dyr(aob.g("Fragment ", c2, " did not call through to super.onResume()"));
    }
    
    public final Bundle o() {
        final Bundle bundle = new Bundle();
        final Fragment c = this.c;
        c.A1(bundle);
        c.u1.d(bundle);
        bundle.putParcelable("android:support:fragments", (Parcelable)((p)c.W0).e0());
        this.a.j(this.c, bundle, false);
        Bundle bundle2 = bundle;
        if (((BaseBundle)bundle).isEmpty()) {
            bundle2 = null;
        }
        if (this.c.j1 != null) {
            this.q();
        }
        Bundle bundle3 = bundle2;
        if (this.c.E0 != null) {
            if ((bundle3 = bundle2) == null) {
                bundle3 = new Bundle();
            }
            bundle3.putSparseParcelableArray("android:view_state", this.c.E0);
        }
        Bundle bundle4 = bundle3;
        if (this.c.F0 != null) {
            if ((bundle4 = bundle3) == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBundle("android:view_registry_state", this.c.F0);
        }
        Bundle bundle5 = bundle4;
        if (!this.c.l1) {
            if ((bundle5 = bundle4) == null) {
                bundle5 = new Bundle();
            }
            bundle5.putBoolean("android:user_visible_hint", this.c.l1);
        }
        return bundle5;
    }
    
    public final void p() {
        final lpb lpb = new lpb(this.c);
        final Fragment c = this.c;
        if (c.C0 > -1 && lpb.O0 == null) {
            final Bundle o = this.o();
            lpb.O0 = o;
            if (this.c.K0 != null) {
                if (o == null) {
                    lpb.O0 = new Bundle();
                }
                ((BaseBundle)lpb.O0).putString("android:target_state", this.c.K0);
                final int l0 = this.c.L0;
                if (l0 != 0) {
                    ((BaseBundle)lpb.O0).putInt("android:target_req_state", l0);
                }
            }
        }
        else {
            lpb.O0 = c.D0;
        }
        this.b.q(this.c.H0, lpb);
    }
    
    public final void q() {
        if (this.c.j1 == null) {
            return;
        }
        if (p.P(2)) {
            final StringBuilder g = w48.g("Saving view state for fragment ");
            g.append(this.c);
            g.append(" with view ");
            g.append(this.c.j1);
            Log.v("FragmentManager", g.toString());
        }
        final SparseArray e0 = new SparseArray();
        this.c.j1.saveHierarchyState(e0);
        if (e0.size() > 0) {
            this.c.E0 = e0;
        }
        final Bundle f0 = new Bundle();
        this.c.s1.F0.d(f0);
        if (!((BaseBundle)f0).isEmpty()) {
            this.c.F0 = f0;
        }
    }
    
    public final void r() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("moveto STARTED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        ((p)c.W0).V();
        ((p)c.W0).A(true);
        c.C0 = 5;
        c.h1 = false;
        c.B1();
        if (c.h1) {
            final f r1 = c.r1;
            final d$b on_START = d$b.ON_START;
            r1.f(on_START);
            if (c.j1 != null) {
                c.s1.a(on_START);
            }
            final apb w0 = c.W0;
            ((p)w0).F = false;
            ((p)w0).G = false;
            ((p)w0).M.h = false;
            ((p)w0).u(5);
            this.a.k(this.c, false);
            return;
        }
        throw new dyr(aob.g("Fragment ", c, " did not call through to super.onStart()"));
    }
    
    public final void s() {
        if (p.P(3)) {
            final StringBuilder g = w48.g("movefrom STARTED: ");
            g.append(this.c);
            Log.d("FragmentManager", g.toString());
        }
        final Fragment c = this.c;
        final apb w0 = c.W0;
        ((p)w0).G = true;
        ((p)w0).M.h = true;
        ((p)w0).u(4);
        if (c.j1 != null) {
            c.s1.a(d$b.ON_STOP);
        }
        c.r1.f(d$b.ON_STOP);
        c.C0 = 4;
        c.h1 = false;
        c.C1();
        if (c.h1) {
            this.a.l(this.c, false);
            return;
        }
        throw new dyr(aob.g("Fragment ", c, " did not call through to super.onStop()"));
    }
}
