import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eux
{
    public static final ColorDrawable a;
    
    static {
        a = new ColorDrawable(0);
    }
    
    public static Drawable a(final Drawable drawable, final olo olo, final Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
            final zko zko = new zko(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b((yko)zko, olo);
            return (Drawable)zko;
        }
        if (drawable instanceof NinePatchDrawable) {
            final jlo jlo = new jlo((NinePatchDrawable)drawable);
            b((yko)jlo, olo);
            return (Drawable)jlo;
        }
        if (drawable instanceof ColorDrawable) {
            final clo clo = new clo(((ColorDrawable)drawable).getColor());
            b((yko)clo, olo);
            return (Drawable)clo;
        }
        xli.I0("WrappingUtils", "Don't know how to round that drawable: %s", new Object[] { drawable });
        return drawable;
    }
    
    public static void b(final yko yko, final olo olo) {
        yko.b(olo.b);
        yko.m(olo.c);
        yko.a(olo.f, olo.e);
        yko.e(olo.g);
        yko.h(olo.h);
        yko.j();
    }
    
    public static Drawable c(Drawable a, final olo olo, final Resources resources) {
        try {
            pqb.b();
            if (a == null || olo == null || olo.a != 2) {
                return a;
            }
            if (a instanceof tlb) {
                Object o = a;
                while (true) {
                    final Drawable k = ((dd9)o).k();
                    if (k == o || !(k instanceof dd9)) {
                        break;
                    }
                    o = k;
                }
                ((dd9)o).d(a(((dd9)o).d((Drawable)eux.a), olo, resources));
                return a;
            }
            a = a(a, olo, resources);
            return a;
        }
        finally {
            pqb.b();
        }
    }
    
    public static Drawable d(final Drawable drawable, final olo olo) {
        try {
            pqb.b();
            if (drawable != null && olo != null && olo.a == 1) {
                final glo glo = new glo(drawable);
                b(glo, olo);
                glo.R0 = olo.d;
                ((Drawable)glo).invalidateSelf();
                return (Drawable)glo;
            }
            return drawable;
        }
        finally {
            pqb.b();
        }
    }
    
    public static Drawable e(final Drawable drawable, final uuo$b uuo$b) {
        pqb.b();
        if (drawable != null && uuo$b != null) {
            final ruo ruo = new ruo(drawable, uuo$b);
            pqb.b();
            return (Drawable)ruo;
        }
        pqb.b();
        return drawable;
    }
}
