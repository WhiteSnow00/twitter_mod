import com.twitter.business.settings.overview.compose.SwitchAccountConfirmationBottomSheetDialogArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2s extends wpc
{
    public final SwitchAccountConfirmationBottomSheetDialogArgs E0;
    public final o2s F0;
    
    public p2s(final e76 e76, final SwitchAccountConfirmationBottomSheetDialogArgs e77, final o2s f0) {
        zzd.f((Object)e76, "composeDependencies");
        zzd.f((Object)e77, "dialogArgs");
        zzd.f((Object)f0, "switchAccountActionDispatcher");
        super(e76);
        this.E0 = e77;
        this.F0 = f0;
    }
    
    public final void b(m76 h, final int n) {
        h = h.h(1755380830);
        final ea6$b a = ea6.a;
        q2s.d(this.E0.getAccountType(), this.F0, (wv8)null, h, 64, 4);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new gub<m76, Integer, oyv>() {
                public final /* synthetic */ p2s C0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final m76 m76 = (m76)o;
                    ((Number)o2).intValue();
                    this.C0.b(m76, n | 0x1);
                    return oyv.a;
                }
            });
        }
    }
}
