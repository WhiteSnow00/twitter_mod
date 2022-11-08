import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gh1 implements fh1
{
    public final cfw<q8w> a;
    public final gew b;
    
    public gh1(final cfw<q8w> a, final gew b) {
        this.a = a;
        this.b = b;
    }
    
    public final n9q<xg1> a(final UserIdentifier userIdentifier, final String s) {
        return (n9q<xg1>)((q8w)((hyr)this.a).get((Object)userIdentifier)).a.get((Object)s).w((qtb)new zg3((Object)userIdentifier, 5));
    }
}
