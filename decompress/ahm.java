// 
// Decompiled by Procyon v0.6.0
// 

public final class ahm implements mxs
{
    public final tvs.a<?, ?> a;
    public final String b;
    public final String c;
    
    public ahm(final tvs.a<?, ?> a, final kwv kwv) {
        e0e.f((Object)kwv, "unhydratedInstruction");
        final String b = kwv.a.b;
        final String b2 = kwv.b;
        e0e.f((Object)b, "entryId");
        e0e.f((Object)b2, "entryIdToReplace");
        this.a = a;
        this.b = b;
        this.c = b2;
    }
    
    public static final class a implements xtd
    {
        public final boolean a;
        
        public a(final boolean a) {
            this.a = a;
        }
        
        public final boolean a() {
            return this.a;
        }
    }
}
