import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vz2 extends ste implements qsb<Integer, taj<? extends Integer>>
{
    public static final vz2 D0;
    
    static {
        D0 = new vz2();
    }
    
    public vz2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Integer n = (Integer)o;
        czd.f((Object)n, "state");
        final int intValue = n;
        h5j h5j;
        if (intValue != 1 && intValue != 3) {
            if (intValue != 4) {
                h5j = h5j.just((Object)n).delay(250L, TimeUnit.MILLISECONDS);
            }
            else {
                h5j = h5j.just((Object)n).delay(1200L, TimeUnit.MILLISECONDS);
            }
        }
        else {
            h5j = h5j.just((Object)n);
        }
        return h5j;
    }
}
