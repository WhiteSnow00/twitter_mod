import java.util.Iterator;
import java.util.Locale;
import android.os.Build$VERSION;
import java.util.Set;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajw extends d2v<ziw>
{
    public final Context j1;
    public final arc$b k1;
    public final Map<String, String> l1;
    public final Set<a> m1;
    
    public ajw(final ejw ejw) {
        super(ejw.b, 0);
        this.j1 = ejw.a;
        this.k1 = ejw.f;
        this.l1 = qjg.p((Map)ejw.d);
        this.m1 = dnp.u((Set)ejw.e);
    }
    
    public final tqc f0() {
        final mcv b = ib0.B("/1.1/account/settings.json", "/");
        final int a = c5j.a;
        ((tqc$a)b).e = this.k1;
        ((tqc$a)b).i((Map)this.l1);
        Locale locale;
        if (Build$VERSION.SDK_INT >= 24) {
            locale = this.j1.getResources().getConfiguration().getLocales().get(0);
        }
        else {
            locale = this.j1.getResources().getConfiguration().locale;
        }
        if (locale != null) {
            ((tqc$a)b).d("locale", locale.getCountry());
            ((tqc$a)b).d("lang", v68.y(locale));
        }
        return ((tqc$a)b).k();
    }
    
    public final asc<ziw, kbv> g0() {
        return (asc<ziw, kbv>)v8g.c((Class)ziw.class);
    }
    
    public final void n0(final xrc<ziw, kbv> xrc) {
        final Iterator<a> iterator = this.m1.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(xrc);
        }
    }
    
    public final void w() {
        super.w();
        if (zcw.d().o() == zjw.G0) {
            ((wv0)this).H(true);
        }
    }
    
    @FunctionalInterface
    public interface a
    {
        void a(final xrc<ziw, kbv> p0);
    }
}
