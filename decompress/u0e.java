// 
// Decompiled by Procyon v0.6.0
// 

public interface u0e<T extends qtr<? extends bur>>
{
    void a(final T p0);
    
    public abstract static class a<T extends qtr<? extends bur>>
    {
        public final Class<T> a;
        
        public a(final Class<T> a) {
            this.a = a;
        }
    }
    
    public abstract static class b<T extends qtr<? extends bur>>
    {
        public final a<T> a;
        public final mxe<? extends u0e<T>> b;
        
        public b(final a<T> a, final mxe<? extends u0e<T>> b) {
            e0e.f((Object)a, "matcher");
            e0e.f((Object)b, "handler");
            this.a = a;
            this.b = b;
        }
    }
}
