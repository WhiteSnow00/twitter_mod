import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aib implements yhb
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    @Override
    public final tcu a(final Context context, final hp6 e, final dsb f, final sfv sfv, final boolean b) {
        e0e.f((Object)f, "friendshipCache");
        e0e.f((Object)sfv, "scribeAssociation");
        final xhb$a o = xhb$a.o(context, UserIdentifier.Companion.c(), new a8d((Object)context.getApplicationContext(), (Object)sfv));
        o.e = e;
        o.f = f;
        o.i = "user_recommendation";
        String j;
        if (b) {
            j = "unfollow";
        }
        else {
            j = "follow";
        }
        o.j = j;
        return (tcu)((z4j)o).e();
    }
    
    public static final class a
    {
    }
}
