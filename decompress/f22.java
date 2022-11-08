// 
// Decompiled by Procyon v0.6.0
// 

public final class f22
{
    public static bf6<String, g22> a;
    
    public static bf6<String, g22> a() {
        synchronized (f22.class) {
            if (f22.a == null) {
                f22.a = (bf6<String, g22>)new bf6((bra)new a(k83.a().T6()));
                nds.a((Class)f22.class);
            }
            return f22.a;
        }
    }
    
    public static final class a implements bra<String, g22>
    {
        public final d9w a;
        
        public a(final d9w a) {
            this.a = a;
        }
        
        public final Object a(final Object o) {
            return new g22(this.a, (String)o);
        }
    }
}
