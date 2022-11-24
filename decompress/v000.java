// 
// Decompiled by Procyon v0.6.0
// 

public final class v000 implements Runnable
{
    public final n3r F0;
    public final int G0;
    public final int H0;
    public final f100 I0;
    
    public v000(final f100 i0, final n3r f0, final int g0, final int h0) {
        this.I0 = i0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final f100 i0 = this.I0;
        final n3r f0 = this.F0;
        i0.e((n3r)new day(f0.g(), this.G0, this.H0, f0.a(), f0.i(), f0.k(), f0.j(), f0.f(), f0.l()));
    }
}
