import com.twitter.util.user.UserIdentifier;
import tv.periscope.android.api.ApiRunnable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hh0 extends dj1<Void>
{
    public final ApiRunnable G0;
    
    public hh0(final ApiRunnable g0) {
        super(UserIdentifier.UNDEFINED);
        this.G0 = g0;
    }
    
    public final Object b() throws InterruptedException {
        this.G0.run();
        return null;
    }
}
