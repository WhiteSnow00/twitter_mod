import java.util.Objects;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfg
{
    public final i9u a;
    public TrustedFriendsMembersContentViewArgs b;
    
    public zfg(final i9u a, final ibm ibm) {
        this.a = a;
        final j29 subscribe = a.g(true).observeOn(h6q.L()).onErrorReturn((qtb)ckc.F0).map((qtb)orf.E0).subscribe((fk6)new jpa((Object)this, 13), (fk6)uuf.G0);
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new zbv(subscribe, 1));
    }
    
    public static final class a
    {
        public final long a;
        public final int b;
        
        public a(final long a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
