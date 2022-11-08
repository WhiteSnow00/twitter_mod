import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ial
{
    public final mbi<?> a;
    public final xjq b;
    
    public ial(final mbi<?> a, final xjq b) {
        zzd.f((Object)a, "navigator");
        zzd.f((Object)b, "softUserGate");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        if (!this.b.a(ckq.F0)) {
            final mbi<?> a = this.a;
            final c7l$a c7l$a = new c7l$a();
            c7l$a.h = userIdentifier.getId();
            a.d((zm)((h4j)c7l$a).e());
        }
    }
}
