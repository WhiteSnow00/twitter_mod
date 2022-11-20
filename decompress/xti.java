// 
// Decompiled by Procyon v0.6.0
// 

public final class xti
{
    public static final a Companion;
    public final int a;
    public final int b;
    public final boolean c;
    
    static {
        Companion = new a();
    }
    
    public xti(final int a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xti)) {
            return false;
        }
        final xti xti = (xti)o;
        return this.a == xti.a && this.b == xti.b && this.c == xti.c;
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
        return wnj.D(shc.f("NotificationProgress(progressMax=", this.a, ", progress=", this.b, ", progressIndeterminate="), this.c, ")");
    }
    
    public static final class a
    {
    }
}
