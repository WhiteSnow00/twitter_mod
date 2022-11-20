import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import tv.periscope.model.b;
import android.view.View$OnClickListener;
import java.util.NoSuchElementException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bi2 implements z6f
{
    public final fk2 D0;
    public final sh2 E0;
    public final ji2 F0;
    public w4 G0;
    public sh2$b H0;
    
    public bi2(final fk2 d0, final sh2 e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = new ji2((Object)this, 1);
    }
    
    public final void g(final w4 g0) {
        this.G0 = g0;
        g0.e.g((f2)new nnk((nnk$a)new nnk$a(this) {
            public final bi2 a;
            
            public final void a() {
                this.a.D0.c();
                this.a.H0 = null;
            }
            
            public final void b(final vsv vsv) {
                final bi2 a = this.a;
                final sh2 e0 = a.E0;
                Objects.requireNonNull(e0);
                final int f = ((c8a)vsv).f;
                final boolean b = true;
                String s;
                boolean b2 = false;
                if (f == -200) {
                    s = e0.a.getString(2131952249);
                    b2 = false;
                }
                else {
                    final b f2 = aof.f(e0.e);
                    Label_0111: {
                        if (f2 != null) {
                            if (f2 == null) {
                                throw new NoSuchElementException("No value present");
                            }
                            if (f2.F() || f2.d) {
                                b2 = true;
                                break Label_0111;
                            }
                        }
                        b2 = false;
                    }
                    final Resources a2 = e0.a;
                    int n;
                    if (!b2) {
                        n = 2131952254;
                    }
                    else if (e0.b.i()) {
                        n = 2131954780;
                    }
                    else {
                        n = 2131954779;
                    }
                    s = a2.getString(n);
                }
                Drawable drawable;
                if (b2) {
                    drawable = e0.c;
                }
                else {
                    drawable = e0.d;
                }
                final sh2$b h0 = new sh2$b(s, drawable, b2);
                final sh2$b h2 = a.H0;
                if (h2 == null || h2.a || !b2) {
                    final fk2 d0 = a.D0;
                    Object o;
                    if (b2) {
                        o = a.F0;
                    }
                    else {
                        o = ai2.D0;
                    }
                    d0.f(s, drawable, (View$OnClickListener)o);
                    a.D0.d();
                    final sh2$b h3 = a.H0;
                    int n2 = b ? 1 : 0;
                    if (h3 != null) {
                        n2 = (b ? 1 : 0);
                        if (!h3.a) {
                            if (!b2) {
                                n2 = (b ? 1 : 0);
                            }
                            else {
                                n2 = 0;
                            }
                        }
                    }
                    if (n2 != 0) {
                        a.H0 = h0;
                    }
                }
            }
        }));
    }
    
    public final void p(final w4 w4) {
        this.G0 = null;
    }
}
