// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = { 399 }, m = "runCached")
public final class pw0 extends io6
{
    public ow0 D0;
    public ow0$b E0;
    public boolean F0;
    public Object G0;
    public final ow0 H0;
    public int I0;
    
    public pw0(final ow0 h0, final go6<? super pw0> go6) {
        this.H0 = h0;
        super((go6)go6);
    }
    
    public final Object invokeSuspend(final Object g0) {
        this.G0 = g0;
        this.I0 |= Integer.MIN_VALUE;
        return this.H0.b((ijb)null, (lhk)null, (qsb)null, (go6)this);
    }
}
