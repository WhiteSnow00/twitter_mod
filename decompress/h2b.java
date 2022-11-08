import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h2b extends isc
{
    public final i3j a;
    public final mdv b;
    
    public h2b(final i3j a, final mdv b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final xrc xrc, final long n, final UserIdentifier userIdentifier) {
        this.a.P(xrc, this.b, n);
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return this.b != null;
    }
}
