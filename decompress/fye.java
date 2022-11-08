// 
// Decompiled by Procyon v0.6.0
// 

public final class fye extends gue implements otb<dye>
{
    public final /* synthetic */ q7r<rtb<yye, oyv>> C0;
    public final /* synthetic */ q7r<fud> D0;
    
    public fye(final q7r<? extends rtb<? super yye, oyv>> c0, final q7r<fud> d0) {
        this.C0 = (q7r<rtb<yye, oyv>>)c0;
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final zye zye = new zye();
        ((rtb)this.C0.getValue()).invoke((Object)zye);
        return new dye((bzd)zye.a, zye.b, (fud)this.D0.getValue());
    }
}
