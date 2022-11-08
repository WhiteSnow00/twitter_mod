import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oql implements eyi
{
    public final xcs a;
    public final rui b;
    public final wql c;
    public final dyi d;
    public final UserIdentifier e;
    
    public oql(final xcs a, final rui b, final wql c, final dyi d, final UserIdentifier e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final n9q<hql> a(final boolean b) {
        final rui b2 = this.b;
        Objects.requireNonNull(b2);
        return (n9q<hql>)new rbq((ubq)new taq((ubq)new y9q((pbq)new ekc(b2, 4)), (qtb)new hd5((Object)this, 6)), (qtb)new b6p((Object)this, 4));
    }
}
