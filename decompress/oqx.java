import java.util.Objects;
import android.os.Build$VERSION;
import android.view.ViewParent;
import android.view.View;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqx
{
    public static final a Companion;
    public static final WeakHashMap<View, oqx> v;
    public final y70 a;
    public final y70 b;
    public final y70 c;
    public final y70 d;
    public final y70 e;
    public final y70 f;
    public final y70 g;
    public final y70 h;
    public final y70 i;
    public final fpw j;
    public final szv k;
    public final szv l;
    public final szv m;
    public final fpw n;
    public final fpw o;
    public final fpw p;
    public final fpw q;
    public final fpw r;
    public final boolean s;
    public int t;
    public final msd u;
    
    static {
        Companion = new a();
        v = new WeakHashMap<View, oqx>();
    }
    
    public oqx(View view) {
        final a companion = oqx.Companion;
        this.a = oqx.a.a(companion, 4, "captionBar");
        final y70 b = new y70(128, "displayCutout");
        this.b = b;
        final y70 c = new y70(8, "ime");
        this.c = c;
        final y70 d = new y70(32, "mandatorySystemGestures");
        this.d = d;
        this.e = new y70(2, "navigationBars");
        boolean booleanValue = true;
        this.f = new y70(1, "statusBars");
        final y70 g = new y70(7, "systemBars");
        this.g = g;
        final y70 h = new y70(16, "systemGestures");
        this.h = h;
        final y70 i = new y70(64, "tappableElement");
        this.i = i;
        final fpw j = new fpw(new osd(0, 0, 0, 0), "waterfall");
        this.j = j;
        final dqx w = w9y.w(w9y.w((dqx)g, (dqx)c), (dqx)b);
        this.k = (szv)w;
        final dqx w2 = w9y.w(w9y.w(w9y.w((dqx)i, (dqx)d), (dqx)h), (dqx)j);
        this.l = (szv)w2;
        this.m = (szv)w9y.w(w, w2);
        this.n = oqx.a.b(companion, 4, "captionBarIgnoringVisibility");
        this.o = oqx.a.b(companion, 2, "navigationBarsIgnoringVisibility");
        this.p = oqx.a.b(companion, 1, "statusBarsIgnoringVisibility");
        this.q = oqx.a.b(companion, 7, "systemBarsIgnoringVisibility");
        this.r = oqx.a.b(companion, 64, "tappableElementIgnoringVisibility");
        final ViewParent parent = view.getParent();
        final boolean b2 = parent instanceof View;
        Boolean b3 = null;
        if (b2) {
            view = (View)parent;
        }
        else {
            view = null;
        }
        Object tag;
        if (view != null) {
            tag = view.getTag(2131428420);
        }
        else {
            tag = null;
        }
        if (tag instanceof Boolean) {
            b3 = (Boolean)tag;
        }
        if (b3 != null) {
            booleanValue = b3;
        }
        this.s = booleanValue;
        this.u = new msd(this);
    }
    
    public final void a(final fqx fqx, final int n) {
        e0e.f((Object)fqx, "windowInsets");
        this.a.f(fqx, n);
        this.c.f(fqx, n);
        this.b.f(fqx, n);
        this.e.f(fqx, n);
        this.f.f(fqx, n);
        this.g.f(fqx, n);
        this.h.f(fqx, n);
        this.i.f(fqx, n);
        this.d.f(fqx, n);
        if (n == 0) {
            final fpw n2 = this.n;
            final lsd e = fqx.e(4);
            e0e.e((Object)e, "insets.getInsetsIgnoring\u2026aptionBar()\n            )");
            n2.f(shw.Y0(e));
            final fpw o = this.o;
            final lsd e2 = fqx.e(2);
            e0e.e((Object)e2, "insets.getInsetsIgnoring\u2026ationBars()\n            )");
            o.f(shw.Y0(e2));
            final fpw p2 = this.p;
            final lsd e3 = fqx.e(1);
            e0e.e((Object)e3, "insets.getInsetsIgnoring\u2026tatusBars()\n            )");
            p2.f(shw.Y0(e3));
            final fpw q = this.q;
            final lsd e4 = fqx.e(7);
            e0e.e((Object)e4, "insets.getInsetsIgnoring\u2026ystemBars()\n            )");
            q.f(shw.Y0(e4));
            final fpw r = this.r;
            final lsd e5 = fqx.e(64);
            e0e.e((Object)e5, "insets.getInsetsIgnoring\u2026leElement()\n            )");
            r.f(shw.Y0(e5));
            final n29 c = fqx.c();
            if (c != null) {
                lsd lsd;
                if (Build$VERSION.SDK_INT >= 30) {
                    lsd = lsd.d(n29.b.b(c.a));
                }
                else {
                    lsd = lsd.e;
                }
                this.j.f(shw.Y0(lsd));
            }
        }
        piq.Companion.e();
    }
    
    public static final class a
    {
        public static final y70 a(final a a, final int n, final String s) {
            Objects.requireNonNull(a);
            return new y70(n, s);
        }
        
        public static final fpw b(final a a, final int n, final String s) {
            Objects.requireNonNull(a);
            return new fpw(new osd(0, 0, 0, 0), s);
        }
        
        public final oqx c(final d86 d86) {
            d86.x(-1366542614);
            final sa6$b a = sa6.a;
            final View view = (View)d86.m((df6)z20.f);
            final WeakHashMap<View, oqx> v = oqx.v;
            synchronized (v) {
                oqx value;
                if ((value = v.get(view)) == null) {
                    value = new oqx(view);
                    v.put(view, value);
                }
                final oqx oqx = value;
                monitorexit(v);
                shw.b((Object)oqx, (stb)new nqx(oqx, view), d86);
                d86.O();
                return oqx;
            }
        }
    }
}
