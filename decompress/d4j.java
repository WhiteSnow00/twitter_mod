import android.graphics.Paint;
import tv.periscope.model.b;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import android.content.Context;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d4j
{
    public static yp4 a;
    public static final b4s b;
    public static final b4s c;
    public static final j8a d;
    
    static {
        b = new b4s("NONE");
        c = new b4s("PENDING");
        d = new j8a();
    }
    
    public static final quh a(final Object o) {
        Object k0 = o;
        if (o == null) {
            k0 = ffz.K0;
        }
        return (quh)new o8r(k0);
    }
    
    public static final int b(long n) {
        int n2 = 32;
        long n3;
        if ((0xFFFFFFFFL & n) == 0x0L) {
            n3 = n >> 32;
        }
        else {
            n2 = 0;
            n3 = n;
        }
        int n4 = n2;
        n = n3;
        if ((0xFFFFL & n3) == 0x0L) {
            n4 = n2 + 16;
            n = n3 >> 16;
        }
        int n5 = n4;
        long n6 = n;
        if ((0xFFL & n) == 0x0L) {
            n5 = n4 + 8;
            n6 = n >> 8;
        }
        int n7 = n5;
        n = n6;
        if ((0xFL & n6) == 0x0L) {
            n7 = n5 + 4;
            n = n6 >> 4;
        }
        if ((0x1L & n) == 0x0L) {
            if ((0x2L & n) != 0x0L) {
                ++n7;
            }
            else if ((0x4L & n) != 0x0L) {
                n7 += 2;
            }
            else if ((n & 0x8L) != 0x0L) {
                n7 += 3;
            }
            else {
                n7 = -1;
            }
        }
        return n7;
    }
    
    public static final int c(final int[] array, final int n) {
        int n2 = array.length - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int n4 = array[n3];
            if (n > n4) {
                i = n3 + 1;
            }
            else {
                if (n >= n4) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final d7b d(final n8r n8r, final sx6 sx6, final int n, final vq2 vq2) {
        int n2 = 0;
        if (n >= 0) {
            n2 = n2;
            if (n < 2) {
                n2 = 1;
            }
        }
        if ((n2 != 0 || n == -2) && vq2 == vq2.E0) {
            return (d7b)n8r;
        }
        return chw.N((zwp)n8r, sx6, n, vq2);
    }
    
    public static rlp e() {
        synchronized (d4j.class) {
            if (d4j.a == null) {
                d4j.a = new yp4((rlp)lw6.c);
            }
            return (rlp)d4j.a;
        }
    }
    
    public static final boolean f() {
        return asa.b().b("af_ui_empty_states_m3_enabled", false);
    }
    
    public static final h5j g(final Toolbar toolbar) {
        czd.g((Object)toolbar, "$this$itemClicks");
        return (h5j)new hit(toolbar);
    }
    
    public static final h5j h(final Toolbar toolbar) {
        czd.g((Object)toolbar, "$this$navigationClicks");
        return (h5j)new iit(toolbar);
    }
    
    public static final int i(final Context context, int data) {
        czd.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(data, typedValue, true)) {
            data = typedValue.data;
        }
        else {
            final String resourceEntryName = context.getResources().getResourceEntryName(data);
            final StringBuilder sb = new StringBuilder();
            sb.append("Attribute resource doesn't got resolved for ");
            sb.append(resourceEntryName);
            Log.w("AttributeResolver", sb.toString());
            wk0.b().t();
            data = 0;
        }
        return data;
    }
    
    public static final int j(final Context context, int n, final int n2) {
        czd.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            n = typedValue.data;
        }
        else {
            n = kn6.b(context, n2);
        }
        return n;
    }
    
    public static final ColorStateList k(final Context context, final int n, final TypedArray typedArray) {
        czd.f((Object)context, "context");
        czd.f((Object)typedArray, "typedArray");
        final int resourceId = typedArray.getResourceId(n, 0);
        ColorStateList list;
        if (resourceId != 0) {
            list = v68.u(context, resourceId);
        }
        else {
            list = typedArray.getColorStateList(n);
        }
        return list;
    }
    
    public static final float l(final Context context, final int n, final int n2) {
        czd.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        float n3;
        if (context.getTheme().resolveAttribute(n, typedValue, true) && typedValue.type == 5) {
            n3 = TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        else {
            n3 = context.getResources().getDimension(n2);
        }
        return n3;
    }
    
    public static final int m(final Context context, int n, final int n2) {
        czd.f((Object)context, "context");
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true) && typedValue.type == 5) {
            n = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        else {
            n = context.getResources().getDimensionPixelSize(n2);
        }
        return n;
    }
    
    public static final Drawable n(final Context context, int a, final int n) {
        czd.f((Object)context, "context");
        a = fd9.a(context, a, n);
        final Object a2 = kn6.a;
        return kn6.c.b(context, a);
    }
    
    public static final void o(final TextPaint textPaint, final float n) {
        czd.f((Object)textPaint, "<this>");
        if (!Float.isNaN(n)) {
            ((Paint)textPaint).setAlpha(zyz.n(rrz.o(n, 0.0f, 1.0f) * 255));
        }
    }
    
    public static boolean p(final xmp xmp, final b b) {
        final wmp d = xmp.d();
        final boolean b2 = false;
        final boolean b3 = d != null && d.c == 2;
        boolean b4 = b2;
        if (b3) {
            b4 = b2;
            if (b.a()) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public static String q(final String s, final String s2) {
        return ta0.z(new StringBuilder(s.length() + 1 + String.valueOf(s2).length()), s, ":", s2);
    }
    
    public static String r(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder(udu.e(s.length(), 2, String.valueOf(s2).length(), String.valueOf(s3).length()));
        nb0.z(sb, s, ":", s2, ":");
        sb.append(s3);
        return sb.toString();
    }
}
