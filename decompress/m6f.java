import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class m6f
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final m6f a() {
        return m6f.Companion.a();
    }
    
    public abstract void b(final Context p0, final hp2 p1, final h6w p2, final UserIdentifier p3, final String p4, final String p5, final efv p6, final String p7);
    
    public abstract void c(final Context p0, final String p1, final String p2, final UserIdentifier p3, final hp2 p4);
    
    public abstract void d(final Context p0, final String p1, final UserIdentifier p2, final vba p3);
    
    public abstract void e(final Context p0, final String p1);
    
    public abstract void f(final Context p0, final String p1, final UserIdentifier p2);
    
    public abstract void g(final Context p0, final String p1, final hp2 p2, final String p3);
    
    public abstract boolean h(final Context p0, final String p1);
    
    public abstract boolean i(final String p0, final UserIdentifier p1, final hp2 p2);
    
    public static final class a
    {
        public final m6f a() {
            return fdi.Companion.a().h4();
        }
    }
}
