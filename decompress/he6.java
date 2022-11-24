import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.net.URI;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class he6 implements xrc
{
    public final List<xrc> a;
    
    public he6(final List<xrc> a) {
        this.a = a;
    }
    
    public final void a(final URI uri, final UserIdentifier userIdentifier, final xrc$a xrc$a) {
        po.b().t();
        final Iterator<xrc> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(uri, userIdentifier, xrc$a);
        }
    }
}
