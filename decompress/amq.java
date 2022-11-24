// 
// Decompiled by Procyon v0.6.0
// 

public interface amq
{
    public static final a Companion = a.a;
    
    slq a(final ddu p0);
    
    boolean b(final ddu p0);
    
    ddu c(final ddu p0);
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b implements amq
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        @Override
        public final slq a(final ddu ddu) {
            e0e.f((Object)ddu, "gatedTweetAction");
            return slq.G0;
        }
        
        @Override
        public final boolean b(final ddu ddu) {
            e0e.f((Object)ddu, "action");
            return false;
        }
        
        @Override
        public final ddu c(final ddu ddu) {
            e0e.f((Object)ddu, "action");
            return ddu;
        }
    }
}
