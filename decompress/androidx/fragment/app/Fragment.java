// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.MenuItem;
import android.view.LayoutInflater$Factory2;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import android.view.Menu;
import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.lifecycle.d;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import android.content.res.Resources;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import android.view.LayoutInflater;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import java.util.UUID;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.lifecycle.f;
import androidx.lifecycle.d$c;
import android.view.View;
import android.view.ViewGroup;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, xaf, w9x, ncc, pto
{
    public static final Object z1;
    public int D0;
    public Bundle E0;
    public SparseArray<Parcelable> F0;
    public Bundle G0;
    public Boolean H0;
    public String I0;
    public Bundle J0;
    public Fragment K0;
    public String L0;
    public int M0;
    public Boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public p V0;
    public hnb<?> W0;
    public wnb X0;
    public Fragment Y0;
    public int Z0;
    public int a1;
    public String b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public ViewGroup j1;
    public View k1;
    public boolean l1;
    public boolean m1;
    public Fragment.Fragment$d n1;
    public boolean o1;
    public boolean p1;
    public String q1;
    public d$c r1;
    public f s1;
    public yob t1;
    public wth<xaf> u1;
    public oto v1;
    public final AtomicInteger w1;
    public final ArrayList<Fragment.Fragment$e> x1;
    public final Fragment$a y1;
    
    static {
        z1 = new Object();
    }
    
    public Fragment() {
        this.D0 = -1;
        this.I0 = UUID.randomUUID().toString();
        this.L0 = null;
        this.N0 = null;
        this.X0 = new wnb();
        this.h1 = true;
        this.m1 = true;
        this.r1 = d$c.H0;
        this.u1 = (wth<xaf>)new wth();
        this.w1 = new AtomicInteger();
        this.x1 = new ArrayList<Fragment.Fragment$e>();
        this.y1 = new Fragment$a(this);
        this.Z0();
    }
    
    @Deprecated
    public static Fragment c1(final Context context, final String s) {
        try {
            return n.c(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final InvocationTargetException ex) {
            throw new Fragment.Fragment$InstantiationException(da8.j("Unable to instantiate fragment ", s, ": calling Fragment constructor caused an exception"), (Exception)ex);
        }
        catch (final NoSuchMethodException ex2) {
            throw new Fragment.Fragment$InstantiationException(da8.j("Unable to instantiate fragment ", s, ": could not find Fragment constructor"), (Exception)ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new Fragment.Fragment$InstantiationException(da8.j("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), (Exception)ex3);
        }
        catch (final InstantiationException ex4) {
            throw new Fragment.Fragment$InstantiationException(da8.j("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), (Exception)ex4);
        }
    }
    
    public final nto A() {
        return this.v1.b;
    }
    
    public void A1(final Bundle bundle) {
    }
    
    public void B1() {
        this.i1 = true;
    }
    
    public void C1() {
        this.i1 = true;
    }
    
    public void D1(final View view, final Bundle bundle) {
    }
    
    public void E1(final Bundle bundle) {
        this.i1 = true;
    }
    
    public void F1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        ((p)this.X0).V();
        boolean b = true;
        this.T0 = true;
        this.t1 = new yob(this, this.p());
        final View m1 = this.m1(layoutInflater, viewGroup, bundle);
        this.k1 = m1;
        if (m1 != null) {
            this.t1.c();
            lp.g0(this.k1, (xaf)this.t1);
            nza.S1(this.k1, (w9x)this.t1);
            fcx.b(this.k1, (pto)this.t1);
            this.u1.k((Object)this.t1);
        }
        else {
            if (this.t1.F0 == null) {
                b = false;
            }
            if (b) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.t1 = null;
        }
    }
    
    public final <I, O> jo<I> G1(final fo<I, O> fo, final eo<O> eo) {
        final Fragment$c fragment$c = new Fragment$c(this);
        if (this.D0 <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            final l l = new l(this, (wtb)fragment$c, atomicReference, (fo)fo, (eo)eo);
            if (this.D0 >= 0) {
                l.a();
            }
            else {
                this.x1.add((Fragment.Fragment$e)l);
            }
            return (jo<I>)new xmb(atomicReference);
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }
    
    public final cnb H1() {
        final cnb l0 = this.L0();
        if (l0 != null) {
            return l0;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " not attached to an activity."));
    }
    
    public db I0() {
        return new db(this) {
            public final Fragment E0;
            
            public final View q0(final int n) {
                final View k1 = this.E0.k1;
                if (k1 != null) {
                    return k1.findViewById(n);
                }
                final StringBuilder j = fu8.j("Fragment ");
                j.append(this.E0);
                j.append(" does not have a view");
                throw new IllegalStateException(j.toString());
            }
            
            public final boolean r0() {
                return this.E0.k1 != null;
            }
        };
    }
    
    public final Bundle I1() {
        final Bundle j0 = this.J0;
        if (j0 != null) {
            return j0;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " does not have any arguments."));
    }
    
    public void J0(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.Z0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.a1));
        printWriter.print(" mTag=");
        printWriter.println(this.b1);
        printWriter.print(s);
        printWriter.print("mState=");
        printWriter.print(this.D0);
        printWriter.print(" mWho=");
        printWriter.print(this.I0);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.U0);
        printWriter.print(s);
        printWriter.print("mAdded=");
        printWriter.print(this.O0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.P0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.Q0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.R0);
        printWriter.print(s);
        printWriter.print("mHidden=");
        printWriter.print(this.c1);
        printWriter.print(" mDetached=");
        printWriter.print(this.d1);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.h1);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.g1);
        printWriter.print(s);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.e1);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.m1);
        if (this.V0 != null) {
            printWriter.print(s);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.V0);
        }
        if (this.W0 != null) {
            printWriter.print(s);
            printWriter.print("mHost=");
            printWriter.println(this.W0);
        }
        if (this.Y0 != null) {
            printWriter.print(s);
            printWriter.print("mParentFragment=");
            printWriter.println(this.Y0);
        }
        if (this.J0 != null) {
            printWriter.print(s);
            printWriter.print("mArguments=");
            printWriter.println(this.J0);
        }
        if (this.E0 != null) {
            printWriter.print(s);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.E0);
        }
        if (this.F0 != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.F0);
        }
        if (this.G0 != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.G0);
        }
        boolean a = false;
        final Fragment y0 = this.Y0(false);
        if (y0 != null) {
            printWriter.print(s);
            printWriter.print("mTarget=");
            printWriter.print(y0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.M0);
        }
        printWriter.print(s);
        printWriter.print("mPopDirection=");
        final Fragment.Fragment$d n1 = this.n1;
        if (n1 != null) {
            a = n1.a;
        }
        printWriter.println(a);
        if (this.O0() != 0) {
            printWriter.print(s);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.O0());
        }
        if (this.P0() != 0) {
            printWriter.print(s);
            printWriter.print("getExitAnim=");
            printWriter.println(this.P0());
        }
        if (this.S0() != 0) {
            printWriter.print(s);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.S0());
        }
        if (this.T0() != 0) {
            printWriter.print(s);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.T0());
        }
        if (this.j1 != null) {
            printWriter.print(s);
            printWriter.print("mContainer=");
            printWriter.println(this.j1);
        }
        if (this.k1 != null) {
            printWriter.print(s);
            printWriter.print("mView=");
            printWriter.println(this.k1);
        }
        if (this.N0() != null) {
            r2g.b((xaf)this).a(s, fileDescriptor, printWriter, array);
        }
        printWriter.print(s);
        final StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.X0);
        sb.append(":");
        printWriter.println(sb.toString());
        ((p)this.X0).w(hmg.h(s, "  "), fileDescriptor, printWriter, array);
    }
    
    public final Context J1() {
        final Context n0 = this.N0();
        if (n0 != null) {
            return n0;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " not attached to a context."));
    }
    
    public final Fragment.Fragment$d K0() {
        if (this.n1 == null) {
            this.n1 = new Fragment.Fragment$d();
        }
        return this.n1;
    }
    
    public final View K1() {
        final View k1 = this.k1;
        if (k1 != null) {
            return k1;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }
    
    public final cnb L0() {
        final hnb<?> w0 = this.W0;
        cnb cnb;
        if (w0 == null) {
            cnb = null;
        }
        else {
            cnb = (cnb)w0.E0;
        }
        return cnb;
    }
    
    public final void L1(final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                ((p)this.X0).d0(parcelable);
                ((p)this.X0).j();
            }
        }
    }
    
    public final p M0() {
        if (this.W0 != null) {
            return (p)this.X0;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " has not been attached yet."));
    }
    
    public final void M1(final int b, final int c, final int d, final int e) {
        if (this.n1 == null && b == 0 && c == 0 && d == 0 && e == 0) {
            return;
        }
        this.K0().b = b;
        this.K0().c = c;
        this.K0().d = d;
        this.K0().e = e;
    }
    
    public final Context N0() {
        final hnb<?> w0 = this.W0;
        Context f0;
        if (w0 == null) {
            f0 = null;
        }
        else {
            f0 = w0.F0;
        }
        return f0;
    }
    
    public final void N1(final Bundle j0) {
        final p v0 = this.V0;
        if (v0 != null && (v0 != null && v0.T())) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.J0 = j0;
    }
    
    public final int O0() {
        final Fragment.Fragment$d n1 = this.n1;
        if (n1 == null) {
            return 0;
        }
        return n1.b;
    }
    
    public final void O1(final View m) {
        this.K0().m = m;
    }
    
    public final int P0() {
        final Fragment.Fragment$d n1 = this.n1;
        if (n1 == null) {
            return 0;
        }
        return n1.c;
    }
    
    @Deprecated
    public final void P1() {
        if (!this.g1) {
            this.g1 = true;
            if (this.d1() && !this.e1()) {
                this.W0.w0();
            }
        }
    }
    
    public final int Q0() {
        final d$c r1 = this.r1;
        if (r1 != d$c.E0 && this.Y0 != null) {
            return Math.min(((Enum)r1).ordinal(), this.Y0.Q0());
        }
        return ((Enum)r1).ordinal();
    }
    
    public final void Q1(final boolean h1) {
        if (this.h1 != h1) {
            this.h1 = h1;
            if (this.g1 && this.d1() && !this.e1()) {
                this.W0.w0();
            }
        }
    }
    
    public final p R0() {
        final p v0 = this.V0;
        if (v0 != null) {
            return v0;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " not associated with a fragment manager."));
    }
    
    public final void R1(final boolean a) {
        if (this.n1 == null) {
            return;
        }
        this.K0().a = a;
    }
    
    public final int S0() {
        final Fragment.Fragment$d n1 = this.n1;
        if (n1 == null) {
            return 0;
        }
        return n1.d;
    }
    
    @Deprecated
    public final void S1() {
        final oob a = oob.a;
        final SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        final oob a2 = oob.a;
        oob.c((Violation)setRetainInstanceUsageViolation);
        final oob$c a3 = oob.a(this);
        if (a3.a.contains(oob$a.H0) && oob.f(a3, (Class)this.getClass(), (Class)SetRetainInstanceUsageViolation.class)) {
            oob.b(a3, (Violation)setRetainInstanceUsageViolation);
        }
        this.e1 = true;
        final p v0 = this.V0;
        if (v0 != null) {
            v0.M.b(this);
        }
        else {
            this.f1 = true;
        }
    }
    
    public final int T0() {
        final Fragment.Fragment$d n1 = this.n1;
        if (n1 == null) {
            return 0;
        }
        return n1.e;
    }
    
    @Deprecated
    public final void T1(final Fragment k0, final int m0) {
        if (k0 != null) {
            final oob a = oob.a;
            final SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, k0, m0);
            final oob a2 = oob.a;
            oob.c((Violation)setTargetFragmentUsageViolation);
            final oob$c a3 = oob.a(this);
            if (a3.a.contains(oob$a.J0) && oob.f(a3, (Class)this.getClass(), (Class)SetTargetFragmentUsageViolation.class)) {
                oob.b(a3, (Violation)setTargetFragmentUsageViolation);
            }
        }
        final p v0 = this.V0;
        p v2;
        if (k0 != null) {
            v2 = k0.V0;
        }
        else {
            v2 = null;
        }
        if (v0 != null && v2 != null && v0 != v2) {
            throw new IllegalArgumentException(sk0.C("Fragment ", k0, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment y0 = k0; y0 != null; y0 = y0.Y0(false)) {
            if (y0.equals(this)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting ");
                sb.append(k0);
                sb.append(" as the target of ");
                sb.append(this);
                sb.append(" would create a target cycle");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (k0 == null) {
            this.L0 = null;
            this.K0 = null;
        }
        else if (this.V0 != null && k0.V0 != null) {
            this.L0 = k0.I0;
            this.K0 = null;
        }
        else {
            this.L0 = null;
            this.K0 = k0;
        }
        this.M0 = m0;
    }
    
    public final Resources U0() {
        return this.J1().getResources();
    }
    
    @Deprecated
    public final void U1(final boolean m1) {
        final oob a = oob.a;
        final SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, m1);
        final oob a2 = oob.a;
        oob.c((Violation)setUserVisibleHintViolation);
        final oob$c a3 = oob.a(this);
        if (a3.a.contains(oob$a.I0) && oob.f(a3, (Class)this.getClass(), (Class)SetUserVisibleHintViolation.class)) {
            oob.b(a3, (Violation)setUserVisibleHintViolation);
        }
        if (!this.m1 && m1 && this.D0 < 5 && this.V0 != null && this.d1() && this.p1) {
            final p v0 = this.V0;
            v0.W(v0.f(this));
        }
        this.m1 = m1;
        this.l1 = (this.D0 < 5 && !m1);
        if (this.E0 != null) {
            this.H0 = m1;
        }
    }
    
    @Deprecated
    public final boolean V0() {
        final oob a = oob.a;
        final GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        final oob a2 = oob.a;
        oob.c((Violation)getRetainInstanceUsageViolation);
        final oob$c a3 = oob.a(this);
        if (a3.a.contains(oob$a.H0) && oob.f(a3, (Class)this.getClass(), (Class)GetRetainInstanceUsageViolation.class)) {
            oob.b(a3, (Violation)getRetainInstanceUsageViolation);
        }
        return this.e1;
    }
    
    public final void V1(@SuppressLint({ "UnknownNullness" }) final Intent intent) {
        final hnb<?> w0 = this.W0;
        if (w0 != null) {
            final Context f0 = w0.F0;
            final Object a = kn6.a;
            kn6.a.b(f0, intent, null);
            return;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " not attached to Activity"));
    }
    
    public final String W0(final int n) {
        return this.U0().getString(n);
    }
    
    @Deprecated
    public final void W1(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, final Bundle bundle) {
        if (this.W0 != null) {
            final p r0 = this.R0();
            if (r0.A != null) {
                r0.D.addLast(new p$l(this.I0, n));
                r0.A.a((Object)intent);
            }
            else {
                final hnb u = r0.u;
                Objects.requireNonNull(u);
                if (n != -1) {
                    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
                }
                final Context f0 = u.F0;
                final Object a = kn6.a;
                kn6.a.b(f0, intent, null);
            }
            return;
        }
        throw new IllegalStateException(sk0.C("Fragment ", this, " not attached to Activity"));
    }
    
    public final String X0(final int n, final Object... array) {
        return this.U0().getString(n, array);
    }
    
    public final Fragment Y0(final boolean b) {
        if (b) {
            final oob a = oob.a;
            final GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            final oob a2 = oob.a;
            oob.c((Violation)getTargetFragmentUsageViolation);
            final oob$c a3 = oob.a(this);
            if (a3.a.contains(oob$a.J0) && oob.f(a3, (Class)this.getClass(), (Class)GetTargetFragmentUsageViolation.class)) {
                oob.b(a3, (Violation)getTargetFragmentUsageViolation);
            }
        }
        final Fragment k0 = this.K0;
        if (k0 != null) {
            return k0;
        }
        final p v0 = this.V0;
        if (v0 != null) {
            final String l0 = this.L0;
            if (l0 != null) {
                return v0.E(l0);
            }
        }
        return null;
    }
    
    public final void Z0() {
        this.s1 = new f((xaf)this);
        this.v1 = oto.a((pto)this);
        if (!this.x1.contains(this.y1)) {
            final Fragment$a y1 = this.y1;
            if (this.D0 >= 0) {
                y1.a();
            }
            else {
                this.x1.add((Fragment.Fragment$e)y1);
            }
        }
    }
    
    final void a1() {
        this.Z0();
        this.q1 = this.I0;
        this.I0 = UUID.randomUUID().toString();
        this.O0 = false;
        this.P0 = false;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = false;
        this.U0 = 0;
        this.V0 = null;
        this.X0 = new wnb();
        this.W0 = null;
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = null;
        this.c1 = false;
        this.d1 = false;
    }
    
    public final d b() {
        return (d)this.s1;
    }
    
    public final boolean d1() {
        return this.W0 != null && this.O0;
    }
    
    public final boolean e1() {
        final boolean c1 = this.c1;
        final boolean b = false;
        if (!c1) {
            final p v0 = this.V0;
            boolean b2 = b;
            if (v0 == null) {
                return b2;
            }
            final Fragment y0 = this.Y0;
            Objects.requireNonNull(v0);
            final boolean b3 = y0 != null && y0.e1();
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public final boolean f1() {
        return this.U0 > 0;
    }
    
    @Deprecated
    public void g1(final Bundle bundle) {
        this.i1 = true;
    }
    
    @Deprecated
    public void h1(final int n, final int n2, final Intent intent) {
        if (p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(n);
            sb.append(" resultCode: ");
            sb.append(n2);
            sb.append(" data: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public final a57 i0() {
        while (true) {
            for (Context context = this.J1().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    if (application == null && p.P(3)) {
                        final StringBuilder j = fu8.j("Could not find Application instance from Context ");
                        j.append(this.J1().getApplicationContext());
                        j.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                        Log.d("FragmentManager", j.toString());
                    }
                    final qth qth = new qth();
                    if (application != null) {
                        ((a57)qth).a.put(q3j.L0, application);
                    }
                    ((a57)qth).a.put(hto.a, this);
                    ((a57)qth).a.put(hto.b, this);
                    final Bundle j2 = this.J0;
                    if (j2 != null) {
                        ((a57)qth).a.put(hto.c, j2);
                    }
                    return (a57)qth;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    @Deprecated
    public void i1(final Activity activity) {
        this.i1 = true;
    }
    
    public void j1(final Context context) {
        this.i1 = true;
        final hnb<?> w0 = this.W0;
        Activity e0;
        if (w0 == null) {
            e0 = null;
        }
        else {
            e0 = w0.E0;
        }
        if (e0 != null) {
            this.i1 = false;
            this.i1(e0);
        }
    }
    
    public void k1(final Bundle bundle) {
        boolean b = true;
        this.i1 = true;
        this.L1(bundle);
        final wnb x0 = this.X0;
        if (((p)x0).t < 1) {
            b = false;
        }
        if (!b) {
            ((p)x0).j();
        }
    }
    
    @Deprecated
    public void l1(final Menu menu) {
    }
    
    public View m1(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return null;
    }
    
    public void o1() {
        this.i1 = true;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.i1 = true;
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        ((Activity)this.H1()).onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public final void onLowMemory() {
        this.i1 = true;
    }
    
    public final s9x p() {
        if (this.V0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.Q0() != 1) {
            final xnb m = this.V0.M;
            s9x s9x;
            if ((s9x = m.e.get(this.I0)) == null) {
                s9x = new s9x();
                m.e.put(this.I0, s9x);
            }
            return s9x;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    public void q1() {
        this.i1 = true;
    }
    
    public void r1() {
        this.i1 = true;
    }
    
    public LayoutInflater s1(final Bundle bundle) {
        final hnb<?> w0 = this.W0;
        if (w0 != null) {
            final LayoutInflater v0 = w0.v0();
            v0.setFactory2((LayoutInflater$Factory2)((p)this.X0).f);
            return v0;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    @Deprecated
    public final void startActivityForResult(@SuppressLint({ "UnknownNullness" }) final Intent intent, final int n) {
        this.W1(intent, n, null);
    }
    
    public void t1(final boolean b) {
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.I0);
        if (this.Z0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.Z0));
        }
        if (this.b1 != null) {
            sb.append(" tag=");
            sb.append(this.b1);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public final void u1() {
        this.i1 = true;
        final hnb<?> w0 = this.W0;
        Activity e0;
        if (w0 == null) {
            e0 = null;
        }
        else {
            e0 = w0.E0;
        }
        if (e0 != null) {
            this.i1 = true;
        }
    }
    
    @Deprecated
    public boolean v1(final MenuItem menuItem) {
        return false;
    }
    
    public void w1() {
        this.i1 = true;
    }
    
    @Deprecated
    public void x1(final Menu menu) {
    }
    
    @Deprecated
    public void y1(final int n, final String[] array, final int[] array2) {
    }
    
    public void z1() {
        this.i1 = true;
    }
}
