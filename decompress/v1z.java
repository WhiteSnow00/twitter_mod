// 
// Decompiled by Procyon v0.6.0
// 

public abstract class v1z
{
    public abstract int a();
    
    public abstract long b();
    
    public abstract String c();
    
    public abstract boolean d();
    
    public abstract boolean e();
    
    public abstract byte[] f();
    
    public final boolean g() {
        return this.c() != null && this.c().endsWith("/");
    }
    
    public final boolean h() {
        return this.a() == 0;
    }
}
