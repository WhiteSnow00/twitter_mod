import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$subscribeToChanges$2", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class p21 extends xzr implements gub<o1o, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ fpf D0;
    public final /* synthetic */ AudioSpaceHeroViewModel E0;
    
    public p21(final fpf d0, final AudioSpaceHeroViewModel e0, final ap6<? super p21> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final p21 p2 = new p21(this.D0, this.E0, (ap6<? super p21>)ap6);
        p2.C0 = c0;
        return (ap6<oyv>)p2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p21 p2 = (p21)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        p2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final o1o o1o = (o1o)this.C0;
        final String a = o1o.a;
        final boolean b = o1o.b;
        if (zzd.a((Object)a, (Object)this.D0.b)) {
            final AudioSpaceHeroViewModel e0 = this.E0;
            final rtb<r21, r21> rtb = (rtb<r21, r21>)new rtb<r21, r21>() {
                public final Object invoke(final Object o) {
                    final r21 r21 = (r21)o;
                    zzd.f((Object)r21, "$this$setState");
                    return r21.l(r21, (fpf)null, b, (mdq)null, false, false, 29);
                }
            };
            final soe<Object>[] v0 = AudioSpaceHeroViewModel.V0;
            e0.Q((rtb)rtb);
        }
        return oyv.a;
    }
}
