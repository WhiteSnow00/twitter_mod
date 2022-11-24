import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class siz implements Runnable
{
    public final int F0;
    public final Object G0;
    
    public siz(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final Runnable runnable = (Runnable)this.G0;
                xch.G0.set(new ArrayDeque<Runnable>());
                runnable.run();
                return;
            }
            case 0: {
                ((viz)this.G0).O0 = null;
            }
        }
    }
}
