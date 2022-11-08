import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n38
{
    public static final a Companion;
    public final z28 a;
    
    static {
        Companion = new a();
    }
    
    public n38(final z28 a) {
        this.a = a;
    }
    
    public z28 a() {
        return this.a;
    }
    
    public static final class a
    {
        public final n38 a(final z28 z28, final boolean b, final boolean b2) {
            zzd.f((Object)z28, "suggestion");
            Object b3;
            if (zzd.a((Object)z28, (Object)gm7.a)) {
                b3 = n38$b.b;
            }
            else if (z28 instanceof to7) {
                b3 = new n38$c((to7)z28, b, b2);
            }
            else {
                if (!(z28 instanceof l48)) {
                    throw new NoWhenBranchMatchedException();
                }
                b3 = new n38$d((l48)z28, b, b2);
            }
            return (n38)b3;
        }
    }
}
