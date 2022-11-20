import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpi
{
    public static final rlp<fpi> m;
    public final String a;
    public final List<UserIdentifier> b;
    public final Map<UserIdentifier, ozl> c;
    public final zri d;
    public final oxm e;
    public final oxm f;
    public final String g;
    public final hwv h;
    public final psi i;
    public final hri j;
    public final long k;
    public final String l;
    
    static {
        fpi.m = new fpi.fpi$b();
    }
    
    public fpi(final fpi.fpi$a fpi$a) {
        final String a = fpi$a.a;
        jee.l((Object)a);
        this.a = a;
        Object b;
        if ((b = fpi$a.b) == null) {
            b = f2a.D0;
        }
        this.b = (List<UserIdentifier>)b;
        Object c;
        if ((c = fpi$a.c) == null) {
            c = k2a.D0;
        }
        this.c = (Map<UserIdentifier, ozl>)c;
        final zri d = fpi$a.d;
        jee.l((Object)d);
        this.d = d;
        final oxm e = fpi$a.e;
        jee.l((Object)e);
        this.e = e;
        this.f = fpi$a.f;
        this.k = fpi$a.k;
        final String l = fpi$a.l;
        jee.l((Object)l);
        this.l = l;
        this.g = fpi$a.g;
        this.h = fpi$a.h;
        this.i = fpi$a.i;
        this.j = fpi$a.j;
    }
}
