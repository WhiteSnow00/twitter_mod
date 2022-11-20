import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drm
{
    public static final drm a;
    
    static {
        a = new drm();
    }
    
    public final Typeface a(final Context context, final crm crm) {
        czd.f((Object)context, "context");
        czd.f((Object)crm, "font");
        final Typeface font = context.getResources().getFont(crm.a);
        czd.e((Object)font, "context.resources.getFont(font.resId)");
        return font;
    }
}
