import java.util.Iterator;
import android.widget.ImageView;
import java.util.HashSet;
import java.lang.ref.WeakReference;
import java.util.Set;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6k implements bvm, avm$a, gtp
{
    public final Context F0;
    public final UserIdentifier G0;
    public final h6k H0;
    public final l6k I0;
    public final xfv J0;
    public final avm K0;
    public final Set<WeakReference<avm$a>> L0;
    public hp6 M0;
    
    public f6k(final Context context, final zrm zrm, final UserIdentifier g0, final hp6 hp6, final h6k h0, final l6k i0, final dqu dqu, final long n, final nlq nlq) {
        this.L0 = new HashSet();
        this.F0 = context.getApplicationContext();
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = new xfv(zrm, (bvm)this);
        final avm k0 = new avm((avm$a)this, nlq);
        this.K0 = k0;
        k0.K0 = false;
        final ImageView h2 = k0.H0;
        if (h2 != null) {
            h2.setVisibility(8);
        }
        if (hp6 != null) {
            this.f(hp6);
        }
        else if (n > 0L) {
            dqu.y2(n).subscribe((ocj)new c6k(this));
        }
    }
    
    public static void d(final f6k f6k, final WeakReference weakReference, final boolean b) {
        f6k.M0.F0.H0 = true;
        if (weakReference.get() != null) {
            final avm avm = (avm)weakReference.get();
            if (b) {
                avm.c();
            }
            else {
                avm.d();
            }
        }
    }
    
    public final boolean a() {
        return this.M0 != null && !this.e() && this.M0.J() != this.G0.getId() && !this.M0.z0();
    }
    
    public final void b() {
        if (!this.e()) {
            if (this.M0 != null) {
                final h6k h0 = this.H0;
                sbw.b(h0.b.a(h0.c, dda.g("periscope_watch", "", "", "retweet", "click"), ((i1p)this.I0).a()));
                final jvm jvm = new jvm(this.F0, this.G0, this.M0.D(), 0L, (gjl)null);
                final tsc c = tsc.c();
                ((pnm)jvm).U((aw0$b)new d6k(this, this.K0));
                c.f((pnm)jvm);
            }
            final Iterator iterator = this.L0.iterator();
            while (iterator.hasNext()) {
                final avm$a avm$a = ((WeakReference<avm$a>)iterator.next()).get();
                if (avm$a != null) {
                    avm$a.b();
                }
            }
        }
    }
    
    public final void c(final avm$a avm$a) {
        this.L0.add(new WeakReference(avm$a));
    }
    
    public final boolean e() {
        final hp6 m0 = this.M0;
        return m0 != null && m0.F0.H0;
    }
    
    public final void f(final hp6 m0) {
        this.M0 = m0;
        if (this.a()) {
            final avm k0 = this.K0;
            k0.K0 = true;
            final ImageView h0 = k0.H0;
            if (h0 != null) {
                h0.setVisibility(0);
            }
        }
        if (this.e()) {
            this.K0.c();
        }
    }
    
    public final void g() {
        if (this.e()) {
            if (this.M0 != null) {
                final fp8 fp8 = new fp8(this.F0, this.G0, this.M0.D(), this.M0.w(), false);
                final tsc c = tsc.c();
                ((pnm)fp8).U((aw0$b)new e6k(this, this.K0));
                c.f((pnm)fp8);
            }
            final Iterator iterator = this.L0.iterator();
            while (iterator.hasNext()) {
                final avm$a avm$a = ((WeakReference<avm$a>)iterator.next()).get();
                if (avm$a != null) {
                    avm$a.g();
                }
            }
        }
    }
    
    public static class a<REQ extends pnm<?, ?>> implements osc$a<REQ>
    {
        public WeakReference<avm> F0;
        
        public a(final avm avm) {
            this.F0 = new WeakReference<avm>(avm);
        }
        
        public final void a(final aw0 aw0) {
        }
        
        public final void c(final aw0 aw0, final boolean b) {
        }
    }
}
