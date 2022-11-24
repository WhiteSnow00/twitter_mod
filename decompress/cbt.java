import android.content.Context;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbt extends ContextWrapper
{
    public static final Object a;
    
    static {
        a = new Object();
    }
    
    public static Context a(final Context context) {
        if (!(context instanceof cbt) && !(context.getResources() instanceof fbt)) {
            context.getResources();
            final int a = fqw.a;
        }
        return context;
    }
}
