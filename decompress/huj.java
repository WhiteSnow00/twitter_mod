import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huj extends tvs implements vm3, vdc, afc
{
    public final fuj q;
    
    public huj(final a a) {
        super((tvs.a)a, 46);
        final fuj p = a.p;
        e0e.c((Object)p);
        this.q = p;
    }
    
    public final String d() {
        return super.b;
    }
    
    public final List<oh0> g() {
        final fuj q = this.q;
        if (q instanceof buj) {
            final oh0 b = ((buj)q).b;
            if (b != null) {
                final Object o = ojf.v((Object)b);
                e0e.e(o, "{\n            ListBuilde\u2026.feedbackTweet)\n        }");
                return (List<oh0>)o;
            }
        }
        final Object o = ged.G0;
        final int a = o5j.a;
        e0e.e(o, "empty()");
        return (List<oh0>)o;
    }
    
    public static final class a extends tvs.a<huj, a>
    {
        public fuj p;
        
        public final Object i() {
            return new huj(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null;
        }
    }
}
