// 
// Decompiled by Procyon v0.6.0
// 

public final class kju implements s5d
{
    public final long F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    
    public kju(final a a) {
        this.F0 = a.a;
        this.G0 = a.b;
        this.H0 = a.c;
        this.I0 = a.d;
        this.J0 = a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof kju;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final kju kju = (kju)o;
        if (this != o) {
            boolean b3 = b2;
            if (kju.F0 != this.F0) {
                return b3;
            }
            b3 = b2;
            if (kju.G0 != this.G0) {
                return b3;
            }
            b3 = b2;
            if (kju.H0 != this.H0) {
                return b3;
            }
            b3 = b2;
            if (kju.I0 != this.I0) {
                return b3;
            }
            b3 = b2;
            if (kju.J0 != this.J0) {
                return b3;
            }
        }
        return true;
    }
    
    public final long getId() {
        return this.F0;
    }
    
    @Override
    public final int hashCode() {
        return o5j.j((Object)this.F0, (Object)this.G0, (Object)this.H0, (Object)this.I0, (Object)this.J0);
    }
    
    public static final class a extends z4j<kju>
    {
        public long a;
        public int b;
        public int c;
        public int d;
        public int e;
        
        public a() {
            this.b = -1;
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }
        
        public a(final kju kju) {
            this.a = kju.F0;
            this.b = kju.G0;
            this.c = kju.H0;
            this.d = kju.I0;
            this.e = kju.J0;
        }
        
        public final Object i() {
            return new kju(this);
        }
        
        public final a o(final vg3 vg3) {
            this.a = vg3.a(false);
            this.b = vg3.G0;
            this.c = vg3.I0;
            this.d = vg3.K0;
            this.e = vg3.J0;
            return this;
        }
    }
}
