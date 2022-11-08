// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import android.util.Log;
import java.util.Collection;
import android.view.View;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import android.view.ViewGroup;

public abstract class v
{
    public final ViewGroup a;
    public final ArrayList<b> b;
    public final ArrayList<b> c;
    public boolean d;
    public boolean e;
    
    public v(final ViewGroup a) {
        this.b = new ArrayList<b>();
        this.c = new ArrayList<b>();
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    public static v f(final ViewGroup viewGroup, final h0r h0r) {
        final Object tag = ((View)viewGroup).getTag(2131431658);
        if (tag instanceof v) {
            return (v)tag;
        }
        Objects.requireNonNull(h0r);
        final c c = new c(viewGroup);
        ((View)viewGroup).setTag(2131431658, (Object)c);
        return c;
    }
    
    public static v g(final ViewGroup viewGroup, final p p2) {
        return f(viewGroup, p2.N());
    }
    
    public final void a(final int n, final int n2, final r r) {
        synchronized (this.b) {
            final jg3 jg3 = new jg3();
            final b d = this.d(r.c);
            if (d != null) {
                d.d(n, n2);
                return;
            }
            final v.v$a v$a = new v.v$a(n, n2, r, jg3);
            this.b.add((b)v$a);
            ((b)v$a).a(new t(this, v$a));
            ((b)v$a).a(new u(this, v$a));
        }
    }
    
    public abstract void b(final List<b> p0, final boolean p1);
    
    public final void c() {
        if (this.e) {
            return;
        }
        final ViewGroup a = this.a;
        final WeakHashMap a2 = p5x.a;
        if (!p5x$g.b((View)a)) {
            this.e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                final ArrayList list = new ArrayList(this.c);
                this.c.clear();
                for (final b b : list) {
                    if (p.P(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(b);
                        Log.v("FragmentManager", sb.toString());
                    }
                    b.b();
                    if (!b.g) {
                        this.c.add(b);
                    }
                }
                this.i();
                final ArrayList<b> list2 = new ArrayList<b>(this.b);
                this.b.clear();
                this.c.addAll(list2);
                if (p.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                final Iterator<b> iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().e();
                }
                this.b(list2, this.d);
                this.d = false;
                if (p.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }
    
    public final b d(final Fragment fragment) {
        for (final b b : this.b) {
            if (b.c.equals((Object)fragment) && !b.f) {
                return b;
            }
        }
        return null;
    }
    
    public final void e() {
        if (p.P(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        final ViewGroup a = this.a;
        final WeakHashMap a2 = p5x.a;
        final boolean b = p5x$g.b((View)a);
        synchronized (this.b) {
            this.i();
            final Iterator<b> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().e();
            }
            for (final b b2 : new ArrayList(this.c)) {
                if (p.P(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    String string;
                    if (b) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                        string = sb2.toString();
                    }
                    sb.append(string);
                    sb.append("Cancelling running operation ");
                    sb.append(b2);
                    Log.v("FragmentManager", sb.toString());
                }
                b2.b();
            }
            for (final b b3 : new ArrayList(this.b)) {
                if (p.P(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    String string2;
                    if (b) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.a);
                        sb4.append(" is not attached to window. ");
                        string2 = sb4.toString();
                    }
                    sb3.append(string2);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(b3);
                    Log.v("FragmentManager", sb3.toString());
                }
                b3.b();
            }
        }
    }
    
    public final void h() {
        synchronized (this.b) {
            this.i();
            this.e = false;
            int size = this.b.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                final b b = this.b.get(n);
                final int c = mag.c(b.c.j1);
                size = n;
                if (b.a != 2) {
                    continue;
                }
                size = n;
                if (c != 2) {
                    final Fragment.d m1 = b.c.m1;
                    this.e = false;
                    break;
                }
            }
        }
    }
    
    public final void i() {
        for (final b b : this.b) {
            if (b.b == 2) {
                b.d(mag.b(b.c.K1().getVisibility()), 1);
            }
        }
    }
    
    public static class b
    {
        public int a;
        public int b;
        public final Fragment c;
        public final List<Runnable> d;
        public final HashSet<jg3> e;
        public boolean f;
        public boolean g;
        
        public b(final int a, final int b, final Fragment c, final jg3 jg3) {
            this.d = new ArrayList();
            this.e = new HashSet<jg3>();
            this.f = false;
            this.g = false;
            this.a = a;
            this.b = b;
            this.c = c;
            jg3.b((jg3.b)new w(this));
        }
        
        public final void a(final Runnable runnable) {
            this.d.add(runnable);
        }
        
        public final void b() {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                this.c();
            }
            else {
                final Iterator iterator = new ArrayList(this.e).iterator();
                while (iterator.hasNext()) {
                    ((jg3)iterator.next()).a();
                }
            }
        }
        
        public void c() {
            if (this.g) {
                return;
            }
            if (p.P(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.g = true;
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
        }
        
        public final void d(final int a, int n) {
            if (n != 0) {
                if (--n != 0) {
                    if (n != 1) {
                        if (n == 2) {
                            if (p.P(2)) {
                                final StringBuilder g = w48.g("SpecialEffectsController: For fragment ");
                                g.append(this.c);
                                g.append(" mFinalState = ");
                                g.append(mag.s(this.a));
                                g.append(" -> REMOVED. mLifecycleImpact  = ");
                                g.append(b8b.u(this.b));
                                g.append(" to REMOVING.");
                                Log.v("FragmentManager", g.toString());
                            }
                            this.a = 1;
                            this.b = 3;
                        }
                    }
                    else if (this.a == 1) {
                        if (p.P(2)) {
                            final StringBuilder g2 = w48.g("SpecialEffectsController: For fragment ");
                            g2.append(this.c);
                            g2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                            g2.append(b8b.u(this.b));
                            g2.append(" to ADDING.");
                            Log.v("FragmentManager", g2.toString());
                        }
                        this.a = 2;
                        this.b = 2;
                    }
                }
                else if (this.a != 1) {
                    if (p.P(2)) {
                        final StringBuilder g3 = w48.g("SpecialEffectsController: For fragment ");
                        g3.append(this.c);
                        g3.append(" mFinalState = ");
                        g3.append(mag.s(this.a));
                        g3.append(" -> ");
                        g3.append(mag.s(a));
                        g3.append(". ");
                        Log.v("FragmentManager", g3.toString());
                    }
                    this.a = a;
                }
                return;
            }
            throw null;
        }
        
        public void e() {
        }
        
        @Override
        public final String toString() {
            final StringBuilder j = p88.j("Operation ", "{");
            j.append(Integer.toHexString(System.identityHashCode(this)));
            j.append("} ");
            j.append("{");
            j.append("mFinalState = ");
            j.append(mag.s(this.a));
            j.append("} ");
            j.append("{");
            j.append("mLifecycleImpact = ");
            j.append(b8b.u(this.b));
            j.append("} ");
            j.append("{");
            j.append("mFragment = ");
            j.append(this.c);
            j.append("}");
            return j.toString();
        }
    }
}
