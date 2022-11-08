// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import androidx.lifecycle.d$c;
import java.io.Writer;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import android.util.Log;
import java.util.ArrayList;

public final class a extends s implements m
{
    public final p p;
    public boolean q;
    public int r;
    
    public a(final p p) {
        p.L();
        final lob<?> u = p.u;
        if (u != null) {
            u.E0.getClassLoader();
        }
        this.r = -1;
        this.p = p;
    }
    
    @Override
    public final boolean a(final ArrayList<a> list, final ArrayList<Boolean> list2) {
        if (androidx.fragment.app.p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        list.add(this);
        list2.add(Boolean.FALSE);
        if (super.g) {
            final p p2 = this.p;
            if (p2.d == null) {
                p2.d = new ArrayList<a>();
            }
            p2.d.add(this);
        }
        return true;
    }
    
    @Override
    public final int c() {
        return this.k(false);
    }
    
    @Override
    public final void d() {
        if (!super.g) {
            this.p.B((p.m)this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    
    @Override
    public final void e(final int n, final Fragment fragment, final String a1, final int n2) {
        final String p4 = fragment.p1;
        if (p4 != null) {
            spb.d(fragment, p4);
        }
        final Class<? extends Fragment> class1 = fragment.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (a1 != null) {
                final String a2 = fragment.a1;
                if (a2 != null && !a1.equals(a2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(xa0.B(sb, fragment.a1, " now ", a1));
                }
                fragment.a1 = a1;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append(fragment);
                    sb2.append(" with tag ");
                    sb2.append(a1);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int y0 = fragment.Y0;
                if (y0 != 0 && y0 != n) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(": was ");
                    sb3.append(fragment.Y0);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                fragment.Y0 = n;
                fragment.Z0 = n;
            }
            this.b(new s.a(n2, fragment));
            fragment.U0 = this.p;
            return;
        }
        final StringBuilder g = w48.g("Fragment ");
        g.append(class1.getCanonicalName());
        g.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(g.toString());
    }
    
    @Override
    public final s f(final Fragment fragment) {
        final p u0 = fragment.U0;
        if (u0 != null && u0 != this.p) {
            final StringBuilder g = w48.g("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            g.append(fragment.toString());
            g.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(g.toString());
        }
        this.b(new s.a(4, fragment));
        return this;
    }
    
    @Override
    public final s h(final Fragment fragment) {
        final p u0 = fragment.U0;
        if (u0 != null && u0 != this.p) {
            final StringBuilder g = w48.g("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            g.append(fragment.toString());
            g.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(g.toString());
        }
        this.b(new s.a(5, fragment));
        return this;
    }
    
    public final void i(final int n) {
        if (!super.g) {
            return;
        }
        if (androidx.fragment.app.p.P(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(n);
            Log.v("FragmentManager", sb.toString());
        }
        for (int size = super.a.size(), i = 0; i < size; ++i) {
            final s.a a = super.a.get(i);
            final Fragment b = a.b;
            if (b != null) {
                b.T0 += n;
                if (androidx.fragment.app.p.P(2)) {
                    final StringBuilder g = w48.g("Bump nesting of ");
                    g.append(a.b);
                    g.append(" to ");
                    g.append(a.b.T0);
                    Log.v("FragmentManager", g.toString());
                }
            }
        }
    }
    
    public final int j() {
        return this.k(true);
    }
    
    public final int k(final boolean b) {
        if (!this.q) {
            if (androidx.fragment.app.p.P(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                final PrintWriter printWriter = new PrintWriter((Writer)new e9g());
                this.m("  ", printWriter, true);
                printWriter.close();
            }
            this.q = true;
            if (super.g) {
                this.r = this.p.i.getAndIncrement();
            }
            else {
                this.r = -1;
            }
            this.p.y((p.m)this, b);
            return this.r;
        }
        throw new IllegalStateException("commit already called");
    }
    
    public final void l() {
        if (!super.g) {
            this.p.B((p.m)this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    
    public final void m(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (super.f != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.f));
            }
            if (super.b != 0 || super.c != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.c));
            }
            if (super.d != 0 || super.e != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.e));
            }
            if (super.i != 0 || super.j != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(super.j);
            }
            if (super.k != 0 || super.l != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(super.l);
            }
        }
        if (!super.a.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.a.size(), i = 0; i < size; ++i) {
                final s.a a = super.a.get(i);
                String string = null;
                switch (a.a) {
                    default: {
                        final StringBuilder g = w48.g("cmd=");
                        g.append(a.a);
                        string = g.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(a.b);
                if (b) {
                    if (a.d != 0 || a.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.e));
                    }
                    if (a.f != 0 || a.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.g));
                    }
                }
            }
        }
    }
    
    public final s n(final Fragment fragment) {
        final p u0 = fragment.U0;
        if (u0 != null && u0 != this.p) {
            final StringBuilder g = w48.g("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            g.append(fragment.toString());
            g.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(g.toString());
        }
        this.b(new s.a(3, fragment));
        return this;
    }
    
    public final s o(final Fragment fragment, final d$c d$c) {
        if (fragment.U0 != this.p) {
            final StringBuilder g = w48.g("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            g.append(this.p);
            throw new IllegalArgumentException(g.toString());
        }
        if (d$c == d$c.D0 && fragment.C0 > -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot set maximum Lifecycle to ");
            sb.append(d$c);
            sb.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb.toString());
        }
        if (d$c != d$c.C0) {
            this.b(new s.a(fragment, d$c));
            return this;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot set maximum Lifecycle to ");
        sb2.append(d$c);
        sb2.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (super.h != null) {
            sb.append(" ");
            sb.append(super.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
