import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bh1 implements ah1
{
    public final pfw<y8w> a;
    public final uew b;
    
    public bh1(final pfw<y8w> a, final uew b) {
        this.a = a;
        this.b = b;
    }
    
    public final eaq<tg1> a(final UserIdentifier userIdentifier, final String s) {
        return (eaq<tg1>)((y8w)((zyr)this.a).get((Object)userIdentifier)).a.get((Object)s).w((psb)new mf8((Object)userIdentifier, 5));
    }
}
