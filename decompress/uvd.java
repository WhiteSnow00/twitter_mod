// 
// Decompiled by Procyon v0.6.0
// 

public final class uvd
{
    public static final nmp<uvd> c;
    public final String a;
    public final String b;
    
    static {
        uvd.c = new uvd.uvd$b();
    }
    
    public uvd(final uvd.uvd$a uvd$a) {
        final String a = uvd$a.a;
        vmw.g((Object)a);
        this.a = a;
        final String b = uvd$a.b;
        vmw.g((Object)b);
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && uvd.class == o.getClass() && o5j.a((Object)this.b, (Object)((uvd)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b);
    }
}
