// 
// Decompiled by Procyon v0.6.0
// 

public final class zg9 extends ste implements nsb<Float>
{
    public final float D0;
    public final xh9 E0;
    
    public zg9(final float d0, final xh9 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final float d0 = this.D0;
        final float floatValue = ((Number)this.E0.a.e.getValue()).floatValue();
        final float a = fh9.a;
        return rrz.o((floatValue - d0) / (0.0f - d0), 0.0f, 1.0f);
    }
}
