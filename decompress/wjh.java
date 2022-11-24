// 
// Decompiled by Procyon v0.6.0
// 

public final class wjh implements rk6
{
    public final int F0;
    public final znl G0;
    
    public wjh(final znl g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void accept(final Object o) {
        Object o2 = null;
        znl znl = null;
        switch (this.F0) {
            default: {
                final znl g0 = this.G0;
                o2 = o;
                znl = g0;
                break;
            }
            case 0: {
                final znl g2 = this.G0;
                o2 = o;
                znl = g2;
                break;
            }
        }
        znl.onNext(o2);
    }
}
