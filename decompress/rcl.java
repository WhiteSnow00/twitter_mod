import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcl
{
    public static Intent a(final Context context, final UserIdentifier userIdentifier, final String s, final gjl gjl, final sfv sfv, final b1p b1p, final boolean b) {
        ijl i0;
        if (b) {
            i0 = ijl.I0;
        }
        else {
            i0 = null;
        }
        return c(context, userIdentifier, s, gjl, sfv, -1, i0, b1p);
    }
    
    public static b8l$a b(final UserIdentifier c, final String c2, final gjl d, final sfv a, final int i, final ijl ijl, final b1p b1p) {
        final b8l$a b8l$a = new b8l$a();
        b8l$a.h = c.getId();
        b8l$a.a = a;
        b8l$a.b = b1p;
        b8l$a.c = c2;
        final wfw$a wfw$a = new wfw$a();
        wfw$a.d = b1p;
        wfw$a.c = c;
        b8l$a.g = (wfw)((z4j)wfw$a).e();
        b8l$a.i = i;
        if (d != null) {
            if (ijl != null) {
                sbw.b((tlm)((z4j)jjl.e(ijl, d)).e());
            }
            b8l$a.d = d;
        }
        return b8l$a;
    }
    
    public static Intent c(final Context context, final UserIdentifier userIdentifier, final String s, final gjl gjl, final sfv sfv, final int n, final ijl ijl, final b1p b1p) {
        return b(userIdentifier, s, gjl, sfv, n, ijl, b1p).o(context);
    }
    
    public static void d(final Context context, final UserIdentifier userIdentifier) {
        context.startActivity(a(context, userIdentifier, null, null, null, null, true));
    }
    
    public static void e(final Context context, final UserIdentifier userIdentifier, final String s, final gjl gjl, final sfv sfv, final b1p b1p) {
        context.startActivity(a(context, userIdentifier, s, gjl, sfv, b1p, true));
    }
    
    public static void f(final Context context, final UserIdentifier userIdentifier, final String s, final gjl gjl, final sfv sfv, final b1p b1p, final boolean b) {
        context.startActivity(a(context, userIdentifier, s, gjl, sfv, b1p, b));
    }
}
