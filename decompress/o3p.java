// 
// Decompiled by Procyon v0.6.0
// 

public final class o3p extends gue implements rtb<Float, Float>
{
    public final /* synthetic */ q7r<rtb<Float, Float>> C0;
    
    public o3p(final q7r<? extends rtb<? super Float, Float>> c0) {
        this.C0 = (q7r<rtb<Float, Float>>)c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return ((rtb)this.C0.getValue()).invoke((Object)((Number)o).floatValue());
    }
}
