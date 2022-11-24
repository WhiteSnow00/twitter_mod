// 
// Decompiled by Procyon v0.6.0
// 

public final class dlf implements sj
{
    public final int F0;
    public final de6 G0;
    
    public dlf(final de6 g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void run() {
        switch (this.F0) {
            default: {
                this.G0.dispose();
                return;
            }
            case 6: {
                this.G0.dispose();
                return;
            }
            case 5: {
                final de6 g0 = this.G0;
                e0e.f((Object)g0, "$disposable");
                g0.dispose();
                return;
            }
            case 4: {
                this.G0.dispose();
                return;
            }
            case 3: {
                this.G0.dispose();
                return;
            }
            case 2: {
                this.G0.e();
                return;
            }
            case 1: {
                this.G0.dispose();
                return;
            }
            case 0: {
                this.G0.dispose();
            }
        }
    }
}
