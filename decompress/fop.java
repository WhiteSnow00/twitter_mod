import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fop extends i4e
{
    public final c3e<lop> d;
    
    public fop(final Resources resources, final c3e<lop> d, final int n) {
        final ThreadLocal a = orm.a;
        final Drawable a2 = orm$a.a(resources, 2131232621, (Resources$Theme)null);
        jee.l((Object)a2);
        final Drawable drawable = a2;
        super(1, (Drawable)new InsetDrawable(a2, n, 0, n, 0));
        this.d = d;
    }
    
    public final boolean j(final int n) {
        boolean b = true;
        if (n == 1 || n == 2 || this.d.a(n - 3) instanceof l5q) {
            b = false;
        }
        return b;
    }
}
