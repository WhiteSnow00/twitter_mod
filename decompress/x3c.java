import java.util.Iterator;
import android.view.View;
import j$.time.Instant;
import java.util.Objects;
import tv.periscope.android.graphics.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import com.twitter.commerce.api.CommerceProductDropViewArgs$b;
import android.view.ViewStub;
import android.graphics.Bitmap;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x3c implements dsy
{
    public Object F0;
    public Object G0;
    
    public x3c() {
        this.F0 = new HashMap();
        this.G0 = new fiy(1);
        this.i((ohy)new hhy());
        this.i(new zhy(0));
        this.i((ohy)new fiy(0));
        this.i(new dky());
        this.i((ohy)new aly());
        this.i(new zhy(1));
        this.i(new lly());
    }
    
    public x3c(final Bitmap f0) {
        this.F0 = f0;
        beq g0;
        if (f0 != null) {
            g0 = p60.a(f0);
        }
        else {
            g0 = beq.c;
        }
        this.G0 = g0;
    }
    
    public x3c(final ViewStub f0) {
        this.F0 = f0;
    }
    
    public x3c(final beq g0) {
        this.F0 = null;
        this.G0 = g0;
    }
    
    public x3c(final CommerceProductDropViewArgs$b commerceProductDropViewArgs$b) {
        e0e.f((Object)commerceProductDropViewArgs$b, "loggingValues");
        final String a = commerceProductDropViewArgs$b.a;
        final String b = commerceProductDropViewArgs$b.b;
        Long f1;
        if (b != null) {
            f1 = rlr.f1(b);
        }
        else {
            f1 = null;
        }
        this.F0 = new ex4((Long)null, f1, (Boolean)null, (Integer)null, commerceProductDropViewArgs$b.c, a, (String)null, (String)null, (String)null, (String)null, 262093);
    }
    
    public x3c(final Object f0, final Object g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public x3c(final Map g0, final Set f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public x3c(final t0c g0) {
        this.G0 = g0;
        final ArrayList f0 = new ArrayList();
        this.F0 = f0;
        f0.add(new u0c(g0, new int[] { 1 }));
    }
    
    public x3c(final wb3 f0, final a g0) {
        e0e.f((Object)f0, "cameraBroadcaster");
        e0e.f((Object)g0, "hydraCameraGLContext");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public static void f(final x3c x3c, final String s) {
        final ex4 ex4 = (ex4)x3c.F0;
        Objects.requireNonNull(x3c);
        final dda a = dda.Companion.a(s);
        if (a != null) {
            yru.C(a, yru.K(ex4, (Instant)x3c.G0));
        }
    }
    
    public final /* bridge */ Object a() {
        return new dly(((xzz)this.F0).b(), (ezy)((dsy)this.G0).a());
    }
    
    public final void b(final int[] array, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        final int n = array.length - i;
        if (n <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        if (i >= ((List)this.F0).size()) {
            final List list = (List)this.F0;
            u0c f = list.get(list.size() - 1);
            for (int j = ((List)this.F0).size(); j <= i; ++j) {
                final t0c t0c = (t0c)this.G0;
                f = f.f(new u0c(t0c, new int[] { 1, t0c.a[j - 1 + t0c.g] }));
                ((List)this.F0).add(f);
            }
        }
        final u0c u0c = ((List)this.F0).get(i);
        final int[] array2 = new int[n];
        System.arraycopy(array, 0, array2, 0, n);
        final u0c g = new u0c((t0c)this.G0, array2).g(i, 1);
        if (!g.a.equals(u0c.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (!u0c.d()) {
            u0c u0c2 = g.a.c;
            final int b = g.a.b(u0c.c(u0c.b.length - 1));
            u0c a;
            u0c g2;
            for (a = g; a.b.length - 1 >= u0c.b.length - 1 && !a.d(); a = a.a(g2)) {
                final int[] b2 = a.b;
                final int n2 = b2.length - 1 - (u0c.b.length - 1);
                final int c = g.a.c(a.c(b2.length - 1), b);
                g2 = u0c.g(n2, c);
                u0c2 = u0c2.a(g.a.a(n2, c));
            }
            final int[] b3 = (new u0c[] { u0c2, a })[1].b;
            int n3;
            for (n3 = i - b3.length, i = 0; i < n3; ++i) {
                array[n + i] = 0;
            }
            System.arraycopy(b3, 0, array, n + n3, b3.length);
            return;
        }
        throw new IllegalArgumentException("Divide by 0");
    }
    
    public final View c() {
        if (this.G0 == null) {
            final View inflate = ((ViewStub)this.F0).inflate();
            final int a = o5j.a;
            this.G0 = inflate;
        }
        return (View)this.G0;
    }
    
    public final View d() {
        this.g(0);
        return this.c();
    }
    
    public final boolean e() {
        final Object g0 = this.G0;
        return g0 != null && ((View)g0).getVisibility() == 0;
    }
    
    public final void g(final int visibility) {
        if (this.G0 != null || visibility != 8) {
            this.c().setVisibility(visibility);
        }
    }
    
    public final kfy h(final y7z y7z, final kfy kfy) {
        vbz.c(y7z);
        if (kfy instanceof vfy) {
            final vfy vfy = (vfy)kfy;
            final ArrayList g0 = vfy.G0;
            final String f0 = vfy.F0;
            Object o;
            if (((Map)this.F0).containsKey(f0)) {
                o = ((Map)this.F0).get(f0);
            }
            else {
                o = this.G0;
            }
            return ((ohy)o).a(f0, y7z, g0);
        }
        return kfy;
    }
    
    public final void i(final ohy ohy) {
        final Iterator iterator = ohy.a.iterator();
        while (iterator.hasNext()) {
            ((Map)this.F0).put(Integer.valueOf(((qly)iterator.next()).F0).toString(), ohy);
        }
    }
}
