import androidx.preference.d;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lqsu;", "Lbnd;", "<init>", "()V", "a", "subsystem.tfa.notifications.tweet-settings.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class qsu extends bnd
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public final void D1(final View view, final Bundle bundle) {
        czd.f((Object)view, "view");
        super.D1(view, bundle);
        view.setTag(2131432642, (Object)"TweetSettings");
        ((rlx)nh.c((mdc)this, (Class)rlx.class)).S0().b(view);
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).b2(2132213826, s);
    }
    
    public static final class a
    {
    }
}
