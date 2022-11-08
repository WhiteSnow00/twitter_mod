import java.util.Iterator;
import java.util.Set;
import java.net.URI;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public class lm1<T extends lm1>
{
    public pl6 a;
    public final UserIdentifier b;
    public final bsc c;
    public final zqc d;
    public final urc e;
    public final List<sfa> f;
    public URI g;
    public xrc$b h;
    public src i;
    public hsc j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public dca<Double> o;
    public String p;
    public isc q;
    public List<fvj<String, String>> r;
    public bsc$a s;
    public boolean t;
    
    public lm1(final UserIdentifier b, final bsc c, final zqc d, final urc e, final Set<sfa> set) {
        this.f = (rth$a)rth.a(5);
        this.h = xrc$b.E0;
        this.l = true;
        this.n = true;
        this.s = bsc$a.C0;
        this.t = true;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final Iterator<sfa> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next());
        }
    }
    
    public final T a(final sfa sfa) {
        ((List<sfa>)this.f).add(sfa);
        final int a = w4j.a;
        return (T)this;
    }
    
    public final xrc b(final xrc$b xrc$b, final URI uri, final hsc hsc) {
        zrc zrc;
        if ((zrc = this.c.b(this.s)) == null) {
            zrc = this.c.a();
        }
        return zrc.b(xrc$b, uri, hsc);
    }
    
    public final T c(final List<? extends l6i> list) {
        if (list != null && !list.isEmpty()) {
            final ajr i = new ajr(dml.t((List)list), wj6.a);
            ((ac)i).e("application/x-www-form-urlencoded");
            this.i = (src)i;
        }
        final int a = w4j.a;
        return (T)this;
    }
    
    public final T d(final CharSequence charSequence) {
        this.g = er1.e(charSequence.toString());
        final int a = w4j.a;
        return (T)this;
    }
}
