import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8g implements y7g
{
    public final Context a;
    public final UserIdentifier b;
    public final ru8 c;
    public final tsc d;
    
    public a8g(final Context a, final UserIdentifier b, final ru8 c, final tsc d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final bbq<x7g> a() {
        final s2c s2c = new s2c(this.a, this.b, this.c, 0L);
        s2c.o1 = "tweet_compose_location";
        return (bbq<x7g>)this.d.b(s2c).w((rtb)yvt.K0);
    }
}
