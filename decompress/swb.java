// 
// Decompiled by Procyon v0.6.0
// 

public final class swb implements hub
{
    public final int F0;
    public final Object G0;
    
    public swb(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final int f0 = this.F0;
        boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        switch (f0) {
            default: {
                final rpr rpr = (rpr)this.G0;
                final xzu xzu = (xzu)o;
                final Integer n = (Integer)o2;
                final iuu f2 = xzu.f;
                Boolean b4;
                if (f2 != null) {
                    b4 = ((((vxs)f2).c().h & 0x4000000) != 0x0 && rpr.g() && b2);
                }
                else {
                    b4 = Boolean.FALSE;
                }
                return b4;
            }
            case 1: {
                final cku$a cku$a = (cku$a)this.G0;
                final xzu xzu2 = (xzu)o;
                final Integer n2 = (Integer)o2;
                final iuu f3 = xzu2.f;
                return f3 != null && tkr.l(xzu2.a, ((vxs)f3).h(), cku$a.a(xzu2.a).c(mku.P0)) && b3;
            }
            case 0: {
                final cwb cwb = (cwb)this.G0;
                final xzu xzu3 = (xzu)o;
                final Integer n3 = (Integer)o2;
                if (lb0.I(3)[((aj1)cwb).mIntent.getIntExtra("extra_gallery_tweet_display_mode", 1)] != 3 || cwb.c() == 0L) {
                    b = false;
                }
                return b;
            }
        }
    }
}
