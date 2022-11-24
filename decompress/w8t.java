// 
// Decompiled by Procyon v0.6.0
// 

public final class w8t
{
    public final String a;
    public final int b;
    
    public w8t(final a a) {
        final String a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.b = a.b;
    }
    
    public static final class a extends z4j<w8t>
    {
        public String a;
        public int b;
        
        public final Object i() {
            return new w8t(this);
        }
    }
}
