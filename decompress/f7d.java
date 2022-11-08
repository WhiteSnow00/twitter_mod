// 
// Decompiled by Procyon v0.6.0
// 

public final class f7d
{
    public static final f7d b;
    public final String a;
    
    static {
        b = new f7d("UNKNOWN");
    }
    
    public f7d(final String a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
    
    public interface a
    {
        f7d a(final byte[] p0, final int p1);
        
        int b();
    }
}
