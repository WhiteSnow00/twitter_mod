import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public interface bn
{
    public static final a Companion = a.a;
    
     <T extends ym> Intent a(final Context p0, final T p1);
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public final bn a() {
            final bn c7 = ua.a().c7();
            czd.e((Object)c7, "get().activityArgsIntentFactory");
            return c7;
        }
    }
}
