import android.content.Context;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egf
{
    public static final a Companion;
    public final h93 a;
    public final Resources b;
    
    static {
        Companion = new a();
    }
    
    public egf(final Context context, final h93 a) {
        czd.f((Object)context, "context");
        czd.f((Object)a, "callToActionSerializer");
        this.a = a;
        this.b = context.getResources();
    }
    
    public final String a(final int n) {
        final String string = this.b.getString(n);
        czd.e((Object)string, "resources.getString(resId)");
        return string;
    }
    
    public static final class a
    {
    }
}
