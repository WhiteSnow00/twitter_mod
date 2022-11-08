import java.util.Set;
import com.twitter.android.onboarding.legacy.userrecommendationurp.di.UserRecommendationsPageViewGraph;
import java.util.Objects;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Logw;", "Lrnd;", "Loej;", "<init>", "()V", "feature.tfa.onboarding.legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ogw extends rnd implements oej
{
    public final b5j<Boolean> H0() {
        return (b5j<Boolean>)pej.a((rnd)this, (otb)new otb<b5j<Boolean>>() {
            public final /* synthetic */ ogw C0;
            
            public final Object invoke() {
                final ogw c0 = this.C0;
                Objects.requireNonNull(c0);
                return ((UserRecommendationsPageViewGraph)jhd.d((t2e)c0)).P();
            }
        });
    }
    
    public final b5j<Set<Long>> d() {
        return (b5j<Set<Long>>)pej.a((rnd)this, (otb)new otb<b5j<Set<? extends Long>>>() {
            public final /* synthetic */ ogw C0;
            
            public final Object invoke() {
                final ogw c0 = this.C0;
                Objects.requireNonNull(c0);
                return ((UserRecommendationsPageViewGraph)jhd.d((t2e)c0)).y();
            }
        });
    }
}
