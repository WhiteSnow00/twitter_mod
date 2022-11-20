import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atm<T>
{
    public final List<T> a;
    
    public atm() {
        this.a = (vth$a)vth.a(1);
    }
    
    public final atm<T> a(final T t) {
        monitorenter(this);
        if (t != null) {
            try {
                ((List<T>)this.a).add(t);
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
        return this;
    }
    
    public final List<T> b() {
        synchronized (this) {
            return rif.x((List)this.a);
        }
    }
    
    public final int c() {
        synchronized (this) {
            return ((List)this.a).size();
        }
    }
    
    public final T d() {
        synchronized (this) {
            final T e = this.e();
            jee.l((Object)e);
            return e;
        }
    }
    
    public final T e() {
        synchronized (this) {
            return (T)fq4.z((List)this.a);
        }
    }
}
