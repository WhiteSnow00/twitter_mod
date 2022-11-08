import com.twitter.media.ui.image.c;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xys
{
    public static final int[] m;
    public final ezs a;
    public final w7t b;
    public final tij c;
    public final zys.a d;
    public final blo e;
    public final qys f;
    public final kys g;
    public final iyf h;
    public final axo i;
    public final boolean j;
    public final int k;
    public final int l;
    
    static {
        m = new int[] { 16842919 };
    }
    
    public xys(final Context context, final ezs a, final w7t b, final tij c, final zys.a d, final qys f, final kys g, final iyf h, final axo i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        int n;
        if (g.a()) {
            n = 2131166064;
        }
        else {
            n = 2131165927;
        }
        final int l = (int)context.getResources().getDimension(n);
        this.l = l;
        if (g.a()) {
            final float n2 = (float)l;
            this.e = kjg.a(n2, n2, n2, n2);
        }
        else {
            final float n3 = (float)l;
            this.e = kjg.a(n3, n3, 0.0f, 0.0f);
        }
        this.j = rqu.w(context);
        int k;
        if (dta.b().b("timeline_live_banner_multi_line_title_enabled", false)) {
            k = 3;
        }
        else {
            k = 2;
        }
        this.k = k;
        this.f = f;
        this.i = i;
    }
    
    public final void a(final yys.a a) {
        ((View)a.D0).setVisibility(4);
        if (!this.g.a()) {
            a.F0.setBackgroundResource(2131232626);
        }
        else {
            a.F0.setBackgroundTintList(ColorStateList.valueOf(a.C0.getResources().getColor(2131099931)));
        }
    }
    
    public final void b(final yys.a a, final bca bca) {
        final Resources resources = a.G0.getContext().getResources();
        final tqm b = tqm.b(a.G0);
        final Drawable j = b.j(2131232626);
        if (!this.g.a()) {
            a.F0.setBackground(xd9.c(j, h6q.w(bca.d, resources.getColor(2131099712))));
        }
        ((c)a.D0).setDefaultDrawable(xd9.c(b.j(2131232638), h6q.w(bca.d, resources.getColor(2131100865))));
    }
}
