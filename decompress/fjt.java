import java.util.ArrayList;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjt
{
    public final UserIdentifier a;
    public final gjt b;
    public final List<djt> c;
    
    public fjt(final UserIdentifier a, final gjt b) {
        czd.f((Object)a, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = new ArrayList();
    }
    
    public final void a(final ejt ejt) {
        this.c.add(new djt(this.a, ejt));
    }
}
