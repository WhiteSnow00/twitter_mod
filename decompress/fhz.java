import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhz implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Object D0;
    
    @Override
    public final void run() {
        switch (this.C0) {
            default: {
                final Runnable runnable = (Runnable)this.D0;
                fch.D0.set(new ArrayDeque<Runnable>());
                runnable.run();
                return;
            }
            case 0: {
                ((ihz)this.D0).L0 = null;
            }
        }
    }
}
