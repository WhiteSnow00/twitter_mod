import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$subscribeToChanges$1", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class o21 extends xzr implements gub<Boolean, ap6<? super oyv>, Object>
{
    public /* synthetic */ boolean C0;
    public final /* synthetic */ AudioSpaceHeroViewModel D0;
    
    public o21(final AudioSpaceHeroViewModel d0, final ap6<? super o21> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        final o21 o2 = new o21(this.D0, (ap6<? super o21>)ap6);
        o2.C0 = (boolean)o;
        return (ap6<oyv>)o2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final o21 o3 = (o21)this.create((boolean)o, (ap6<?>)o2);
        final oyv a = oyv.a;
        o3.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final boolean c0 = this.C0;
        final AudioSpaceHeroViewModel d0 = this.D0;
        final rtb<r21, r21> rtb = (rtb<r21, r21>)new rtb<r21, r21>() {
            public final Object invoke(final Object o) {
                final r21 r21 = (r21)o;
                zzd.f((Object)r21, "$this$setState");
                return r21.l(r21, (fpf)null, c0 || r21.b, (mdq)null, false, false, 29);
            }
        };
        final soe<Object>[] v0 = AudioSpaceHeroViewModel.V0;
        d0.Q((rtb)rtb);
        return oyv.a;
    }
}
