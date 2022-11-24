import android.view.View;
import java.util.List;
import android.graphics.Rect;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i5t implements izo
{
    public final jat F0;
    public final jca G0;
    
    public i5t(final bts bts, final jat f0) {
        e0e.f((Object)bts, "timelineArgs");
        e0e.f((Object)f0, "visibleItemsProvider");
        this.F0 = f0;
        final ica.ica$a companion = ica.Companion;
        final String j = bts.j();
        e0e.e((Object)j, "timelineArgs.scribePage");
        final String l = bts.l();
        e0e.e((Object)l, "timelineArgs.scribeSection");
        this.G0 = (jca)companion.b(j, l, "", "");
    }
    
    public final Object get() {
        final jca g0 = this.G0;
        final jat f0 = this.F0;
        final udv a1 = ((idv)f0.a).a1;
        e0e.e((Object)a1, "contentViewProvider.viewHost");
        final s4e g2 = a1.G1();
        e0e.e((Object)g2, "viewHost.itemProvider");
        Object f2;
        if (!g2.c()) {
            f2 = h3a.F0;
        }
        else {
            f2 = new ArrayList<ufv>();
            final n7m k0 = a1.K0;
            e0e.e((Object)k0, "viewHost.listWrapper");
            int s = k0.s();
            final int i = k0.k();
            final int n = -k0.d();
            if (s <= i) {
                while (true) {
                    final int n2 = s + n;
                    int n3 = 0;
                    if (n2 >= 0) {
                        n3 = n3;
                        if (n2 < ((f5e)g2).a()) {
                            n3 = 1;
                        }
                    }
                    if (n3 != 0) {
                        final View b = k0.b(s);
                        if (b != null) {
                            final ufv d = f0.b.d((vxs)((f5e)g2).getItem(n2), (sfv)null);
                            e0e.e((Object)d, "urtScribeItemFactory.cre\u2026Item(itemPosition), null)");
                            final Rect rect = new Rect();
                            final Float value = 0.0f;
                            float n4 = value.floatValue();
                            float n5 = value.floatValue();
                            float n6 = n4;
                            if (b.getLocalVisibleRect(rect)) {
                                if (b.getWidth() > 0) {
                                    n4 = Math.min(Math.abs(rect.width()) / (float)b.getWidth(), 1.0f);
                                }
                                n5 = n5;
                                n6 = n4;
                                if (b.getHeight() > 0) {
                                    n5 = Math.min(Math.abs(rect.height()) / (float)b.getHeight(), 1.0f);
                                    n6 = n4;
                                }
                            }
                            final float floatValue = Float.valueOf(n6).floatValue();
                            final float floatValue2 = Float.valueOf(n5).floatValue();
                            final float n7 = 100000;
                            d.b1 = (int)(floatValue * n7);
                            d.a1 = (int)(floatValue2 * n7);
                            ((ArrayList<ufv>)f2).add(d);
                        }
                    }
                    if (s == i) {
                        break;
                    }
                    ++s;
                }
            }
        }
        return new hzo((ica)g0, (List)f2);
    }
}
