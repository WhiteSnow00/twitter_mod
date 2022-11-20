// 
// Decompiled by Procyon v0.6.0
// 

public final class bbk implements oj
{
    public final int D0;
    public final wc6 E0;
    
    public bbk(final wc6 e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void run() {
        switch (this.D0) {
            default: {
                this.E0.dispose();
                return;
            }
            case 6: {
                this.E0.dispose();
                return;
            }
            case 5: {
                final wc6 e0 = this.E0;
                czd.f((Object)e0, "$disposable");
                e0.dispose();
                return;
            }
            case 4: {
                this.E0.dispose();
                return;
            }
            case 3: {
                this.E0.dispose();
                return;
            }
            case 2: {
                this.E0.e();
                return;
            }
            case 1: {
                this.E0.dispose();
                return;
            }
            case 0: {
                final wc6 e2 = this.E0;
                czd.f((Object)e2, "$compositeDisposable");
                e2.dispose();
            }
        }
    }
}
