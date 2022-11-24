import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxm extends p4m
{
    public static final int l = 0;
    public final oxm k;
    
    public pxm(final fa3<p4m> fa3, final Context context, final UserIdentifier userIdentifier, final tsc tsc, final oxm k) {
        super(fa3, context, userIdentifier, tsc);
        this.k = k;
        fj1.b(flr.g((CharSequence)((gnp)k).a) && k.c.a());
    }
    
    @Override
    public final klp a() {
        fj1.b(super.d == null);
        return new klp((fa3)new jg1((Object)this, 17), super.b, super.c, shw.x0((Object)this.k.c.b), ch4.z1, (z5s)z5s.c);
    }
}
