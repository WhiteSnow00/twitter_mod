import java.util.Set;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsj extends i1v<ssj>
{
    public final m7c i1;
    
    public rsj(final UserIdentifier userIdentifier, final m7c i1) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)i1, "pageEndpointConfig");
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final o7c o7c = new o7c();
        o7c.r(this.i1.a);
        o7c.q(this.i1.b);
        return (qrc)o7c.e();
    }
    
    @Override
    public final wsc<ssj, pav> g0() {
        final d8c$a companion = d8c.Companion;
        final b8c b8c = new b8c();
        final e8c c = this.i1.c;
        zzd.e((Object)c, "pageEndpointConfig.parsingPath");
        return (wsc<ssj, pav>)companion.a((TypeConverter)b8c, c, (Set)f3a.C0);
    }
}
