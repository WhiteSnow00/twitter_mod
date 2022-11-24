// 
// Decompiled by Procyon v0.6.0
// 

public final class w6d
{
    public static final nmp<w6d> e;
    public int a;
    public int b;
    public int c;
    public int d;
    
    static {
        w6d.e = new w6d.w6d$b();
    }
    
    public w6d(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && w6d.class == o.getClass()) {
            final w6d w6d = (w6d)o;
            if (this.a != w6d.a || this.b != w6d.b || this.c != w6d.c || this.d != w6d.d) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends z4j<w6d>
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public final Object i() {
            return new w6d(this);
        }
    }
}
