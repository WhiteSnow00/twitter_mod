import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a2u
{
    public final Handler a;
    public final Context b;
    public final UserIdentifier c;
    public final b2u d;
    public yqm e;
    public final long f;
    
    public a2u(final Context context, final UserIdentifier c, final long f, final Handler a) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.f = f;
        this.a = a;
        this.d = ((w1u)zew.a().e(c, (Class)w1u.class)).L7();
    }
    
    public interface a
    {
    }
}
