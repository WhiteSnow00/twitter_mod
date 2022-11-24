import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d2b extends msc
{
    public final b4j a;
    public final vev b;
    
    public d2b(final b4j a, final vev b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final asc asc, final long n, final UserIdentifier userIdentifier) {
        this.a.P(asc, this.b, n);
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return this.b != null;
    }
}
