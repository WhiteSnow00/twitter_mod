import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jha extends fca<iha>
{
    public final h2p b;
    
    public jha(final h2p b) {
        super((Class)iha.class);
        this.b = b;
    }
    
    public final void b(final UserIdentifier userIdentifier, final elm elm) {
        final iha iha = (iha)elm;
        final h2p b = this.b;
        final String a = iha.a;
        final int b2 = iha.b;
        final String c = iha.c;
        Objects.requireNonNull(b);
        rw0.c((oj)new e2p(b, a, b2, c, userIdentifier));
    }
    
    public final boolean c(final elm elm) {
        return elm instanceof iha;
    }
}
