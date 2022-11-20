import androidx.fragment.app.Fragment;
import com.twitter.app.dm.request.di.view.RequestsActionsViewObjectGraph;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lppm;", "Lpl;", "<init>", "()V", "a", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ppm extends pl
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public final xk1 h2() {
        return (xk1)new qpm(((Fragment)this).J0);
    }
    
    public final dm n2() {
        return ((RequestsActionsViewObjectGraph)((smd)this).n()).b();
    }
    
    public static final class a
    {
    }
}
