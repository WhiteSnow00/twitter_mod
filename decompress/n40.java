import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n40 implements qve
{
    public final goj a;
    
    public n40(final goj a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final UserIdentifier userIdentifier) {
        return mqb.f((qve)this, userIdentifier);
    }
    
    @Override
    public final String b() {
        if (kfj.b()) {
            Objects.requireNonNull(this.a);
            return "oppo";
        }
        return "android";
    }
    
    @Override
    public final int c(final wg1 wg1) {
        if (kfj.b()) {
            return this.a.c(wg1);
        }
        return 2;
    }
    
    @Override
    public final String d() {
        if (kfj.b()) {
            Objects.requireNonNull(this.a);
            return "android_should_badge_oppo_launchers";
        }
        return null;
    }
}
