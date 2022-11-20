import com.twitter.common.ui.settings.ShareSettingsView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s5n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public s5n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        ((ShareSettingsView)this.D0.A1.b).setInviteViaDMShown(t6n.L ^ true);
        return fzv.a;
    }
}
