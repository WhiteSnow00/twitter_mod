// 
// Decompiled by Procyon v0.6.0
// 

public final class gir<EXTDATA extends b>
{
    public final String a;
    public final int b;
    public final c c;
    public final EXTDATA d;
    
    public gir(final a<EXTDATA> a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    public static final class a<EXTDATA extends b>
    {
        public final String a;
        public int b;
        public c c;
        public EXTDATA d;
        
        public a(final String a) {
            this.a = a;
        }
    }
    
    public abstract static class b
    {
    }
    
    public static final class c
    {
        public final int a;
        public final String b;
        
        public c(final int a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("Error (code: ");
            sb.append(this.a);
            sb.append(", message: ");
            return xpa.m(sb, this.b, ')');
        }
    }
}
