import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0c
{
    public static Drawable a(final Context context, final TypedArray typedArray, int resourceId) {
        resourceId = typedArray.getResourceId(resourceId, 0);
        Drawable drawable;
        if (resourceId == 0) {
            drawable = null;
        }
        else {
            drawable = context.getResources().getDrawable(resourceId);
        }
        return drawable;
    }
    
    public static imo b(final m0c m0c) {
        if (m0c.p == null) {
            m0c.p = new imo();
        }
        return m0c.p;
    }
    
    public static ovo$b c(final TypedArray typedArray, final int n) {
        switch (typedArray.getInt(n, -2)) {
            default: {
                throw new RuntimeException("XML attribute not specified!");
            }
            case 8: {
                return (ovo$b)ovo.f.a;
            }
            case 7: {
                return (ovo$b)ovo.k.a;
            }
            case 6: {
                return (ovo$b)ovo.d.a;
            }
            case 5: {
                return (ovo$b)ovo.e.a;
            }
            case 4: {
                return (ovo$b)ovo.c.a;
            }
            case 3: {
                return (ovo$b)ovo.h.a;
            }
            case 2: {
                return (ovo$b)ovo.g.a;
            }
            case 1: {
                return (ovo$b)ovo.i.a;
            }
            case 0: {
                return (ovo$b)ovo.j.a;
            }
            case -1: {
                return null;
            }
        }
    }
}
