// 
// Decompiled by Procyon v0.6.0
// 

public final class dj6<T>
{
    public volatile T a;
    
    public dj6(final T a) {
        czd.f((Object)a, "value");
        this.a = a;
    }
    
    public final T a() {
        synchronized (this) {
            final T a = this.a;
            if (a != null) {
                this.a = null;
                return a;
            }
            return null;
        }
    }
}
