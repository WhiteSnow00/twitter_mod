import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.birdwatch.navigation.BirdwatchWebViewContentViewArgs;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iz1 extends jvb implements stb<xz1, vzv>
{
    public iz1(final Object o) {
        super(1, o, (Class)kz1.class, "profileResult", "profileResult(Lcom/twitter/model/birdwatch/BirdwatchUserProfile;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final xz1 xz1 = (xz1)o;
        final kz1 kz1 = (kz1)((ea3)this).receiver;
        Objects.requireNonNull(kz1);
        vzv a2 = null;
        Label_0057: {
            if (xz1 != null) {
                final String a = xz1.a;
                if (a != null) {
                    ((kcv)kz1).T0.b((ContentViewArgs)BirdwatchWebViewContentViewArgs.Companion.a(a, true));
                    a2 = vzv.a;
                    break Label_0057;
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            r9a.b().f((Throwable)new IllegalStateException("Invalid null birdwatch user profile result"));
        }
        return vzv.a;
    }
}
