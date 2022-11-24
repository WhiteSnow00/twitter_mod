// 
// Decompiled by Procyon v0.6.0
// 

public final class uyo
{
    public static final uyo.uyo$b c;
    public final pyo a;
    public final vyo b;
    
    static {
        c = new uyo.uyo$b();
    }
    
    public uyo(final uyo.uyo$a uyo$a) {
        final pyo a = uyo$a.a;
        vmw.g((Object)a);
        this.a = a;
        final vyo b = uyo$a.b;
        vmw.g((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && uyo.class == o.getClass()) {
            final int a = o5j.a;
            final uyo uyo = (uyo)o;
            if (!o5j.a((Object)this.a, (Object)uyo.a) || !o5j.a((Object)this.b, (Object)uyo.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
}
