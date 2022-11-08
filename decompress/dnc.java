import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnc implements pgg
{
    public final tnc a;
    public final p8s b;
    public final iek c;
    public final UserIdentifier d;
    
    public dnc(final tnc a, final p8s b, final iek c, final UserIdentifier d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final esj a(final tqm tqm, final ggg ggg) {
        if (this.c.a(this.d)) {
            return this.b.a(tqm, ggg);
        }
        return this.a.a(tqm, ggg);
    }
}
