import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psz implements jxz
{
    public final i3r a;
    
    public psz(final i3r a) {
        this.a = a;
    }
    
    public final Set<String> a() {
        final i3r a = this.a;
        synchronized (a.c) {
            return new HashSet<String>(a.c);
        }
    }
}
