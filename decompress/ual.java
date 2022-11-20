import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ual
{
    public final obi<?> a;
    public final qkq b;
    
    public ual(final obi<?> a, final qkq b) {
        czd.f((Object)a, "navigator");
        czd.f((Object)b, "softUserGate");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        if (!this.b.a(vkq.G0)) {
            final obi<?> a = this.a;
            final k7l$a k7l$a = new k7l$a();
            k7l$a.h = userIdentifier.getId();
            a.d((ym)((n4j)k7l$a).e());
        }
    }
}
