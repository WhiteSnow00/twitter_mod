import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pig implements fa3
{
    public final int a;
    public final Object b;
    
    public pig(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final zi1 zi1 = (zi1)this.b;
                final kni kni = (kni)o;
                final int r1 = zi1.r1;
                Objects.requireNonNull(zi1);
                return;
            }
            case 1: {
                final hni hni = (hni)this.b;
                final Void void1 = (Void)o;
                e0e.f((Object)hni, "this$0");
                ((kqg)hni.F0).onComplete();
                return;
            }
            case 0: {
                final qig qig = (qig)this.b;
                final kg9$d kg9$d = (kg9$d)o;
                qig.c();
            }
        }
    }
}
