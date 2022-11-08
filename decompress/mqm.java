import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqm
{
    public static final mqm a;
    
    static {
        a = new mqm();
    }
    
    public final Typeface a(final Context context, final lqm lqm) {
        zzd.f((Object)context, "context");
        zzd.f((Object)lqm, "font");
        final Typeface font = context.getResources().getFont(lqm.a);
        zzd.e((Object)font, "context.resources.getFont(font.resId)");
        return font;
    }
}
