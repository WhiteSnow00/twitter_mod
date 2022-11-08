// 
// Decompiled by Procyon v0.6.0
// 

public interface jkh
{
    public static final a Companion = a.C0;
    
    jkh E(final jkh p0);
    
    boolean H(final rtb<? super b, Boolean> p0);
    
     <R> R X(final R p0, final gub<? super R, ? super b, ? extends R> p1);
    
    public static final class a implements jkh
    {
        public static final /* synthetic */ a C0;
        
        static {
            C0 = new a();
        }
        
        @Override
        public final jkh E(final jkh jkh) {
            zzd.f((Object)jkh, "other");
            return jkh;
        }
        
        @Override
        public final boolean H(final rtb<? super b, Boolean> rtb) {
            zzd.f((Object)rtb, "predicate");
            return true;
        }
        
        @Override
        public final <R> R X(final R r, final gub<? super R, ? super b, ? extends R> gub) {
            zzd.f((Object)gub, "operation");
            return r;
        }
        
        @Override
        public final String toString() {
            return "Modifier";
        }
    }
    
    public interface b extends jkh
    {
    }
    
    public abstract static class c implements pm8
    {
        public c C0;
        public int D0;
        public int E0;
        public c F0;
        public c G0;
        public vmi H0;
        public boolean I0;
        
        public c() {
            this.C0 = this;
        }
        
        @Override
        public final c l() {
            return this.C0;
        }
        
        public final void s() {
            if (!this.I0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (this.H0 != null) {
                this.y();
                this.I0 = false;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        
        public void t() {
        }
        
        public void y() {
        }
    }
}
