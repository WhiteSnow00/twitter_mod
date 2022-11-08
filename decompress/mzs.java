// 
// Decompiled by Procyon v0.6.0
// 

public final class mzs
{
    public static final alp<mzs> d;
    public final hzs a;
    public final kzs b;
    public final u8t c;
    
    static {
        mzs.d = new mzs.mzs$b();
    }
    
    public mzs(final hzs a, final kzs b, final u8t c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public mzs(final mzs.mzs$a mzs$a) {
        this.a = mzs$a.a;
        this.b = mzs$a.b;
        this.c = mzs$a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && mzs.class == o.getClass()) {
            final mzs mzs = (mzs)o;
            if (!w4j.a((Object)this.a, (Object)mzs.a) || !w4j.a((Object)this.b, (Object)mzs.b) || !w4j.a((Object)this.c, (Object)mzs.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
