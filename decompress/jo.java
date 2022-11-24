import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jo<I, O>
{
    public abstract Intent a(final Context p0, final I p1);
    
    public a<O> b(final Context context, final I n) {
        e0e.f((Object)context, "context");
        return null;
    }
    
    public abstract O c(final int p0, final Intent p1);
    
    public static final class a<T>
    {
        public final T a;
        
        public a(final T a) {
            this.a = a;
        }
    }
}
