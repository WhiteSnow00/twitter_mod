import android.widget.ImageView;
import android.content.Context;
import android.view.View;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yyq extends ste implements qsb<hwq, fzv>
{
    public final hzq D0;
    
    public yyq(final hzq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final hzq d0 = this.D0;
        if (hwq.y) {
            final View q = d0.q;
            final Context d2 = d0.d;
            final Object a = kn6.a;
            q.setBackground(kn6.c.b(d2, 2131231003));
            d0.p.setImageDrawable(zyz.c(d0.d, 2130969736));
            final ImageView p = d0.p;
            final ColorStateList value = ColorStateList.valueOf(kn6.b(d0.d, 2131100782));
            czd.e((Object)value, "valueOf(this)");
            p.setImageTintList(value);
        }
        else {
            final View q2 = d0.q;
            final Context d3 = d0.d;
            final Object a2 = kn6.a;
            q2.setBackground(kn6.c.b(d3, 2131231004));
            d0.p.setImageDrawable(zyz.c(d0.d, 2130969735));
            final ImageView p2 = d0.p;
            final ColorStateList value2 = ColorStateList.valueOf(kn6.b(d0.d, 2131100783));
            czd.e((Object)value2, "valueOf(this)");
            p2.setImageTintList(value2);
        }
        return fzv.a;
    }
}
