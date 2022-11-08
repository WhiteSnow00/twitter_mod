import com.twitter.util.user.UserIdentifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmr
{
    public final Context a;
    public final ofk b;
    public final zml<Boolean> c;
    public final zml<Boolean> d;
    public final Set<String> e;
    public final Set<String> f;
    public final Set<String> g;
    public long h;
    public boolean i;
    
    public qmr(final Context context, final ofk b) {
        this.h = TimeUnit.MINUTES.toMillis(2L);
        this.a = context.getApplicationContext();
        this.b = b;
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        final zml c = new zml();
        this.c = (zml<Boolean>)c;
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        ((b5j)c).debounce(100L, milliseconds).subscribe((wbj)new qmr.qmr$a(this));
        final zml d = new zml();
        this.d = (zml<Boolean>)d;
        ((b5j)d).debounce(1000L, milliseconds).subscribe((wbj)new qmr.qmr$a(this));
    }
    
    public final Collection<String> a() {
        synchronized (this) {
            final HashSet set = new HashSet();
            set.addAll(this.e);
            set.removeAll(this.g);
            set.addAll(this.f);
            return set;
        }
    }
    
    public final void b(final int n) {
        synchronized (this) {
            this.i = false;
            if (!q1a.d(n)) {
                this.e.clear();
                this.f.clear();
                this.g.clear();
            }
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.e.removeAll(this.g);
            this.e.addAll(this.f);
            this.f.clear();
            final HashSet<String> set = new HashSet<String>(this.e);
            final HashSet<String> set2 = new HashSet<String>(this.g);
            this.g.clear();
            monitorexit(this);
            this.d(set, set2);
        }
    }
    
    public final void d(final Set<String> set, final Set<String> set2) {
        psc.c().f((ksc)new rqt(UserIdentifier.getCurrent(), this.b, this.h, (Collection)set, (Collection)set2));
        final g1g.g1g$d m = ((f1g)this.b).a.m;
        if (m != null) {
            ++m.t;
        }
    }
    
    public final void e(final String s) {
        synchronized (this) {
            this.g.remove(s);
            if (!this.e.contains(s)) {
                this.f.add(s);
                if (this.i) {
                    this.c.onNext((Object)Boolean.TRUE);
                }
            }
        }
    }
    
    public final void f(final String s) {
        synchronized (this) {
            if (!this.e.contains(s)) {
                this.f.remove(s);
                return;
            }
            this.g.add(s);
            if (this.i && this.f.isEmpty()) {
                this.d.onNext((Object)Boolean.TRUE);
            }
        }
    }
}
