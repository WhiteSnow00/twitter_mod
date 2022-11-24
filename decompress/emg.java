// 
// Decompiled by Procyon v0.6.0
// 

public final class emg extends vq9
{
    public final float J0;
    
    public emg(final float n) {
        super((j98)null);
        this.J0 = n - 0.001f;
    }
    
    public final void f(float n, final float n2, float n3, final msp msp) {
        n = (float)(Math.sqrt(2.0) * this.J0 / 2.0);
        n3 = (float)Math.sqrt(Math.pow(this.J0, 2.0) - Math.pow(n, 2.0));
        msp.f(n2 - n, (float)(-(Math.sqrt(2.0) * this.J0 - this.J0)) + n3);
        msp.e(n2, (float)(-(Math.sqrt(2.0) * this.J0 - this.J0)));
        msp.e(n2 + n, (float)(-(Math.sqrt(2.0) * this.J0 - this.J0)) + n3);
    }
}
