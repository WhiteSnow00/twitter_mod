import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public interface bsm<R>
{
    public static final a Companion = a.a;
    
    R c(final Intent p0);
    
    public static final class a
    {
        public static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        public final <R extends vn6> bsm<R> a(final Class<R> clazz) {
            return (bsm<R>)new bsm$a$a((Class)clazz);
        }
    }
}
