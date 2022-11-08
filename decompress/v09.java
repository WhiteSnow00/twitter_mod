import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public class v09 implements yqa<nws, iva, Boolean, kmm>
{
    public final UserIdentifier a;
    
    public v09(final UserIdentifier a) {
        this.a = a;
    }
    
    public static boolean c(final nws nws, final iva iva) {
        return !pjr.e((CharSequence)nws.c) || !pjr.e((CharSequence)iva.e);
    }
    
    public kmm b(final nws nws, final iva iva, final Boolean b) {
        if (c(nws, iva)) {
            return (kmm)new dov(this.a, iva, nws, (boolean)b);
        }
        final List a = rth.a(0);
        final List a2 = rth.a(0);
        final List a3 = rth.a(0);
        nws.a(a, a2, a3);
        return (kmm)new u09(this.a, iva, nws.f(), (boolean)b, a, a2, a3);
    }
}
