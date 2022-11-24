import java.util.concurrent.TimeUnit;
import java.util.Map;
import androidx.work.b;
import java.util.HashMap;
import androidx.work.c;
import com.twitter.subscriptions.appicon.implementation.AppIconResetWorker;
import kotlin.NoWhenBranchMatchedException;
import android.content.pm.PackageManager;
import java.util.Iterator;
import android.content.ComponentName;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Collection;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nl0 implements ml0
{
    public static final nl0.nl0$a Companion;
    public final gcu a;
    public final Context b;
    public final lsx c;
    public final r9a d;
    public final igt e;
    public final ql0 f;
    public final dl0 g;
    public final Set<dl0> h;
    public final Set<String> i;
    public final h5s j;
    public final List<dl0> k;
    
    static {
        Companion = new nl0.nl0$a();
    }
    
    public nl0(final gcu a, final Context b, final lsx c, final r9a d, final igt e, final ql0 f, final dl0 g, final Set<? extends dl0> h, final Set<String> i) {
        e0e.f((Object)a, "preferences");
        e0e.f((Object)b, "applicationContext");
        e0e.f((Object)c, "workManager");
        e0e.f((Object)d, "errorReporter");
        e0e.f((Object)e, "toaster");
        e0e.f((Object)f, "appIconScribeReporter");
        e0e.f((Object)g, "defaultAppIcon");
        e0e.f((Object)h, "customAppIcons");
        e0e.f((Object)i, "allActivityAliasNames");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = (Set<dl0>)h;
        this.i = i;
        this.j = (h5s)jty.N((ptb)new nl0$b(this));
        this.k = (ArrayList)rr4.T1((Collection)shw.x0((Object)g), (Iterable)rr4.b2((Iterable)h, (Comparator)new nl0$c()));
    }
    
    public final dl0 a() {
        return ((AtomicReference)this.j.getValue()).get();
    }
    
    public final dl0 b() {
        return this.g;
    }
    
    public final List<dl0> c() {
        return this.k;
    }
    
    public final void d(final gl0 gl0) {
        final dl0 a = this.a();
        if (a == null || a.c() != this.g.c()) {
            if (this.a() == null) {
                final Set<dl0> h = this.h;
                final ArrayList list = new ArrayList<String>(nr4.d1((Iterable)h, 10));
                final Iterator<Object> iterator = h.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().a());
                }
                final Set<String> i = this.i;
                final ArrayList<String> list2 = new ArrayList<String>();
                for (final String next : i) {
                    if (list.contains(next) ^ true) {
                        list2.add(next);
                    }
                }
                for (final String s : list2) {
                    Object m;
                    try {
                        this.f().setComponentEnabledSetting(new ComponentName(this.b, s), 0, 1);
                        final vzv a2 = vzv.a;
                    }
                    finally {
                        final Throwable t;
                        m = jb2.M(t);
                    }
                    final Throwable a3 = ctm.a(m);
                    if (a3 != null) {
                        this.d.f(a3);
                    }
                }
            }
            this.h(this.g.c(), gl0);
        }
    }
    
    public final void e(final int n) {
        this.h(n, (gl0)gl0$a.a);
    }
    
    public final PackageManager f() {
        return this.b.getPackageManager();
    }
    
    public final void g(dl0 g) {
        ((AtomicReference)this.j.getValue()).set(g);
        final gcu$c i = this.a.i();
        if (g == null) {
            g = this.g;
        }
        ((gcu$d)i).g("current_app_icon_id", g.c());
        i.e();
    }
    
    public final void h(int n, final gl0 gl0) {
        while (true) {
            for (final Object next : this.k) {
                if (((dl0)next).c() == n) {
                    final dl0 dl0 = (dl0)next;
                    if (dl0 == null) {
                        return;
                    }
                    for (final dl0 dl2 : this.k) {
                        if (!e0e.a((Object)dl2, (Object)dl0)) {
                            Object m = null;
                            try {
                                if (dl2.c() == this.g.c()) {
                                    this.f().setComponentEnabledSetting(new ComponentName(this.b, dl2.a()), 2, 1);
                                }
                                else {
                                    this.f().setComponentEnabledSetting(new ComponentName(this.b, dl2.a()), 0, 1);
                                }
                                final vzv a = vzv.a;
                            }
                            finally {
                                final Throwable t;
                                m = jb2.M(t);
                            }
                            final Throwable a2 = ctm.a(m);
                            if (a2 == null) {
                                continue;
                            }
                            this.d.f(a2);
                        }
                        else {
                            Object i;
                            try {
                                this.f().setComponentEnabledSetting(new ComponentName(this.b, dl2.a()), 1, 1);
                                final vzv a3 = vzv.a;
                            }
                            finally {
                                final Throwable t2;
                                i = jb2.M(t2);
                            }
                            if (i instanceof ctm$b ^ true) {
                                final vzv vzv = (vzv)i;
                                this.g(dl2);
                                final igt e = this.e;
                                if (e0e.a((Object)gl0, (Object)gl0$a.a)) {
                                    n = 2131952023;
                                }
                                else if (e0e.a((Object)gl0, (Object)gl0$c.a)) {
                                    n = 2131952016;
                                }
                                else if (e0e.a((Object)gl0, (Object)gl0$b.a)) {
                                    n = 2131952014;
                                }
                                else if (e0e.a((Object)gl0, (Object)gl0$d.a)) {
                                    n = 2131952017;
                                }
                                else if (e0e.a((Object)gl0, (Object)gl0$e.a)) {
                                    n = 2131952015;
                                }
                                else {
                                    if (!e0e.a((Object)gl0, (Object)gl0$f.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    n = 2131952018;
                                }
                                e.c(n, 1);
                                dl0.b b;
                                if (dl2 instanceof dl0.b) {
                                    b = (dl0.b)dl2;
                                }
                                else {
                                    b = null;
                                }
                                vzv a6;
                                if (b != null) {
                                    final long j = b.j;
                                    final g5s a4 = nq1.a;
                                    long n2;
                                    if ((n2 = j - System.currentTimeMillis()) < 0L) {
                                        n2 = 0L;
                                    }
                                    final lsx c = this.c;
                                    final uga f0 = uga.F0;
                                    final emj.a a5 = new emj.a((Class<? extends c>)AppIconResetWorker.class);
                                    final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
                                    hashMap.put("ParamAppIconID", b.e);
                                    final b e2 = new b((Map)hashMap);
                                    androidx.work.b.f(e2);
                                    a5.c.e = e2;
                                    c.f("AppIconResetJob", f0, (emj)a5.g(n2, TimeUnit.MILLISECONDS).b());
                                    a6 = vzv.a;
                                }
                                else {
                                    a6 = null;
                                }
                                if (a6 == null) {
                                    this.c.c("AppIconResetJob");
                                }
                                this.f.a(new pl0(dl2, gl0, true));
                            }
                            final Throwable a7 = ctm.a(i);
                            if (a7 == null) {
                                continue;
                            }
                            this.d.f(a7);
                            this.f().setComponentEnabledSetting(new ComponentName(this.b, this.g.a()), 1, 1);
                            this.g(this.g);
                            this.c.c("AppIconResetJob");
                            this.f.a(new pl0(dl2, gl0, false));
                        }
                    }
                    return;
                }
            }
            Object next = null;
            continue;
        }
    }
}
