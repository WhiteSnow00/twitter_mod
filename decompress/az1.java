import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.birdwatch.navigation.BirdwatchWebViewContentViewArgs;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class az1 extends hub implements qsb<pz1, fzv>
{
    public az1(final Object o) {
        super(1, o, (Class)cz1.class, "profileResult", "profileResult(Lcom/twitter/model/birdwatch/BirdwatchUserProfile;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final pz1 pz1 = (pz1)o;
        final cz1 cz1 = (cz1)((m93)this).receiver;
        Objects.requireNonNull(cz1);
        fzv a2 = null;
        Label_0057: {
            if (pz1 != null) {
                final String a = pz1.a;
                if (a != null) {
                    ((vbv)cz1).R0.b((ContentViewArgs)BirdwatchWebViewContentViewArgs.Companion.a(a, true));
                    a2 = fzv.a;
                    break Label_0057;
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            m8a.b().f((Throwable)new IllegalStateException("Invalid null birdwatch user profile result"));
        }
        return fzv.a;
    }
}
