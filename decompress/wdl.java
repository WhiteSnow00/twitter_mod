import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.app.Activity;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wdl extends b4e<vdl, a>
{
    public final Resources d;
    
    public wdl(final Activity activity) {
        super((Class)vdl.class);
        this.d = ((Context)activity).getResources();
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final vdl vdl = (vdl)o;
        final Context context = a.F0.getContext();
        final zrm b = zrm.b(a.F0);
        final TextView g0 = a.G0;
        final Drawable j = b.j(vdl.b.F0);
        final int dimensionPixelSize = this.d.getDimensionPixelSize(2131166921);
        final int dimensionPixelSize2 = this.d.getDimensionPixelSize(2131166921);
        if (j != null) {
            j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
            j.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(b1b.B(context, 2130969093), PorterDuff$Mode.SRC_IN));
            g0.setCompoundDrawablesRelative(j, (Drawable)null, (Drawable)null, (Drawable)null);
            g0.setCompoundDrawablePadding(this.d.getDimensionPixelSize(2131166933));
        }
        g0.setText((CharSequence)vdl.a);
        g0.setTextColor(b1b.B(context, 2130969093));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new a((TextView)m51.w(viewGroup, 2131625225, viewGroup, false));
    }
    
    public static final class a extends sl8
    {
        public final TextView G0;
        
        public a(final TextView g0) {
            super((View)g0);
            this.G0 = g0;
        }
    }
}
