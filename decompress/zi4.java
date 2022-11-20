// 
// Decompiled by Procyon v0.6.0
// 

public final class zi4 extends ste implements qsb<fzv, fzv>
{
    public final wi4 D0;
    
    public zi4(final wi4 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fzv fzv = (fzv)o;
        final wi4 d0 = this.D0;
        final boolean j0 = d0.J0 ^ true;
        d0.J0 = j0;
        d0.K0.onNext((Object)j0);
        final wi4 d2 = this.D0;
        final fj4 i0 = d2.I0;
        if (i0 != null) {
            if (d2.J0) {
                i0.a.setImageResource(2131231452);
            }
            else {
                i0.a.setImageResource(2131231451);
            }
        }
        if (this.D0.J0) {
            cbw.a().c((elm)new af4(new String[] { "home:timeline:video_player::cc_on_screen_toggle_on:click" }));
        }
        else {
            cbw.a().c((elm)new af4(new String[] { "home:timeline:video_player::cc_on_screen_toggle_off:click" }));
        }
        return fzv.a;
    }
}
