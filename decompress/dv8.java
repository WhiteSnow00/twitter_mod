import androidx.profileinstaller.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dv8 implements Runnable
{
    public final a F0;
    public final int G0;
    public final Object H0;
    
    public dv8(final a f0, final int g0, final Object h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        this.F0.c.a(this.G0, this.H0);
    }
}
