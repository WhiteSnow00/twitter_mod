import java.util.HashMap;
import android.graphics.drawable.Drawable;
import com.google.android.material.tabs.TabLayout$i;
import android.view.View;
import com.google.android.material.tabs.TabLayout$g;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yfg
{
    public final whg a;
    public final ufg b;
    public final ggg c;
    public final egg d;
    public final xa7 e;
    
    public yfg(final whg a, final ufg b, final ggg c, final xa7 e, final egg d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        final whg a = this.a;
        ((HashMap)a.G0).clear();
        final osj k0 = a.K0;
        if (k0 != null && a.L0 != null) {
            for (int count = ((iuj)k0).getCount(), i = 0; i < count; ++i) {
                final int n = (int)a.K0.getItemId(i);
                final TabLayout$g l = a.L0.l(i);
                if (l != null) {
                    final View f = l.f;
                    if (f != null && f instanceof mh1) {
                        ((HashMap<Integer, mh1>)a.G0).put(Integer.valueOf(n), (mh1)f);
                    }
                }
            }
        }
        if (fli.D0()) {
            final whg a2 = this.a;
            final yh9 yh9 = (yh9)a2.I0.get();
            final TabLayout$g m = yh9.b.m();
            m.i = 2131428830;
            final TabLayout$i h = m.h;
            if (h != null) {
                ((View)h).setId(2131428830);
            }
            m.d = ((Context)yh9.a).getString(2131955112);
            m.h();
            final Drawable n2 = d4j.n((Context)yh9.a, 2130969253, 2131232050);
            if (n2 != null) {
                n2.setColorFilter((ColorFilter)new PorterDuffColorFilter(yh9.c.e(2130969091, 0), PorterDuff$Mode.SRC_IN));
            }
            yh9.b.b(m);
            final cgv n3 = a2.N0;
            if (n3 != null) {
                a2.g(n3);
            }
        }
    }
}
