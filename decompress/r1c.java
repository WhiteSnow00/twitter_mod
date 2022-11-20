import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1c extends ywg
{
    public final long k1;
    
    public r1c(final UserIdentifier userIdentifier, final long k1) {
        super(userIdentifier);
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.F0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/amplify/marketplace/videos.json", "/");
        ((tqc$a)mcv).c("video_id", this.k1);
        return ((tqc$a)mcv).k();
    }
}
