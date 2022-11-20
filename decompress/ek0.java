import android.os.Build$VERSION;
import android.util.Log;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ek0
{
    public static final PorterDuff$Mode b;
    public static ek0 c;
    public grm a;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public static ek0 a() {
        synchronized (ek0.class) {
            if (ek0.c == null) {
                e();
            }
            return ek0.c;
        }
    }
    
    public static PorterDuffColorFilter c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (ek0.class) {
            return grm.h(n, porterDuff$Mode);
        }
    }
    
    public static void e() {
        synchronized (ek0.class) {
            if (ek0.c == null) {
                (ek0.c = new ek0()).a = grm.d();
                final grm a = ek0.c.a;
                final grm$f g = (grm$f)new grm$f() {
                    public final int[] a = { 2131230832, 2131230830, 2131230756 };
                    public final int[] b = { 2131230780, 2131230815, 2131230787, 2131230782, 2131230783, 2131230786, 2131230785 };
                    public final int[] c = { 2131230829, 2131230831, 2131230773, 2131230825, 2131230826, 2131230827, 2131230828 };
                    public final int[] d = { 2131230805, 2131230771, 2131230804 };
                    public final int[] e = { 2131230823, 2131230833 };
                    public final int[] f = { 2131230759, 2131230765, 2131230760, 2131230766 };
                    
                    public final boolean a(final int[] array, final int n) {
                        for (int length = array.length, i = 0; i < length; ++i) {
                            if (array[i] == n) {
                                return true;
                            }
                        }
                        return false;
                    }
                    
                    public final ColorStateList b(final Context context, final int n) {
                        final int c = hms.c(context, 2130968954);
                        return new ColorStateList(new int[][] { hms.b, hms.d, hms.c, hms.f }, new int[] { hms.b(context, 2130968951), er4.g(c, n), er4.g(c, n), n });
                    }
                    
                    public final LayerDrawable c(final grm grm, final Context context, int dimensionPixelSize) {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(dimensionPixelSize);
                        final Drawable f = grm.f(context, 2131230819);
                        final Drawable f2 = grm.f(context, 2131230820);
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        if (f instanceof BitmapDrawable && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable)f;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        }
                        else {
                            final Bitmap bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas = new Canvas(bitmap);
                            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            f.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(bitmap);
                            bitmapDrawable2 = new BitmapDrawable(bitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader$TileMode.REPEAT);
                        BitmapDrawable bitmapDrawable3;
                        if (f2 instanceof BitmapDrawable && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable)f2;
                        }
                        else {
                            final Bitmap bitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas2 = new Canvas(bitmap2);
                            f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            f2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(bitmap2);
                        }
                        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable2 });
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }
                    
                    public final ColorStateList d(final Context context, final int n) {
                        if (n == 2131230776) {
                            return v68.u(context, 2131099669);
                        }
                        if (n == 2131230822) {
                            return v68.u(context, 2131099672);
                        }
                        if (n == 2131230821) {
                            final int[][] array = new int[3][];
                            final int[] array2 = new int[3];
                            final ColorStateList d = hms.d(context, 2130968986);
                            if (d != null && d.isStateful()) {
                                array[0] = hms.b;
                                array2[0] = d.getColorForState(array[0], 0);
                                array[1] = hms.e;
                                array2[1] = hms.c(context, 2130968953);
                                array[2] = hms.f;
                                array2[2] = d.getDefaultColor();
                            }
                            else {
                                array[0] = hms.b;
                                array2[0] = hms.b(context, 2130968986);
                                array[1] = hms.e;
                                array2[1] = hms.c(context, 2130968953);
                                array[2] = hms.f;
                                array2[2] = hms.c(context, 2130968986);
                            }
                            return new ColorStateList(array, array2);
                        }
                        if (n == 2131230764) {
                            return this.b(context, hms.c(context, 2130968951));
                        }
                        if (n == 2131230758) {
                            return this.b(context, 0);
                        }
                        if (n == 2131230763) {
                            return this.b(context, hms.c(context, 2130968949));
                        }
                        if (n == 2131230817 || n == 2131230818) {
                            return v68.u(context, 2131099671);
                        }
                        if (this.a(this.b, n)) {
                            return hms.d(context, 2130968955);
                        }
                        if (this.a(this.e, n)) {
                            return v68.u(context, 2131099668);
                        }
                        if (this.a(this.f, n)) {
                            return v68.u(context, 2131099667);
                        }
                        if (n == 2131230814) {
                            return v68.u(context, 2131099670);
                        }
                        return null;
                    }
                    
                    public final void e(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
                        final int[] a = gd9.a;
                        final Drawable mutate = drawable.mutate();
                        PorterDuff$Mode b = porterDuff$Mode;
                        if (porterDuff$Mode == null) {
                            b = ek0.b;
                        }
                        mutate.setColorFilter((ColorFilter)ek0.c(n, b));
                    }
                };
                synchronized (a) {
                    a.g = (grm$f)g;
                }
            }
        }
    }
    
    public static void f(final Drawable drawable, final iat iat, final int[] array) {
        final PorterDuff$Mode h = grm.h;
        final int[] state = drawable.getState();
        final int[] a = gd9.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
        else {
            if (drawable instanceof LayerDrawable && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            final boolean d = iat.d;
            if (!d && !iat.c) {
                drawable.clearColorFilter();
            }
            else {
                final ColorFilter colorFilter = null;
                ColorStateList a2;
                if (d) {
                    a2 = iat.a;
                }
                else {
                    a2 = null;
                }
                PorterDuff$Mode porterDuff$Mode;
                if (iat.c) {
                    porterDuff$Mode = iat.b;
                }
                else {
                    porterDuff$Mode = grm.h;
                }
                Object h2 = colorFilter;
                if (a2 != null) {
                    if (porterDuff$Mode == null) {
                        h2 = colorFilter;
                    }
                    else {
                        h2 = grm.h(a2.getColorForState(array, 0), porterDuff$Mode);
                    }
                }
                drawable.setColorFilter((ColorFilter)h2);
            }
            if (Build$VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
    
    public final Drawable b(final Context context, final int n) {
        synchronized (this) {
            return this.a.f(context, n);
        }
    }
    
    public final ColorStateList d(final Context context, final int n) {
        synchronized (this) {
            return this.a.i(context, n);
        }
    }
}
