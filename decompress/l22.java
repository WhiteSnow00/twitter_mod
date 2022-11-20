import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l22 extends hss
{
    public l22(final Bundle bundle) {
        super(bundle);
    }
    
    public l22(final Bundle bundle, final nb0 nb0) {
        super(bundle);
    }
    
    public final String j() {
        if (((vl1)this).a.getBoolean("imported", false)) {
            return "blocked_imported";
        }
        if (((vl1)this).a.getBoolean("auto", false)) {
            return "auto_blocked";
        }
        return "blocked";
    }
    
    public final String l() {
        return "";
    }
    
    public final int n() {
        if (((vl1)this).a.getBoolean("imported", false)) {
            return 42;
        }
        if (((vl1)this).a.getBoolean("auto", false)) {
            return 56;
        }
        return 41;
    }
    
    public final pqv o() {
        return pqv.c;
    }
    
    public final boolean q() {
        return true;
    }
    
    public static final class a extends hss$a<l22, a>
    {
        public a() {
            super((Bundle)null);
        }
        
        public final Object i() {
            return new l22(((vl1$a)this).a, null);
        }
        
        public final a w(final boolean b) {
            ((vl1$a)this).a.putBoolean("auto", b);
            return this;
        }
        
        public final a x(final g2a g2a) {
            dwj.k(((vl1$a)this).a, "empty_config", (Object)g2a, (rlp)g2a.i);
            return this;
        }
        
        public final a y(final boolean b) {
            ((vl1$a)this).a.putBoolean("imported", b);
            return this;
        }
    }
}
