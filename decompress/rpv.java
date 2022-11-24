import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpv implements apv
{
    public static final nmp<rpv> k;
    public final fym a;
    public final cpv b;
    public final int c;
    public final fym d;
    public final cpv e;
    public final fym f;
    public final opv g;
    public final l0h h;
    public final List<vov> i;
    public final int j;
    
    static {
        rpv.k = new rpv.rpv$b();
    }
    
    public rpv(final a a) {
        final fym a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        final cpv b = a.b;
        vmw.g((Object)b);
        this.b = b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.g = a.g;
        this.h = a.h;
        this.f = a.f;
        this.i = a.i;
        this.j = a.j;
    }
    
    public final cpv a() {
        return this.b;
    }
    
    public final cpv b() {
        return this.e;
    }
    
    public static final class a extends z4j<rpv>
    {
        public fym a;
        public cpv b;
        public int c;
        public fym d;
        public cpv e;
        public fym f;
        public opv g;
        public l0h h;
        public List<vov> i;
        public int j;
        
        public final Object i() {
            return new rpv(this);
        }
        
        public final boolean k() {
            return this.a != null && this.c != 0 && this.b != null;
        }
    }
}
