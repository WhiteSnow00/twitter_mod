import com.twitter.util.user.UserIdentifier;
import tv.periscope.android.api.ApiRunnable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lh0 extends jj1<Void>
{
    public final ApiRunnable F0;
    
    public lh0(final ApiRunnable f0) {
        super(UserIdentifier.UNDEFINED);
        this.F0 = f0;
    }
    
    public final Object b() throws InterruptedException {
        this.F0.run();
        return null;
    }
}
