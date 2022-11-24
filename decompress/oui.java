// 
// Decompiled by Procyon v0.6.0
// 

public final class oui
{
    public static final a Companion;
    public final int a;
    public final int b;
    public final boolean c;
    
    static {
        Companion = new a();
    }
    
    public oui(final int a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof oui)) {
            return false;
        }
        final oui oui = (oui)o;
        return this.a == oui.a && this.b == oui.b && this.c == oui.c;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (a * 31 + b) * 31 + c;
    }
    
    @Override
    public final String toString() {
        return xj0.B(xnf.g("NotificationProgress(progressMax=", this.a, ", progress=", this.b, ", progressIndeterminate="), this.c, ")");
    }
    
    public static final class a
    {
    }
    
    public static final class b extends k5j<oui>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            return new oui(rmp.z(), rmp.z(), rmp.u());
        }
        
        public final void f(final smp smp, final Object o) {
            final oui oui = (oui)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)oui, "entry");
            smp.z(oui.a);
            smp.z(oui.b);
            smp.t(oui.c);
        }
    }
}
