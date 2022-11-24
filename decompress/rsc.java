import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsc implements ng3
{
    public final int a;
    public final Object b;
    
    public rsc(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void cancel() {
        switch (this.a) {
            default: {
                ((h6w)this.b).b(null);
                return;
            }
            case 0: {
                ((aw0)this.b).H(true);
            }
        }
    }
}
