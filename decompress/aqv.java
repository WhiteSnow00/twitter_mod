import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqv implements osm
{
    public final UserIdentifier a;
    public final bw0 b;
    public final kbv c;
    
    public aqv(final UserIdentifier a, final bw0 b, final kbv c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final nsm nsm) {
        if (nsm.b().a()) {
            this.b.d((aw0)new eum(this.a, this.c));
        }
    }
}
