import com.twitter.narrowcast.communitypicker.NarrowcastBottomSheetCommunityPickerViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a7i extends zoc
{
    public final c7i F0;
    
    public a7i(final p66 p2, final c7i f0) {
        czd.f((Object)p2, "composeTwitterDependencies");
        czd.f((Object)f0, "effectHandler");
        super(p2);
        this.F0 = f0;
    }
    
    public final void b(x66 h, final int n) {
        h = h.h(-1517089003);
        final n96$b a = n96.a;
        j7i.c(this.F0, (okh)null, (NarrowcastBottomSheetCommunityPickerViewModel)null, h, 8, 6);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(this, n) {
                public final a7i D0;
                public final int E0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    this.D0.b(x66, this.E0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
}
