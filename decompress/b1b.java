import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b1b extends mrc
{
    public final o3j a;
    public final hev b;
    
    public b1b(final o3j a, final hev b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final arc arc, final long n, final UserIdentifier userIdentifier) {
        this.a.N(arc, this.b, n);
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return this.b != null;
    }
}
