// 
// Decompiled by Procyon v0.6.0
// 

public final class ck8 implements n3p
{
    public final rtb<Float, Float> a;
    public final ck8$b b;
    public final vuh c;
    public final luh<Boolean> d;
    
    public ck8(final rtb<? super Float, Float> a) {
        this.a = (rtb<Float, Float>)a;
        this.b = new u2p() {
            public final /* synthetic */ ck8 a;
            
            public final float a(final float n) {
                return ((Number)this.a.a.invoke((Object)n)).floatValue();
            }
        };
        this.c = new vuh();
        this.d = (cwj)nkz.r((Object)Boolean.FALSE);
    }
    
    public final boolean a() {
        return (boolean)((nhq)this.d).getValue();
    }
    
    public final float b(final float n) {
        return ((Number)this.a.invoke((Object)n)).floatValue();
    }
    
    public final Object c(final puh puh, final gub<? super u2p, ? super ap6<? super oyv>, ?> gub, final ap6<? super oyv> ap6) {
        final Object q = oyz.q((gub)new ck8$a(this, puh, (gub)gub, (ap6)null), ap6);
        if (q == zy6.C0) {
            return q;
        }
        return oyv.a;
    }
}
