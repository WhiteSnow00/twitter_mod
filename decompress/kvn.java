// 
// Decompiled by Procyon v0.6.0
// 

public final class kvn extends gue implements rtb<bwn, oyv>
{
    public final /* synthetic */ wun C0;
    
    public kvn(final wun c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bwn bwn = (bwn)o;
        zzd.f((Object)bwn, "$this$distinct");
        if (bwn.n) {
            this.C0.M0.setFollowVisibility(0);
            final hfv b = bwn.b;
            if (b != null) {
                this.C0.M0.setIsFollower(tdy.d0(b.H1));
            }
            this.C0.M0.setIsFollowing(bwn.i);
        }
        return oyv.a;
    }
}
