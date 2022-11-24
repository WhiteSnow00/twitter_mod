// 
// Decompiled by Procyon v0.6.0
// 

public final class qk8 implements a5p
{
    public final stb<Float, Float> a;
    public final qk8$b b;
    public final pvh c;
    public final fvh<Boolean> d;
    
    public qk8(final stb<? super Float, Float> a) {
        this.a = (stb<Float, Float>)a;
        this.b = new g4p(this) {
            public final qk8 a;
            
            public final float a(final float n) {
                return ((Number)this.a.a.invoke((Object)n)).floatValue();
            }
        };
        this.c = new pvh();
        this.d = (wwj)zzz.W((Object)Boolean.FALSE);
    }
    
    public final boolean a() {
        return ((cjq<Boolean>)this.d).getValue();
    }
    
    public final float b(final float n) {
        return ((Number)this.a.invoke((Object)n)).floatValue();
    }
    
    public final Object c(final jvh jvh, final hub<? super g4p, ? super mp6<? super vzv>, ?> hub, final mp6<? super vzv> mp6) {
        final Object u = r1n.u((hub)new qk8$a(this, jvh, (hub)hub, (mp6)null), (mp6)mp6);
        if (u == jz6.F0) {
            return u;
        }
        return vzv.a;
    }
}
